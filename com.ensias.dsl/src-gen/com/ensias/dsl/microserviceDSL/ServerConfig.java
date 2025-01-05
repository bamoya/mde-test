/**
 * generated by Xtext 2.37.0
 */
package com.ensias.dsl.microserviceDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ensias.dsl.microserviceDSL.ServerConfig#getPort <em>Port</em>}</li>
 *   <li>{@link com.ensias.dsl.microserviceDSL.ServerConfig#getContextPath <em>Context Path</em>}</li>
 * </ul>
 *
 * @see com.ensias.dsl.microserviceDSL.MicroserviceDSLPackage#getServerConfig()
 * @model
 * @generated
 */
public interface ServerConfig extends ServiceConfigEntry {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see com.ensias.dsl.microserviceDSL.MicroserviceDSLPackage#getServerConfig_Port()
	 * @model unique="false"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.ensias.dsl.microserviceDSL.ServerConfig#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Context Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Path</em>' attribute.
	 * @see #setContextPath(String)
	 * @see com.ensias.dsl.microserviceDSL.MicroserviceDSLPackage#getServerConfig_ContextPath()
	 * @model unique="false"
	 * @generated
	 */
	String getContextPath();

	/**
	 * Sets the value of the '{@link com.ensias.dsl.microserviceDSL.ServerConfig#getContextPath <em>Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Path</em>' attribute.
	 * @see #getContextPath()
	 * @generated
	 */
	void setContextPath(String value);

} // ServerConfig
