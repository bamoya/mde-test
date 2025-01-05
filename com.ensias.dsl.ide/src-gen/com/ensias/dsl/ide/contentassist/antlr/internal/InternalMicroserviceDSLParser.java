package com.ensias.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.ensias.dsl.services.MicroserviceDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMicroserviceDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'JPA'", "'SPRING_WEB'", "'EUREKA_CLIENT'", "'CONFIG_CLIENT'", "'ACTUATOR'", "'LOMBOK'", "'CUSTOM'", "'MYSQL'", "'POSTGRESQL'", "'H2'", "'CREATE'", "'CREATE_UPDATE'", "'INFO'", "'DEBUG'", "'WARN'", "'ERROR'", "'TRACE'", "'project'", "'group'", "'version'", "'description'", "'{'", "'}'", "'discovery'", "'port'", "'dependencies'", "'defaultZone'", "'gateway'", "'routes'", "'route'", "'path'", "'service'", "'config-server'", "'git-uri'", "'git-branch'", "'config'", "'server-config'", "'context-path'", "'application-config'", "'name'", "'profile'", "'logging-level'", "'database-config'", "'url'", "'username'", "'password'", "'driver'", "'ddl'", "'actuator-config'", "'healthcheck-path'", "'metrics-enabled'", "'info-enabled'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMicroserviceDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMicroserviceDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMicroserviceDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMicroserviceDSL.g"; }


    	private MicroserviceDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(MicroserviceDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMicroserviceDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:54:1: ( ruleModel EOF )
            // InternalMicroserviceDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMicroserviceDSL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMicroserviceDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMicroserviceDSL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMicroserviceDSL.g:69:3: ( rule__Model__Group__0 )
            // InternalMicroserviceDSL.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDiscovery"
    // InternalMicroserviceDSL.g:78:1: entryRuleDiscovery : ruleDiscovery EOF ;
    public final void entryRuleDiscovery() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:79:1: ( ruleDiscovery EOF )
            // InternalMicroserviceDSL.g:80:1: ruleDiscovery EOF
            {
             before(grammarAccess.getDiscoveryRule()); 
            pushFollow(FOLLOW_1);
            ruleDiscovery();

            state._fsp--;

             after(grammarAccess.getDiscoveryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiscovery"


    // $ANTLR start "ruleDiscovery"
    // InternalMicroserviceDSL.g:87:1: ruleDiscovery : ( ( rule__Discovery__Group__0 ) ) ;
    public final void ruleDiscovery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:91:2: ( ( ( rule__Discovery__Group__0 ) ) )
            // InternalMicroserviceDSL.g:92:2: ( ( rule__Discovery__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:92:2: ( ( rule__Discovery__Group__0 ) )
            // InternalMicroserviceDSL.g:93:3: ( rule__Discovery__Group__0 )
            {
             before(grammarAccess.getDiscoveryAccess().getGroup()); 
            // InternalMicroserviceDSL.g:94:3: ( rule__Discovery__Group__0 )
            // InternalMicroserviceDSL.g:94:4: rule__Discovery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Discovery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiscoveryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiscovery"


    // $ANTLR start "entryRuleGateway"
    // InternalMicroserviceDSL.g:103:1: entryRuleGateway : ruleGateway EOF ;
    public final void entryRuleGateway() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:104:1: ( ruleGateway EOF )
            // InternalMicroserviceDSL.g:105:1: ruleGateway EOF
            {
             before(grammarAccess.getGatewayRule()); 
            pushFollow(FOLLOW_1);
            ruleGateway();

            state._fsp--;

             after(grammarAccess.getGatewayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGateway"


    // $ANTLR start "ruleGateway"
    // InternalMicroserviceDSL.g:112:1: ruleGateway : ( ( rule__Gateway__Group__0 ) ) ;
    public final void ruleGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:116:2: ( ( ( rule__Gateway__Group__0 ) ) )
            // InternalMicroserviceDSL.g:117:2: ( ( rule__Gateway__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:117:2: ( ( rule__Gateway__Group__0 ) )
            // InternalMicroserviceDSL.g:118:3: ( rule__Gateway__Group__0 )
            {
             before(grammarAccess.getGatewayAccess().getGroup()); 
            // InternalMicroserviceDSL.g:119:3: ( rule__Gateway__Group__0 )
            // InternalMicroserviceDSL.g:119:4: rule__Gateway__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGatewayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGateway"


    // $ANTLR start "entryRuleRouteConfig"
    // InternalMicroserviceDSL.g:128:1: entryRuleRouteConfig : ruleRouteConfig EOF ;
    public final void entryRuleRouteConfig() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:129:1: ( ruleRouteConfig EOF )
            // InternalMicroserviceDSL.g:130:1: ruleRouteConfig EOF
            {
             before(grammarAccess.getRouteConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleRouteConfig();

            state._fsp--;

             after(grammarAccess.getRouteConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRouteConfig"


    // $ANTLR start "ruleRouteConfig"
    // InternalMicroserviceDSL.g:137:1: ruleRouteConfig : ( ( rule__RouteConfig__Group__0 ) ) ;
    public final void ruleRouteConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:141:2: ( ( ( rule__RouteConfig__Group__0 ) ) )
            // InternalMicroserviceDSL.g:142:2: ( ( rule__RouteConfig__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:142:2: ( ( rule__RouteConfig__Group__0 ) )
            // InternalMicroserviceDSL.g:143:3: ( rule__RouteConfig__Group__0 )
            {
             before(grammarAccess.getRouteConfigAccess().getGroup()); 
            // InternalMicroserviceDSL.g:144:3: ( rule__RouteConfig__Group__0 )
            // InternalMicroserviceDSL.g:144:4: rule__RouteConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRouteConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRouteConfig"


    // $ANTLR start "entryRuleConfigServer"
    // InternalMicroserviceDSL.g:153:1: entryRuleConfigServer : ruleConfigServer EOF ;
    public final void entryRuleConfigServer() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:154:1: ( ruleConfigServer EOF )
            // InternalMicroserviceDSL.g:155:1: ruleConfigServer EOF
            {
             before(grammarAccess.getConfigServerRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigServer();

            state._fsp--;

             after(grammarAccess.getConfigServerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigServer"


    // $ANTLR start "ruleConfigServer"
    // InternalMicroserviceDSL.g:162:1: ruleConfigServer : ( ( rule__ConfigServer__Group__0 ) ) ;
    public final void ruleConfigServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:166:2: ( ( ( rule__ConfigServer__Group__0 ) ) )
            // InternalMicroserviceDSL.g:167:2: ( ( rule__ConfigServer__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:167:2: ( ( rule__ConfigServer__Group__0 ) )
            // InternalMicroserviceDSL.g:168:3: ( rule__ConfigServer__Group__0 )
            {
             before(grammarAccess.getConfigServerAccess().getGroup()); 
            // InternalMicroserviceDSL.g:169:3: ( rule__ConfigServer__Group__0 )
            // InternalMicroserviceDSL.g:169:4: rule__ConfigServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigServer"


    // $ANTLR start "entryRuleService"
    // InternalMicroserviceDSL.g:178:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:179:1: ( ruleService EOF )
            // InternalMicroserviceDSL.g:180:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalMicroserviceDSL.g:187:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:191:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalMicroserviceDSL.g:192:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:192:2: ( ( rule__Service__Group__0 ) )
            // InternalMicroserviceDSL.g:193:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalMicroserviceDSL.g:194:3: ( rule__Service__Group__0 )
            // InternalMicroserviceDSL.g:194:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleServiceConfigEntry"
    // InternalMicroserviceDSL.g:203:1: entryRuleServiceConfigEntry : ruleServiceConfigEntry EOF ;
    public final void entryRuleServiceConfigEntry() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:204:1: ( ruleServiceConfigEntry EOF )
            // InternalMicroserviceDSL.g:205:1: ruleServiceConfigEntry EOF
            {
             before(grammarAccess.getServiceConfigEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceConfigEntry();

            state._fsp--;

             after(grammarAccess.getServiceConfigEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceConfigEntry"


    // $ANTLR start "ruleServiceConfigEntry"
    // InternalMicroserviceDSL.g:212:1: ruleServiceConfigEntry : ( ( rule__ServiceConfigEntry__Alternatives ) ) ;
    public final void ruleServiceConfigEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:216:2: ( ( ( rule__ServiceConfigEntry__Alternatives ) ) )
            // InternalMicroserviceDSL.g:217:2: ( ( rule__ServiceConfigEntry__Alternatives ) )
            {
            // InternalMicroserviceDSL.g:217:2: ( ( rule__ServiceConfigEntry__Alternatives ) )
            // InternalMicroserviceDSL.g:218:3: ( rule__ServiceConfigEntry__Alternatives )
            {
             before(grammarAccess.getServiceConfigEntryAccess().getAlternatives()); 
            // InternalMicroserviceDSL.g:219:3: ( rule__ServiceConfigEntry__Alternatives )
            // InternalMicroserviceDSL.g:219:4: rule__ServiceConfigEntry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfigEntry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigEntryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceConfigEntry"


    // $ANTLR start "entryRuleServerConfig"
    // InternalMicroserviceDSL.g:228:1: entryRuleServerConfig : ruleServerConfig EOF ;
    public final void entryRuleServerConfig() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:229:1: ( ruleServerConfig EOF )
            // InternalMicroserviceDSL.g:230:1: ruleServerConfig EOF
            {
             before(grammarAccess.getServerConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleServerConfig();

            state._fsp--;

             after(grammarAccess.getServerConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServerConfig"


    // $ANTLR start "ruleServerConfig"
    // InternalMicroserviceDSL.g:237:1: ruleServerConfig : ( ( rule__ServerConfig__Group__0 ) ) ;
    public final void ruleServerConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:241:2: ( ( ( rule__ServerConfig__Group__0 ) ) )
            // InternalMicroserviceDSL.g:242:2: ( ( rule__ServerConfig__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:242:2: ( ( rule__ServerConfig__Group__0 ) )
            // InternalMicroserviceDSL.g:243:3: ( rule__ServerConfig__Group__0 )
            {
             before(grammarAccess.getServerConfigAccess().getGroup()); 
            // InternalMicroserviceDSL.g:244:3: ( rule__ServerConfig__Group__0 )
            // InternalMicroserviceDSL.g:244:4: rule__ServerConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServerConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServerConfig"


    // $ANTLR start "entryRuleApplicationConfig"
    // InternalMicroserviceDSL.g:253:1: entryRuleApplicationConfig : ruleApplicationConfig EOF ;
    public final void entryRuleApplicationConfig() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:254:1: ( ruleApplicationConfig EOF )
            // InternalMicroserviceDSL.g:255:1: ruleApplicationConfig EOF
            {
             before(grammarAccess.getApplicationConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleApplicationConfig();

            state._fsp--;

             after(grammarAccess.getApplicationConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplicationConfig"


    // $ANTLR start "ruleApplicationConfig"
    // InternalMicroserviceDSL.g:262:1: ruleApplicationConfig : ( ( rule__ApplicationConfig__Group__0 ) ) ;
    public final void ruleApplicationConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:266:2: ( ( ( rule__ApplicationConfig__Group__0 ) ) )
            // InternalMicroserviceDSL.g:267:2: ( ( rule__ApplicationConfig__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:267:2: ( ( rule__ApplicationConfig__Group__0 ) )
            // InternalMicroserviceDSL.g:268:3: ( rule__ApplicationConfig__Group__0 )
            {
             before(grammarAccess.getApplicationConfigAccess().getGroup()); 
            // InternalMicroserviceDSL.g:269:3: ( rule__ApplicationConfig__Group__0 )
            // InternalMicroserviceDSL.g:269:4: rule__ApplicationConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationConfig"


    // $ANTLR start "entryRuleDatabaseConfig"
    // InternalMicroserviceDSL.g:278:1: entryRuleDatabaseConfig : ruleDatabaseConfig EOF ;
    public final void entryRuleDatabaseConfig() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:279:1: ( ruleDatabaseConfig EOF )
            // InternalMicroserviceDSL.g:280:1: ruleDatabaseConfig EOF
            {
             before(grammarAccess.getDatabaseConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleDatabaseConfig();

            state._fsp--;

             after(grammarAccess.getDatabaseConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatabaseConfig"


    // $ANTLR start "ruleDatabaseConfig"
    // InternalMicroserviceDSL.g:287:1: ruleDatabaseConfig : ( ( rule__DatabaseConfig__Group__0 ) ) ;
    public final void ruleDatabaseConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:291:2: ( ( ( rule__DatabaseConfig__Group__0 ) ) )
            // InternalMicroserviceDSL.g:292:2: ( ( rule__DatabaseConfig__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:292:2: ( ( rule__DatabaseConfig__Group__0 ) )
            // InternalMicroserviceDSL.g:293:3: ( rule__DatabaseConfig__Group__0 )
            {
             before(grammarAccess.getDatabaseConfigAccess().getGroup()); 
            // InternalMicroserviceDSL.g:294:3: ( rule__DatabaseConfig__Group__0 )
            // InternalMicroserviceDSL.g:294:4: rule__DatabaseConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatabaseConfig"


    // $ANTLR start "entryRuleActuatorConfig"
    // InternalMicroserviceDSL.g:303:1: entryRuleActuatorConfig : ruleActuatorConfig EOF ;
    public final void entryRuleActuatorConfig() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:304:1: ( ruleActuatorConfig EOF )
            // InternalMicroserviceDSL.g:305:1: ruleActuatorConfig EOF
            {
             before(grammarAccess.getActuatorConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleActuatorConfig();

            state._fsp--;

             after(grammarAccess.getActuatorConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActuatorConfig"


    // $ANTLR start "ruleActuatorConfig"
    // InternalMicroserviceDSL.g:312:1: ruleActuatorConfig : ( ( rule__ActuatorConfig__Group__0 ) ) ;
    public final void ruleActuatorConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:316:2: ( ( ( rule__ActuatorConfig__Group__0 ) ) )
            // InternalMicroserviceDSL.g:317:2: ( ( rule__ActuatorConfig__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:317:2: ( ( rule__ActuatorConfig__Group__0 ) )
            // InternalMicroserviceDSL.g:318:3: ( rule__ActuatorConfig__Group__0 )
            {
             before(grammarAccess.getActuatorConfigAccess().getGroup()); 
            // InternalMicroserviceDSL.g:319:3: ( rule__ActuatorConfig__Group__0 )
            // InternalMicroserviceDSL.g:319:4: rule__ActuatorConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuatorConfig"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMicroserviceDSL.g:328:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMicroserviceDSL.g:329:1: ( ruleQualifiedName EOF )
            // InternalMicroserviceDSL.g:330:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMicroserviceDSL.g:337:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:341:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMicroserviceDSL.g:342:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMicroserviceDSL.g:342:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMicroserviceDSL.g:343:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalMicroserviceDSL.g:344:3: ( rule__QualifiedName__Group__0 )
            // InternalMicroserviceDSL.g:344:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleDependency"
    // InternalMicroserviceDSL.g:353:1: ruleDependency : ( ( rule__Dependency__Alternatives ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:357:1: ( ( ( rule__Dependency__Alternatives ) ) )
            // InternalMicroserviceDSL.g:358:2: ( ( rule__Dependency__Alternatives ) )
            {
            // InternalMicroserviceDSL.g:358:2: ( ( rule__Dependency__Alternatives ) )
            // InternalMicroserviceDSL.g:359:3: ( rule__Dependency__Alternatives )
            {
             before(grammarAccess.getDependencyAccess().getAlternatives()); 
            // InternalMicroserviceDSL.g:360:3: ( rule__Dependency__Alternatives )
            // InternalMicroserviceDSL.g:360:4: rule__Dependency__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "ruleDatabaseDriver"
    // InternalMicroserviceDSL.g:369:1: ruleDatabaseDriver : ( ( rule__DatabaseDriver__Alternatives ) ) ;
    public final void ruleDatabaseDriver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:373:1: ( ( ( rule__DatabaseDriver__Alternatives ) ) )
            // InternalMicroserviceDSL.g:374:2: ( ( rule__DatabaseDriver__Alternatives ) )
            {
            // InternalMicroserviceDSL.g:374:2: ( ( rule__DatabaseDriver__Alternatives ) )
            // InternalMicroserviceDSL.g:375:3: ( rule__DatabaseDriver__Alternatives )
            {
             before(grammarAccess.getDatabaseDriverAccess().getAlternatives()); 
            // InternalMicroserviceDSL.g:376:3: ( rule__DatabaseDriver__Alternatives )
            // InternalMicroserviceDSL.g:376:4: rule__DatabaseDriver__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseDriver__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseDriverAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatabaseDriver"


    // $ANTLR start "ruleDdlType"
    // InternalMicroserviceDSL.g:385:1: ruleDdlType : ( ( rule__DdlType__Alternatives ) ) ;
    public final void ruleDdlType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:389:1: ( ( ( rule__DdlType__Alternatives ) ) )
            // InternalMicroserviceDSL.g:390:2: ( ( rule__DdlType__Alternatives ) )
            {
            // InternalMicroserviceDSL.g:390:2: ( ( rule__DdlType__Alternatives ) )
            // InternalMicroserviceDSL.g:391:3: ( rule__DdlType__Alternatives )
            {
             before(grammarAccess.getDdlTypeAccess().getAlternatives()); 
            // InternalMicroserviceDSL.g:392:3: ( rule__DdlType__Alternatives )
            // InternalMicroserviceDSL.g:392:4: rule__DdlType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DdlType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDdlTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDdlType"


    // $ANTLR start "ruleLogLevel"
    // InternalMicroserviceDSL.g:401:1: ruleLogLevel : ( ( rule__LogLevel__Alternatives ) ) ;
    public final void ruleLogLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:405:1: ( ( ( rule__LogLevel__Alternatives ) ) )
            // InternalMicroserviceDSL.g:406:2: ( ( rule__LogLevel__Alternatives ) )
            {
            // InternalMicroserviceDSL.g:406:2: ( ( rule__LogLevel__Alternatives ) )
            // InternalMicroserviceDSL.g:407:3: ( rule__LogLevel__Alternatives )
            {
             before(grammarAccess.getLogLevelAccess().getAlternatives()); 
            // InternalMicroserviceDSL.g:408:3: ( rule__LogLevel__Alternatives )
            // InternalMicroserviceDSL.g:408:4: rule__LogLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogLevel"


    // $ANTLR start "rule__ServiceConfigEntry__Alternatives"
    // InternalMicroserviceDSL.g:416:1: rule__ServiceConfigEntry__Alternatives : ( ( ruleServerConfig ) | ( ruleApplicationConfig ) | ( ruleDatabaseConfig ) | ( ruleActuatorConfig ) );
    public final void rule__ServiceConfigEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:420:1: ( ( ruleServerConfig ) | ( ruleApplicationConfig ) | ( ruleDatabaseConfig ) | ( ruleActuatorConfig ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt1=1;
                }
                break;
            case 51:
                {
                alt1=2;
                }
                break;
            case 55:
                {
                alt1=3;
                }
                break;
            case 61:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMicroserviceDSL.g:421:2: ( ruleServerConfig )
                    {
                    // InternalMicroserviceDSL.g:421:2: ( ruleServerConfig )
                    // InternalMicroserviceDSL.g:422:3: ruleServerConfig
                    {
                     before(grammarAccess.getServiceConfigEntryAccess().getServerConfigParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleServerConfig();

                    state._fsp--;

                     after(grammarAccess.getServiceConfigEntryAccess().getServerConfigParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:427:2: ( ruleApplicationConfig )
                    {
                    // InternalMicroserviceDSL.g:427:2: ( ruleApplicationConfig )
                    // InternalMicroserviceDSL.g:428:3: ruleApplicationConfig
                    {
                     before(grammarAccess.getServiceConfigEntryAccess().getApplicationConfigParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleApplicationConfig();

                    state._fsp--;

                     after(grammarAccess.getServiceConfigEntryAccess().getApplicationConfigParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMicroserviceDSL.g:433:2: ( ruleDatabaseConfig )
                    {
                    // InternalMicroserviceDSL.g:433:2: ( ruleDatabaseConfig )
                    // InternalMicroserviceDSL.g:434:3: ruleDatabaseConfig
                    {
                     before(grammarAccess.getServiceConfigEntryAccess().getDatabaseConfigParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDatabaseConfig();

                    state._fsp--;

                     after(grammarAccess.getServiceConfigEntryAccess().getDatabaseConfigParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMicroserviceDSL.g:439:2: ( ruleActuatorConfig )
                    {
                    // InternalMicroserviceDSL.g:439:2: ( ruleActuatorConfig )
                    // InternalMicroserviceDSL.g:440:3: ruleActuatorConfig
                    {
                     before(grammarAccess.getServiceConfigEntryAccess().getActuatorConfigParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleActuatorConfig();

                    state._fsp--;

                     after(grammarAccess.getServiceConfigEntryAccess().getActuatorConfigParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfigEntry__Alternatives"


    // $ANTLR start "rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0"
    // InternalMicroserviceDSL.g:449:1: rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:453:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMicroserviceDSL.g:454:2: ( 'true' )
                    {
                    // InternalMicroserviceDSL.g:454:2: ( 'true' )
                    // InternalMicroserviceDSL.g:455:3: 'true'
                    {
                     before(grammarAccess.getActuatorConfigAccess().getMetricsEnabledTrueKeyword_3_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getActuatorConfigAccess().getMetricsEnabledTrueKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:460:2: ( 'false' )
                    {
                    // InternalMicroserviceDSL.g:460:2: ( 'false' )
                    // InternalMicroserviceDSL.g:461:3: 'false'
                    {
                     before(grammarAccess.getActuatorConfigAccess().getMetricsEnabledFalseKeyword_3_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getActuatorConfigAccess().getMetricsEnabledFalseKeyword_3_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0"


    // $ANTLR start "rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0"
    // InternalMicroserviceDSL.g:470:1: rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:474:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMicroserviceDSL.g:475:2: ( 'true' )
                    {
                    // InternalMicroserviceDSL.g:475:2: ( 'true' )
                    // InternalMicroserviceDSL.g:476:3: 'true'
                    {
                     before(grammarAccess.getActuatorConfigAccess().getInfoEnabledTrueKeyword_4_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getActuatorConfigAccess().getInfoEnabledTrueKeyword_4_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:481:2: ( 'false' )
                    {
                    // InternalMicroserviceDSL.g:481:2: ( 'false' )
                    // InternalMicroserviceDSL.g:482:3: 'false'
                    {
                     before(grammarAccess.getActuatorConfigAccess().getInfoEnabledFalseKeyword_4_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getActuatorConfigAccess().getInfoEnabledFalseKeyword_4_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0"


    // $ANTLR start "rule__Dependency__Alternatives"
    // InternalMicroserviceDSL.g:491:1: rule__Dependency__Alternatives : ( ( ( 'JPA' ) ) | ( ( 'SPRING_WEB' ) ) | ( ( 'EUREKA_CLIENT' ) ) | ( ( 'CONFIG_CLIENT' ) ) | ( ( 'ACTUATOR' ) ) | ( ( 'LOMBOK' ) ) | ( ( 'CUSTOM' ) ) );
    public final void rule__Dependency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:495:1: ( ( ( 'JPA' ) ) | ( ( 'SPRING_WEB' ) ) | ( ( 'EUREKA_CLIENT' ) ) | ( ( 'CONFIG_CLIENT' ) ) | ( ( 'ACTUATOR' ) ) | ( ( 'LOMBOK' ) ) | ( ( 'CUSTOM' ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMicroserviceDSL.g:496:2: ( ( 'JPA' ) )
                    {
                    // InternalMicroserviceDSL.g:496:2: ( ( 'JPA' ) )
                    // InternalMicroserviceDSL.g:497:3: ( 'JPA' )
                    {
                     before(grammarAccess.getDependencyAccess().getJPAEnumLiteralDeclaration_0()); 
                    // InternalMicroserviceDSL.g:498:3: ( 'JPA' )
                    // InternalMicroserviceDSL.g:498:4: 'JPA'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyAccess().getJPAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:502:2: ( ( 'SPRING_WEB' ) )
                    {
                    // InternalMicroserviceDSL.g:502:2: ( ( 'SPRING_WEB' ) )
                    // InternalMicroserviceDSL.g:503:3: ( 'SPRING_WEB' )
                    {
                     before(grammarAccess.getDependencyAccess().getSPRING_WEBEnumLiteralDeclaration_1()); 
                    // InternalMicroserviceDSL.g:504:3: ( 'SPRING_WEB' )
                    // InternalMicroserviceDSL.g:504:4: 'SPRING_WEB'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyAccess().getSPRING_WEBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMicroserviceDSL.g:508:2: ( ( 'EUREKA_CLIENT' ) )
                    {
                    // InternalMicroserviceDSL.g:508:2: ( ( 'EUREKA_CLIENT' ) )
                    // InternalMicroserviceDSL.g:509:3: ( 'EUREKA_CLIENT' )
                    {
                     before(grammarAccess.getDependencyAccess().getEUREKA_CLIENTEnumLiteralDeclaration_2()); 
                    // InternalMicroserviceDSL.g:510:3: ( 'EUREKA_CLIENT' )
                    // InternalMicroserviceDSL.g:510:4: 'EUREKA_CLIENT'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyAccess().getEUREKA_CLIENTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMicroserviceDSL.g:514:2: ( ( 'CONFIG_CLIENT' ) )
                    {
                    // InternalMicroserviceDSL.g:514:2: ( ( 'CONFIG_CLIENT' ) )
                    // InternalMicroserviceDSL.g:515:3: ( 'CONFIG_CLIENT' )
                    {
                     before(grammarAccess.getDependencyAccess().getCONFIG_CLIENTEnumLiteralDeclaration_3()); 
                    // InternalMicroserviceDSL.g:516:3: ( 'CONFIG_CLIENT' )
                    // InternalMicroserviceDSL.g:516:4: 'CONFIG_CLIENT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyAccess().getCONFIG_CLIENTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMicroserviceDSL.g:520:2: ( ( 'ACTUATOR' ) )
                    {
                    // InternalMicroserviceDSL.g:520:2: ( ( 'ACTUATOR' ) )
                    // InternalMicroserviceDSL.g:521:3: ( 'ACTUATOR' )
                    {
                     before(grammarAccess.getDependencyAccess().getACTUATOREnumLiteralDeclaration_4()); 
                    // InternalMicroserviceDSL.g:522:3: ( 'ACTUATOR' )
                    // InternalMicroserviceDSL.g:522:4: 'ACTUATOR'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyAccess().getACTUATOREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMicroserviceDSL.g:526:2: ( ( 'LOMBOK' ) )
                    {
                    // InternalMicroserviceDSL.g:526:2: ( ( 'LOMBOK' ) )
                    // InternalMicroserviceDSL.g:527:3: ( 'LOMBOK' )
                    {
                     before(grammarAccess.getDependencyAccess().getLOMBOKEnumLiteralDeclaration_5()); 
                    // InternalMicroserviceDSL.g:528:3: ( 'LOMBOK' )
                    // InternalMicroserviceDSL.g:528:4: 'LOMBOK'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyAccess().getLOMBOKEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMicroserviceDSL.g:532:2: ( ( 'CUSTOM' ) )
                    {
                    // InternalMicroserviceDSL.g:532:2: ( ( 'CUSTOM' ) )
                    // InternalMicroserviceDSL.g:533:3: ( 'CUSTOM' )
                    {
                     before(grammarAccess.getDependencyAccess().getCUSTOMEnumLiteralDeclaration_6()); 
                    // InternalMicroserviceDSL.g:534:3: ( 'CUSTOM' )
                    // InternalMicroserviceDSL.g:534:4: 'CUSTOM'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDependencyAccess().getCUSTOMEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Alternatives"


    // $ANTLR start "rule__DatabaseDriver__Alternatives"
    // InternalMicroserviceDSL.g:542:1: rule__DatabaseDriver__Alternatives : ( ( ( 'MYSQL' ) ) | ( ( 'POSTGRESQL' ) ) | ( ( 'H2' ) ) );
    public final void rule__DatabaseDriver__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:546:1: ( ( ( 'MYSQL' ) ) | ( ( 'POSTGRESQL' ) ) | ( ( 'H2' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMicroserviceDSL.g:547:2: ( ( 'MYSQL' ) )
                    {
                    // InternalMicroserviceDSL.g:547:2: ( ( 'MYSQL' ) )
                    // InternalMicroserviceDSL.g:548:3: ( 'MYSQL' )
                    {
                     before(grammarAccess.getDatabaseDriverAccess().getMYSQLEnumLiteralDeclaration_0()); 
                    // InternalMicroserviceDSL.g:549:3: ( 'MYSQL' )
                    // InternalMicroserviceDSL.g:549:4: 'MYSQL'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseDriverAccess().getMYSQLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:553:2: ( ( 'POSTGRESQL' ) )
                    {
                    // InternalMicroserviceDSL.g:553:2: ( ( 'POSTGRESQL' ) )
                    // InternalMicroserviceDSL.g:554:3: ( 'POSTGRESQL' )
                    {
                     before(grammarAccess.getDatabaseDriverAccess().getPOSTGRESQLEnumLiteralDeclaration_1()); 
                    // InternalMicroserviceDSL.g:555:3: ( 'POSTGRESQL' )
                    // InternalMicroserviceDSL.g:555:4: 'POSTGRESQL'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseDriverAccess().getPOSTGRESQLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMicroserviceDSL.g:559:2: ( ( 'H2' ) )
                    {
                    // InternalMicroserviceDSL.g:559:2: ( ( 'H2' ) )
                    // InternalMicroserviceDSL.g:560:3: ( 'H2' )
                    {
                     before(grammarAccess.getDatabaseDriverAccess().getH2EnumLiteralDeclaration_2()); 
                    // InternalMicroserviceDSL.g:561:3: ( 'H2' )
                    // InternalMicroserviceDSL.g:561:4: 'H2'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseDriverAccess().getH2EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseDriver__Alternatives"


    // $ANTLR start "rule__DdlType__Alternatives"
    // InternalMicroserviceDSL.g:569:1: rule__DdlType__Alternatives : ( ( ( 'CREATE' ) ) | ( ( 'CREATE_UPDATE' ) ) );
    public final void rule__DdlType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:573:1: ( ( ( 'CREATE' ) ) | ( ( 'CREATE_UPDATE' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMicroserviceDSL.g:574:2: ( ( 'CREATE' ) )
                    {
                    // InternalMicroserviceDSL.g:574:2: ( ( 'CREATE' ) )
                    // InternalMicroserviceDSL.g:575:3: ( 'CREATE' )
                    {
                     before(grammarAccess.getDdlTypeAccess().getCREATEEnumLiteralDeclaration_0()); 
                    // InternalMicroserviceDSL.g:576:3: ( 'CREATE' )
                    // InternalMicroserviceDSL.g:576:4: 'CREATE'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDdlTypeAccess().getCREATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:580:2: ( ( 'CREATE_UPDATE' ) )
                    {
                    // InternalMicroserviceDSL.g:580:2: ( ( 'CREATE_UPDATE' ) )
                    // InternalMicroserviceDSL.g:581:3: ( 'CREATE_UPDATE' )
                    {
                     before(grammarAccess.getDdlTypeAccess().getCREATE_UPDATEEnumLiteralDeclaration_1()); 
                    // InternalMicroserviceDSL.g:582:3: ( 'CREATE_UPDATE' )
                    // InternalMicroserviceDSL.g:582:4: 'CREATE_UPDATE'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDdlTypeAccess().getCREATE_UPDATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DdlType__Alternatives"


    // $ANTLR start "rule__LogLevel__Alternatives"
    // InternalMicroserviceDSL.g:590:1: rule__LogLevel__Alternatives : ( ( ( 'INFO' ) ) | ( ( 'DEBUG' ) ) | ( ( 'WARN' ) ) | ( ( 'ERROR' ) ) | ( ( 'TRACE' ) ) );
    public final void rule__LogLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:594:1: ( ( ( 'INFO' ) ) | ( ( 'DEBUG' ) ) | ( ( 'WARN' ) ) | ( ( 'ERROR' ) ) | ( ( 'TRACE' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            case 28:
                {
                alt7=4;
                }
                break;
            case 29:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMicroserviceDSL.g:595:2: ( ( 'INFO' ) )
                    {
                    // InternalMicroserviceDSL.g:595:2: ( ( 'INFO' ) )
                    // InternalMicroserviceDSL.g:596:3: ( 'INFO' )
                    {
                     before(grammarAccess.getLogLevelAccess().getINFOEnumLiteralDeclaration_0()); 
                    // InternalMicroserviceDSL.g:597:3: ( 'INFO' )
                    // InternalMicroserviceDSL.g:597:4: 'INFO'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getINFOEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMicroserviceDSL.g:601:2: ( ( 'DEBUG' ) )
                    {
                    // InternalMicroserviceDSL.g:601:2: ( ( 'DEBUG' ) )
                    // InternalMicroserviceDSL.g:602:3: ( 'DEBUG' )
                    {
                     before(grammarAccess.getLogLevelAccess().getDEBUGEnumLiteralDeclaration_1()); 
                    // InternalMicroserviceDSL.g:603:3: ( 'DEBUG' )
                    // InternalMicroserviceDSL.g:603:4: 'DEBUG'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getDEBUGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMicroserviceDSL.g:607:2: ( ( 'WARN' ) )
                    {
                    // InternalMicroserviceDSL.g:607:2: ( ( 'WARN' ) )
                    // InternalMicroserviceDSL.g:608:3: ( 'WARN' )
                    {
                     before(grammarAccess.getLogLevelAccess().getWARNEnumLiteralDeclaration_2()); 
                    // InternalMicroserviceDSL.g:609:3: ( 'WARN' )
                    // InternalMicroserviceDSL.g:609:4: 'WARN'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getWARNEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMicroserviceDSL.g:613:2: ( ( 'ERROR' ) )
                    {
                    // InternalMicroserviceDSL.g:613:2: ( ( 'ERROR' ) )
                    // InternalMicroserviceDSL.g:614:3: ( 'ERROR' )
                    {
                     before(grammarAccess.getLogLevelAccess().getERROREnumLiteralDeclaration_3()); 
                    // InternalMicroserviceDSL.g:615:3: ( 'ERROR' )
                    // InternalMicroserviceDSL.g:615:4: 'ERROR'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getERROREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMicroserviceDSL.g:619:2: ( ( 'TRACE' ) )
                    {
                    // InternalMicroserviceDSL.g:619:2: ( ( 'TRACE' ) )
                    // InternalMicroserviceDSL.g:620:3: ( 'TRACE' )
                    {
                     before(grammarAccess.getLogLevelAccess().getTRACEEnumLiteralDeclaration_4()); 
                    // InternalMicroserviceDSL.g:621:3: ( 'TRACE' )
                    // InternalMicroserviceDSL.g:621:4: 'TRACE'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getTRACEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogLevel__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMicroserviceDSL.g:629:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:633:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMicroserviceDSL.g:634:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMicroserviceDSL.g:641:1: rule__Model__Group__0__Impl : ( 'project' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:645:1: ( ( 'project' ) )
            // InternalMicroserviceDSL.g:646:1: ( 'project' )
            {
            // InternalMicroserviceDSL.g:646:1: ( 'project' )
            // InternalMicroserviceDSL.g:647:2: 'project'
            {
             before(grammarAccess.getModelAccess().getProjectKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getProjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMicroserviceDSL.g:656:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:660:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMicroserviceDSL.g:661:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMicroserviceDSL.g:668:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:672:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalMicroserviceDSL.g:673:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalMicroserviceDSL.g:673:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalMicroserviceDSL.g:674:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalMicroserviceDSL.g:675:2: ( rule__Model__NameAssignment_1 )
            // InternalMicroserviceDSL.g:675:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMicroserviceDSL.g:683:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:687:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMicroserviceDSL.g:688:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMicroserviceDSL.g:695:1: rule__Model__Group__2__Impl : ( 'group' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:699:1: ( ( 'group' ) )
            // InternalMicroserviceDSL.g:700:1: ( 'group' )
            {
            // InternalMicroserviceDSL.g:700:1: ( 'group' )
            // InternalMicroserviceDSL.g:701:2: 'group'
            {
             before(grammarAccess.getModelAccess().getGroupKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getGroupKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalMicroserviceDSL.g:710:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:714:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalMicroserviceDSL.g:715:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalMicroserviceDSL.g:722:1: rule__Model__Group__3__Impl : ( ( rule__Model__GroupNameAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:726:1: ( ( ( rule__Model__GroupNameAssignment_3 ) ) )
            // InternalMicroserviceDSL.g:727:1: ( ( rule__Model__GroupNameAssignment_3 ) )
            {
            // InternalMicroserviceDSL.g:727:1: ( ( rule__Model__GroupNameAssignment_3 ) )
            // InternalMicroserviceDSL.g:728:2: ( rule__Model__GroupNameAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getGroupNameAssignment_3()); 
            // InternalMicroserviceDSL.g:729:2: ( rule__Model__GroupNameAssignment_3 )
            // InternalMicroserviceDSL.g:729:3: rule__Model__GroupNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__GroupNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroupNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalMicroserviceDSL.g:737:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:741:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalMicroserviceDSL.g:742:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalMicroserviceDSL.g:749:1: rule__Model__Group__4__Impl : ( 'version' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:753:1: ( ( 'version' ) )
            // InternalMicroserviceDSL.g:754:1: ( 'version' )
            {
            // InternalMicroserviceDSL.g:754:1: ( 'version' )
            // InternalMicroserviceDSL.g:755:2: 'version'
            {
             before(grammarAccess.getModelAccess().getVersionKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getVersionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalMicroserviceDSL.g:764:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:768:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalMicroserviceDSL.g:769:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalMicroserviceDSL.g:776:1: rule__Model__Group__5__Impl : ( ( rule__Model__VersionAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:780:1: ( ( ( rule__Model__VersionAssignment_5 ) ) )
            // InternalMicroserviceDSL.g:781:1: ( ( rule__Model__VersionAssignment_5 ) )
            {
            // InternalMicroserviceDSL.g:781:1: ( ( rule__Model__VersionAssignment_5 ) )
            // InternalMicroserviceDSL.g:782:2: ( rule__Model__VersionAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getVersionAssignment_5()); 
            // InternalMicroserviceDSL.g:783:2: ( rule__Model__VersionAssignment_5 )
            // InternalMicroserviceDSL.g:783:3: rule__Model__VersionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Model__VersionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getVersionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalMicroserviceDSL.g:791:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:795:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalMicroserviceDSL.g:796:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalMicroserviceDSL.g:803:1: rule__Model__Group__6__Impl : ( 'description' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:807:1: ( ( 'description' ) )
            // InternalMicroserviceDSL.g:808:1: ( 'description' )
            {
            // InternalMicroserviceDSL.g:808:1: ( 'description' )
            // InternalMicroserviceDSL.g:809:2: 'description'
            {
             before(grammarAccess.getModelAccess().getDescriptionKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getDescriptionKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalMicroserviceDSL.g:818:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:822:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalMicroserviceDSL.g:823:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalMicroserviceDSL.g:830:1: rule__Model__Group__7__Impl : ( ( rule__Model__DescriptionAssignment_7 ) ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:834:1: ( ( ( rule__Model__DescriptionAssignment_7 ) ) )
            // InternalMicroserviceDSL.g:835:1: ( ( rule__Model__DescriptionAssignment_7 ) )
            {
            // InternalMicroserviceDSL.g:835:1: ( ( rule__Model__DescriptionAssignment_7 ) )
            // InternalMicroserviceDSL.g:836:2: ( rule__Model__DescriptionAssignment_7 )
            {
             before(grammarAccess.getModelAccess().getDescriptionAssignment_7()); 
            // InternalMicroserviceDSL.g:837:2: ( rule__Model__DescriptionAssignment_7 )
            // InternalMicroserviceDSL.g:837:3: rule__Model__DescriptionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Model__DescriptionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDescriptionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // InternalMicroserviceDSL.g:845:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:849:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // InternalMicroserviceDSL.g:850:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // InternalMicroserviceDSL.g:857:1: rule__Model__Group__8__Impl : ( '{' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:861:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:862:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:862:1: ( '{' )
            // InternalMicroserviceDSL.g:863:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // InternalMicroserviceDSL.g:872:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:876:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // InternalMicroserviceDSL.g:877:2: rule__Model__Group__9__Impl rule__Model__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Model__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // InternalMicroserviceDSL.g:884:1: rule__Model__Group__9__Impl : ( ( rule__Model__DiscoveryAssignment_9 ) ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:888:1: ( ( ( rule__Model__DiscoveryAssignment_9 ) ) )
            // InternalMicroserviceDSL.g:889:1: ( ( rule__Model__DiscoveryAssignment_9 ) )
            {
            // InternalMicroserviceDSL.g:889:1: ( ( rule__Model__DiscoveryAssignment_9 ) )
            // InternalMicroserviceDSL.g:890:2: ( rule__Model__DiscoveryAssignment_9 )
            {
             before(grammarAccess.getModelAccess().getDiscoveryAssignment_9()); 
            // InternalMicroserviceDSL.g:891:2: ( rule__Model__DiscoveryAssignment_9 )
            // InternalMicroserviceDSL.g:891:3: rule__Model__DiscoveryAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Model__DiscoveryAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDiscoveryAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group__10"
    // InternalMicroserviceDSL.g:899:1: rule__Model__Group__10 : rule__Model__Group__10__Impl rule__Model__Group__11 ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:903:1: ( rule__Model__Group__10__Impl rule__Model__Group__11 )
            // InternalMicroserviceDSL.g:904:2: rule__Model__Group__10__Impl rule__Model__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Model__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10"


    // $ANTLR start "rule__Model__Group__10__Impl"
    // InternalMicroserviceDSL.g:911:1: rule__Model__Group__10__Impl : ( ( rule__Model__ConfigServerAssignment_10 ) ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:915:1: ( ( ( rule__Model__ConfigServerAssignment_10 ) ) )
            // InternalMicroserviceDSL.g:916:1: ( ( rule__Model__ConfigServerAssignment_10 ) )
            {
            // InternalMicroserviceDSL.g:916:1: ( ( rule__Model__ConfigServerAssignment_10 ) )
            // InternalMicroserviceDSL.g:917:2: ( rule__Model__ConfigServerAssignment_10 )
            {
             before(grammarAccess.getModelAccess().getConfigServerAssignment_10()); 
            // InternalMicroserviceDSL.g:918:2: ( rule__Model__ConfigServerAssignment_10 )
            // InternalMicroserviceDSL.g:918:3: rule__Model__ConfigServerAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Model__ConfigServerAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getConfigServerAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10__Impl"


    // $ANTLR start "rule__Model__Group__11"
    // InternalMicroserviceDSL.g:926:1: rule__Model__Group__11 : rule__Model__Group__11__Impl rule__Model__Group__12 ;
    public final void rule__Model__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:930:1: ( rule__Model__Group__11__Impl rule__Model__Group__12 )
            // InternalMicroserviceDSL.g:931:2: rule__Model__Group__11__Impl rule__Model__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__Model__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11"


    // $ANTLR start "rule__Model__Group__11__Impl"
    // InternalMicroserviceDSL.g:938:1: rule__Model__Group__11__Impl : ( ( rule__Model__ServicesAssignment_11 )* ) ;
    public final void rule__Model__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:942:1: ( ( ( rule__Model__ServicesAssignment_11 )* ) )
            // InternalMicroserviceDSL.g:943:1: ( ( rule__Model__ServicesAssignment_11 )* )
            {
            // InternalMicroserviceDSL.g:943:1: ( ( rule__Model__ServicesAssignment_11 )* )
            // InternalMicroserviceDSL.g:944:2: ( rule__Model__ServicesAssignment_11 )*
            {
             before(grammarAccess.getModelAccess().getServicesAssignment_11()); 
            // InternalMicroserviceDSL.g:945:2: ( rule__Model__ServicesAssignment_11 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==44) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:945:3: rule__Model__ServicesAssignment_11
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Model__ServicesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getServicesAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11__Impl"


    // $ANTLR start "rule__Model__Group__12"
    // InternalMicroserviceDSL.g:953:1: rule__Model__Group__12 : rule__Model__Group__12__Impl rule__Model__Group__13 ;
    public final void rule__Model__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:957:1: ( rule__Model__Group__12__Impl rule__Model__Group__13 )
            // InternalMicroserviceDSL.g:958:2: rule__Model__Group__12__Impl rule__Model__Group__13
            {
            pushFollow(FOLLOW_13);
            rule__Model__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__12"


    // $ANTLR start "rule__Model__Group__12__Impl"
    // InternalMicroserviceDSL.g:965:1: rule__Model__Group__12__Impl : ( ( rule__Model__GatewayAssignment_12 ) ) ;
    public final void rule__Model__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:969:1: ( ( ( rule__Model__GatewayAssignment_12 ) ) )
            // InternalMicroserviceDSL.g:970:1: ( ( rule__Model__GatewayAssignment_12 ) )
            {
            // InternalMicroserviceDSL.g:970:1: ( ( rule__Model__GatewayAssignment_12 ) )
            // InternalMicroserviceDSL.g:971:2: ( rule__Model__GatewayAssignment_12 )
            {
             before(grammarAccess.getModelAccess().getGatewayAssignment_12()); 
            // InternalMicroserviceDSL.g:972:2: ( rule__Model__GatewayAssignment_12 )
            // InternalMicroserviceDSL.g:972:3: rule__Model__GatewayAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Model__GatewayAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGatewayAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__12__Impl"


    // $ANTLR start "rule__Model__Group__13"
    // InternalMicroserviceDSL.g:980:1: rule__Model__Group__13 : rule__Model__Group__13__Impl ;
    public final void rule__Model__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:984:1: ( rule__Model__Group__13__Impl )
            // InternalMicroserviceDSL.g:985:2: rule__Model__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__13"


    // $ANTLR start "rule__Model__Group__13__Impl"
    // InternalMicroserviceDSL.g:991:1: rule__Model__Group__13__Impl : ( '}' ) ;
    public final void rule__Model__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:995:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:996:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:996:1: ( '}' )
            // InternalMicroserviceDSL.g:997:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_13()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__13__Impl"


    // $ANTLR start "rule__Discovery__Group__0"
    // InternalMicroserviceDSL.g:1007:1: rule__Discovery__Group__0 : rule__Discovery__Group__0__Impl rule__Discovery__Group__1 ;
    public final void rule__Discovery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1011:1: ( rule__Discovery__Group__0__Impl rule__Discovery__Group__1 )
            // InternalMicroserviceDSL.g:1012:2: rule__Discovery__Group__0__Impl rule__Discovery__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Discovery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__0"


    // $ANTLR start "rule__Discovery__Group__0__Impl"
    // InternalMicroserviceDSL.g:1019:1: rule__Discovery__Group__0__Impl : ( 'discovery' ) ;
    public final void rule__Discovery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1023:1: ( ( 'discovery' ) )
            // InternalMicroserviceDSL.g:1024:1: ( 'discovery' )
            {
            // InternalMicroserviceDSL.g:1024:1: ( 'discovery' )
            // InternalMicroserviceDSL.g:1025:2: 'discovery'
            {
             before(grammarAccess.getDiscoveryAccess().getDiscoveryKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getDiscoveryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__0__Impl"


    // $ANTLR start "rule__Discovery__Group__1"
    // InternalMicroserviceDSL.g:1034:1: rule__Discovery__Group__1 : rule__Discovery__Group__1__Impl rule__Discovery__Group__2 ;
    public final void rule__Discovery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1038:1: ( rule__Discovery__Group__1__Impl rule__Discovery__Group__2 )
            // InternalMicroserviceDSL.g:1039:2: rule__Discovery__Group__1__Impl rule__Discovery__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Discovery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__1"


    // $ANTLR start "rule__Discovery__Group__1__Impl"
    // InternalMicroserviceDSL.g:1046:1: rule__Discovery__Group__1__Impl : ( ( rule__Discovery__NameAssignment_1 ) ) ;
    public final void rule__Discovery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1050:1: ( ( ( rule__Discovery__NameAssignment_1 ) ) )
            // InternalMicroserviceDSL.g:1051:1: ( ( rule__Discovery__NameAssignment_1 ) )
            {
            // InternalMicroserviceDSL.g:1051:1: ( ( rule__Discovery__NameAssignment_1 ) )
            // InternalMicroserviceDSL.g:1052:2: ( rule__Discovery__NameAssignment_1 )
            {
             before(grammarAccess.getDiscoveryAccess().getNameAssignment_1()); 
            // InternalMicroserviceDSL.g:1053:2: ( rule__Discovery__NameAssignment_1 )
            // InternalMicroserviceDSL.g:1053:3: rule__Discovery__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Discovery__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiscoveryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__1__Impl"


    // $ANTLR start "rule__Discovery__Group__2"
    // InternalMicroserviceDSL.g:1061:1: rule__Discovery__Group__2 : rule__Discovery__Group__2__Impl rule__Discovery__Group__3 ;
    public final void rule__Discovery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1065:1: ( rule__Discovery__Group__2__Impl rule__Discovery__Group__3 )
            // InternalMicroserviceDSL.g:1066:2: rule__Discovery__Group__2__Impl rule__Discovery__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Discovery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__2"


    // $ANTLR start "rule__Discovery__Group__2__Impl"
    // InternalMicroserviceDSL.g:1073:1: rule__Discovery__Group__2__Impl : ( '{' ) ;
    public final void rule__Discovery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1077:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:1078:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:1078:1: ( '{' )
            // InternalMicroserviceDSL.g:1079:2: '{'
            {
             before(grammarAccess.getDiscoveryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__2__Impl"


    // $ANTLR start "rule__Discovery__Group__3"
    // InternalMicroserviceDSL.g:1088:1: rule__Discovery__Group__3 : rule__Discovery__Group__3__Impl rule__Discovery__Group__4 ;
    public final void rule__Discovery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1092:1: ( rule__Discovery__Group__3__Impl rule__Discovery__Group__4 )
            // InternalMicroserviceDSL.g:1093:2: rule__Discovery__Group__3__Impl rule__Discovery__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Discovery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__3"


    // $ANTLR start "rule__Discovery__Group__3__Impl"
    // InternalMicroserviceDSL.g:1100:1: rule__Discovery__Group__3__Impl : ( 'port' ) ;
    public final void rule__Discovery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1104:1: ( ( 'port' ) )
            // InternalMicroserviceDSL.g:1105:1: ( 'port' )
            {
            // InternalMicroserviceDSL.g:1105:1: ( 'port' )
            // InternalMicroserviceDSL.g:1106:2: 'port'
            {
             before(grammarAccess.getDiscoveryAccess().getPortKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getPortKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__3__Impl"


    // $ANTLR start "rule__Discovery__Group__4"
    // InternalMicroserviceDSL.g:1115:1: rule__Discovery__Group__4 : rule__Discovery__Group__4__Impl rule__Discovery__Group__5 ;
    public final void rule__Discovery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1119:1: ( rule__Discovery__Group__4__Impl rule__Discovery__Group__5 )
            // InternalMicroserviceDSL.g:1120:2: rule__Discovery__Group__4__Impl rule__Discovery__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Discovery__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__4"


    // $ANTLR start "rule__Discovery__Group__4__Impl"
    // InternalMicroserviceDSL.g:1127:1: rule__Discovery__Group__4__Impl : ( ( rule__Discovery__PortAssignment_4 ) ) ;
    public final void rule__Discovery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1131:1: ( ( ( rule__Discovery__PortAssignment_4 ) ) )
            // InternalMicroserviceDSL.g:1132:1: ( ( rule__Discovery__PortAssignment_4 ) )
            {
            // InternalMicroserviceDSL.g:1132:1: ( ( rule__Discovery__PortAssignment_4 ) )
            // InternalMicroserviceDSL.g:1133:2: ( rule__Discovery__PortAssignment_4 )
            {
             before(grammarAccess.getDiscoveryAccess().getPortAssignment_4()); 
            // InternalMicroserviceDSL.g:1134:2: ( rule__Discovery__PortAssignment_4 )
            // InternalMicroserviceDSL.g:1134:3: rule__Discovery__PortAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Discovery__PortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDiscoveryAccess().getPortAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__4__Impl"


    // $ANTLR start "rule__Discovery__Group__5"
    // InternalMicroserviceDSL.g:1142:1: rule__Discovery__Group__5 : rule__Discovery__Group__5__Impl rule__Discovery__Group__6 ;
    public final void rule__Discovery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1146:1: ( rule__Discovery__Group__5__Impl rule__Discovery__Group__6 )
            // InternalMicroserviceDSL.g:1147:2: rule__Discovery__Group__5__Impl rule__Discovery__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Discovery__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__5"


    // $ANTLR start "rule__Discovery__Group__5__Impl"
    // InternalMicroserviceDSL.g:1154:1: rule__Discovery__Group__5__Impl : ( ( rule__Discovery__Group_5__0 )? ) ;
    public final void rule__Discovery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1158:1: ( ( ( rule__Discovery__Group_5__0 )? ) )
            // InternalMicroserviceDSL.g:1159:1: ( ( rule__Discovery__Group_5__0 )? )
            {
            // InternalMicroserviceDSL.g:1159:1: ( ( rule__Discovery__Group_5__0 )? )
            // InternalMicroserviceDSL.g:1160:2: ( rule__Discovery__Group_5__0 )?
            {
             before(grammarAccess.getDiscoveryAccess().getGroup_5()); 
            // InternalMicroserviceDSL.g:1161:2: ( rule__Discovery__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMicroserviceDSL.g:1161:3: rule__Discovery__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Discovery__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiscoveryAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__5__Impl"


    // $ANTLR start "rule__Discovery__Group__6"
    // InternalMicroserviceDSL.g:1169:1: rule__Discovery__Group__6 : rule__Discovery__Group__6__Impl rule__Discovery__Group__7 ;
    public final void rule__Discovery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1173:1: ( rule__Discovery__Group__6__Impl rule__Discovery__Group__7 )
            // InternalMicroserviceDSL.g:1174:2: rule__Discovery__Group__6__Impl rule__Discovery__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Discovery__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__6"


    // $ANTLR start "rule__Discovery__Group__6__Impl"
    // InternalMicroserviceDSL.g:1181:1: rule__Discovery__Group__6__Impl : ( 'dependencies' ) ;
    public final void rule__Discovery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1185:1: ( ( 'dependencies' ) )
            // InternalMicroserviceDSL.g:1186:1: ( 'dependencies' )
            {
            // InternalMicroserviceDSL.g:1186:1: ( 'dependencies' )
            // InternalMicroserviceDSL.g:1187:2: 'dependencies'
            {
             before(grammarAccess.getDiscoveryAccess().getDependenciesKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getDependenciesKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__6__Impl"


    // $ANTLR start "rule__Discovery__Group__7"
    // InternalMicroserviceDSL.g:1196:1: rule__Discovery__Group__7 : rule__Discovery__Group__7__Impl rule__Discovery__Group__8 ;
    public final void rule__Discovery__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1200:1: ( rule__Discovery__Group__7__Impl rule__Discovery__Group__8 )
            // InternalMicroserviceDSL.g:1201:2: rule__Discovery__Group__7__Impl rule__Discovery__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Discovery__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__7"


    // $ANTLR start "rule__Discovery__Group__7__Impl"
    // InternalMicroserviceDSL.g:1208:1: rule__Discovery__Group__7__Impl : ( '{' ) ;
    public final void rule__Discovery__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1212:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:1213:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:1213:1: ( '{' )
            // InternalMicroserviceDSL.g:1214:2: '{'
            {
             before(grammarAccess.getDiscoveryAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__7__Impl"


    // $ANTLR start "rule__Discovery__Group__8"
    // InternalMicroserviceDSL.g:1223:1: rule__Discovery__Group__8 : rule__Discovery__Group__8__Impl rule__Discovery__Group__9 ;
    public final void rule__Discovery__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1227:1: ( rule__Discovery__Group__8__Impl rule__Discovery__Group__9 )
            // InternalMicroserviceDSL.g:1228:2: rule__Discovery__Group__8__Impl rule__Discovery__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Discovery__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__8"


    // $ANTLR start "rule__Discovery__Group__8__Impl"
    // InternalMicroserviceDSL.g:1235:1: rule__Discovery__Group__8__Impl : ( ( rule__Discovery__CustomDepsAssignment_8 )* ) ;
    public final void rule__Discovery__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1239:1: ( ( ( rule__Discovery__CustomDepsAssignment_8 )* ) )
            // InternalMicroserviceDSL.g:1240:1: ( ( rule__Discovery__CustomDepsAssignment_8 )* )
            {
            // InternalMicroserviceDSL.g:1240:1: ( ( rule__Discovery__CustomDepsAssignment_8 )* )
            // InternalMicroserviceDSL.g:1241:2: ( rule__Discovery__CustomDepsAssignment_8 )*
            {
             before(grammarAccess.getDiscoveryAccess().getCustomDepsAssignment_8()); 
            // InternalMicroserviceDSL.g:1242:2: ( rule__Discovery__CustomDepsAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=13 && LA10_0<=19)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:1242:3: rule__Discovery__CustomDepsAssignment_8
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Discovery__CustomDepsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDiscoveryAccess().getCustomDepsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__8__Impl"


    // $ANTLR start "rule__Discovery__Group__9"
    // InternalMicroserviceDSL.g:1250:1: rule__Discovery__Group__9 : rule__Discovery__Group__9__Impl rule__Discovery__Group__10 ;
    public final void rule__Discovery__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1254:1: ( rule__Discovery__Group__9__Impl rule__Discovery__Group__10 )
            // InternalMicroserviceDSL.g:1255:2: rule__Discovery__Group__9__Impl rule__Discovery__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Discovery__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__9"


    // $ANTLR start "rule__Discovery__Group__9__Impl"
    // InternalMicroserviceDSL.g:1262:1: rule__Discovery__Group__9__Impl : ( '}' ) ;
    public final void rule__Discovery__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1266:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:1267:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:1267:1: ( '}' )
            // InternalMicroserviceDSL.g:1268:2: '}'
            {
             before(grammarAccess.getDiscoveryAccess().getRightCurlyBracketKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__9__Impl"


    // $ANTLR start "rule__Discovery__Group__10"
    // InternalMicroserviceDSL.g:1277:1: rule__Discovery__Group__10 : rule__Discovery__Group__10__Impl ;
    public final void rule__Discovery__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1281:1: ( rule__Discovery__Group__10__Impl )
            // InternalMicroserviceDSL.g:1282:2: rule__Discovery__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Discovery__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__10"


    // $ANTLR start "rule__Discovery__Group__10__Impl"
    // InternalMicroserviceDSL.g:1288:1: rule__Discovery__Group__10__Impl : ( '}' ) ;
    public final void rule__Discovery__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1292:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:1293:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:1293:1: ( '}' )
            // InternalMicroserviceDSL.g:1294:2: '}'
            {
             before(grammarAccess.getDiscoveryAccess().getRightCurlyBracketKeyword_10()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group__10__Impl"


    // $ANTLR start "rule__Discovery__Group_5__0"
    // InternalMicroserviceDSL.g:1304:1: rule__Discovery__Group_5__0 : rule__Discovery__Group_5__0__Impl rule__Discovery__Group_5__1 ;
    public final void rule__Discovery__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1308:1: ( rule__Discovery__Group_5__0__Impl rule__Discovery__Group_5__1 )
            // InternalMicroserviceDSL.g:1309:2: rule__Discovery__Group_5__0__Impl rule__Discovery__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Discovery__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Discovery__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group_5__0"


    // $ANTLR start "rule__Discovery__Group_5__0__Impl"
    // InternalMicroserviceDSL.g:1316:1: rule__Discovery__Group_5__0__Impl : ( 'defaultZone' ) ;
    public final void rule__Discovery__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1320:1: ( ( 'defaultZone' ) )
            // InternalMicroserviceDSL.g:1321:1: ( 'defaultZone' )
            {
            // InternalMicroserviceDSL.g:1321:1: ( 'defaultZone' )
            // InternalMicroserviceDSL.g:1322:2: 'defaultZone'
            {
             before(grammarAccess.getDiscoveryAccess().getDefaultZoneKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getDefaultZoneKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group_5__0__Impl"


    // $ANTLR start "rule__Discovery__Group_5__1"
    // InternalMicroserviceDSL.g:1331:1: rule__Discovery__Group_5__1 : rule__Discovery__Group_5__1__Impl ;
    public final void rule__Discovery__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1335:1: ( rule__Discovery__Group_5__1__Impl )
            // InternalMicroserviceDSL.g:1336:2: rule__Discovery__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Discovery__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group_5__1"


    // $ANTLR start "rule__Discovery__Group_5__1__Impl"
    // InternalMicroserviceDSL.g:1342:1: rule__Discovery__Group_5__1__Impl : ( ( rule__Discovery__DefaultZoneAssignment_5_1 ) ) ;
    public final void rule__Discovery__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1346:1: ( ( ( rule__Discovery__DefaultZoneAssignment_5_1 ) ) )
            // InternalMicroserviceDSL.g:1347:1: ( ( rule__Discovery__DefaultZoneAssignment_5_1 ) )
            {
            // InternalMicroserviceDSL.g:1347:1: ( ( rule__Discovery__DefaultZoneAssignment_5_1 ) )
            // InternalMicroserviceDSL.g:1348:2: ( rule__Discovery__DefaultZoneAssignment_5_1 )
            {
             before(grammarAccess.getDiscoveryAccess().getDefaultZoneAssignment_5_1()); 
            // InternalMicroserviceDSL.g:1349:2: ( rule__Discovery__DefaultZoneAssignment_5_1 )
            // InternalMicroserviceDSL.g:1349:3: rule__Discovery__DefaultZoneAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Discovery__DefaultZoneAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDiscoveryAccess().getDefaultZoneAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__Group_5__1__Impl"


    // $ANTLR start "rule__Gateway__Group__0"
    // InternalMicroserviceDSL.g:1358:1: rule__Gateway__Group__0 : rule__Gateway__Group__0__Impl rule__Gateway__Group__1 ;
    public final void rule__Gateway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1362:1: ( rule__Gateway__Group__0__Impl rule__Gateway__Group__1 )
            // InternalMicroserviceDSL.g:1363:2: rule__Gateway__Group__0__Impl rule__Gateway__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Gateway__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__0"


    // $ANTLR start "rule__Gateway__Group__0__Impl"
    // InternalMicroserviceDSL.g:1370:1: rule__Gateway__Group__0__Impl : ( 'gateway' ) ;
    public final void rule__Gateway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1374:1: ( ( 'gateway' ) )
            // InternalMicroserviceDSL.g:1375:1: ( 'gateway' )
            {
            // InternalMicroserviceDSL.g:1375:1: ( 'gateway' )
            // InternalMicroserviceDSL.g:1376:2: 'gateway'
            {
             before(grammarAccess.getGatewayAccess().getGatewayKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getGatewayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__0__Impl"


    // $ANTLR start "rule__Gateway__Group__1"
    // InternalMicroserviceDSL.g:1385:1: rule__Gateway__Group__1 : rule__Gateway__Group__1__Impl rule__Gateway__Group__2 ;
    public final void rule__Gateway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1389:1: ( rule__Gateway__Group__1__Impl rule__Gateway__Group__2 )
            // InternalMicroserviceDSL.g:1390:2: rule__Gateway__Group__1__Impl rule__Gateway__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Gateway__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__1"


    // $ANTLR start "rule__Gateway__Group__1__Impl"
    // InternalMicroserviceDSL.g:1397:1: rule__Gateway__Group__1__Impl : ( ( rule__Gateway__NameAssignment_1 ) ) ;
    public final void rule__Gateway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1401:1: ( ( ( rule__Gateway__NameAssignment_1 ) ) )
            // InternalMicroserviceDSL.g:1402:1: ( ( rule__Gateway__NameAssignment_1 ) )
            {
            // InternalMicroserviceDSL.g:1402:1: ( ( rule__Gateway__NameAssignment_1 ) )
            // InternalMicroserviceDSL.g:1403:2: ( rule__Gateway__NameAssignment_1 )
            {
             before(grammarAccess.getGatewayAccess().getNameAssignment_1()); 
            // InternalMicroserviceDSL.g:1404:2: ( rule__Gateway__NameAssignment_1 )
            // InternalMicroserviceDSL.g:1404:3: rule__Gateway__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGatewayAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__1__Impl"


    // $ANTLR start "rule__Gateway__Group__2"
    // InternalMicroserviceDSL.g:1412:1: rule__Gateway__Group__2 : rule__Gateway__Group__2__Impl rule__Gateway__Group__3 ;
    public final void rule__Gateway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1416:1: ( rule__Gateway__Group__2__Impl rule__Gateway__Group__3 )
            // InternalMicroserviceDSL.g:1417:2: rule__Gateway__Group__2__Impl rule__Gateway__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Gateway__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__2"


    // $ANTLR start "rule__Gateway__Group__2__Impl"
    // InternalMicroserviceDSL.g:1424:1: rule__Gateway__Group__2__Impl : ( '{' ) ;
    public final void rule__Gateway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1428:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:1429:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:1429:1: ( '{' )
            // InternalMicroserviceDSL.g:1430:2: '{'
            {
             before(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__2__Impl"


    // $ANTLR start "rule__Gateway__Group__3"
    // InternalMicroserviceDSL.g:1439:1: rule__Gateway__Group__3 : rule__Gateway__Group__3__Impl rule__Gateway__Group__4 ;
    public final void rule__Gateway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1443:1: ( rule__Gateway__Group__3__Impl rule__Gateway__Group__4 )
            // InternalMicroserviceDSL.g:1444:2: rule__Gateway__Group__3__Impl rule__Gateway__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Gateway__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__3"


    // $ANTLR start "rule__Gateway__Group__3__Impl"
    // InternalMicroserviceDSL.g:1451:1: rule__Gateway__Group__3__Impl : ( 'port' ) ;
    public final void rule__Gateway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1455:1: ( ( 'port' ) )
            // InternalMicroserviceDSL.g:1456:1: ( 'port' )
            {
            // InternalMicroserviceDSL.g:1456:1: ( 'port' )
            // InternalMicroserviceDSL.g:1457:2: 'port'
            {
             before(grammarAccess.getGatewayAccess().getPortKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getPortKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__3__Impl"


    // $ANTLR start "rule__Gateway__Group__4"
    // InternalMicroserviceDSL.g:1466:1: rule__Gateway__Group__4 : rule__Gateway__Group__4__Impl rule__Gateway__Group__5 ;
    public final void rule__Gateway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1470:1: ( rule__Gateway__Group__4__Impl rule__Gateway__Group__5 )
            // InternalMicroserviceDSL.g:1471:2: rule__Gateway__Group__4__Impl rule__Gateway__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Gateway__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__4"


    // $ANTLR start "rule__Gateway__Group__4__Impl"
    // InternalMicroserviceDSL.g:1478:1: rule__Gateway__Group__4__Impl : ( ( rule__Gateway__PortAssignment_4 ) ) ;
    public final void rule__Gateway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1482:1: ( ( ( rule__Gateway__PortAssignment_4 ) ) )
            // InternalMicroserviceDSL.g:1483:1: ( ( rule__Gateway__PortAssignment_4 ) )
            {
            // InternalMicroserviceDSL.g:1483:1: ( ( rule__Gateway__PortAssignment_4 ) )
            // InternalMicroserviceDSL.g:1484:2: ( rule__Gateway__PortAssignment_4 )
            {
             before(grammarAccess.getGatewayAccess().getPortAssignment_4()); 
            // InternalMicroserviceDSL.g:1485:2: ( rule__Gateway__PortAssignment_4 )
            // InternalMicroserviceDSL.g:1485:3: rule__Gateway__PortAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__PortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGatewayAccess().getPortAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__4__Impl"


    // $ANTLR start "rule__Gateway__Group__5"
    // InternalMicroserviceDSL.g:1493:1: rule__Gateway__Group__5 : rule__Gateway__Group__5__Impl rule__Gateway__Group__6 ;
    public final void rule__Gateway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1497:1: ( rule__Gateway__Group__5__Impl rule__Gateway__Group__6 )
            // InternalMicroserviceDSL.g:1498:2: rule__Gateway__Group__5__Impl rule__Gateway__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Gateway__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__5"


    // $ANTLR start "rule__Gateway__Group__5__Impl"
    // InternalMicroserviceDSL.g:1505:1: rule__Gateway__Group__5__Impl : ( ( rule__Gateway__Group_5__0 )? ) ;
    public final void rule__Gateway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1509:1: ( ( ( rule__Gateway__Group_5__0 )? ) )
            // InternalMicroserviceDSL.g:1510:1: ( ( rule__Gateway__Group_5__0 )? )
            {
            // InternalMicroserviceDSL.g:1510:1: ( ( rule__Gateway__Group_5__0 )? )
            // InternalMicroserviceDSL.g:1511:2: ( rule__Gateway__Group_5__0 )?
            {
             before(grammarAccess.getGatewayAccess().getGroup_5()); 
            // InternalMicroserviceDSL.g:1512:2: ( rule__Gateway__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMicroserviceDSL.g:1512:3: rule__Gateway__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gateway__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGatewayAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__5__Impl"


    // $ANTLR start "rule__Gateway__Group__6"
    // InternalMicroserviceDSL.g:1520:1: rule__Gateway__Group__6 : rule__Gateway__Group__6__Impl rule__Gateway__Group__7 ;
    public final void rule__Gateway__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1524:1: ( rule__Gateway__Group__6__Impl rule__Gateway__Group__7 )
            // InternalMicroserviceDSL.g:1525:2: rule__Gateway__Group__6__Impl rule__Gateway__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Gateway__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__6"


    // $ANTLR start "rule__Gateway__Group__6__Impl"
    // InternalMicroserviceDSL.g:1532:1: rule__Gateway__Group__6__Impl : ( 'dependencies' ) ;
    public final void rule__Gateway__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1536:1: ( ( 'dependencies' ) )
            // InternalMicroserviceDSL.g:1537:1: ( 'dependencies' )
            {
            // InternalMicroserviceDSL.g:1537:1: ( 'dependencies' )
            // InternalMicroserviceDSL.g:1538:2: 'dependencies'
            {
             before(grammarAccess.getGatewayAccess().getDependenciesKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getDependenciesKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__6__Impl"


    // $ANTLR start "rule__Gateway__Group__7"
    // InternalMicroserviceDSL.g:1547:1: rule__Gateway__Group__7 : rule__Gateway__Group__7__Impl rule__Gateway__Group__8 ;
    public final void rule__Gateway__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1551:1: ( rule__Gateway__Group__7__Impl rule__Gateway__Group__8 )
            // InternalMicroserviceDSL.g:1552:2: rule__Gateway__Group__7__Impl rule__Gateway__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Gateway__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__7"


    // $ANTLR start "rule__Gateway__Group__7__Impl"
    // InternalMicroserviceDSL.g:1559:1: rule__Gateway__Group__7__Impl : ( '{' ) ;
    public final void rule__Gateway__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1563:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:1564:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:1564:1: ( '{' )
            // InternalMicroserviceDSL.g:1565:2: '{'
            {
             before(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__7__Impl"


    // $ANTLR start "rule__Gateway__Group__8"
    // InternalMicroserviceDSL.g:1574:1: rule__Gateway__Group__8 : rule__Gateway__Group__8__Impl rule__Gateway__Group__9 ;
    public final void rule__Gateway__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1578:1: ( rule__Gateway__Group__8__Impl rule__Gateway__Group__9 )
            // InternalMicroserviceDSL.g:1579:2: rule__Gateway__Group__8__Impl rule__Gateway__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Gateway__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__8"


    // $ANTLR start "rule__Gateway__Group__8__Impl"
    // InternalMicroserviceDSL.g:1586:1: rule__Gateway__Group__8__Impl : ( ( rule__Gateway__CustomDepsAssignment_8 )* ) ;
    public final void rule__Gateway__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1590:1: ( ( ( rule__Gateway__CustomDepsAssignment_8 )* ) )
            // InternalMicroserviceDSL.g:1591:1: ( ( rule__Gateway__CustomDepsAssignment_8 )* )
            {
            // InternalMicroserviceDSL.g:1591:1: ( ( rule__Gateway__CustomDepsAssignment_8 )* )
            // InternalMicroserviceDSL.g:1592:2: ( rule__Gateway__CustomDepsAssignment_8 )*
            {
             before(grammarAccess.getGatewayAccess().getCustomDepsAssignment_8()); 
            // InternalMicroserviceDSL.g:1593:2: ( rule__Gateway__CustomDepsAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=19)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:1593:3: rule__Gateway__CustomDepsAssignment_8
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Gateway__CustomDepsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGatewayAccess().getCustomDepsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__8__Impl"


    // $ANTLR start "rule__Gateway__Group__9"
    // InternalMicroserviceDSL.g:1601:1: rule__Gateway__Group__9 : rule__Gateway__Group__9__Impl rule__Gateway__Group__10 ;
    public final void rule__Gateway__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1605:1: ( rule__Gateway__Group__9__Impl rule__Gateway__Group__10 )
            // InternalMicroserviceDSL.g:1606:2: rule__Gateway__Group__9__Impl rule__Gateway__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Gateway__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__9"


    // $ANTLR start "rule__Gateway__Group__9__Impl"
    // InternalMicroserviceDSL.g:1613:1: rule__Gateway__Group__9__Impl : ( '}' ) ;
    public final void rule__Gateway__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1617:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:1618:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:1618:1: ( '}' )
            // InternalMicroserviceDSL.g:1619:2: '}'
            {
             before(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__9__Impl"


    // $ANTLR start "rule__Gateway__Group__10"
    // InternalMicroserviceDSL.g:1628:1: rule__Gateway__Group__10 : rule__Gateway__Group__10__Impl ;
    public final void rule__Gateway__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1632:1: ( rule__Gateway__Group__10__Impl )
            // InternalMicroserviceDSL.g:1633:2: rule__Gateway__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__10"


    // $ANTLR start "rule__Gateway__Group__10__Impl"
    // InternalMicroserviceDSL.g:1639:1: rule__Gateway__Group__10__Impl : ( '}' ) ;
    public final void rule__Gateway__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1643:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:1644:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:1644:1: ( '}' )
            // InternalMicroserviceDSL.g:1645:2: '}'
            {
             before(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_10()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__10__Impl"


    // $ANTLR start "rule__Gateway__Group_5__0"
    // InternalMicroserviceDSL.g:1655:1: rule__Gateway__Group_5__0 : rule__Gateway__Group_5__0__Impl rule__Gateway__Group_5__1 ;
    public final void rule__Gateway__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1659:1: ( rule__Gateway__Group_5__0__Impl rule__Gateway__Group_5__1 )
            // InternalMicroserviceDSL.g:1660:2: rule__Gateway__Group_5__0__Impl rule__Gateway__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Gateway__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__0"


    // $ANTLR start "rule__Gateway__Group_5__0__Impl"
    // InternalMicroserviceDSL.g:1667:1: rule__Gateway__Group_5__0__Impl : ( 'routes' ) ;
    public final void rule__Gateway__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1671:1: ( ( 'routes' ) )
            // InternalMicroserviceDSL.g:1672:1: ( 'routes' )
            {
            // InternalMicroserviceDSL.g:1672:1: ( 'routes' )
            // InternalMicroserviceDSL.g:1673:2: 'routes'
            {
             before(grammarAccess.getGatewayAccess().getRoutesKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getRoutesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__0__Impl"


    // $ANTLR start "rule__Gateway__Group_5__1"
    // InternalMicroserviceDSL.g:1682:1: rule__Gateway__Group_5__1 : rule__Gateway__Group_5__1__Impl rule__Gateway__Group_5__2 ;
    public final void rule__Gateway__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1686:1: ( rule__Gateway__Group_5__1__Impl rule__Gateway__Group_5__2 )
            // InternalMicroserviceDSL.g:1687:2: rule__Gateway__Group_5__1__Impl rule__Gateway__Group_5__2
            {
            pushFollow(FOLLOW_20);
            rule__Gateway__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__1"


    // $ANTLR start "rule__Gateway__Group_5__1__Impl"
    // InternalMicroserviceDSL.g:1694:1: rule__Gateway__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Gateway__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1698:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:1699:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:1699:1: ( '{' )
            // InternalMicroserviceDSL.g:1700:2: '{'
            {
             before(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__1__Impl"


    // $ANTLR start "rule__Gateway__Group_5__2"
    // InternalMicroserviceDSL.g:1709:1: rule__Gateway__Group_5__2 : rule__Gateway__Group_5__2__Impl rule__Gateway__Group_5__3 ;
    public final void rule__Gateway__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1713:1: ( rule__Gateway__Group_5__2__Impl rule__Gateway__Group_5__3 )
            // InternalMicroserviceDSL.g:1714:2: rule__Gateway__Group_5__2__Impl rule__Gateway__Group_5__3
            {
            pushFollow(FOLLOW_20);
            rule__Gateway__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__2"


    // $ANTLR start "rule__Gateway__Group_5__2__Impl"
    // InternalMicroserviceDSL.g:1721:1: rule__Gateway__Group_5__2__Impl : ( ( rule__Gateway__RoutesAssignment_5_2 )* ) ;
    public final void rule__Gateway__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1725:1: ( ( ( rule__Gateway__RoutesAssignment_5_2 )* ) )
            // InternalMicroserviceDSL.g:1726:1: ( ( rule__Gateway__RoutesAssignment_5_2 )* )
            {
            // InternalMicroserviceDSL.g:1726:1: ( ( rule__Gateway__RoutesAssignment_5_2 )* )
            // InternalMicroserviceDSL.g:1727:2: ( rule__Gateway__RoutesAssignment_5_2 )*
            {
             before(grammarAccess.getGatewayAccess().getRoutesAssignment_5_2()); 
            // InternalMicroserviceDSL.g:1728:2: ( rule__Gateway__RoutesAssignment_5_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==42) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:1728:3: rule__Gateway__RoutesAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Gateway__RoutesAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getGatewayAccess().getRoutesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__2__Impl"


    // $ANTLR start "rule__Gateway__Group_5__3"
    // InternalMicroserviceDSL.g:1736:1: rule__Gateway__Group_5__3 : rule__Gateway__Group_5__3__Impl ;
    public final void rule__Gateway__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1740:1: ( rule__Gateway__Group_5__3__Impl )
            // InternalMicroserviceDSL.g:1741:2: rule__Gateway__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__3"


    // $ANTLR start "rule__Gateway__Group_5__3__Impl"
    // InternalMicroserviceDSL.g:1747:1: rule__Gateway__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Gateway__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1751:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:1752:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:1752:1: ( '}' )
            // InternalMicroserviceDSL.g:1753:2: '}'
            {
             before(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__3__Impl"


    // $ANTLR start "rule__RouteConfig__Group__0"
    // InternalMicroserviceDSL.g:1763:1: rule__RouteConfig__Group__0 : rule__RouteConfig__Group__0__Impl rule__RouteConfig__Group__1 ;
    public final void rule__RouteConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1767:1: ( rule__RouteConfig__Group__0__Impl rule__RouteConfig__Group__1 )
            // InternalMicroserviceDSL.g:1768:2: rule__RouteConfig__Group__0__Impl rule__RouteConfig__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RouteConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__0"


    // $ANTLR start "rule__RouteConfig__Group__0__Impl"
    // InternalMicroserviceDSL.g:1775:1: rule__RouteConfig__Group__0__Impl : ( 'route' ) ;
    public final void rule__RouteConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1779:1: ( ( 'route' ) )
            // InternalMicroserviceDSL.g:1780:1: ( 'route' )
            {
            // InternalMicroserviceDSL.g:1780:1: ( 'route' )
            // InternalMicroserviceDSL.g:1781:2: 'route'
            {
             before(grammarAccess.getRouteConfigAccess().getRouteKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRouteConfigAccess().getRouteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__0__Impl"


    // $ANTLR start "rule__RouteConfig__Group__1"
    // InternalMicroserviceDSL.g:1790:1: rule__RouteConfig__Group__1 : rule__RouteConfig__Group__1__Impl rule__RouteConfig__Group__2 ;
    public final void rule__RouteConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1794:1: ( rule__RouteConfig__Group__1__Impl rule__RouteConfig__Group__2 )
            // InternalMicroserviceDSL.g:1795:2: rule__RouteConfig__Group__1__Impl rule__RouteConfig__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__RouteConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__1"


    // $ANTLR start "rule__RouteConfig__Group__1__Impl"
    // InternalMicroserviceDSL.g:1802:1: rule__RouteConfig__Group__1__Impl : ( '{' ) ;
    public final void rule__RouteConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1806:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:1807:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:1807:1: ( '{' )
            // InternalMicroserviceDSL.g:1808:2: '{'
            {
             before(grammarAccess.getRouteConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRouteConfigAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__1__Impl"


    // $ANTLR start "rule__RouteConfig__Group__2"
    // InternalMicroserviceDSL.g:1817:1: rule__RouteConfig__Group__2 : rule__RouteConfig__Group__2__Impl rule__RouteConfig__Group__3 ;
    public final void rule__RouteConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1821:1: ( rule__RouteConfig__Group__2__Impl rule__RouteConfig__Group__3 )
            // InternalMicroserviceDSL.g:1822:2: rule__RouteConfig__Group__2__Impl rule__RouteConfig__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__RouteConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__2"


    // $ANTLR start "rule__RouteConfig__Group__2__Impl"
    // InternalMicroserviceDSL.g:1829:1: rule__RouteConfig__Group__2__Impl : ( 'path' ) ;
    public final void rule__RouteConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1833:1: ( ( 'path' ) )
            // InternalMicroserviceDSL.g:1834:1: ( 'path' )
            {
            // InternalMicroserviceDSL.g:1834:1: ( 'path' )
            // InternalMicroserviceDSL.g:1835:2: 'path'
            {
             before(grammarAccess.getRouteConfigAccess().getPathKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRouteConfigAccess().getPathKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__2__Impl"


    // $ANTLR start "rule__RouteConfig__Group__3"
    // InternalMicroserviceDSL.g:1844:1: rule__RouteConfig__Group__3 : rule__RouteConfig__Group__3__Impl rule__RouteConfig__Group__4 ;
    public final void rule__RouteConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1848:1: ( rule__RouteConfig__Group__3__Impl rule__RouteConfig__Group__4 )
            // InternalMicroserviceDSL.g:1849:2: rule__RouteConfig__Group__3__Impl rule__RouteConfig__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__RouteConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__3"


    // $ANTLR start "rule__RouteConfig__Group__3__Impl"
    // InternalMicroserviceDSL.g:1856:1: rule__RouteConfig__Group__3__Impl : ( ( rule__RouteConfig__PathAssignment_3 ) ) ;
    public final void rule__RouteConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1860:1: ( ( ( rule__RouteConfig__PathAssignment_3 ) ) )
            // InternalMicroserviceDSL.g:1861:1: ( ( rule__RouteConfig__PathAssignment_3 ) )
            {
            // InternalMicroserviceDSL.g:1861:1: ( ( rule__RouteConfig__PathAssignment_3 ) )
            // InternalMicroserviceDSL.g:1862:2: ( rule__RouteConfig__PathAssignment_3 )
            {
             before(grammarAccess.getRouteConfigAccess().getPathAssignment_3()); 
            // InternalMicroserviceDSL.g:1863:2: ( rule__RouteConfig__PathAssignment_3 )
            // InternalMicroserviceDSL.g:1863:3: rule__RouteConfig__PathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RouteConfig__PathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRouteConfigAccess().getPathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__3__Impl"


    // $ANTLR start "rule__RouteConfig__Group__4"
    // InternalMicroserviceDSL.g:1871:1: rule__RouteConfig__Group__4 : rule__RouteConfig__Group__4__Impl rule__RouteConfig__Group__5 ;
    public final void rule__RouteConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1875:1: ( rule__RouteConfig__Group__4__Impl rule__RouteConfig__Group__5 )
            // InternalMicroserviceDSL.g:1876:2: rule__RouteConfig__Group__4__Impl rule__RouteConfig__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__RouteConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__4"


    // $ANTLR start "rule__RouteConfig__Group__4__Impl"
    // InternalMicroserviceDSL.g:1883:1: rule__RouteConfig__Group__4__Impl : ( 'service' ) ;
    public final void rule__RouteConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1887:1: ( ( 'service' ) )
            // InternalMicroserviceDSL.g:1888:1: ( 'service' )
            {
            // InternalMicroserviceDSL.g:1888:1: ( 'service' )
            // InternalMicroserviceDSL.g:1889:2: 'service'
            {
             before(grammarAccess.getRouteConfigAccess().getServiceKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRouteConfigAccess().getServiceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__4__Impl"


    // $ANTLR start "rule__RouteConfig__Group__5"
    // InternalMicroserviceDSL.g:1898:1: rule__RouteConfig__Group__5 : rule__RouteConfig__Group__5__Impl rule__RouteConfig__Group__6 ;
    public final void rule__RouteConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1902:1: ( rule__RouteConfig__Group__5__Impl rule__RouteConfig__Group__6 )
            // InternalMicroserviceDSL.g:1903:2: rule__RouteConfig__Group__5__Impl rule__RouteConfig__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__RouteConfig__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__5"


    // $ANTLR start "rule__RouteConfig__Group__5__Impl"
    // InternalMicroserviceDSL.g:1910:1: rule__RouteConfig__Group__5__Impl : ( ( rule__RouteConfig__ServiceAssignment_5 ) ) ;
    public final void rule__RouteConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1914:1: ( ( ( rule__RouteConfig__ServiceAssignment_5 ) ) )
            // InternalMicroserviceDSL.g:1915:1: ( ( rule__RouteConfig__ServiceAssignment_5 ) )
            {
            // InternalMicroserviceDSL.g:1915:1: ( ( rule__RouteConfig__ServiceAssignment_5 ) )
            // InternalMicroserviceDSL.g:1916:2: ( rule__RouteConfig__ServiceAssignment_5 )
            {
             before(grammarAccess.getRouteConfigAccess().getServiceAssignment_5()); 
            // InternalMicroserviceDSL.g:1917:2: ( rule__RouteConfig__ServiceAssignment_5 )
            // InternalMicroserviceDSL.g:1917:3: rule__RouteConfig__ServiceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RouteConfig__ServiceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRouteConfigAccess().getServiceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__5__Impl"


    // $ANTLR start "rule__RouteConfig__Group__6"
    // InternalMicroserviceDSL.g:1925:1: rule__RouteConfig__Group__6 : rule__RouteConfig__Group__6__Impl ;
    public final void rule__RouteConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1929:1: ( rule__RouteConfig__Group__6__Impl )
            // InternalMicroserviceDSL.g:1930:2: rule__RouteConfig__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RouteConfig__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__6"


    // $ANTLR start "rule__RouteConfig__Group__6__Impl"
    // InternalMicroserviceDSL.g:1936:1: rule__RouteConfig__Group__6__Impl : ( '}' ) ;
    public final void rule__RouteConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1940:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:1941:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:1941:1: ( '}' )
            // InternalMicroserviceDSL.g:1942:2: '}'
            {
             before(grammarAccess.getRouteConfigAccess().getRightCurlyBracketKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRouteConfigAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__Group__6__Impl"


    // $ANTLR start "rule__ConfigServer__Group__0"
    // InternalMicroserviceDSL.g:1952:1: rule__ConfigServer__Group__0 : rule__ConfigServer__Group__0__Impl rule__ConfigServer__Group__1 ;
    public final void rule__ConfigServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1956:1: ( rule__ConfigServer__Group__0__Impl rule__ConfigServer__Group__1 )
            // InternalMicroserviceDSL.g:1957:2: rule__ConfigServer__Group__0__Impl rule__ConfigServer__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConfigServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__0"


    // $ANTLR start "rule__ConfigServer__Group__0__Impl"
    // InternalMicroserviceDSL.g:1964:1: rule__ConfigServer__Group__0__Impl : ( 'config-server' ) ;
    public final void rule__ConfigServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1968:1: ( ( 'config-server' ) )
            // InternalMicroserviceDSL.g:1969:1: ( 'config-server' )
            {
            // InternalMicroserviceDSL.g:1969:1: ( 'config-server' )
            // InternalMicroserviceDSL.g:1970:2: 'config-server'
            {
             before(grammarAccess.getConfigServerAccess().getConfigServerKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getConfigServerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__0__Impl"


    // $ANTLR start "rule__ConfigServer__Group__1"
    // InternalMicroserviceDSL.g:1979:1: rule__ConfigServer__Group__1 : rule__ConfigServer__Group__1__Impl rule__ConfigServer__Group__2 ;
    public final void rule__ConfigServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1983:1: ( rule__ConfigServer__Group__1__Impl rule__ConfigServer__Group__2 )
            // InternalMicroserviceDSL.g:1984:2: rule__ConfigServer__Group__1__Impl rule__ConfigServer__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ConfigServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__1"


    // $ANTLR start "rule__ConfigServer__Group__1__Impl"
    // InternalMicroserviceDSL.g:1991:1: rule__ConfigServer__Group__1__Impl : ( ( rule__ConfigServer__NameAssignment_1 ) ) ;
    public final void rule__ConfigServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:1995:1: ( ( ( rule__ConfigServer__NameAssignment_1 ) ) )
            // InternalMicroserviceDSL.g:1996:1: ( ( rule__ConfigServer__NameAssignment_1 ) )
            {
            // InternalMicroserviceDSL.g:1996:1: ( ( rule__ConfigServer__NameAssignment_1 ) )
            // InternalMicroserviceDSL.g:1997:2: ( rule__ConfigServer__NameAssignment_1 )
            {
             before(grammarAccess.getConfigServerAccess().getNameAssignment_1()); 
            // InternalMicroserviceDSL.g:1998:2: ( rule__ConfigServer__NameAssignment_1 )
            // InternalMicroserviceDSL.g:1998:3: rule__ConfigServer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigServer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigServerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__1__Impl"


    // $ANTLR start "rule__ConfigServer__Group__2"
    // InternalMicroserviceDSL.g:2006:1: rule__ConfigServer__Group__2 : rule__ConfigServer__Group__2__Impl rule__ConfigServer__Group__3 ;
    public final void rule__ConfigServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2010:1: ( rule__ConfigServer__Group__2__Impl rule__ConfigServer__Group__3 )
            // InternalMicroserviceDSL.g:2011:2: rule__ConfigServer__Group__2__Impl rule__ConfigServer__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ConfigServer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__2"


    // $ANTLR start "rule__ConfigServer__Group__2__Impl"
    // InternalMicroserviceDSL.g:2018:1: rule__ConfigServer__Group__2__Impl : ( '{' ) ;
    public final void rule__ConfigServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2022:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:2023:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:2023:1: ( '{' )
            // InternalMicroserviceDSL.g:2024:2: '{'
            {
             before(grammarAccess.getConfigServerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__2__Impl"


    // $ANTLR start "rule__ConfigServer__Group__3"
    // InternalMicroserviceDSL.g:2033:1: rule__ConfigServer__Group__3 : rule__ConfigServer__Group__3__Impl rule__ConfigServer__Group__4 ;
    public final void rule__ConfigServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2037:1: ( rule__ConfigServer__Group__3__Impl rule__ConfigServer__Group__4 )
            // InternalMicroserviceDSL.g:2038:2: rule__ConfigServer__Group__3__Impl rule__ConfigServer__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ConfigServer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__3"


    // $ANTLR start "rule__ConfigServer__Group__3__Impl"
    // InternalMicroserviceDSL.g:2045:1: rule__ConfigServer__Group__3__Impl : ( 'port' ) ;
    public final void rule__ConfigServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2049:1: ( ( 'port' ) )
            // InternalMicroserviceDSL.g:2050:1: ( 'port' )
            {
            // InternalMicroserviceDSL.g:2050:1: ( 'port' )
            // InternalMicroserviceDSL.g:2051:2: 'port'
            {
             before(grammarAccess.getConfigServerAccess().getPortKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getPortKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__3__Impl"


    // $ANTLR start "rule__ConfigServer__Group__4"
    // InternalMicroserviceDSL.g:2060:1: rule__ConfigServer__Group__4 : rule__ConfigServer__Group__4__Impl rule__ConfigServer__Group__5 ;
    public final void rule__ConfigServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2064:1: ( rule__ConfigServer__Group__4__Impl rule__ConfigServer__Group__5 )
            // InternalMicroserviceDSL.g:2065:2: rule__ConfigServer__Group__4__Impl rule__ConfigServer__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__ConfigServer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__4"


    // $ANTLR start "rule__ConfigServer__Group__4__Impl"
    // InternalMicroserviceDSL.g:2072:1: rule__ConfigServer__Group__4__Impl : ( ( rule__ConfigServer__PortAssignment_4 ) ) ;
    public final void rule__ConfigServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2076:1: ( ( ( rule__ConfigServer__PortAssignment_4 ) ) )
            // InternalMicroserviceDSL.g:2077:1: ( ( rule__ConfigServer__PortAssignment_4 ) )
            {
            // InternalMicroserviceDSL.g:2077:1: ( ( rule__ConfigServer__PortAssignment_4 ) )
            // InternalMicroserviceDSL.g:2078:2: ( rule__ConfigServer__PortAssignment_4 )
            {
             before(grammarAccess.getConfigServerAccess().getPortAssignment_4()); 
            // InternalMicroserviceDSL.g:2079:2: ( rule__ConfigServer__PortAssignment_4 )
            // InternalMicroserviceDSL.g:2079:3: rule__ConfigServer__PortAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ConfigServer__PortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConfigServerAccess().getPortAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__4__Impl"


    // $ANTLR start "rule__ConfigServer__Group__5"
    // InternalMicroserviceDSL.g:2087:1: rule__ConfigServer__Group__5 : rule__ConfigServer__Group__5__Impl rule__ConfigServer__Group__6 ;
    public final void rule__ConfigServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2091:1: ( rule__ConfigServer__Group__5__Impl rule__ConfigServer__Group__6 )
            // InternalMicroserviceDSL.g:2092:2: rule__ConfigServer__Group__5__Impl rule__ConfigServer__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ConfigServer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__5"


    // $ANTLR start "rule__ConfigServer__Group__5__Impl"
    // InternalMicroserviceDSL.g:2099:1: rule__ConfigServer__Group__5__Impl : ( 'git-uri' ) ;
    public final void rule__ConfigServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2103:1: ( ( 'git-uri' ) )
            // InternalMicroserviceDSL.g:2104:1: ( 'git-uri' )
            {
            // InternalMicroserviceDSL.g:2104:1: ( 'git-uri' )
            // InternalMicroserviceDSL.g:2105:2: 'git-uri'
            {
             before(grammarAccess.getConfigServerAccess().getGitUriKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getGitUriKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__5__Impl"


    // $ANTLR start "rule__ConfigServer__Group__6"
    // InternalMicroserviceDSL.g:2114:1: rule__ConfigServer__Group__6 : rule__ConfigServer__Group__6__Impl rule__ConfigServer__Group__7 ;
    public final void rule__ConfigServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2118:1: ( rule__ConfigServer__Group__6__Impl rule__ConfigServer__Group__7 )
            // InternalMicroserviceDSL.g:2119:2: rule__ConfigServer__Group__6__Impl rule__ConfigServer__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__ConfigServer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__6"


    // $ANTLR start "rule__ConfigServer__Group__6__Impl"
    // InternalMicroserviceDSL.g:2126:1: rule__ConfigServer__Group__6__Impl : ( ( rule__ConfigServer__GitUriAssignment_6 ) ) ;
    public final void rule__ConfigServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2130:1: ( ( ( rule__ConfigServer__GitUriAssignment_6 ) ) )
            // InternalMicroserviceDSL.g:2131:1: ( ( rule__ConfigServer__GitUriAssignment_6 ) )
            {
            // InternalMicroserviceDSL.g:2131:1: ( ( rule__ConfigServer__GitUriAssignment_6 ) )
            // InternalMicroserviceDSL.g:2132:2: ( rule__ConfigServer__GitUriAssignment_6 )
            {
             before(grammarAccess.getConfigServerAccess().getGitUriAssignment_6()); 
            // InternalMicroserviceDSL.g:2133:2: ( rule__ConfigServer__GitUriAssignment_6 )
            // InternalMicroserviceDSL.g:2133:3: rule__ConfigServer__GitUriAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ConfigServer__GitUriAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConfigServerAccess().getGitUriAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__6__Impl"


    // $ANTLR start "rule__ConfigServer__Group__7"
    // InternalMicroserviceDSL.g:2141:1: rule__ConfigServer__Group__7 : rule__ConfigServer__Group__7__Impl rule__ConfigServer__Group__8 ;
    public final void rule__ConfigServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2145:1: ( rule__ConfigServer__Group__7__Impl rule__ConfigServer__Group__8 )
            // InternalMicroserviceDSL.g:2146:2: rule__ConfigServer__Group__7__Impl rule__ConfigServer__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__ConfigServer__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__7"


    // $ANTLR start "rule__ConfigServer__Group__7__Impl"
    // InternalMicroserviceDSL.g:2153:1: rule__ConfigServer__Group__7__Impl : ( ( rule__ConfigServer__Group_7__0 )? ) ;
    public final void rule__ConfigServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2157:1: ( ( ( rule__ConfigServer__Group_7__0 )? ) )
            // InternalMicroserviceDSL.g:2158:1: ( ( rule__ConfigServer__Group_7__0 )? )
            {
            // InternalMicroserviceDSL.g:2158:1: ( ( rule__ConfigServer__Group_7__0 )? )
            // InternalMicroserviceDSL.g:2159:2: ( rule__ConfigServer__Group_7__0 )?
            {
             before(grammarAccess.getConfigServerAccess().getGroup_7()); 
            // InternalMicroserviceDSL.g:2160:2: ( rule__ConfigServer__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==47) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMicroserviceDSL.g:2160:3: rule__ConfigServer__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConfigServer__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigServerAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__7__Impl"


    // $ANTLR start "rule__ConfigServer__Group__8"
    // InternalMicroserviceDSL.g:2168:1: rule__ConfigServer__Group__8 : rule__ConfigServer__Group__8__Impl rule__ConfigServer__Group__9 ;
    public final void rule__ConfigServer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2172:1: ( rule__ConfigServer__Group__8__Impl rule__ConfigServer__Group__9 )
            // InternalMicroserviceDSL.g:2173:2: rule__ConfigServer__Group__8__Impl rule__ConfigServer__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__ConfigServer__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__8"


    // $ANTLR start "rule__ConfigServer__Group__8__Impl"
    // InternalMicroserviceDSL.g:2180:1: rule__ConfigServer__Group__8__Impl : ( 'dependencies' ) ;
    public final void rule__ConfigServer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2184:1: ( ( 'dependencies' ) )
            // InternalMicroserviceDSL.g:2185:1: ( 'dependencies' )
            {
            // InternalMicroserviceDSL.g:2185:1: ( 'dependencies' )
            // InternalMicroserviceDSL.g:2186:2: 'dependencies'
            {
             before(grammarAccess.getConfigServerAccess().getDependenciesKeyword_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getDependenciesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__8__Impl"


    // $ANTLR start "rule__ConfigServer__Group__9"
    // InternalMicroserviceDSL.g:2195:1: rule__ConfigServer__Group__9 : rule__ConfigServer__Group__9__Impl rule__ConfigServer__Group__10 ;
    public final void rule__ConfigServer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2199:1: ( rule__ConfigServer__Group__9__Impl rule__ConfigServer__Group__10 )
            // InternalMicroserviceDSL.g:2200:2: rule__ConfigServer__Group__9__Impl rule__ConfigServer__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__ConfigServer__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__9"


    // $ANTLR start "rule__ConfigServer__Group__9__Impl"
    // InternalMicroserviceDSL.g:2207:1: rule__ConfigServer__Group__9__Impl : ( '{' ) ;
    public final void rule__ConfigServer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2211:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:2212:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:2212:1: ( '{' )
            // InternalMicroserviceDSL.g:2213:2: '{'
            {
             before(grammarAccess.getConfigServerAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__9__Impl"


    // $ANTLR start "rule__ConfigServer__Group__10"
    // InternalMicroserviceDSL.g:2222:1: rule__ConfigServer__Group__10 : rule__ConfigServer__Group__10__Impl rule__ConfigServer__Group__11 ;
    public final void rule__ConfigServer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2226:1: ( rule__ConfigServer__Group__10__Impl rule__ConfigServer__Group__11 )
            // InternalMicroserviceDSL.g:2227:2: rule__ConfigServer__Group__10__Impl rule__ConfigServer__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__ConfigServer__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__10"


    // $ANTLR start "rule__ConfigServer__Group__10__Impl"
    // InternalMicroserviceDSL.g:2234:1: rule__ConfigServer__Group__10__Impl : ( ( rule__ConfigServer__CustomDepsAssignment_10 )* ) ;
    public final void rule__ConfigServer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2238:1: ( ( ( rule__ConfigServer__CustomDepsAssignment_10 )* ) )
            // InternalMicroserviceDSL.g:2239:1: ( ( rule__ConfigServer__CustomDepsAssignment_10 )* )
            {
            // InternalMicroserviceDSL.g:2239:1: ( ( rule__ConfigServer__CustomDepsAssignment_10 )* )
            // InternalMicroserviceDSL.g:2240:2: ( rule__ConfigServer__CustomDepsAssignment_10 )*
            {
             before(grammarAccess.getConfigServerAccess().getCustomDepsAssignment_10()); 
            // InternalMicroserviceDSL.g:2241:2: ( rule__ConfigServer__CustomDepsAssignment_10 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=13 && LA15_0<=19)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:2241:3: rule__ConfigServer__CustomDepsAssignment_10
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ConfigServer__CustomDepsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getConfigServerAccess().getCustomDepsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__10__Impl"


    // $ANTLR start "rule__ConfigServer__Group__11"
    // InternalMicroserviceDSL.g:2249:1: rule__ConfigServer__Group__11 : rule__ConfigServer__Group__11__Impl rule__ConfigServer__Group__12 ;
    public final void rule__ConfigServer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2253:1: ( rule__ConfigServer__Group__11__Impl rule__ConfigServer__Group__12 )
            // InternalMicroserviceDSL.g:2254:2: rule__ConfigServer__Group__11__Impl rule__ConfigServer__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__ConfigServer__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__11"


    // $ANTLR start "rule__ConfigServer__Group__11__Impl"
    // InternalMicroserviceDSL.g:2261:1: rule__ConfigServer__Group__11__Impl : ( '}' ) ;
    public final void rule__ConfigServer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2265:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:2266:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:2266:1: ( '}' )
            // InternalMicroserviceDSL.g:2267:2: '}'
            {
             before(grammarAccess.getConfigServerAccess().getRightCurlyBracketKeyword_11()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__11__Impl"


    // $ANTLR start "rule__ConfigServer__Group__12"
    // InternalMicroserviceDSL.g:2276:1: rule__ConfigServer__Group__12 : rule__ConfigServer__Group__12__Impl ;
    public final void rule__ConfigServer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2280:1: ( rule__ConfigServer__Group__12__Impl )
            // InternalMicroserviceDSL.g:2281:2: rule__ConfigServer__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__12"


    // $ANTLR start "rule__ConfigServer__Group__12__Impl"
    // InternalMicroserviceDSL.g:2287:1: rule__ConfigServer__Group__12__Impl : ( '}' ) ;
    public final void rule__ConfigServer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2291:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:2292:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:2292:1: ( '}' )
            // InternalMicroserviceDSL.g:2293:2: '}'
            {
             before(grammarAccess.getConfigServerAccess().getRightCurlyBracketKeyword_12()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group__12__Impl"


    // $ANTLR start "rule__ConfigServer__Group_7__0"
    // InternalMicroserviceDSL.g:2303:1: rule__ConfigServer__Group_7__0 : rule__ConfigServer__Group_7__0__Impl rule__ConfigServer__Group_7__1 ;
    public final void rule__ConfigServer__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2307:1: ( rule__ConfigServer__Group_7__0__Impl rule__ConfigServer__Group_7__1 )
            // InternalMicroserviceDSL.g:2308:2: rule__ConfigServer__Group_7__0__Impl rule__ConfigServer__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__ConfigServer__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group_7__0"


    // $ANTLR start "rule__ConfigServer__Group_7__0__Impl"
    // InternalMicroserviceDSL.g:2315:1: rule__ConfigServer__Group_7__0__Impl : ( 'git-branch' ) ;
    public final void rule__ConfigServer__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2319:1: ( ( 'git-branch' ) )
            // InternalMicroserviceDSL.g:2320:1: ( 'git-branch' )
            {
            // InternalMicroserviceDSL.g:2320:1: ( 'git-branch' )
            // InternalMicroserviceDSL.g:2321:2: 'git-branch'
            {
             before(grammarAccess.getConfigServerAccess().getGitBranchKeyword_7_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getGitBranchKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group_7__0__Impl"


    // $ANTLR start "rule__ConfigServer__Group_7__1"
    // InternalMicroserviceDSL.g:2330:1: rule__ConfigServer__Group_7__1 : rule__ConfigServer__Group_7__1__Impl ;
    public final void rule__ConfigServer__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2334:1: ( rule__ConfigServer__Group_7__1__Impl )
            // InternalMicroserviceDSL.g:2335:2: rule__ConfigServer__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigServer__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group_7__1"


    // $ANTLR start "rule__ConfigServer__Group_7__1__Impl"
    // InternalMicroserviceDSL.g:2341:1: rule__ConfigServer__Group_7__1__Impl : ( ( rule__ConfigServer__GitBranchAssignment_7_1 ) ) ;
    public final void rule__ConfigServer__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2345:1: ( ( ( rule__ConfigServer__GitBranchAssignment_7_1 ) ) )
            // InternalMicroserviceDSL.g:2346:1: ( ( rule__ConfigServer__GitBranchAssignment_7_1 ) )
            {
            // InternalMicroserviceDSL.g:2346:1: ( ( rule__ConfigServer__GitBranchAssignment_7_1 ) )
            // InternalMicroserviceDSL.g:2347:2: ( rule__ConfigServer__GitBranchAssignment_7_1 )
            {
             before(grammarAccess.getConfigServerAccess().getGitBranchAssignment_7_1()); 
            // InternalMicroserviceDSL.g:2348:2: ( rule__ConfigServer__GitBranchAssignment_7_1 )
            // InternalMicroserviceDSL.g:2348:3: rule__ConfigServer__GitBranchAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigServer__GitBranchAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigServerAccess().getGitBranchAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__Group_7__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalMicroserviceDSL.g:2357:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2361:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalMicroserviceDSL.g:2362:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalMicroserviceDSL.g:2369:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2373:1: ( ( 'service' ) )
            // InternalMicroserviceDSL.g:2374:1: ( 'service' )
            {
            // InternalMicroserviceDSL.g:2374:1: ( 'service' )
            // InternalMicroserviceDSL.g:2375:2: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalMicroserviceDSL.g:2384:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2388:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalMicroserviceDSL.g:2389:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalMicroserviceDSL.g:2396:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2400:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // InternalMicroserviceDSL.g:2401:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // InternalMicroserviceDSL.g:2401:1: ( ( rule__Service__NameAssignment_1 ) )
            // InternalMicroserviceDSL.g:2402:2: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // InternalMicroserviceDSL.g:2403:2: ( rule__Service__NameAssignment_1 )
            // InternalMicroserviceDSL.g:2403:3: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalMicroserviceDSL.g:2411:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2415:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalMicroserviceDSL.g:2416:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalMicroserviceDSL.g:2423:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2427:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:2428:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:2428:1: ( '{' )
            // InternalMicroserviceDSL.g:2429:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalMicroserviceDSL.g:2438:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2442:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalMicroserviceDSL.g:2443:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalMicroserviceDSL.g:2450:1: rule__Service__Group__3__Impl : ( 'dependencies' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2454:1: ( ( 'dependencies' ) )
            // InternalMicroserviceDSL.g:2455:1: ( 'dependencies' )
            {
            // InternalMicroserviceDSL.g:2455:1: ( 'dependencies' )
            // InternalMicroserviceDSL.g:2456:2: 'dependencies'
            {
             before(grammarAccess.getServiceAccess().getDependenciesKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getDependenciesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalMicroserviceDSL.g:2465:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2469:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalMicroserviceDSL.g:2470:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalMicroserviceDSL.g:2477:1: rule__Service__Group__4__Impl : ( '{' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2481:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:2482:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:2482:1: ( '{' )
            // InternalMicroserviceDSL.g:2483:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalMicroserviceDSL.g:2492:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2496:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalMicroserviceDSL.g:2497:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalMicroserviceDSL.g:2504:1: rule__Service__Group__5__Impl : ( ( rule__Service__DependenciesAssignment_5 )* ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2508:1: ( ( ( rule__Service__DependenciesAssignment_5 )* ) )
            // InternalMicroserviceDSL.g:2509:1: ( ( rule__Service__DependenciesAssignment_5 )* )
            {
            // InternalMicroserviceDSL.g:2509:1: ( ( rule__Service__DependenciesAssignment_5 )* )
            // InternalMicroserviceDSL.g:2510:2: ( rule__Service__DependenciesAssignment_5 )*
            {
             before(grammarAccess.getServiceAccess().getDependenciesAssignment_5()); 
            // InternalMicroserviceDSL.g:2511:2: ( rule__Service__DependenciesAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=13 && LA16_0<=19)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:2511:3: rule__Service__DependenciesAssignment_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Service__DependenciesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getDependenciesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalMicroserviceDSL.g:2519:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2523:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalMicroserviceDSL.g:2524:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Service__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalMicroserviceDSL.g:2531:1: rule__Service__Group__6__Impl : ( '}' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2535:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:2536:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:2536:1: ( '}' )
            // InternalMicroserviceDSL.g:2537:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // InternalMicroserviceDSL.g:2546:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2550:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalMicroserviceDSL.g:2551:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Service__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // InternalMicroserviceDSL.g:2558:1: rule__Service__Group__7__Impl : ( 'config' ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2562:1: ( ( 'config' ) )
            // InternalMicroserviceDSL.g:2563:1: ( 'config' )
            {
            // InternalMicroserviceDSL.g:2563:1: ( 'config' )
            // InternalMicroserviceDSL.g:2564:2: 'config'
            {
             before(grammarAccess.getServiceAccess().getConfigKeyword_7()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getConfigKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group__8"
    // InternalMicroserviceDSL.g:2573:1: rule__Service__Group__8 : rule__Service__Group__8__Impl rule__Service__Group__9 ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2577:1: ( rule__Service__Group__8__Impl rule__Service__Group__9 )
            // InternalMicroserviceDSL.g:2578:2: rule__Service__Group__8__Impl rule__Service__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__Service__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__8"


    // $ANTLR start "rule__Service__Group__8__Impl"
    // InternalMicroserviceDSL.g:2585:1: rule__Service__Group__8__Impl : ( '{' ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2589:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:2590:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:2590:1: ( '{' )
            // InternalMicroserviceDSL.g:2591:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__8__Impl"


    // $ANTLR start "rule__Service__Group__9"
    // InternalMicroserviceDSL.g:2600:1: rule__Service__Group__9 : rule__Service__Group__9__Impl rule__Service__Group__10 ;
    public final void rule__Service__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2604:1: ( rule__Service__Group__9__Impl rule__Service__Group__10 )
            // InternalMicroserviceDSL.g:2605:2: rule__Service__Group__9__Impl rule__Service__Group__10
            {
            pushFollow(FOLLOW_28);
            rule__Service__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__9"


    // $ANTLR start "rule__Service__Group__9__Impl"
    // InternalMicroserviceDSL.g:2612:1: rule__Service__Group__9__Impl : ( ( rule__Service__ConfigurationAssignment_9 )* ) ;
    public final void rule__Service__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2616:1: ( ( ( rule__Service__ConfigurationAssignment_9 )* ) )
            // InternalMicroserviceDSL.g:2617:1: ( ( rule__Service__ConfigurationAssignment_9 )* )
            {
            // InternalMicroserviceDSL.g:2617:1: ( ( rule__Service__ConfigurationAssignment_9 )* )
            // InternalMicroserviceDSL.g:2618:2: ( rule__Service__ConfigurationAssignment_9 )*
            {
             before(grammarAccess.getServiceAccess().getConfigurationAssignment_9()); 
            // InternalMicroserviceDSL.g:2619:2: ( rule__Service__ConfigurationAssignment_9 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==49||LA17_0==51||LA17_0==55||LA17_0==61) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:2619:3: rule__Service__ConfigurationAssignment_9
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Service__ConfigurationAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getConfigurationAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__9__Impl"


    // $ANTLR start "rule__Service__Group__10"
    // InternalMicroserviceDSL.g:2627:1: rule__Service__Group__10 : rule__Service__Group__10__Impl rule__Service__Group__11 ;
    public final void rule__Service__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2631:1: ( rule__Service__Group__10__Impl rule__Service__Group__11 )
            // InternalMicroserviceDSL.g:2632:2: rule__Service__Group__10__Impl rule__Service__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__Service__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__10"


    // $ANTLR start "rule__Service__Group__10__Impl"
    // InternalMicroserviceDSL.g:2639:1: rule__Service__Group__10__Impl : ( '}' ) ;
    public final void rule__Service__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2643:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:2644:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:2644:1: ( '}' )
            // InternalMicroserviceDSL.g:2645:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_10()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__10__Impl"


    // $ANTLR start "rule__Service__Group__11"
    // InternalMicroserviceDSL.g:2654:1: rule__Service__Group__11 : rule__Service__Group__11__Impl ;
    public final void rule__Service__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2658:1: ( rule__Service__Group__11__Impl )
            // InternalMicroserviceDSL.g:2659:2: rule__Service__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__11"


    // $ANTLR start "rule__Service__Group__11__Impl"
    // InternalMicroserviceDSL.g:2665:1: rule__Service__Group__11__Impl : ( '}' ) ;
    public final void rule__Service__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2669:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:2670:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:2670:1: ( '}' )
            // InternalMicroserviceDSL.g:2671:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_11()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__11__Impl"


    // $ANTLR start "rule__ServerConfig__Group__0"
    // InternalMicroserviceDSL.g:2681:1: rule__ServerConfig__Group__0 : rule__ServerConfig__Group__0__Impl rule__ServerConfig__Group__1 ;
    public final void rule__ServerConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2685:1: ( rule__ServerConfig__Group__0__Impl rule__ServerConfig__Group__1 )
            // InternalMicroserviceDSL.g:2686:2: rule__ServerConfig__Group__0__Impl rule__ServerConfig__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ServerConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__0"


    // $ANTLR start "rule__ServerConfig__Group__0__Impl"
    // InternalMicroserviceDSL.g:2693:1: rule__ServerConfig__Group__0__Impl : ( 'server-config' ) ;
    public final void rule__ServerConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2697:1: ( ( 'server-config' ) )
            // InternalMicroserviceDSL.g:2698:1: ( 'server-config' )
            {
            // InternalMicroserviceDSL.g:2698:1: ( 'server-config' )
            // InternalMicroserviceDSL.g:2699:2: 'server-config'
            {
             before(grammarAccess.getServerConfigAccess().getServerConfigKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getServerConfigAccess().getServerConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__0__Impl"


    // $ANTLR start "rule__ServerConfig__Group__1"
    // InternalMicroserviceDSL.g:2708:1: rule__ServerConfig__Group__1 : rule__ServerConfig__Group__1__Impl rule__ServerConfig__Group__2 ;
    public final void rule__ServerConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2712:1: ( rule__ServerConfig__Group__1__Impl rule__ServerConfig__Group__2 )
            // InternalMicroserviceDSL.g:2713:2: rule__ServerConfig__Group__1__Impl rule__ServerConfig__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ServerConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__1"


    // $ANTLR start "rule__ServerConfig__Group__1__Impl"
    // InternalMicroserviceDSL.g:2720:1: rule__ServerConfig__Group__1__Impl : ( '{' ) ;
    public final void rule__ServerConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2724:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:2725:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:2725:1: ( '{' )
            // InternalMicroserviceDSL.g:2726:2: '{'
            {
             before(grammarAccess.getServerConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getServerConfigAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__1__Impl"


    // $ANTLR start "rule__ServerConfig__Group__2"
    // InternalMicroserviceDSL.g:2735:1: rule__ServerConfig__Group__2 : rule__ServerConfig__Group__2__Impl rule__ServerConfig__Group__3 ;
    public final void rule__ServerConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2739:1: ( rule__ServerConfig__Group__2__Impl rule__ServerConfig__Group__3 )
            // InternalMicroserviceDSL.g:2740:2: rule__ServerConfig__Group__2__Impl rule__ServerConfig__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ServerConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__2"


    // $ANTLR start "rule__ServerConfig__Group__2__Impl"
    // InternalMicroserviceDSL.g:2747:1: rule__ServerConfig__Group__2__Impl : ( 'port' ) ;
    public final void rule__ServerConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2751:1: ( ( 'port' ) )
            // InternalMicroserviceDSL.g:2752:1: ( 'port' )
            {
            // InternalMicroserviceDSL.g:2752:1: ( 'port' )
            // InternalMicroserviceDSL.g:2753:2: 'port'
            {
             before(grammarAccess.getServerConfigAccess().getPortKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getServerConfigAccess().getPortKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__2__Impl"


    // $ANTLR start "rule__ServerConfig__Group__3"
    // InternalMicroserviceDSL.g:2762:1: rule__ServerConfig__Group__3 : rule__ServerConfig__Group__3__Impl rule__ServerConfig__Group__4 ;
    public final void rule__ServerConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2766:1: ( rule__ServerConfig__Group__3__Impl rule__ServerConfig__Group__4 )
            // InternalMicroserviceDSL.g:2767:2: rule__ServerConfig__Group__3__Impl rule__ServerConfig__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__ServerConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__3"


    // $ANTLR start "rule__ServerConfig__Group__3__Impl"
    // InternalMicroserviceDSL.g:2774:1: rule__ServerConfig__Group__3__Impl : ( ( rule__ServerConfig__PortAssignment_3 ) ) ;
    public final void rule__ServerConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2778:1: ( ( ( rule__ServerConfig__PortAssignment_3 ) ) )
            // InternalMicroserviceDSL.g:2779:1: ( ( rule__ServerConfig__PortAssignment_3 ) )
            {
            // InternalMicroserviceDSL.g:2779:1: ( ( rule__ServerConfig__PortAssignment_3 ) )
            // InternalMicroserviceDSL.g:2780:2: ( rule__ServerConfig__PortAssignment_3 )
            {
             before(grammarAccess.getServerConfigAccess().getPortAssignment_3()); 
            // InternalMicroserviceDSL.g:2781:2: ( rule__ServerConfig__PortAssignment_3 )
            // InternalMicroserviceDSL.g:2781:3: rule__ServerConfig__PortAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ServerConfig__PortAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServerConfigAccess().getPortAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__3__Impl"


    // $ANTLR start "rule__ServerConfig__Group__4"
    // InternalMicroserviceDSL.g:2789:1: rule__ServerConfig__Group__4 : rule__ServerConfig__Group__4__Impl rule__ServerConfig__Group__5 ;
    public final void rule__ServerConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2793:1: ( rule__ServerConfig__Group__4__Impl rule__ServerConfig__Group__5 )
            // InternalMicroserviceDSL.g:2794:2: rule__ServerConfig__Group__4__Impl rule__ServerConfig__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__ServerConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__4"


    // $ANTLR start "rule__ServerConfig__Group__4__Impl"
    // InternalMicroserviceDSL.g:2801:1: rule__ServerConfig__Group__4__Impl : ( ( rule__ServerConfig__Group_4__0 )? ) ;
    public final void rule__ServerConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2805:1: ( ( ( rule__ServerConfig__Group_4__0 )? ) )
            // InternalMicroserviceDSL.g:2806:1: ( ( rule__ServerConfig__Group_4__0 )? )
            {
            // InternalMicroserviceDSL.g:2806:1: ( ( rule__ServerConfig__Group_4__0 )? )
            // InternalMicroserviceDSL.g:2807:2: ( rule__ServerConfig__Group_4__0 )?
            {
             before(grammarAccess.getServerConfigAccess().getGroup_4()); 
            // InternalMicroserviceDSL.g:2808:2: ( rule__ServerConfig__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==50) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMicroserviceDSL.g:2808:3: rule__ServerConfig__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServerConfig__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServerConfigAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__4__Impl"


    // $ANTLR start "rule__ServerConfig__Group__5"
    // InternalMicroserviceDSL.g:2816:1: rule__ServerConfig__Group__5 : rule__ServerConfig__Group__5__Impl ;
    public final void rule__ServerConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2820:1: ( rule__ServerConfig__Group__5__Impl )
            // InternalMicroserviceDSL.g:2821:2: rule__ServerConfig__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__5"


    // $ANTLR start "rule__ServerConfig__Group__5__Impl"
    // InternalMicroserviceDSL.g:2827:1: rule__ServerConfig__Group__5__Impl : ( '}' ) ;
    public final void rule__ServerConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2831:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:2832:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:2832:1: ( '}' )
            // InternalMicroserviceDSL.g:2833:2: '}'
            {
             before(grammarAccess.getServerConfigAccess().getRightCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getServerConfigAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group__5__Impl"


    // $ANTLR start "rule__ServerConfig__Group_4__0"
    // InternalMicroserviceDSL.g:2843:1: rule__ServerConfig__Group_4__0 : rule__ServerConfig__Group_4__0__Impl rule__ServerConfig__Group_4__1 ;
    public final void rule__ServerConfig__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2847:1: ( rule__ServerConfig__Group_4__0__Impl rule__ServerConfig__Group_4__1 )
            // InternalMicroserviceDSL.g:2848:2: rule__ServerConfig__Group_4__0__Impl rule__ServerConfig__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__ServerConfig__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group_4__0"


    // $ANTLR start "rule__ServerConfig__Group_4__0__Impl"
    // InternalMicroserviceDSL.g:2855:1: rule__ServerConfig__Group_4__0__Impl : ( 'context-path' ) ;
    public final void rule__ServerConfig__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2859:1: ( ( 'context-path' ) )
            // InternalMicroserviceDSL.g:2860:1: ( 'context-path' )
            {
            // InternalMicroserviceDSL.g:2860:1: ( 'context-path' )
            // InternalMicroserviceDSL.g:2861:2: 'context-path'
            {
             before(grammarAccess.getServerConfigAccess().getContextPathKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getServerConfigAccess().getContextPathKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group_4__0__Impl"


    // $ANTLR start "rule__ServerConfig__Group_4__1"
    // InternalMicroserviceDSL.g:2870:1: rule__ServerConfig__Group_4__1 : rule__ServerConfig__Group_4__1__Impl ;
    public final void rule__ServerConfig__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2874:1: ( rule__ServerConfig__Group_4__1__Impl )
            // InternalMicroserviceDSL.g:2875:2: rule__ServerConfig__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerConfig__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group_4__1"


    // $ANTLR start "rule__ServerConfig__Group_4__1__Impl"
    // InternalMicroserviceDSL.g:2881:1: rule__ServerConfig__Group_4__1__Impl : ( ( rule__ServerConfig__ContextPathAssignment_4_1 ) ) ;
    public final void rule__ServerConfig__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2885:1: ( ( ( rule__ServerConfig__ContextPathAssignment_4_1 ) ) )
            // InternalMicroserviceDSL.g:2886:1: ( ( rule__ServerConfig__ContextPathAssignment_4_1 ) )
            {
            // InternalMicroserviceDSL.g:2886:1: ( ( rule__ServerConfig__ContextPathAssignment_4_1 ) )
            // InternalMicroserviceDSL.g:2887:2: ( rule__ServerConfig__ContextPathAssignment_4_1 )
            {
             before(grammarAccess.getServerConfigAccess().getContextPathAssignment_4_1()); 
            // InternalMicroserviceDSL.g:2888:2: ( rule__ServerConfig__ContextPathAssignment_4_1 )
            // InternalMicroserviceDSL.g:2888:3: rule__ServerConfig__ContextPathAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ServerConfig__ContextPathAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServerConfigAccess().getContextPathAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__Group_4__1__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group__0"
    // InternalMicroserviceDSL.g:2897:1: rule__ApplicationConfig__Group__0 : rule__ApplicationConfig__Group__0__Impl rule__ApplicationConfig__Group__1 ;
    public final void rule__ApplicationConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2901:1: ( rule__ApplicationConfig__Group__0__Impl rule__ApplicationConfig__Group__1 )
            // InternalMicroserviceDSL.g:2902:2: rule__ApplicationConfig__Group__0__Impl rule__ApplicationConfig__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ApplicationConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__0"


    // $ANTLR start "rule__ApplicationConfig__Group__0__Impl"
    // InternalMicroserviceDSL.g:2909:1: rule__ApplicationConfig__Group__0__Impl : ( 'application-config' ) ;
    public final void rule__ApplicationConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2913:1: ( ( 'application-config' ) )
            // InternalMicroserviceDSL.g:2914:1: ( 'application-config' )
            {
            // InternalMicroserviceDSL.g:2914:1: ( 'application-config' )
            // InternalMicroserviceDSL.g:2915:2: 'application-config'
            {
             before(grammarAccess.getApplicationConfigAccess().getApplicationConfigKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getApplicationConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__0__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group__1"
    // InternalMicroserviceDSL.g:2924:1: rule__ApplicationConfig__Group__1 : rule__ApplicationConfig__Group__1__Impl rule__ApplicationConfig__Group__2 ;
    public final void rule__ApplicationConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2928:1: ( rule__ApplicationConfig__Group__1__Impl rule__ApplicationConfig__Group__2 )
            // InternalMicroserviceDSL.g:2929:2: rule__ApplicationConfig__Group__1__Impl rule__ApplicationConfig__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__ApplicationConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__1"


    // $ANTLR start "rule__ApplicationConfig__Group__1__Impl"
    // InternalMicroserviceDSL.g:2936:1: rule__ApplicationConfig__Group__1__Impl : ( '{' ) ;
    public final void rule__ApplicationConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2940:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:2941:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:2941:1: ( '{' )
            // InternalMicroserviceDSL.g:2942:2: '{'
            {
             before(grammarAccess.getApplicationConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__1__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group__2"
    // InternalMicroserviceDSL.g:2951:1: rule__ApplicationConfig__Group__2 : rule__ApplicationConfig__Group__2__Impl rule__ApplicationConfig__Group__3 ;
    public final void rule__ApplicationConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2955:1: ( rule__ApplicationConfig__Group__2__Impl rule__ApplicationConfig__Group__3 )
            // InternalMicroserviceDSL.g:2956:2: rule__ApplicationConfig__Group__2__Impl rule__ApplicationConfig__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__ApplicationConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__2"


    // $ANTLR start "rule__ApplicationConfig__Group__2__Impl"
    // InternalMicroserviceDSL.g:2963:1: rule__ApplicationConfig__Group__2__Impl : ( ( rule__ApplicationConfig__Group_2__0 )? ) ;
    public final void rule__ApplicationConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2967:1: ( ( ( rule__ApplicationConfig__Group_2__0 )? ) )
            // InternalMicroserviceDSL.g:2968:1: ( ( rule__ApplicationConfig__Group_2__0 )? )
            {
            // InternalMicroserviceDSL.g:2968:1: ( ( rule__ApplicationConfig__Group_2__0 )? )
            // InternalMicroserviceDSL.g:2969:2: ( rule__ApplicationConfig__Group_2__0 )?
            {
             before(grammarAccess.getApplicationConfigAccess().getGroup_2()); 
            // InternalMicroserviceDSL.g:2970:2: ( rule__ApplicationConfig__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==52) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMicroserviceDSL.g:2970:3: rule__ApplicationConfig__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationConfig__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationConfigAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__2__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group__3"
    // InternalMicroserviceDSL.g:2978:1: rule__ApplicationConfig__Group__3 : rule__ApplicationConfig__Group__3__Impl rule__ApplicationConfig__Group__4 ;
    public final void rule__ApplicationConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2982:1: ( rule__ApplicationConfig__Group__3__Impl rule__ApplicationConfig__Group__4 )
            // InternalMicroserviceDSL.g:2983:2: rule__ApplicationConfig__Group__3__Impl rule__ApplicationConfig__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__ApplicationConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__3"


    // $ANTLR start "rule__ApplicationConfig__Group__3__Impl"
    // InternalMicroserviceDSL.g:2990:1: rule__ApplicationConfig__Group__3__Impl : ( ( rule__ApplicationConfig__Group_3__0 )? ) ;
    public final void rule__ApplicationConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:2994:1: ( ( ( rule__ApplicationConfig__Group_3__0 )? ) )
            // InternalMicroserviceDSL.g:2995:1: ( ( rule__ApplicationConfig__Group_3__0 )? )
            {
            // InternalMicroserviceDSL.g:2995:1: ( ( rule__ApplicationConfig__Group_3__0 )? )
            // InternalMicroserviceDSL.g:2996:2: ( rule__ApplicationConfig__Group_3__0 )?
            {
             before(grammarAccess.getApplicationConfigAccess().getGroup_3()); 
            // InternalMicroserviceDSL.g:2997:2: ( rule__ApplicationConfig__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==53) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMicroserviceDSL.g:2997:3: rule__ApplicationConfig__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationConfig__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationConfigAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__3__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group__4"
    // InternalMicroserviceDSL.g:3005:1: rule__ApplicationConfig__Group__4 : rule__ApplicationConfig__Group__4__Impl rule__ApplicationConfig__Group__5 ;
    public final void rule__ApplicationConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3009:1: ( rule__ApplicationConfig__Group__4__Impl rule__ApplicationConfig__Group__5 )
            // InternalMicroserviceDSL.g:3010:2: rule__ApplicationConfig__Group__4__Impl rule__ApplicationConfig__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__ApplicationConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__4"


    // $ANTLR start "rule__ApplicationConfig__Group__4__Impl"
    // InternalMicroserviceDSL.g:3017:1: rule__ApplicationConfig__Group__4__Impl : ( ( rule__ApplicationConfig__Group_4__0 )? ) ;
    public final void rule__ApplicationConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3021:1: ( ( ( rule__ApplicationConfig__Group_4__0 )? ) )
            // InternalMicroserviceDSL.g:3022:1: ( ( rule__ApplicationConfig__Group_4__0 )? )
            {
            // InternalMicroserviceDSL.g:3022:1: ( ( rule__ApplicationConfig__Group_4__0 )? )
            // InternalMicroserviceDSL.g:3023:2: ( rule__ApplicationConfig__Group_4__0 )?
            {
             before(grammarAccess.getApplicationConfigAccess().getGroup_4()); 
            // InternalMicroserviceDSL.g:3024:2: ( rule__ApplicationConfig__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==54) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMicroserviceDSL.g:3024:3: rule__ApplicationConfig__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicationConfig__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationConfigAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__4__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group__5"
    // InternalMicroserviceDSL.g:3032:1: rule__ApplicationConfig__Group__5 : rule__ApplicationConfig__Group__5__Impl ;
    public final void rule__ApplicationConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3036:1: ( rule__ApplicationConfig__Group__5__Impl )
            // InternalMicroserviceDSL.g:3037:2: rule__ApplicationConfig__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__5"


    // $ANTLR start "rule__ApplicationConfig__Group__5__Impl"
    // InternalMicroserviceDSL.g:3043:1: rule__ApplicationConfig__Group__5__Impl : ( '}' ) ;
    public final void rule__ApplicationConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3047:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:3048:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:3048:1: ( '}' )
            // InternalMicroserviceDSL.g:3049:2: '}'
            {
             before(grammarAccess.getApplicationConfigAccess().getRightCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group__5__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group_2__0"
    // InternalMicroserviceDSL.g:3059:1: rule__ApplicationConfig__Group_2__0 : rule__ApplicationConfig__Group_2__0__Impl rule__ApplicationConfig__Group_2__1 ;
    public final void rule__ApplicationConfig__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3063:1: ( rule__ApplicationConfig__Group_2__0__Impl rule__ApplicationConfig__Group_2__1 )
            // InternalMicroserviceDSL.g:3064:2: rule__ApplicationConfig__Group_2__0__Impl rule__ApplicationConfig__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ApplicationConfig__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_2__0"


    // $ANTLR start "rule__ApplicationConfig__Group_2__0__Impl"
    // InternalMicroserviceDSL.g:3071:1: rule__ApplicationConfig__Group_2__0__Impl : ( 'name' ) ;
    public final void rule__ApplicationConfig__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3075:1: ( ( 'name' ) )
            // InternalMicroserviceDSL.g:3076:1: ( 'name' )
            {
            // InternalMicroserviceDSL.g:3076:1: ( 'name' )
            // InternalMicroserviceDSL.g:3077:2: 'name'
            {
             before(grammarAccess.getApplicationConfigAccess().getNameKeyword_2_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getNameKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_2__0__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group_2__1"
    // InternalMicroserviceDSL.g:3086:1: rule__ApplicationConfig__Group_2__1 : rule__ApplicationConfig__Group_2__1__Impl ;
    public final void rule__ApplicationConfig__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3090:1: ( rule__ApplicationConfig__Group_2__1__Impl )
            // InternalMicroserviceDSL.g:3091:2: rule__ApplicationConfig__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_2__1"


    // $ANTLR start "rule__ApplicationConfig__Group_2__1__Impl"
    // InternalMicroserviceDSL.g:3097:1: rule__ApplicationConfig__Group_2__1__Impl : ( ( rule__ApplicationConfig__AppNameAssignment_2_1 ) ) ;
    public final void rule__ApplicationConfig__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3101:1: ( ( ( rule__ApplicationConfig__AppNameAssignment_2_1 ) ) )
            // InternalMicroserviceDSL.g:3102:1: ( ( rule__ApplicationConfig__AppNameAssignment_2_1 ) )
            {
            // InternalMicroserviceDSL.g:3102:1: ( ( rule__ApplicationConfig__AppNameAssignment_2_1 ) )
            // InternalMicroserviceDSL.g:3103:2: ( rule__ApplicationConfig__AppNameAssignment_2_1 )
            {
             before(grammarAccess.getApplicationConfigAccess().getAppNameAssignment_2_1()); 
            // InternalMicroserviceDSL.g:3104:2: ( rule__ApplicationConfig__AppNameAssignment_2_1 )
            // InternalMicroserviceDSL.g:3104:3: rule__ApplicationConfig__AppNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__AppNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationConfigAccess().getAppNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_2__1__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group_3__0"
    // InternalMicroserviceDSL.g:3113:1: rule__ApplicationConfig__Group_3__0 : rule__ApplicationConfig__Group_3__0__Impl rule__ApplicationConfig__Group_3__1 ;
    public final void rule__ApplicationConfig__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3117:1: ( rule__ApplicationConfig__Group_3__0__Impl rule__ApplicationConfig__Group_3__1 )
            // InternalMicroserviceDSL.g:3118:2: rule__ApplicationConfig__Group_3__0__Impl rule__ApplicationConfig__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__ApplicationConfig__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_3__0"


    // $ANTLR start "rule__ApplicationConfig__Group_3__0__Impl"
    // InternalMicroserviceDSL.g:3125:1: rule__ApplicationConfig__Group_3__0__Impl : ( 'profile' ) ;
    public final void rule__ApplicationConfig__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3129:1: ( ( 'profile' ) )
            // InternalMicroserviceDSL.g:3130:1: ( 'profile' )
            {
            // InternalMicroserviceDSL.g:3130:1: ( 'profile' )
            // InternalMicroserviceDSL.g:3131:2: 'profile'
            {
             before(grammarAccess.getApplicationConfigAccess().getProfileKeyword_3_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getProfileKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_3__0__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group_3__1"
    // InternalMicroserviceDSL.g:3140:1: rule__ApplicationConfig__Group_3__1 : rule__ApplicationConfig__Group_3__1__Impl ;
    public final void rule__ApplicationConfig__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3144:1: ( rule__ApplicationConfig__Group_3__1__Impl )
            // InternalMicroserviceDSL.g:3145:2: rule__ApplicationConfig__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_3__1"


    // $ANTLR start "rule__ApplicationConfig__Group_3__1__Impl"
    // InternalMicroserviceDSL.g:3151:1: rule__ApplicationConfig__Group_3__1__Impl : ( ( rule__ApplicationConfig__ProfileAssignment_3_1 ) ) ;
    public final void rule__ApplicationConfig__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3155:1: ( ( ( rule__ApplicationConfig__ProfileAssignment_3_1 ) ) )
            // InternalMicroserviceDSL.g:3156:1: ( ( rule__ApplicationConfig__ProfileAssignment_3_1 ) )
            {
            // InternalMicroserviceDSL.g:3156:1: ( ( rule__ApplicationConfig__ProfileAssignment_3_1 ) )
            // InternalMicroserviceDSL.g:3157:2: ( rule__ApplicationConfig__ProfileAssignment_3_1 )
            {
             before(grammarAccess.getApplicationConfigAccess().getProfileAssignment_3_1()); 
            // InternalMicroserviceDSL.g:3158:2: ( rule__ApplicationConfig__ProfileAssignment_3_1 )
            // InternalMicroserviceDSL.g:3158:3: rule__ApplicationConfig__ProfileAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__ProfileAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationConfigAccess().getProfileAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_3__1__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group_4__0"
    // InternalMicroserviceDSL.g:3167:1: rule__ApplicationConfig__Group_4__0 : rule__ApplicationConfig__Group_4__0__Impl rule__ApplicationConfig__Group_4__1 ;
    public final void rule__ApplicationConfig__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3171:1: ( rule__ApplicationConfig__Group_4__0__Impl rule__ApplicationConfig__Group_4__1 )
            // InternalMicroserviceDSL.g:3172:2: rule__ApplicationConfig__Group_4__0__Impl rule__ApplicationConfig__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__ApplicationConfig__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_4__0"


    // $ANTLR start "rule__ApplicationConfig__Group_4__0__Impl"
    // InternalMicroserviceDSL.g:3179:1: rule__ApplicationConfig__Group_4__0__Impl : ( 'logging-level' ) ;
    public final void rule__ApplicationConfig__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3183:1: ( ( 'logging-level' ) )
            // InternalMicroserviceDSL.g:3184:1: ( 'logging-level' )
            {
            // InternalMicroserviceDSL.g:3184:1: ( 'logging-level' )
            // InternalMicroserviceDSL.g:3185:2: 'logging-level'
            {
             before(grammarAccess.getApplicationConfigAccess().getLoggingLevelKeyword_4_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getLoggingLevelKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_4__0__Impl"


    // $ANTLR start "rule__ApplicationConfig__Group_4__1"
    // InternalMicroserviceDSL.g:3194:1: rule__ApplicationConfig__Group_4__1 : rule__ApplicationConfig__Group_4__1__Impl ;
    public final void rule__ApplicationConfig__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3198:1: ( rule__ApplicationConfig__Group_4__1__Impl )
            // InternalMicroserviceDSL.g:3199:2: rule__ApplicationConfig__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_4__1"


    // $ANTLR start "rule__ApplicationConfig__Group_4__1__Impl"
    // InternalMicroserviceDSL.g:3205:1: rule__ApplicationConfig__Group_4__1__Impl : ( ( rule__ApplicationConfig__LoggingLevelAssignment_4_1 ) ) ;
    public final void rule__ApplicationConfig__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3209:1: ( ( ( rule__ApplicationConfig__LoggingLevelAssignment_4_1 ) ) )
            // InternalMicroserviceDSL.g:3210:1: ( ( rule__ApplicationConfig__LoggingLevelAssignment_4_1 ) )
            {
            // InternalMicroserviceDSL.g:3210:1: ( ( rule__ApplicationConfig__LoggingLevelAssignment_4_1 ) )
            // InternalMicroserviceDSL.g:3211:2: ( rule__ApplicationConfig__LoggingLevelAssignment_4_1 )
            {
             before(grammarAccess.getApplicationConfigAccess().getLoggingLevelAssignment_4_1()); 
            // InternalMicroserviceDSL.g:3212:2: ( rule__ApplicationConfig__LoggingLevelAssignment_4_1 )
            // InternalMicroserviceDSL.g:3212:3: rule__ApplicationConfig__LoggingLevelAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationConfig__LoggingLevelAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationConfigAccess().getLoggingLevelAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__Group_4__1__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__0"
    // InternalMicroserviceDSL.g:3221:1: rule__DatabaseConfig__Group__0 : rule__DatabaseConfig__Group__0__Impl rule__DatabaseConfig__Group__1 ;
    public final void rule__DatabaseConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3225:1: ( rule__DatabaseConfig__Group__0__Impl rule__DatabaseConfig__Group__1 )
            // InternalMicroserviceDSL.g:3226:2: rule__DatabaseConfig__Group__0__Impl rule__DatabaseConfig__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__DatabaseConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__0"


    // $ANTLR start "rule__DatabaseConfig__Group__0__Impl"
    // InternalMicroserviceDSL.g:3233:1: rule__DatabaseConfig__Group__0__Impl : ( 'database-config' ) ;
    public final void rule__DatabaseConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3237:1: ( ( 'database-config' ) )
            // InternalMicroserviceDSL.g:3238:1: ( 'database-config' )
            {
            // InternalMicroserviceDSL.g:3238:1: ( 'database-config' )
            // InternalMicroserviceDSL.g:3239:2: 'database-config'
            {
             before(grammarAccess.getDatabaseConfigAccess().getDatabaseConfigKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getDatabaseConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__0__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__1"
    // InternalMicroserviceDSL.g:3248:1: rule__DatabaseConfig__Group__1 : rule__DatabaseConfig__Group__1__Impl rule__DatabaseConfig__Group__2 ;
    public final void rule__DatabaseConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3252:1: ( rule__DatabaseConfig__Group__1__Impl rule__DatabaseConfig__Group__2 )
            // InternalMicroserviceDSL.g:3253:2: rule__DatabaseConfig__Group__1__Impl rule__DatabaseConfig__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__DatabaseConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__1"


    // $ANTLR start "rule__DatabaseConfig__Group__1__Impl"
    // InternalMicroserviceDSL.g:3260:1: rule__DatabaseConfig__Group__1__Impl : ( '{' ) ;
    public final void rule__DatabaseConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3264:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:3265:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:3265:1: ( '{' )
            // InternalMicroserviceDSL.g:3266:2: '{'
            {
             before(grammarAccess.getDatabaseConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__1__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__2"
    // InternalMicroserviceDSL.g:3275:1: rule__DatabaseConfig__Group__2 : rule__DatabaseConfig__Group__2__Impl rule__DatabaseConfig__Group__3 ;
    public final void rule__DatabaseConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3279:1: ( rule__DatabaseConfig__Group__2__Impl rule__DatabaseConfig__Group__3 )
            // InternalMicroserviceDSL.g:3280:2: rule__DatabaseConfig__Group__2__Impl rule__DatabaseConfig__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DatabaseConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__2"


    // $ANTLR start "rule__DatabaseConfig__Group__2__Impl"
    // InternalMicroserviceDSL.g:3287:1: rule__DatabaseConfig__Group__2__Impl : ( 'url' ) ;
    public final void rule__DatabaseConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3291:1: ( ( 'url' ) )
            // InternalMicroserviceDSL.g:3292:1: ( 'url' )
            {
            // InternalMicroserviceDSL.g:3292:1: ( 'url' )
            // InternalMicroserviceDSL.g:3293:2: 'url'
            {
             before(grammarAccess.getDatabaseConfigAccess().getUrlKeyword_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getUrlKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__2__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__3"
    // InternalMicroserviceDSL.g:3302:1: rule__DatabaseConfig__Group__3 : rule__DatabaseConfig__Group__3__Impl rule__DatabaseConfig__Group__4 ;
    public final void rule__DatabaseConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3306:1: ( rule__DatabaseConfig__Group__3__Impl rule__DatabaseConfig__Group__4 )
            // InternalMicroserviceDSL.g:3307:2: rule__DatabaseConfig__Group__3__Impl rule__DatabaseConfig__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__DatabaseConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__3"


    // $ANTLR start "rule__DatabaseConfig__Group__3__Impl"
    // InternalMicroserviceDSL.g:3314:1: rule__DatabaseConfig__Group__3__Impl : ( ( rule__DatabaseConfig__DbUrlAssignment_3 ) ) ;
    public final void rule__DatabaseConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3318:1: ( ( ( rule__DatabaseConfig__DbUrlAssignment_3 ) ) )
            // InternalMicroserviceDSL.g:3319:1: ( ( rule__DatabaseConfig__DbUrlAssignment_3 ) )
            {
            // InternalMicroserviceDSL.g:3319:1: ( ( rule__DatabaseConfig__DbUrlAssignment_3 ) )
            // InternalMicroserviceDSL.g:3320:2: ( rule__DatabaseConfig__DbUrlAssignment_3 )
            {
             before(grammarAccess.getDatabaseConfigAccess().getDbUrlAssignment_3()); 
            // InternalMicroserviceDSL.g:3321:2: ( rule__DatabaseConfig__DbUrlAssignment_3 )
            // InternalMicroserviceDSL.g:3321:3: rule__DatabaseConfig__DbUrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__DbUrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseConfigAccess().getDbUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__3__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__4"
    // InternalMicroserviceDSL.g:3329:1: rule__DatabaseConfig__Group__4 : rule__DatabaseConfig__Group__4__Impl rule__DatabaseConfig__Group__5 ;
    public final void rule__DatabaseConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3333:1: ( rule__DatabaseConfig__Group__4__Impl rule__DatabaseConfig__Group__5 )
            // InternalMicroserviceDSL.g:3334:2: rule__DatabaseConfig__Group__4__Impl rule__DatabaseConfig__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__DatabaseConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__4"


    // $ANTLR start "rule__DatabaseConfig__Group__4__Impl"
    // InternalMicroserviceDSL.g:3341:1: rule__DatabaseConfig__Group__4__Impl : ( 'username' ) ;
    public final void rule__DatabaseConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3345:1: ( ( 'username' ) )
            // InternalMicroserviceDSL.g:3346:1: ( 'username' )
            {
            // InternalMicroserviceDSL.g:3346:1: ( 'username' )
            // InternalMicroserviceDSL.g:3347:2: 'username'
            {
             before(grammarAccess.getDatabaseConfigAccess().getUsernameKeyword_4()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getUsernameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__4__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__5"
    // InternalMicroserviceDSL.g:3356:1: rule__DatabaseConfig__Group__5 : rule__DatabaseConfig__Group__5__Impl rule__DatabaseConfig__Group__6 ;
    public final void rule__DatabaseConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3360:1: ( rule__DatabaseConfig__Group__5__Impl rule__DatabaseConfig__Group__6 )
            // InternalMicroserviceDSL.g:3361:2: rule__DatabaseConfig__Group__5__Impl rule__DatabaseConfig__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__DatabaseConfig__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__5"


    // $ANTLR start "rule__DatabaseConfig__Group__5__Impl"
    // InternalMicroserviceDSL.g:3368:1: rule__DatabaseConfig__Group__5__Impl : ( ( rule__DatabaseConfig__DbUsernameAssignment_5 ) ) ;
    public final void rule__DatabaseConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3372:1: ( ( ( rule__DatabaseConfig__DbUsernameAssignment_5 ) ) )
            // InternalMicroserviceDSL.g:3373:1: ( ( rule__DatabaseConfig__DbUsernameAssignment_5 ) )
            {
            // InternalMicroserviceDSL.g:3373:1: ( ( rule__DatabaseConfig__DbUsernameAssignment_5 ) )
            // InternalMicroserviceDSL.g:3374:2: ( rule__DatabaseConfig__DbUsernameAssignment_5 )
            {
             before(grammarAccess.getDatabaseConfigAccess().getDbUsernameAssignment_5()); 
            // InternalMicroserviceDSL.g:3375:2: ( rule__DatabaseConfig__DbUsernameAssignment_5 )
            // InternalMicroserviceDSL.g:3375:3: rule__DatabaseConfig__DbUsernameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__DbUsernameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseConfigAccess().getDbUsernameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__5__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__6"
    // InternalMicroserviceDSL.g:3383:1: rule__DatabaseConfig__Group__6 : rule__DatabaseConfig__Group__6__Impl rule__DatabaseConfig__Group__7 ;
    public final void rule__DatabaseConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3387:1: ( rule__DatabaseConfig__Group__6__Impl rule__DatabaseConfig__Group__7 )
            // InternalMicroserviceDSL.g:3388:2: rule__DatabaseConfig__Group__6__Impl rule__DatabaseConfig__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__DatabaseConfig__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__6"


    // $ANTLR start "rule__DatabaseConfig__Group__6__Impl"
    // InternalMicroserviceDSL.g:3395:1: rule__DatabaseConfig__Group__6__Impl : ( 'password' ) ;
    public final void rule__DatabaseConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3399:1: ( ( 'password' ) )
            // InternalMicroserviceDSL.g:3400:1: ( 'password' )
            {
            // InternalMicroserviceDSL.g:3400:1: ( 'password' )
            // InternalMicroserviceDSL.g:3401:2: 'password'
            {
             before(grammarAccess.getDatabaseConfigAccess().getPasswordKeyword_6()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getPasswordKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__6__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__7"
    // InternalMicroserviceDSL.g:3410:1: rule__DatabaseConfig__Group__7 : rule__DatabaseConfig__Group__7__Impl rule__DatabaseConfig__Group__8 ;
    public final void rule__DatabaseConfig__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3414:1: ( rule__DatabaseConfig__Group__7__Impl rule__DatabaseConfig__Group__8 )
            // InternalMicroserviceDSL.g:3415:2: rule__DatabaseConfig__Group__7__Impl rule__DatabaseConfig__Group__8
            {
            pushFollow(FOLLOW_36);
            rule__DatabaseConfig__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__7"


    // $ANTLR start "rule__DatabaseConfig__Group__7__Impl"
    // InternalMicroserviceDSL.g:3422:1: rule__DatabaseConfig__Group__7__Impl : ( ( rule__DatabaseConfig__DbPasswordAssignment_7 ) ) ;
    public final void rule__DatabaseConfig__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3426:1: ( ( ( rule__DatabaseConfig__DbPasswordAssignment_7 ) ) )
            // InternalMicroserviceDSL.g:3427:1: ( ( rule__DatabaseConfig__DbPasswordAssignment_7 ) )
            {
            // InternalMicroserviceDSL.g:3427:1: ( ( rule__DatabaseConfig__DbPasswordAssignment_7 ) )
            // InternalMicroserviceDSL.g:3428:2: ( rule__DatabaseConfig__DbPasswordAssignment_7 )
            {
             before(grammarAccess.getDatabaseConfigAccess().getDbPasswordAssignment_7()); 
            // InternalMicroserviceDSL.g:3429:2: ( rule__DatabaseConfig__DbPasswordAssignment_7 )
            // InternalMicroserviceDSL.g:3429:3: rule__DatabaseConfig__DbPasswordAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__DbPasswordAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseConfigAccess().getDbPasswordAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__7__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__8"
    // InternalMicroserviceDSL.g:3437:1: rule__DatabaseConfig__Group__8 : rule__DatabaseConfig__Group__8__Impl rule__DatabaseConfig__Group__9 ;
    public final void rule__DatabaseConfig__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3441:1: ( rule__DatabaseConfig__Group__8__Impl rule__DatabaseConfig__Group__9 )
            // InternalMicroserviceDSL.g:3442:2: rule__DatabaseConfig__Group__8__Impl rule__DatabaseConfig__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__DatabaseConfig__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__8"


    // $ANTLR start "rule__DatabaseConfig__Group__8__Impl"
    // InternalMicroserviceDSL.g:3449:1: rule__DatabaseConfig__Group__8__Impl : ( 'driver' ) ;
    public final void rule__DatabaseConfig__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3453:1: ( ( 'driver' ) )
            // InternalMicroserviceDSL.g:3454:1: ( 'driver' )
            {
            // InternalMicroserviceDSL.g:3454:1: ( 'driver' )
            // InternalMicroserviceDSL.g:3455:2: 'driver'
            {
             before(grammarAccess.getDatabaseConfigAccess().getDriverKeyword_8()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getDriverKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__8__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__9"
    // InternalMicroserviceDSL.g:3464:1: rule__DatabaseConfig__Group__9 : rule__DatabaseConfig__Group__9__Impl rule__DatabaseConfig__Group__10 ;
    public final void rule__DatabaseConfig__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3468:1: ( rule__DatabaseConfig__Group__9__Impl rule__DatabaseConfig__Group__10 )
            // InternalMicroserviceDSL.g:3469:2: rule__DatabaseConfig__Group__9__Impl rule__DatabaseConfig__Group__10
            {
            pushFollow(FOLLOW_38);
            rule__DatabaseConfig__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__9"


    // $ANTLR start "rule__DatabaseConfig__Group__9__Impl"
    // InternalMicroserviceDSL.g:3476:1: rule__DatabaseConfig__Group__9__Impl : ( ( rule__DatabaseConfig__DriverAssignment_9 ) ) ;
    public final void rule__DatabaseConfig__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3480:1: ( ( ( rule__DatabaseConfig__DriverAssignment_9 ) ) )
            // InternalMicroserviceDSL.g:3481:1: ( ( rule__DatabaseConfig__DriverAssignment_9 ) )
            {
            // InternalMicroserviceDSL.g:3481:1: ( ( rule__DatabaseConfig__DriverAssignment_9 ) )
            // InternalMicroserviceDSL.g:3482:2: ( rule__DatabaseConfig__DriverAssignment_9 )
            {
             before(grammarAccess.getDatabaseConfigAccess().getDriverAssignment_9()); 
            // InternalMicroserviceDSL.g:3483:2: ( rule__DatabaseConfig__DriverAssignment_9 )
            // InternalMicroserviceDSL.g:3483:3: rule__DatabaseConfig__DriverAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__DriverAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseConfigAccess().getDriverAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__9__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__10"
    // InternalMicroserviceDSL.g:3491:1: rule__DatabaseConfig__Group__10 : rule__DatabaseConfig__Group__10__Impl rule__DatabaseConfig__Group__11 ;
    public final void rule__DatabaseConfig__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3495:1: ( rule__DatabaseConfig__Group__10__Impl rule__DatabaseConfig__Group__11 )
            // InternalMicroserviceDSL.g:3496:2: rule__DatabaseConfig__Group__10__Impl rule__DatabaseConfig__Group__11
            {
            pushFollow(FOLLOW_38);
            rule__DatabaseConfig__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__10"


    // $ANTLR start "rule__DatabaseConfig__Group__10__Impl"
    // InternalMicroserviceDSL.g:3503:1: rule__DatabaseConfig__Group__10__Impl : ( ( rule__DatabaseConfig__Group_10__0 )? ) ;
    public final void rule__DatabaseConfig__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3507:1: ( ( ( rule__DatabaseConfig__Group_10__0 )? ) )
            // InternalMicroserviceDSL.g:3508:1: ( ( rule__DatabaseConfig__Group_10__0 )? )
            {
            // InternalMicroserviceDSL.g:3508:1: ( ( rule__DatabaseConfig__Group_10__0 )? )
            // InternalMicroserviceDSL.g:3509:2: ( rule__DatabaseConfig__Group_10__0 )?
            {
             before(grammarAccess.getDatabaseConfigAccess().getGroup_10()); 
            // InternalMicroserviceDSL.g:3510:2: ( rule__DatabaseConfig__Group_10__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==60) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMicroserviceDSL.g:3510:3: rule__DatabaseConfig__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DatabaseConfig__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDatabaseConfigAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__10__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group__11"
    // InternalMicroserviceDSL.g:3518:1: rule__DatabaseConfig__Group__11 : rule__DatabaseConfig__Group__11__Impl ;
    public final void rule__DatabaseConfig__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3522:1: ( rule__DatabaseConfig__Group__11__Impl )
            // InternalMicroserviceDSL.g:3523:2: rule__DatabaseConfig__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__11"


    // $ANTLR start "rule__DatabaseConfig__Group__11__Impl"
    // InternalMicroserviceDSL.g:3529:1: rule__DatabaseConfig__Group__11__Impl : ( '}' ) ;
    public final void rule__DatabaseConfig__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3533:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:3534:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:3534:1: ( '}' )
            // InternalMicroserviceDSL.g:3535:2: '}'
            {
             before(grammarAccess.getDatabaseConfigAccess().getRightCurlyBracketKeyword_11()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group__11__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group_10__0"
    // InternalMicroserviceDSL.g:3545:1: rule__DatabaseConfig__Group_10__0 : rule__DatabaseConfig__Group_10__0__Impl rule__DatabaseConfig__Group_10__1 ;
    public final void rule__DatabaseConfig__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3549:1: ( rule__DatabaseConfig__Group_10__0__Impl rule__DatabaseConfig__Group_10__1 )
            // InternalMicroserviceDSL.g:3550:2: rule__DatabaseConfig__Group_10__0__Impl rule__DatabaseConfig__Group_10__1
            {
            pushFollow(FOLLOW_39);
            rule__DatabaseConfig__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group_10__0"


    // $ANTLR start "rule__DatabaseConfig__Group_10__0__Impl"
    // InternalMicroserviceDSL.g:3557:1: rule__DatabaseConfig__Group_10__0__Impl : ( 'ddl' ) ;
    public final void rule__DatabaseConfig__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3561:1: ( ( 'ddl' ) )
            // InternalMicroserviceDSL.g:3562:1: ( 'ddl' )
            {
            // InternalMicroserviceDSL.g:3562:1: ( 'ddl' )
            // InternalMicroserviceDSL.g:3563:2: 'ddl'
            {
             before(grammarAccess.getDatabaseConfigAccess().getDdlKeyword_10_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getDdlKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group_10__0__Impl"


    // $ANTLR start "rule__DatabaseConfig__Group_10__1"
    // InternalMicroserviceDSL.g:3572:1: rule__DatabaseConfig__Group_10__1 : rule__DatabaseConfig__Group_10__1__Impl ;
    public final void rule__DatabaseConfig__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3576:1: ( rule__DatabaseConfig__Group_10__1__Impl )
            // InternalMicroserviceDSL.g:3577:2: rule__DatabaseConfig__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group_10__1"


    // $ANTLR start "rule__DatabaseConfig__Group_10__1__Impl"
    // InternalMicroserviceDSL.g:3583:1: rule__DatabaseConfig__Group_10__1__Impl : ( ( rule__DatabaseConfig__DdlAssignment_10_1 ) ) ;
    public final void rule__DatabaseConfig__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3587:1: ( ( ( rule__DatabaseConfig__DdlAssignment_10_1 ) ) )
            // InternalMicroserviceDSL.g:3588:1: ( ( rule__DatabaseConfig__DdlAssignment_10_1 ) )
            {
            // InternalMicroserviceDSL.g:3588:1: ( ( rule__DatabaseConfig__DdlAssignment_10_1 ) )
            // InternalMicroserviceDSL.g:3589:2: ( rule__DatabaseConfig__DdlAssignment_10_1 )
            {
             before(grammarAccess.getDatabaseConfigAccess().getDdlAssignment_10_1()); 
            // InternalMicroserviceDSL.g:3590:2: ( rule__DatabaseConfig__DdlAssignment_10_1 )
            // InternalMicroserviceDSL.g:3590:3: rule__DatabaseConfig__DdlAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseConfig__DdlAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseConfigAccess().getDdlAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__Group_10__1__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group__0"
    // InternalMicroserviceDSL.g:3599:1: rule__ActuatorConfig__Group__0 : rule__ActuatorConfig__Group__0__Impl rule__ActuatorConfig__Group__1 ;
    public final void rule__ActuatorConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3603:1: ( rule__ActuatorConfig__Group__0__Impl rule__ActuatorConfig__Group__1 )
            // InternalMicroserviceDSL.g:3604:2: rule__ActuatorConfig__Group__0__Impl rule__ActuatorConfig__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ActuatorConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__0"


    // $ANTLR start "rule__ActuatorConfig__Group__0__Impl"
    // InternalMicroserviceDSL.g:3611:1: rule__ActuatorConfig__Group__0__Impl : ( 'actuator-config' ) ;
    public final void rule__ActuatorConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3615:1: ( ( 'actuator-config' ) )
            // InternalMicroserviceDSL.g:3616:1: ( 'actuator-config' )
            {
            // InternalMicroserviceDSL.g:3616:1: ( 'actuator-config' )
            // InternalMicroserviceDSL.g:3617:2: 'actuator-config'
            {
             before(grammarAccess.getActuatorConfigAccess().getActuatorConfigKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getActuatorConfigAccess().getActuatorConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__0__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group__1"
    // InternalMicroserviceDSL.g:3626:1: rule__ActuatorConfig__Group__1 : rule__ActuatorConfig__Group__1__Impl rule__ActuatorConfig__Group__2 ;
    public final void rule__ActuatorConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3630:1: ( rule__ActuatorConfig__Group__1__Impl rule__ActuatorConfig__Group__2 )
            // InternalMicroserviceDSL.g:3631:2: rule__ActuatorConfig__Group__1__Impl rule__ActuatorConfig__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__ActuatorConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__1"


    // $ANTLR start "rule__ActuatorConfig__Group__1__Impl"
    // InternalMicroserviceDSL.g:3638:1: rule__ActuatorConfig__Group__1__Impl : ( '{' ) ;
    public final void rule__ActuatorConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3642:1: ( ( '{' ) )
            // InternalMicroserviceDSL.g:3643:1: ( '{' )
            {
            // InternalMicroserviceDSL.g:3643:1: ( '{' )
            // InternalMicroserviceDSL.g:3644:2: '{'
            {
             before(grammarAccess.getActuatorConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getActuatorConfigAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__1__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group__2"
    // InternalMicroserviceDSL.g:3653:1: rule__ActuatorConfig__Group__2 : rule__ActuatorConfig__Group__2__Impl rule__ActuatorConfig__Group__3 ;
    public final void rule__ActuatorConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3657:1: ( rule__ActuatorConfig__Group__2__Impl rule__ActuatorConfig__Group__3 )
            // InternalMicroserviceDSL.g:3658:2: rule__ActuatorConfig__Group__2__Impl rule__ActuatorConfig__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__ActuatorConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__2"


    // $ANTLR start "rule__ActuatorConfig__Group__2__Impl"
    // InternalMicroserviceDSL.g:3665:1: rule__ActuatorConfig__Group__2__Impl : ( ( rule__ActuatorConfig__Group_2__0 )? ) ;
    public final void rule__ActuatorConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3669:1: ( ( ( rule__ActuatorConfig__Group_2__0 )? ) )
            // InternalMicroserviceDSL.g:3670:1: ( ( rule__ActuatorConfig__Group_2__0 )? )
            {
            // InternalMicroserviceDSL.g:3670:1: ( ( rule__ActuatorConfig__Group_2__0 )? )
            // InternalMicroserviceDSL.g:3671:2: ( rule__ActuatorConfig__Group_2__0 )?
            {
             before(grammarAccess.getActuatorConfigAccess().getGroup_2()); 
            // InternalMicroserviceDSL.g:3672:2: ( rule__ActuatorConfig__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==62) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMicroserviceDSL.g:3672:3: rule__ActuatorConfig__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActuatorConfig__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActuatorConfigAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__2__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group__3"
    // InternalMicroserviceDSL.g:3680:1: rule__ActuatorConfig__Group__3 : rule__ActuatorConfig__Group__3__Impl rule__ActuatorConfig__Group__4 ;
    public final void rule__ActuatorConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3684:1: ( rule__ActuatorConfig__Group__3__Impl rule__ActuatorConfig__Group__4 )
            // InternalMicroserviceDSL.g:3685:2: rule__ActuatorConfig__Group__3__Impl rule__ActuatorConfig__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__ActuatorConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__3"


    // $ANTLR start "rule__ActuatorConfig__Group__3__Impl"
    // InternalMicroserviceDSL.g:3692:1: rule__ActuatorConfig__Group__3__Impl : ( ( rule__ActuatorConfig__Group_3__0 )? ) ;
    public final void rule__ActuatorConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3696:1: ( ( ( rule__ActuatorConfig__Group_3__0 )? ) )
            // InternalMicroserviceDSL.g:3697:1: ( ( rule__ActuatorConfig__Group_3__0 )? )
            {
            // InternalMicroserviceDSL.g:3697:1: ( ( rule__ActuatorConfig__Group_3__0 )? )
            // InternalMicroserviceDSL.g:3698:2: ( rule__ActuatorConfig__Group_3__0 )?
            {
             before(grammarAccess.getActuatorConfigAccess().getGroup_3()); 
            // InternalMicroserviceDSL.g:3699:2: ( rule__ActuatorConfig__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==63) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMicroserviceDSL.g:3699:3: rule__ActuatorConfig__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActuatorConfig__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActuatorConfigAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__3__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group__4"
    // InternalMicroserviceDSL.g:3707:1: rule__ActuatorConfig__Group__4 : rule__ActuatorConfig__Group__4__Impl rule__ActuatorConfig__Group__5 ;
    public final void rule__ActuatorConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3711:1: ( rule__ActuatorConfig__Group__4__Impl rule__ActuatorConfig__Group__5 )
            // InternalMicroserviceDSL.g:3712:2: rule__ActuatorConfig__Group__4__Impl rule__ActuatorConfig__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__ActuatorConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__4"


    // $ANTLR start "rule__ActuatorConfig__Group__4__Impl"
    // InternalMicroserviceDSL.g:3719:1: rule__ActuatorConfig__Group__4__Impl : ( ( rule__ActuatorConfig__Group_4__0 )? ) ;
    public final void rule__ActuatorConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3723:1: ( ( ( rule__ActuatorConfig__Group_4__0 )? ) )
            // InternalMicroserviceDSL.g:3724:1: ( ( rule__ActuatorConfig__Group_4__0 )? )
            {
            // InternalMicroserviceDSL.g:3724:1: ( ( rule__ActuatorConfig__Group_4__0 )? )
            // InternalMicroserviceDSL.g:3725:2: ( rule__ActuatorConfig__Group_4__0 )?
            {
             before(grammarAccess.getActuatorConfigAccess().getGroup_4()); 
            // InternalMicroserviceDSL.g:3726:2: ( rule__ActuatorConfig__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==64) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMicroserviceDSL.g:3726:3: rule__ActuatorConfig__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActuatorConfig__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActuatorConfigAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__4__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group__5"
    // InternalMicroserviceDSL.g:3734:1: rule__ActuatorConfig__Group__5 : rule__ActuatorConfig__Group__5__Impl ;
    public final void rule__ActuatorConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3738:1: ( rule__ActuatorConfig__Group__5__Impl )
            // InternalMicroserviceDSL.g:3739:2: rule__ActuatorConfig__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__5"


    // $ANTLR start "rule__ActuatorConfig__Group__5__Impl"
    // InternalMicroserviceDSL.g:3745:1: rule__ActuatorConfig__Group__5__Impl : ( '}' ) ;
    public final void rule__ActuatorConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3749:1: ( ( '}' ) )
            // InternalMicroserviceDSL.g:3750:1: ( '}' )
            {
            // InternalMicroserviceDSL.g:3750:1: ( '}' )
            // InternalMicroserviceDSL.g:3751:2: '}'
            {
             before(grammarAccess.getActuatorConfigAccess().getRightCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getActuatorConfigAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group__5__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group_2__0"
    // InternalMicroserviceDSL.g:3761:1: rule__ActuatorConfig__Group_2__0 : rule__ActuatorConfig__Group_2__0__Impl rule__ActuatorConfig__Group_2__1 ;
    public final void rule__ActuatorConfig__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3765:1: ( rule__ActuatorConfig__Group_2__0__Impl rule__ActuatorConfig__Group_2__1 )
            // InternalMicroserviceDSL.g:3766:2: rule__ActuatorConfig__Group_2__0__Impl rule__ActuatorConfig__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ActuatorConfig__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_2__0"


    // $ANTLR start "rule__ActuatorConfig__Group_2__0__Impl"
    // InternalMicroserviceDSL.g:3773:1: rule__ActuatorConfig__Group_2__0__Impl : ( 'healthcheck-path' ) ;
    public final void rule__ActuatorConfig__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3777:1: ( ( 'healthcheck-path' ) )
            // InternalMicroserviceDSL.g:3778:1: ( 'healthcheck-path' )
            {
            // InternalMicroserviceDSL.g:3778:1: ( 'healthcheck-path' )
            // InternalMicroserviceDSL.g:3779:2: 'healthcheck-path'
            {
             before(grammarAccess.getActuatorConfigAccess().getHealthcheckPathKeyword_2_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getActuatorConfigAccess().getHealthcheckPathKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_2__0__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group_2__1"
    // InternalMicroserviceDSL.g:3788:1: rule__ActuatorConfig__Group_2__1 : rule__ActuatorConfig__Group_2__1__Impl ;
    public final void rule__ActuatorConfig__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3792:1: ( rule__ActuatorConfig__Group_2__1__Impl )
            // InternalMicroserviceDSL.g:3793:2: rule__ActuatorConfig__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_2__1"


    // $ANTLR start "rule__ActuatorConfig__Group_2__1__Impl"
    // InternalMicroserviceDSL.g:3799:1: rule__ActuatorConfig__Group_2__1__Impl : ( ( rule__ActuatorConfig__HealthcheckPathAssignment_2_1 ) ) ;
    public final void rule__ActuatorConfig__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3803:1: ( ( ( rule__ActuatorConfig__HealthcheckPathAssignment_2_1 ) ) )
            // InternalMicroserviceDSL.g:3804:1: ( ( rule__ActuatorConfig__HealthcheckPathAssignment_2_1 ) )
            {
            // InternalMicroserviceDSL.g:3804:1: ( ( rule__ActuatorConfig__HealthcheckPathAssignment_2_1 ) )
            // InternalMicroserviceDSL.g:3805:2: ( rule__ActuatorConfig__HealthcheckPathAssignment_2_1 )
            {
             before(grammarAccess.getActuatorConfigAccess().getHealthcheckPathAssignment_2_1()); 
            // InternalMicroserviceDSL.g:3806:2: ( rule__ActuatorConfig__HealthcheckPathAssignment_2_1 )
            // InternalMicroserviceDSL.g:3806:3: rule__ActuatorConfig__HealthcheckPathAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__HealthcheckPathAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorConfigAccess().getHealthcheckPathAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_2__1__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group_3__0"
    // InternalMicroserviceDSL.g:3815:1: rule__ActuatorConfig__Group_3__0 : rule__ActuatorConfig__Group_3__0__Impl rule__ActuatorConfig__Group_3__1 ;
    public final void rule__ActuatorConfig__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3819:1: ( rule__ActuatorConfig__Group_3__0__Impl rule__ActuatorConfig__Group_3__1 )
            // InternalMicroserviceDSL.g:3820:2: rule__ActuatorConfig__Group_3__0__Impl rule__ActuatorConfig__Group_3__1
            {
            pushFollow(FOLLOW_41);
            rule__ActuatorConfig__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_3__0"


    // $ANTLR start "rule__ActuatorConfig__Group_3__0__Impl"
    // InternalMicroserviceDSL.g:3827:1: rule__ActuatorConfig__Group_3__0__Impl : ( 'metrics-enabled' ) ;
    public final void rule__ActuatorConfig__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3831:1: ( ( 'metrics-enabled' ) )
            // InternalMicroserviceDSL.g:3832:1: ( 'metrics-enabled' )
            {
            // InternalMicroserviceDSL.g:3832:1: ( 'metrics-enabled' )
            // InternalMicroserviceDSL.g:3833:2: 'metrics-enabled'
            {
             before(grammarAccess.getActuatorConfigAccess().getMetricsEnabledKeyword_3_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getActuatorConfigAccess().getMetricsEnabledKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_3__0__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group_3__1"
    // InternalMicroserviceDSL.g:3842:1: rule__ActuatorConfig__Group_3__1 : rule__ActuatorConfig__Group_3__1__Impl ;
    public final void rule__ActuatorConfig__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3846:1: ( rule__ActuatorConfig__Group_3__1__Impl )
            // InternalMicroserviceDSL.g:3847:2: rule__ActuatorConfig__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_3__1"


    // $ANTLR start "rule__ActuatorConfig__Group_3__1__Impl"
    // InternalMicroserviceDSL.g:3853:1: rule__ActuatorConfig__Group_3__1__Impl : ( ( rule__ActuatorConfig__MetricsEnabledAssignment_3_1 ) ) ;
    public final void rule__ActuatorConfig__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3857:1: ( ( ( rule__ActuatorConfig__MetricsEnabledAssignment_3_1 ) ) )
            // InternalMicroserviceDSL.g:3858:1: ( ( rule__ActuatorConfig__MetricsEnabledAssignment_3_1 ) )
            {
            // InternalMicroserviceDSL.g:3858:1: ( ( rule__ActuatorConfig__MetricsEnabledAssignment_3_1 ) )
            // InternalMicroserviceDSL.g:3859:2: ( rule__ActuatorConfig__MetricsEnabledAssignment_3_1 )
            {
             before(grammarAccess.getActuatorConfigAccess().getMetricsEnabledAssignment_3_1()); 
            // InternalMicroserviceDSL.g:3860:2: ( rule__ActuatorConfig__MetricsEnabledAssignment_3_1 )
            // InternalMicroserviceDSL.g:3860:3: rule__ActuatorConfig__MetricsEnabledAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__MetricsEnabledAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorConfigAccess().getMetricsEnabledAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_3__1__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group_4__0"
    // InternalMicroserviceDSL.g:3869:1: rule__ActuatorConfig__Group_4__0 : rule__ActuatorConfig__Group_4__0__Impl rule__ActuatorConfig__Group_4__1 ;
    public final void rule__ActuatorConfig__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3873:1: ( rule__ActuatorConfig__Group_4__0__Impl rule__ActuatorConfig__Group_4__1 )
            // InternalMicroserviceDSL.g:3874:2: rule__ActuatorConfig__Group_4__0__Impl rule__ActuatorConfig__Group_4__1
            {
            pushFollow(FOLLOW_41);
            rule__ActuatorConfig__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_4__0"


    // $ANTLR start "rule__ActuatorConfig__Group_4__0__Impl"
    // InternalMicroserviceDSL.g:3881:1: rule__ActuatorConfig__Group_4__0__Impl : ( 'info-enabled' ) ;
    public final void rule__ActuatorConfig__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3885:1: ( ( 'info-enabled' ) )
            // InternalMicroserviceDSL.g:3886:1: ( 'info-enabled' )
            {
            // InternalMicroserviceDSL.g:3886:1: ( 'info-enabled' )
            // InternalMicroserviceDSL.g:3887:2: 'info-enabled'
            {
             before(grammarAccess.getActuatorConfigAccess().getInfoEnabledKeyword_4_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getActuatorConfigAccess().getInfoEnabledKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_4__0__Impl"


    // $ANTLR start "rule__ActuatorConfig__Group_4__1"
    // InternalMicroserviceDSL.g:3896:1: rule__ActuatorConfig__Group_4__1 : rule__ActuatorConfig__Group_4__1__Impl ;
    public final void rule__ActuatorConfig__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3900:1: ( rule__ActuatorConfig__Group_4__1__Impl )
            // InternalMicroserviceDSL.g:3901:2: rule__ActuatorConfig__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_4__1"


    // $ANTLR start "rule__ActuatorConfig__Group_4__1__Impl"
    // InternalMicroserviceDSL.g:3907:1: rule__ActuatorConfig__Group_4__1__Impl : ( ( rule__ActuatorConfig__InfoEnabledAssignment_4_1 ) ) ;
    public final void rule__ActuatorConfig__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3911:1: ( ( ( rule__ActuatorConfig__InfoEnabledAssignment_4_1 ) ) )
            // InternalMicroserviceDSL.g:3912:1: ( ( rule__ActuatorConfig__InfoEnabledAssignment_4_1 ) )
            {
            // InternalMicroserviceDSL.g:3912:1: ( ( rule__ActuatorConfig__InfoEnabledAssignment_4_1 ) )
            // InternalMicroserviceDSL.g:3913:2: ( rule__ActuatorConfig__InfoEnabledAssignment_4_1 )
            {
             before(grammarAccess.getActuatorConfigAccess().getInfoEnabledAssignment_4_1()); 
            // InternalMicroserviceDSL.g:3914:2: ( rule__ActuatorConfig__InfoEnabledAssignment_4_1 )
            // InternalMicroserviceDSL.g:3914:3: rule__ActuatorConfig__InfoEnabledAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__InfoEnabledAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorConfigAccess().getInfoEnabledAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__Group_4__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMicroserviceDSL.g:3923:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3927:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMicroserviceDSL.g:3928:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMicroserviceDSL.g:3935:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3939:1: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:3940:1: ( RULE_ID )
            {
            // InternalMicroserviceDSL.g:3940:1: ( RULE_ID )
            // InternalMicroserviceDSL.g:3941:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMicroserviceDSL.g:3950:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3954:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMicroserviceDSL.g:3955:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMicroserviceDSL.g:3961:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3965:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMicroserviceDSL.g:3966:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMicroserviceDSL.g:3966:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMicroserviceDSL.g:3967:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalMicroserviceDSL.g:3968:2: ( rule__QualifiedName__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==65) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMicroserviceDSL.g:3968:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMicroserviceDSL.g:3977:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3981:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMicroserviceDSL.g:3982:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMicroserviceDSL.g:3989:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:3993:1: ( ( '.' ) )
            // InternalMicroserviceDSL.g:3994:1: ( '.' )
            {
            // InternalMicroserviceDSL.g:3994:1: ( '.' )
            // InternalMicroserviceDSL.g:3995:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMicroserviceDSL.g:4004:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4008:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMicroserviceDSL.g:4009:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMicroserviceDSL.g:4015:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4019:1: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:4020:1: ( RULE_ID )
            {
            // InternalMicroserviceDSL.g:4020:1: ( RULE_ID )
            // InternalMicroserviceDSL.g:4021:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalMicroserviceDSL.g:4031:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4035:1: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:4036:2: ( RULE_ID )
            {
            // InternalMicroserviceDSL.g:4036:2: ( RULE_ID )
            // InternalMicroserviceDSL.g:4037:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__GroupNameAssignment_3"
    // InternalMicroserviceDSL.g:4046:1: rule__Model__GroupNameAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__Model__GroupNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4050:1: ( ( ruleQualifiedName ) )
            // InternalMicroserviceDSL.g:4051:2: ( ruleQualifiedName )
            {
            // InternalMicroserviceDSL.g:4051:2: ( ruleQualifiedName )
            // InternalMicroserviceDSL.g:4052:3: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getGroupNameQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGroupNameQualifiedNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GroupNameAssignment_3"


    // $ANTLR start "rule__Model__VersionAssignment_5"
    // InternalMicroserviceDSL.g:4061:1: rule__Model__VersionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Model__VersionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4065:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4066:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4066:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4067:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getVersionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getVersionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__VersionAssignment_5"


    // $ANTLR start "rule__Model__DescriptionAssignment_7"
    // InternalMicroserviceDSL.g:4076:1: rule__Model__DescriptionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Model__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4080:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4081:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4081:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4082:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DescriptionAssignment_7"


    // $ANTLR start "rule__Model__DiscoveryAssignment_9"
    // InternalMicroserviceDSL.g:4091:1: rule__Model__DiscoveryAssignment_9 : ( ruleDiscovery ) ;
    public final void rule__Model__DiscoveryAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4095:1: ( ( ruleDiscovery ) )
            // InternalMicroserviceDSL.g:4096:2: ( ruleDiscovery )
            {
            // InternalMicroserviceDSL.g:4096:2: ( ruleDiscovery )
            // InternalMicroserviceDSL.g:4097:3: ruleDiscovery
            {
             before(grammarAccess.getModelAccess().getDiscoveryDiscoveryParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDiscovery();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDiscoveryDiscoveryParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DiscoveryAssignment_9"


    // $ANTLR start "rule__Model__ConfigServerAssignment_10"
    // InternalMicroserviceDSL.g:4106:1: rule__Model__ConfigServerAssignment_10 : ( ruleConfigServer ) ;
    public final void rule__Model__ConfigServerAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4110:1: ( ( ruleConfigServer ) )
            // InternalMicroserviceDSL.g:4111:2: ( ruleConfigServer )
            {
            // InternalMicroserviceDSL.g:4111:2: ( ruleConfigServer )
            // InternalMicroserviceDSL.g:4112:3: ruleConfigServer
            {
             before(grammarAccess.getModelAccess().getConfigServerConfigServerParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigServer();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConfigServerConfigServerParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ConfigServerAssignment_10"


    // $ANTLR start "rule__Model__ServicesAssignment_11"
    // InternalMicroserviceDSL.g:4121:1: rule__Model__ServicesAssignment_11 : ( ruleService ) ;
    public final void rule__Model__ServicesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4125:1: ( ( ruleService ) )
            // InternalMicroserviceDSL.g:4126:2: ( ruleService )
            {
            // InternalMicroserviceDSL.g:4126:2: ( ruleService )
            // InternalMicroserviceDSL.g:4127:3: ruleService
            {
             before(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getModelAccess().getServicesServiceParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ServicesAssignment_11"


    // $ANTLR start "rule__Model__GatewayAssignment_12"
    // InternalMicroserviceDSL.g:4136:1: rule__Model__GatewayAssignment_12 : ( ruleGateway ) ;
    public final void rule__Model__GatewayAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4140:1: ( ( ruleGateway ) )
            // InternalMicroserviceDSL.g:4141:2: ( ruleGateway )
            {
            // InternalMicroserviceDSL.g:4141:2: ( ruleGateway )
            // InternalMicroserviceDSL.g:4142:3: ruleGateway
            {
             before(grammarAccess.getModelAccess().getGatewayGatewayParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleGateway();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGatewayGatewayParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GatewayAssignment_12"


    // $ANTLR start "rule__Discovery__NameAssignment_1"
    // InternalMicroserviceDSL.g:4151:1: rule__Discovery__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Discovery__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4155:1: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:4156:2: ( RULE_ID )
            {
            // InternalMicroserviceDSL.g:4156:2: ( RULE_ID )
            // InternalMicroserviceDSL.g:4157:3: RULE_ID
            {
             before(grammarAccess.getDiscoveryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__NameAssignment_1"


    // $ANTLR start "rule__Discovery__PortAssignment_4"
    // InternalMicroserviceDSL.g:4166:1: rule__Discovery__PortAssignment_4 : ( RULE_INT ) ;
    public final void rule__Discovery__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4170:1: ( ( RULE_INT ) )
            // InternalMicroserviceDSL.g:4171:2: ( RULE_INT )
            {
            // InternalMicroserviceDSL.g:4171:2: ( RULE_INT )
            // InternalMicroserviceDSL.g:4172:3: RULE_INT
            {
             before(grammarAccess.getDiscoveryAccess().getPortINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getPortINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__PortAssignment_4"


    // $ANTLR start "rule__Discovery__DefaultZoneAssignment_5_1"
    // InternalMicroserviceDSL.g:4181:1: rule__Discovery__DefaultZoneAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Discovery__DefaultZoneAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4185:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4186:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4186:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4187:3: RULE_STRING
            {
             before(grammarAccess.getDiscoveryAccess().getDefaultZoneSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDiscoveryAccess().getDefaultZoneSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__DefaultZoneAssignment_5_1"


    // $ANTLR start "rule__Discovery__CustomDepsAssignment_8"
    // InternalMicroserviceDSL.g:4196:1: rule__Discovery__CustomDepsAssignment_8 : ( ruleDependency ) ;
    public final void rule__Discovery__CustomDepsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4200:1: ( ( ruleDependency ) )
            // InternalMicroserviceDSL.g:4201:2: ( ruleDependency )
            {
            // InternalMicroserviceDSL.g:4201:2: ( ruleDependency )
            // InternalMicroserviceDSL.g:4202:3: ruleDependency
            {
             before(grammarAccess.getDiscoveryAccess().getCustomDepsDependencyEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDiscoveryAccess().getCustomDepsDependencyEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discovery__CustomDepsAssignment_8"


    // $ANTLR start "rule__Gateway__NameAssignment_1"
    // InternalMicroserviceDSL.g:4211:1: rule__Gateway__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Gateway__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4215:1: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:4216:2: ( RULE_ID )
            {
            // InternalMicroserviceDSL.g:4216:2: ( RULE_ID )
            // InternalMicroserviceDSL.g:4217:3: RULE_ID
            {
             before(grammarAccess.getGatewayAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__NameAssignment_1"


    // $ANTLR start "rule__Gateway__PortAssignment_4"
    // InternalMicroserviceDSL.g:4226:1: rule__Gateway__PortAssignment_4 : ( RULE_INT ) ;
    public final void rule__Gateway__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4230:1: ( ( RULE_INT ) )
            // InternalMicroserviceDSL.g:4231:2: ( RULE_INT )
            {
            // InternalMicroserviceDSL.g:4231:2: ( RULE_INT )
            // InternalMicroserviceDSL.g:4232:3: RULE_INT
            {
             before(grammarAccess.getGatewayAccess().getPortINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getPortINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__PortAssignment_4"


    // $ANTLR start "rule__Gateway__RoutesAssignment_5_2"
    // InternalMicroserviceDSL.g:4241:1: rule__Gateway__RoutesAssignment_5_2 : ( ruleRouteConfig ) ;
    public final void rule__Gateway__RoutesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4245:1: ( ( ruleRouteConfig ) )
            // InternalMicroserviceDSL.g:4246:2: ( ruleRouteConfig )
            {
            // InternalMicroserviceDSL.g:4246:2: ( ruleRouteConfig )
            // InternalMicroserviceDSL.g:4247:3: ruleRouteConfig
            {
             before(grammarAccess.getGatewayAccess().getRoutesRouteConfigParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRouteConfig();

            state._fsp--;

             after(grammarAccess.getGatewayAccess().getRoutesRouteConfigParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__RoutesAssignment_5_2"


    // $ANTLR start "rule__Gateway__CustomDepsAssignment_8"
    // InternalMicroserviceDSL.g:4256:1: rule__Gateway__CustomDepsAssignment_8 : ( ruleDependency ) ;
    public final void rule__Gateway__CustomDepsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4260:1: ( ( ruleDependency ) )
            // InternalMicroserviceDSL.g:4261:2: ( ruleDependency )
            {
            // InternalMicroserviceDSL.g:4261:2: ( ruleDependency )
            // InternalMicroserviceDSL.g:4262:3: ruleDependency
            {
             before(grammarAccess.getGatewayAccess().getCustomDepsDependencyEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getGatewayAccess().getCustomDepsDependencyEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__CustomDepsAssignment_8"


    // $ANTLR start "rule__RouteConfig__PathAssignment_3"
    // InternalMicroserviceDSL.g:4271:1: rule__RouteConfig__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__RouteConfig__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4275:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4276:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4276:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4277:3: RULE_STRING
            {
             before(grammarAccess.getRouteConfigAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRouteConfigAccess().getPathSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__PathAssignment_3"


    // $ANTLR start "rule__RouteConfig__ServiceAssignment_5"
    // InternalMicroserviceDSL.g:4286:1: rule__RouteConfig__ServiceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__RouteConfig__ServiceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4290:1: ( ( ( RULE_ID ) ) )
            // InternalMicroserviceDSL.g:4291:2: ( ( RULE_ID ) )
            {
            // InternalMicroserviceDSL.g:4291:2: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:4292:3: ( RULE_ID )
            {
             before(grammarAccess.getRouteConfigAccess().getServiceServiceCrossReference_5_0()); 
            // InternalMicroserviceDSL.g:4293:3: ( RULE_ID )
            // InternalMicroserviceDSL.g:4294:4: RULE_ID
            {
             before(grammarAccess.getRouteConfigAccess().getServiceServiceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRouteConfigAccess().getServiceServiceIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRouteConfigAccess().getServiceServiceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteConfig__ServiceAssignment_5"


    // $ANTLR start "rule__ConfigServer__NameAssignment_1"
    // InternalMicroserviceDSL.g:4305:1: rule__ConfigServer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConfigServer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4309:1: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:4310:2: ( RULE_ID )
            {
            // InternalMicroserviceDSL.g:4310:2: ( RULE_ID )
            // InternalMicroserviceDSL.g:4311:3: RULE_ID
            {
             before(grammarAccess.getConfigServerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__NameAssignment_1"


    // $ANTLR start "rule__ConfigServer__PortAssignment_4"
    // InternalMicroserviceDSL.g:4320:1: rule__ConfigServer__PortAssignment_4 : ( RULE_INT ) ;
    public final void rule__ConfigServer__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4324:1: ( ( RULE_INT ) )
            // InternalMicroserviceDSL.g:4325:2: ( RULE_INT )
            {
            // InternalMicroserviceDSL.g:4325:2: ( RULE_INT )
            // InternalMicroserviceDSL.g:4326:3: RULE_INT
            {
             before(grammarAccess.getConfigServerAccess().getPortINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getPortINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__PortAssignment_4"


    // $ANTLR start "rule__ConfigServer__GitUriAssignment_6"
    // InternalMicroserviceDSL.g:4335:1: rule__ConfigServer__GitUriAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ConfigServer__GitUriAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4339:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4340:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4340:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4341:3: RULE_STRING
            {
             before(grammarAccess.getConfigServerAccess().getGitUriSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getGitUriSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__GitUriAssignment_6"


    // $ANTLR start "rule__ConfigServer__GitBranchAssignment_7_1"
    // InternalMicroserviceDSL.g:4350:1: rule__ConfigServer__GitBranchAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__ConfigServer__GitBranchAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4354:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4355:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4355:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4356:3: RULE_STRING
            {
             before(grammarAccess.getConfigServerAccess().getGitBranchSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConfigServerAccess().getGitBranchSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__GitBranchAssignment_7_1"


    // $ANTLR start "rule__ConfigServer__CustomDepsAssignment_10"
    // InternalMicroserviceDSL.g:4365:1: rule__ConfigServer__CustomDepsAssignment_10 : ( ruleDependency ) ;
    public final void rule__ConfigServer__CustomDepsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4369:1: ( ( ruleDependency ) )
            // InternalMicroserviceDSL.g:4370:2: ( ruleDependency )
            {
            // InternalMicroserviceDSL.g:4370:2: ( ruleDependency )
            // InternalMicroserviceDSL.g:4371:3: ruleDependency
            {
             before(grammarAccess.getConfigServerAccess().getCustomDepsDependencyEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getConfigServerAccess().getCustomDepsDependencyEnumRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigServer__CustomDepsAssignment_10"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // InternalMicroserviceDSL.g:4380:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4384:1: ( ( RULE_ID ) )
            // InternalMicroserviceDSL.g:4385:2: ( RULE_ID )
            {
            // InternalMicroserviceDSL.g:4385:2: ( RULE_ID )
            // InternalMicroserviceDSL.g:4386:3: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__DependenciesAssignment_5"
    // InternalMicroserviceDSL.g:4395:1: rule__Service__DependenciesAssignment_5 : ( ruleDependency ) ;
    public final void rule__Service__DependenciesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4399:1: ( ( ruleDependency ) )
            // InternalMicroserviceDSL.g:4400:2: ( ruleDependency )
            {
            // InternalMicroserviceDSL.g:4400:2: ( ruleDependency )
            // InternalMicroserviceDSL.g:4401:3: ruleDependency
            {
             before(grammarAccess.getServiceAccess().getDependenciesDependencyEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getDependenciesDependencyEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__DependenciesAssignment_5"


    // $ANTLR start "rule__Service__ConfigurationAssignment_9"
    // InternalMicroserviceDSL.g:4410:1: rule__Service__ConfigurationAssignment_9 : ( ruleServiceConfigEntry ) ;
    public final void rule__Service__ConfigurationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4414:1: ( ( ruleServiceConfigEntry ) )
            // InternalMicroserviceDSL.g:4415:2: ( ruleServiceConfigEntry )
            {
            // InternalMicroserviceDSL.g:4415:2: ( ruleServiceConfigEntry )
            // InternalMicroserviceDSL.g:4416:3: ruleServiceConfigEntry
            {
             before(grammarAccess.getServiceAccess().getConfigurationServiceConfigEntryParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceConfigEntry();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getConfigurationServiceConfigEntryParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ConfigurationAssignment_9"


    // $ANTLR start "rule__ServerConfig__PortAssignment_3"
    // InternalMicroserviceDSL.g:4425:1: rule__ServerConfig__PortAssignment_3 : ( RULE_INT ) ;
    public final void rule__ServerConfig__PortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4429:1: ( ( RULE_INT ) )
            // InternalMicroserviceDSL.g:4430:2: ( RULE_INT )
            {
            // InternalMicroserviceDSL.g:4430:2: ( RULE_INT )
            // InternalMicroserviceDSL.g:4431:3: RULE_INT
            {
             before(grammarAccess.getServerConfigAccess().getPortINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getServerConfigAccess().getPortINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__PortAssignment_3"


    // $ANTLR start "rule__ServerConfig__ContextPathAssignment_4_1"
    // InternalMicroserviceDSL.g:4440:1: rule__ServerConfig__ContextPathAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ServerConfig__ContextPathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4444:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4445:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4445:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4446:3: RULE_STRING
            {
             before(grammarAccess.getServerConfigAccess().getContextPathSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getServerConfigAccess().getContextPathSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerConfig__ContextPathAssignment_4_1"


    // $ANTLR start "rule__ApplicationConfig__AppNameAssignment_2_1"
    // InternalMicroserviceDSL.g:4455:1: rule__ApplicationConfig__AppNameAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ApplicationConfig__AppNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4459:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4460:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4460:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4461:3: RULE_STRING
            {
             before(grammarAccess.getApplicationConfigAccess().getAppNameSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getAppNameSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__AppNameAssignment_2_1"


    // $ANTLR start "rule__ApplicationConfig__ProfileAssignment_3_1"
    // InternalMicroserviceDSL.g:4470:1: rule__ApplicationConfig__ProfileAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ApplicationConfig__ProfileAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4474:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4475:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4475:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4476:3: RULE_STRING
            {
             before(grammarAccess.getApplicationConfigAccess().getProfileSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getApplicationConfigAccess().getProfileSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__ProfileAssignment_3_1"


    // $ANTLR start "rule__ApplicationConfig__LoggingLevelAssignment_4_1"
    // InternalMicroserviceDSL.g:4485:1: rule__ApplicationConfig__LoggingLevelAssignment_4_1 : ( ruleLogLevel ) ;
    public final void rule__ApplicationConfig__LoggingLevelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4489:1: ( ( ruleLogLevel ) )
            // InternalMicroserviceDSL.g:4490:2: ( ruleLogLevel )
            {
            // InternalMicroserviceDSL.g:4490:2: ( ruleLogLevel )
            // InternalMicroserviceDSL.g:4491:3: ruleLogLevel
            {
             before(grammarAccess.getApplicationConfigAccess().getLoggingLevelLogLevelEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLogLevel();

            state._fsp--;

             after(grammarAccess.getApplicationConfigAccess().getLoggingLevelLogLevelEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationConfig__LoggingLevelAssignment_4_1"


    // $ANTLR start "rule__DatabaseConfig__DbUrlAssignment_3"
    // InternalMicroserviceDSL.g:4500:1: rule__DatabaseConfig__DbUrlAssignment_3 : ( RULE_STRING ) ;
    public final void rule__DatabaseConfig__DbUrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4504:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4505:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4505:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4506:3: RULE_STRING
            {
             before(grammarAccess.getDatabaseConfigAccess().getDbUrlSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getDbUrlSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__DbUrlAssignment_3"


    // $ANTLR start "rule__DatabaseConfig__DbUsernameAssignment_5"
    // InternalMicroserviceDSL.g:4515:1: rule__DatabaseConfig__DbUsernameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__DatabaseConfig__DbUsernameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4519:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4520:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4520:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4521:3: RULE_STRING
            {
             before(grammarAccess.getDatabaseConfigAccess().getDbUsernameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getDbUsernameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__DbUsernameAssignment_5"


    // $ANTLR start "rule__DatabaseConfig__DbPasswordAssignment_7"
    // InternalMicroserviceDSL.g:4530:1: rule__DatabaseConfig__DbPasswordAssignment_7 : ( RULE_STRING ) ;
    public final void rule__DatabaseConfig__DbPasswordAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4534:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4535:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4535:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4536:3: RULE_STRING
            {
             before(grammarAccess.getDatabaseConfigAccess().getDbPasswordSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatabaseConfigAccess().getDbPasswordSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__DbPasswordAssignment_7"


    // $ANTLR start "rule__DatabaseConfig__DriverAssignment_9"
    // InternalMicroserviceDSL.g:4545:1: rule__DatabaseConfig__DriverAssignment_9 : ( ruleDatabaseDriver ) ;
    public final void rule__DatabaseConfig__DriverAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4549:1: ( ( ruleDatabaseDriver ) )
            // InternalMicroserviceDSL.g:4550:2: ( ruleDatabaseDriver )
            {
            // InternalMicroserviceDSL.g:4550:2: ( ruleDatabaseDriver )
            // InternalMicroserviceDSL.g:4551:3: ruleDatabaseDriver
            {
             before(grammarAccess.getDatabaseConfigAccess().getDriverDatabaseDriverEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDatabaseDriver();

            state._fsp--;

             after(grammarAccess.getDatabaseConfigAccess().getDriverDatabaseDriverEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__DriverAssignment_9"


    // $ANTLR start "rule__DatabaseConfig__DdlAssignment_10_1"
    // InternalMicroserviceDSL.g:4560:1: rule__DatabaseConfig__DdlAssignment_10_1 : ( ruleDdlType ) ;
    public final void rule__DatabaseConfig__DdlAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4564:1: ( ( ruleDdlType ) )
            // InternalMicroserviceDSL.g:4565:2: ( ruleDdlType )
            {
            // InternalMicroserviceDSL.g:4565:2: ( ruleDdlType )
            // InternalMicroserviceDSL.g:4566:3: ruleDdlType
            {
             before(grammarAccess.getDatabaseConfigAccess().getDdlDdlTypeEnumRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDdlType();

            state._fsp--;

             after(grammarAccess.getDatabaseConfigAccess().getDdlDdlTypeEnumRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatabaseConfig__DdlAssignment_10_1"


    // $ANTLR start "rule__ActuatorConfig__HealthcheckPathAssignment_2_1"
    // InternalMicroserviceDSL.g:4575:1: rule__ActuatorConfig__HealthcheckPathAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ActuatorConfig__HealthcheckPathAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4579:1: ( ( RULE_STRING ) )
            // InternalMicroserviceDSL.g:4580:2: ( RULE_STRING )
            {
            // InternalMicroserviceDSL.g:4580:2: ( RULE_STRING )
            // InternalMicroserviceDSL.g:4581:3: RULE_STRING
            {
             before(grammarAccess.getActuatorConfigAccess().getHealthcheckPathSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActuatorConfigAccess().getHealthcheckPathSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__HealthcheckPathAssignment_2_1"


    // $ANTLR start "rule__ActuatorConfig__MetricsEnabledAssignment_3_1"
    // InternalMicroserviceDSL.g:4590:1: rule__ActuatorConfig__MetricsEnabledAssignment_3_1 : ( ( rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0 ) ) ;
    public final void rule__ActuatorConfig__MetricsEnabledAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4594:1: ( ( ( rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0 ) ) )
            // InternalMicroserviceDSL.g:4595:2: ( ( rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0 ) )
            {
            // InternalMicroserviceDSL.g:4595:2: ( ( rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0 ) )
            // InternalMicroserviceDSL.g:4596:3: ( rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0 )
            {
             before(grammarAccess.getActuatorConfigAccess().getMetricsEnabledAlternatives_3_1_0()); 
            // InternalMicroserviceDSL.g:4597:3: ( rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0 )
            // InternalMicroserviceDSL.g:4597:4: rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__MetricsEnabledAlternatives_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorConfigAccess().getMetricsEnabledAlternatives_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__MetricsEnabledAssignment_3_1"


    // $ANTLR start "rule__ActuatorConfig__InfoEnabledAssignment_4_1"
    // InternalMicroserviceDSL.g:4605:1: rule__ActuatorConfig__InfoEnabledAssignment_4_1 : ( ( rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0 ) ) ;
    public final void rule__ActuatorConfig__InfoEnabledAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMicroserviceDSL.g:4609:1: ( ( ( rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0 ) ) )
            // InternalMicroserviceDSL.g:4610:2: ( ( rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0 ) )
            {
            // InternalMicroserviceDSL.g:4610:2: ( ( rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0 ) )
            // InternalMicroserviceDSL.g:4611:3: ( rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0 )
            {
             before(grammarAccess.getActuatorConfigAccess().getInfoEnabledAlternatives_4_1_0()); 
            // InternalMicroserviceDSL.g:4612:3: ( rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0 )
            // InternalMicroserviceDSL.g:4612:4: rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorConfig__InfoEnabledAlternatives_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorConfigAccess().getInfoEnabledAlternatives_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorConfig__InfoEnabledAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000008000FE000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000FE002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000804000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x208A000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x208A000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0070000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1000000800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xC000000800000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});

}