package com.ensias.dsl.validation;

import com.ensias.dsl.microserviceDSL.*;
import org.eclipse.xtext.validation.Check;
import java.util.HashSet;
import java.util.Set;

public class MicroserviceDSLValidator extends AbstractMicroserviceDSLValidator {
	
    public static final String INVALID_PORT = "invalidPort";
    public static final String DUPLICATE_SERVICE_NAME = "duplicateServiceName";
    public static final String DUPLICATE_ROUTE_PATH = "duplicateRoutePath";
    public static final String INVALID_DEPENDENCIES = "invalidDependencies";
    public static final String INCOMPLETE_CONFIG = "incompleteConfig";
    public static final String INVALID_DATABASE_CONFIG = "invalidDatabaseConfig";
    
    //To-do Hajar & Fatiha
    @Check
    public void checkPortNumbers(Model model) {
        Set<Integer> usedPorts = new HashSet<>();

        // Check Discovery port
        if (model.getDiscovery() != null) {
            checkPortRange(model.getDiscovery().getPort(), "Discovery");
            usedPorts.add(model.getDiscovery().getPort());
        }

        // Check Config Server port
        if (model.getConfigServer() != null) {
            checkPortRange(model.getConfigServer().getPort(), "Config Server");
            if (!usedPorts.add(model.getConfigServer().getPort())) {
                error("Port " + model.getConfigServer().getPort() + " is already in use",
                        MicroserviceDSLPackage.Literals.CONFIG_SERVER__PORT,
                        INVALID_PORT);
            }
        }

        // Check Gateway port
        if (model.getGateway() != null) {
            checkPortRange(model.getGateway().getPort(), "Gateway");
            if (!usedPorts.add(model.getGateway().getPort())) {
                error("Port " + model.getGateway().getPort() + " is already in use",
                        MicroserviceDSLPackage.Literals.GATEWAY__PORT,
                        INVALID_PORT);
            }
        }

        // Check Service ports
        for (Service service : model.getServices()) {
            var serverConfig = service.getConfiguration().stream()
                    .filter(it -> it instanceof ServerConfig)
                    .findFirst()
                    .orElse(null);

            if (serverConfig != null) {
                int port = ((ServerConfig) serverConfig).getPort();
                checkPortRange(port, "Service " + service.getName());
                if (!usedPorts.add(port)) {
                    error("Port " + port + " is already in use",
                            serverConfig,
                            MicroserviceDSLPackage.Literals.SERVER_CONFIG__PORT,
                            INVALID_PORT);
                }
            }
        }
    }
    
    //To-do Hajar & Fatiha
    private void checkPortRange(int port, String serviceName) {
        if (port < 1024 || port > 65535) {
            error(serviceName + " port must be between 1024 and 65535",
                    MicroserviceDSLPackage.Literals.SERVER_CONFIG__PORT,
                    INVALID_PORT);
        }
    }
    
    //To-do Hajar & Fatiha
    @Check
    public void checkServiceNameUniqueness(Model model) {
        Set<String> serviceNames = new HashSet<>();

        for (Service service : model.getServices()) {
            if (!serviceNames.add(service.getName())) {
                error("Service name '" + service.getName() + "' is already used",
                        service,
                        MicroserviceDSLPackage.Literals.SERVICE__NAME,
                        DUPLICATE_SERVICE_NAME);
            }
        }
    }

    //To-do Bassim
    @Check
    public void checkDependencyCompatibility(Service service) {
        Set<Dependency> dependencies = new HashSet<>(service.getDependencies());

        // Check if JPA is present when database config exists
        boolean hasDatabase = service.getConfiguration().stream()
                .anyMatch(it -> it instanceof DatabaseConfig);

        if (hasDatabase && !dependencies.contains(Dependency.JPA)) {
            warning("Database configuration requires JPA dependency",
                    MicroserviceDSLPackage.Literals.SERVICE__DEPENDENCIES,
                    INVALID_DEPENDENCIES);
        }

        // Check for unnecessary SPRING_WEB dependency since it's added by default
        if (dependencies.contains(Dependency.SPRING_WEB)) {
            warning("SPRING_WEB dependency is unnecessary as it's included by default",
                    MicroserviceDSLPackage.Literals.SERVICE__DEPENDENCIES,
                    INVALID_DEPENDENCIES);
        }

        // Check for unnecessary EUREKA_CLIENT dependency since it's added by default
        if (dependencies.contains(Dependency.EUREKA_CLIENT)) {
            warning("EUREKA_CLIENT dependency is unnecessary as it's included by default",
                    MicroserviceDSLPackage.Literals.SERVICE__DEPENDENCIES,
                    INVALID_DEPENDENCIES);
        }

        // Check for Config Client
        if (!dependencies.contains(Dependency.CONFIG_CLIENT)) {
            warning("Service should include CONFIG_CLIENT dependency for configuration management",
                    MicroserviceDSLPackage.Literals.SERVICE__DEPENDENCIES,
                    INVALID_DEPENDENCIES);
        }
    }
    
    //To-do Bassim
    @Check
    public void checkDatabaseConfiguration(DatabaseConfig dbConfig) {
        // Validate database URL format
        if (!dbConfig.getDbUrl().startsWith("jdbc:")) {
            error("Database URL must start with 'jdbc:'",
                    MicroserviceDSLPackage.Literals.DATABASE_CONFIG__DB_URL,
                    INVALID_DATABASE_CONFIG);
        }

        // Validate credentials
        if (dbConfig.getDbUsername() == null || dbConfig.getDbUsername().isEmpty()) {
            error("Database username cannot be empty",
                    MicroserviceDSLPackage.Literals.DATABASE_CONFIG__DB_USERNAME,
                    INVALID_DATABASE_CONFIG);
        }

        if (dbConfig.getDbPassword() == null || dbConfig.getDbPassword().isEmpty()) {
            warning("Database password is empty",
                    MicroserviceDSLPackage.Literals.DATABASE_CONFIG__DB_PASSWORD,
                    INVALID_DATABASE_CONFIG);
        }
    }
    
    //To-do Nour
    @Check
    public void checkRouteUniqueness(Gateway gateway) {
        if (gateway.getRoutes() == null) return;

        Set<String> paths = new HashSet<>();
        for (RouteConfig route : gateway.getRoutes()) {
            if (!paths.add(route.getPath())) {
                error("Route path '" + route.getPath() + "' is already defined",
                        route,
                        MicroserviceDSLPackage.Literals.ROUTE_CONFIG__PATH,
                        DUPLICATE_ROUTE_PATH);
            }
        }
    }
    
    //To-do Nour
    @Check
    public void checkConfigurationCompleteness(Service service) {
        // Check if basic configuration exists
        if (service.getConfiguration().stream()
                .noneMatch(it -> it instanceof ServerConfig)) {
            error("Service must have server configuration",
                    service,
                    MicroserviceDSLPackage.Literals.SERVICE__CONFIGURATION,
                    INCOMPLETE_CONFIG);
        }

        if (service.getConfiguration().stream()
                .noneMatch(it -> it instanceof ApplicationConfig)) {
            warning("Service should have application configuration",
                    service,
                    MicroserviceDSLPackage.Literals.SERVICE__CONFIGURATION,
                    INCOMPLETE_CONFIG);
        }
    }
}
