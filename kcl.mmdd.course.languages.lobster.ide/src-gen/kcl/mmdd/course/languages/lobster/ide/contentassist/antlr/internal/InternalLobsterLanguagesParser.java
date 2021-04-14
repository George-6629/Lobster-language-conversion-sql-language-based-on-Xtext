package kcl.mmdd.course.languages.lobster.ide.contentassist.antlr.internal;

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
import kcl.mmdd.course.languages.lobster.services.LobsterLanguagesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLobsterLanguagesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Integer'", "'Character'", "'and'", "'or'", "'finish'", "'maximum'", "'minimum'", "'average'", "'count'", "'sum'", "'ascending'", "'descending'", "'var'", "'='", "'Create'", "'a'", "'database'", "'named'", "'table'", "'in'", "'include'", "'{'", "'}'", "'Column Name:'", "'is'", "'type'", "','", "'('", "'max'", "'characters'", "')'", "'Insert'", "'value'", "'into'", "'Delete'", "'from'", "'Table'", "'Delete All From'", "'Update'", "'set'", "'where'", "'Find out'", "'of'", "'order by'", "'sorted in'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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


        public InternalLobsterLanguagesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLobsterLanguagesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLobsterLanguagesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLobsterLanguages.g"; }


    	private LobsterLanguagesGrammarAccess grammarAccess;

    	public void setGrammarAccess(LobsterLanguagesGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleLobsterProgram"
    // InternalLobsterLanguages.g:53:1: entryRuleLobsterProgram : ruleLobsterProgram EOF ;
    public final void entryRuleLobsterProgram() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:54:1: ( ruleLobsterProgram EOF )
            // InternalLobsterLanguages.g:55:1: ruleLobsterProgram EOF
            {
             before(grammarAccess.getLobsterProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleLobsterProgram();

            state._fsp--;

             after(grammarAccess.getLobsterProgramRule()); 
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
    // $ANTLR end "entryRuleLobsterProgram"


    // $ANTLR start "ruleLobsterProgram"
    // InternalLobsterLanguages.g:62:1: ruleLobsterProgram : ( ( rule__LobsterProgram__StatementsAssignment )* ) ;
    public final void ruleLobsterProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:66:2: ( ( ( rule__LobsterProgram__StatementsAssignment )* ) )
            // InternalLobsterLanguages.g:67:2: ( ( rule__LobsterProgram__StatementsAssignment )* )
            {
            // InternalLobsterLanguages.g:67:2: ( ( rule__LobsterProgram__StatementsAssignment )* )
            // InternalLobsterLanguages.g:68:3: ( rule__LobsterProgram__StatementsAssignment )*
            {
             before(grammarAccess.getLobsterProgramAccess().getStatementsAssignment()); 
            // InternalLobsterLanguages.g:69:3: ( rule__LobsterProgram__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23||LA1_0==25||LA1_0==42||LA1_0==45||(LA1_0>=48 && LA1_0<=49)||LA1_0==52) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLobsterLanguages.g:69:4: rule__LobsterProgram__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__LobsterProgram__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLobsterProgramAccess().getStatementsAssignment()); 

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
    // $ANTLR end "ruleLobsterProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalLobsterLanguages.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:79:1: ( ruleStatement EOF )
            // InternalLobsterLanguages.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalLobsterLanguages.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalLobsterLanguages.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalLobsterLanguages.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalLobsterLanguages.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalLobsterLanguages.g:94:3: ( rule__Statement__Alternatives )
            // InternalLobsterLanguages.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariableCharacter"
    // InternalLobsterLanguages.g:103:1: entryRuleVariableCharacter : ruleVariableCharacter EOF ;
    public final void entryRuleVariableCharacter() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:104:1: ( ruleVariableCharacter EOF )
            // InternalLobsterLanguages.g:105:1: ruleVariableCharacter EOF
            {
             before(grammarAccess.getVariableCharacterRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableCharacter();

            state._fsp--;

             after(grammarAccess.getVariableCharacterRule()); 
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
    // $ANTLR end "entryRuleVariableCharacter"


    // $ANTLR start "ruleVariableCharacter"
    // InternalLobsterLanguages.g:112:1: ruleVariableCharacter : ( ( rule__VariableCharacter__Group__0 ) ) ;
    public final void ruleVariableCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:116:2: ( ( ( rule__VariableCharacter__Group__0 ) ) )
            // InternalLobsterLanguages.g:117:2: ( ( rule__VariableCharacter__Group__0 ) )
            {
            // InternalLobsterLanguages.g:117:2: ( ( rule__VariableCharacter__Group__0 ) )
            // InternalLobsterLanguages.g:118:3: ( rule__VariableCharacter__Group__0 )
            {
             before(grammarAccess.getVariableCharacterAccess().getGroup()); 
            // InternalLobsterLanguages.g:119:3: ( rule__VariableCharacter__Group__0 )
            // InternalLobsterLanguages.g:119:4: rule__VariableCharacter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableCharacter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableCharacterAccess().getGroup()); 

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
    // $ANTLR end "ruleVariableCharacter"


    // $ANTLR start "entryRuleCreateDatabaseStatement"
    // InternalLobsterLanguages.g:128:1: entryRuleCreateDatabaseStatement : ruleCreateDatabaseStatement EOF ;
    public final void entryRuleCreateDatabaseStatement() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:129:1: ( ruleCreateDatabaseStatement EOF )
            // InternalLobsterLanguages.g:130:1: ruleCreateDatabaseStatement EOF
            {
             before(grammarAccess.getCreateDatabaseStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateDatabaseStatement();

            state._fsp--;

             after(grammarAccess.getCreateDatabaseStatementRule()); 
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
    // $ANTLR end "entryRuleCreateDatabaseStatement"


    // $ANTLR start "ruleCreateDatabaseStatement"
    // InternalLobsterLanguages.g:137:1: ruleCreateDatabaseStatement : ( ( rule__CreateDatabaseStatement__Group__0 ) ) ;
    public final void ruleCreateDatabaseStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:141:2: ( ( ( rule__CreateDatabaseStatement__Group__0 ) ) )
            // InternalLobsterLanguages.g:142:2: ( ( rule__CreateDatabaseStatement__Group__0 ) )
            {
            // InternalLobsterLanguages.g:142:2: ( ( rule__CreateDatabaseStatement__Group__0 ) )
            // InternalLobsterLanguages.g:143:3: ( rule__CreateDatabaseStatement__Group__0 )
            {
             before(grammarAccess.getCreateDatabaseStatementAccess().getGroup()); 
            // InternalLobsterLanguages.g:144:3: ( rule__CreateDatabaseStatement__Group__0 )
            // InternalLobsterLanguages.g:144:4: rule__CreateDatabaseStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateDatabaseStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateDatabaseStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleCreateDatabaseStatement"


    // $ANTLR start "entryRuleCreateTableStatement"
    // InternalLobsterLanguages.g:153:1: entryRuleCreateTableStatement : ruleCreateTableStatement EOF ;
    public final void entryRuleCreateTableStatement() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:154:1: ( ruleCreateTableStatement EOF )
            // InternalLobsterLanguages.g:155:1: ruleCreateTableStatement EOF
            {
             before(grammarAccess.getCreateTableStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateTableStatement();

            state._fsp--;

             after(grammarAccess.getCreateTableStatementRule()); 
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
    // $ANTLR end "entryRuleCreateTableStatement"


    // $ANTLR start "ruleCreateTableStatement"
    // InternalLobsterLanguages.g:162:1: ruleCreateTableStatement : ( ( rule__CreateTableStatement__Group__0 ) ) ;
    public final void ruleCreateTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:166:2: ( ( ( rule__CreateTableStatement__Group__0 ) ) )
            // InternalLobsterLanguages.g:167:2: ( ( rule__CreateTableStatement__Group__0 ) )
            {
            // InternalLobsterLanguages.g:167:2: ( ( rule__CreateTableStatement__Group__0 ) )
            // InternalLobsterLanguages.g:168:3: ( rule__CreateTableStatement__Group__0 )
            {
             before(grammarAccess.getCreateTableStatementAccess().getGroup()); 
            // InternalLobsterLanguages.g:169:3: ( rule__CreateTableStatement__Group__0 )
            // InternalLobsterLanguages.g:169:4: rule__CreateTableStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleCreateTableStatement"


    // $ANTLR start "entryRuleCreateTableColumn"
    // InternalLobsterLanguages.g:178:1: entryRuleCreateTableColumn : ruleCreateTableColumn EOF ;
    public final void entryRuleCreateTableColumn() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:179:1: ( ruleCreateTableColumn EOF )
            // InternalLobsterLanguages.g:180:1: ruleCreateTableColumn EOF
            {
             before(grammarAccess.getCreateTableColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateTableColumn();

            state._fsp--;

             after(grammarAccess.getCreateTableColumnRule()); 
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
    // $ANTLR end "entryRuleCreateTableColumn"


    // $ANTLR start "ruleCreateTableColumn"
    // InternalLobsterLanguages.g:187:1: ruleCreateTableColumn : ( ( rule__CreateTableColumn__Group__0 ) ) ;
    public final void ruleCreateTableColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:191:2: ( ( ( rule__CreateTableColumn__Group__0 ) ) )
            // InternalLobsterLanguages.g:192:2: ( ( rule__CreateTableColumn__Group__0 ) )
            {
            // InternalLobsterLanguages.g:192:2: ( ( rule__CreateTableColumn__Group__0 ) )
            // InternalLobsterLanguages.g:193:3: ( rule__CreateTableColumn__Group__0 )
            {
             before(grammarAccess.getCreateTableColumnAccess().getGroup()); 
            // InternalLobsterLanguages.g:194:3: ( rule__CreateTableColumn__Group__0 )
            // InternalLobsterLanguages.g:194:4: rule__CreateTableColumn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableColumnAccess().getGroup()); 

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
    // $ANTLR end "ruleCreateTableColumn"


    // $ANTLR start "entryRuleInsertStatement"
    // InternalLobsterLanguages.g:203:1: entryRuleInsertStatement : ruleInsertStatement EOF ;
    public final void entryRuleInsertStatement() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:204:1: ( ruleInsertStatement EOF )
            // InternalLobsterLanguages.g:205:1: ruleInsertStatement EOF
            {
             before(grammarAccess.getInsertStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleInsertStatement();

            state._fsp--;

             after(grammarAccess.getInsertStatementRule()); 
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
    // $ANTLR end "entryRuleInsertStatement"


    // $ANTLR start "ruleInsertStatement"
    // InternalLobsterLanguages.g:212:1: ruleInsertStatement : ( ( rule__InsertStatement__Group__0 ) ) ;
    public final void ruleInsertStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:216:2: ( ( ( rule__InsertStatement__Group__0 ) ) )
            // InternalLobsterLanguages.g:217:2: ( ( rule__InsertStatement__Group__0 ) )
            {
            // InternalLobsterLanguages.g:217:2: ( ( rule__InsertStatement__Group__0 ) )
            // InternalLobsterLanguages.g:218:3: ( rule__InsertStatement__Group__0 )
            {
             before(grammarAccess.getInsertStatementAccess().getGroup()); 
            // InternalLobsterLanguages.g:219:3: ( rule__InsertStatement__Group__0 )
            // InternalLobsterLanguages.g:219:4: rule__InsertStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleInsertStatement"


    // $ANTLR start "entryRuleDeleteDataStatement"
    // InternalLobsterLanguages.g:228:1: entryRuleDeleteDataStatement : ruleDeleteDataStatement EOF ;
    public final void entryRuleDeleteDataStatement() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:229:1: ( ruleDeleteDataStatement EOF )
            // InternalLobsterLanguages.g:230:1: ruleDeleteDataStatement EOF
            {
             before(grammarAccess.getDeleteDataStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleDeleteDataStatement();

            state._fsp--;

             after(grammarAccess.getDeleteDataStatementRule()); 
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
    // $ANTLR end "entryRuleDeleteDataStatement"


    // $ANTLR start "ruleDeleteDataStatement"
    // InternalLobsterLanguages.g:237:1: ruleDeleteDataStatement : ( ( rule__DeleteDataStatement__Group__0 ) ) ;
    public final void ruleDeleteDataStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:241:2: ( ( ( rule__DeleteDataStatement__Group__0 ) ) )
            // InternalLobsterLanguages.g:242:2: ( ( rule__DeleteDataStatement__Group__0 ) )
            {
            // InternalLobsterLanguages.g:242:2: ( ( rule__DeleteDataStatement__Group__0 ) )
            // InternalLobsterLanguages.g:243:3: ( rule__DeleteDataStatement__Group__0 )
            {
             before(grammarAccess.getDeleteDataStatementAccess().getGroup()); 
            // InternalLobsterLanguages.g:244:3: ( rule__DeleteDataStatement__Group__0 )
            // InternalLobsterLanguages.g:244:4: rule__DeleteDataStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeleteDataStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteDataStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleDeleteDataStatement"


    // $ANTLR start "entryRuleMoreConditionStatement"
    // InternalLobsterLanguages.g:253:1: entryRuleMoreConditionStatement : ruleMoreConditionStatement EOF ;
    public final void entryRuleMoreConditionStatement() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:254:1: ( ruleMoreConditionStatement EOF )
            // InternalLobsterLanguages.g:255:1: ruleMoreConditionStatement EOF
            {
             before(grammarAccess.getMoreConditionStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleMoreConditionStatement();

            state._fsp--;

             after(grammarAccess.getMoreConditionStatementRule()); 
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
    // $ANTLR end "entryRuleMoreConditionStatement"


    // $ANTLR start "ruleMoreConditionStatement"
    // InternalLobsterLanguages.g:262:1: ruleMoreConditionStatement : ( ( rule__MoreConditionStatement__Group__0 ) ) ;
    public final void ruleMoreConditionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:266:2: ( ( ( rule__MoreConditionStatement__Group__0 ) ) )
            // InternalLobsterLanguages.g:267:2: ( ( rule__MoreConditionStatement__Group__0 ) )
            {
            // InternalLobsterLanguages.g:267:2: ( ( rule__MoreConditionStatement__Group__0 ) )
            // InternalLobsterLanguages.g:268:3: ( rule__MoreConditionStatement__Group__0 )
            {
             before(grammarAccess.getMoreConditionStatementAccess().getGroup()); 
            // InternalLobsterLanguages.g:269:3: ( rule__MoreConditionStatement__Group__0 )
            // InternalLobsterLanguages.g:269:4: rule__MoreConditionStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoreConditionStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoreConditionStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleMoreConditionStatement"


    // $ANTLR start "entryRuleDeleteTableStatement"
    // InternalLobsterLanguages.g:278:1: entryRuleDeleteTableStatement : ruleDeleteTableStatement EOF ;
    public final void entryRuleDeleteTableStatement() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:279:1: ( ruleDeleteTableStatement EOF )
            // InternalLobsterLanguages.g:280:1: ruleDeleteTableStatement EOF
            {
             before(grammarAccess.getDeleteTableStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleDeleteTableStatement();

            state._fsp--;

             after(grammarAccess.getDeleteTableStatementRule()); 
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
    // $ANTLR end "entryRuleDeleteTableStatement"


    // $ANTLR start "ruleDeleteTableStatement"
    // InternalLobsterLanguages.g:287:1: ruleDeleteTableStatement : ( ( rule__DeleteTableStatement__Group__0 ) ) ;
    public final void ruleDeleteTableStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:291:2: ( ( ( rule__DeleteTableStatement__Group__0 ) ) )
            // InternalLobsterLanguages.g:292:2: ( ( rule__DeleteTableStatement__Group__0 ) )
            {
            // InternalLobsterLanguages.g:292:2: ( ( rule__DeleteTableStatement__Group__0 ) )
            // InternalLobsterLanguages.g:293:3: ( rule__DeleteTableStatement__Group__0 )
            {
             before(grammarAccess.getDeleteTableStatementAccess().getGroup()); 
            // InternalLobsterLanguages.g:294:3: ( rule__DeleteTableStatement__Group__0 )
            // InternalLobsterLanguages.g:294:4: rule__DeleteTableStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeleteTableStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteTableStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleDeleteTableStatement"


    // $ANTLR start "entryRuleUpdateStatement"
    // InternalLobsterLanguages.g:303:1: entryRuleUpdateStatement : ruleUpdateStatement EOF ;
    public final void entryRuleUpdateStatement() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:304:1: ( ruleUpdateStatement EOF )
            // InternalLobsterLanguages.g:305:1: ruleUpdateStatement EOF
            {
             before(grammarAccess.getUpdateStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdateStatement();

            state._fsp--;

             after(grammarAccess.getUpdateStatementRule()); 
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
    // $ANTLR end "entryRuleUpdateStatement"


    // $ANTLR start "ruleUpdateStatement"
    // InternalLobsterLanguages.g:312:1: ruleUpdateStatement : ( ( rule__UpdateStatement__Group__0 ) ) ;
    public final void ruleUpdateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:316:2: ( ( ( rule__UpdateStatement__Group__0 ) ) )
            // InternalLobsterLanguages.g:317:2: ( ( rule__UpdateStatement__Group__0 ) )
            {
            // InternalLobsterLanguages.g:317:2: ( ( rule__UpdateStatement__Group__0 ) )
            // InternalLobsterLanguages.g:318:3: ( rule__UpdateStatement__Group__0 )
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup()); 
            // InternalLobsterLanguages.g:319:3: ( rule__UpdateStatement__Group__0 )
            // InternalLobsterLanguages.g:319:4: rule__UpdateStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleUpdateStatement"


    // $ANTLR start "entryRuleSelectStatement"
    // InternalLobsterLanguages.g:328:1: entryRuleSelectStatement : ruleSelectStatement EOF ;
    public final void entryRuleSelectStatement() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:329:1: ( ruleSelectStatement EOF )
            // InternalLobsterLanguages.g:330:1: ruleSelectStatement EOF
            {
             before(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectStatement();

            state._fsp--;

             after(grammarAccess.getSelectStatementRule()); 
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
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // InternalLobsterLanguages.g:337:1: ruleSelectStatement : ( ( rule__SelectStatement__Group__0 ) ) ;
    public final void ruleSelectStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:341:2: ( ( ( rule__SelectStatement__Group__0 ) ) )
            // InternalLobsterLanguages.g:342:2: ( ( rule__SelectStatement__Group__0 ) )
            {
            // InternalLobsterLanguages.g:342:2: ( ( rule__SelectStatement__Group__0 ) )
            // InternalLobsterLanguages.g:343:3: ( rule__SelectStatement__Group__0 )
            {
             before(grammarAccess.getSelectStatementAccess().getGroup()); 
            // InternalLobsterLanguages.g:344:3: ( rule__SelectStatement__Group__0 )
            // InternalLobsterLanguages.g:344:4: rule__SelectStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleConditionStatement"
    // InternalLobsterLanguages.g:353:1: entryRuleConditionStatement : ruleConditionStatement EOF ;
    public final void entryRuleConditionStatement() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:354:1: ( ruleConditionStatement EOF )
            // InternalLobsterLanguages.g:355:1: ruleConditionStatement EOF
            {
             before(grammarAccess.getConditionStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionStatement();

            state._fsp--;

             after(grammarAccess.getConditionStatementRule()); 
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
    // $ANTLR end "entryRuleConditionStatement"


    // $ANTLR start "ruleConditionStatement"
    // InternalLobsterLanguages.g:362:1: ruleConditionStatement : ( ( rule__ConditionStatement__Group__0 ) ) ;
    public final void ruleConditionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:366:2: ( ( ( rule__ConditionStatement__Group__0 ) ) )
            // InternalLobsterLanguages.g:367:2: ( ( rule__ConditionStatement__Group__0 ) )
            {
            // InternalLobsterLanguages.g:367:2: ( ( rule__ConditionStatement__Group__0 ) )
            // InternalLobsterLanguages.g:368:3: ( rule__ConditionStatement__Group__0 )
            {
             before(grammarAccess.getConditionStatementAccess().getGroup()); 
            // InternalLobsterLanguages.g:369:3: ( rule__ConditionStatement__Group__0 )
            // InternalLobsterLanguages.g:369:4: rule__ConditionStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionStatement"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalLobsterLanguages.g:378:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:379:1: ( rulePrimaryExpression EOF )
            // InternalLobsterLanguages.g:380:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalLobsterLanguages.g:387:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:391:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalLobsterLanguages.g:392:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalLobsterLanguages.g:392:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalLobsterLanguages.g:393:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalLobsterLanguages.g:394:3: ( rule__PrimaryExpression__Alternatives )
            // InternalLobsterLanguages.g:394:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleCharLiteral"
    // InternalLobsterLanguages.g:403:1: entryRuleCharLiteral : ruleCharLiteral EOF ;
    public final void entryRuleCharLiteral() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:404:1: ( ruleCharLiteral EOF )
            // InternalLobsterLanguages.g:405:1: ruleCharLiteral EOF
            {
             before(grammarAccess.getCharLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleCharLiteral();

            state._fsp--;

             after(grammarAccess.getCharLiteralRule()); 
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
    // $ANTLR end "entryRuleCharLiteral"


    // $ANTLR start "ruleCharLiteral"
    // InternalLobsterLanguages.g:412:1: ruleCharLiteral : ( ( rule__CharLiteral__VacAssignment ) ) ;
    public final void ruleCharLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:416:2: ( ( ( rule__CharLiteral__VacAssignment ) ) )
            // InternalLobsterLanguages.g:417:2: ( ( rule__CharLiteral__VacAssignment ) )
            {
            // InternalLobsterLanguages.g:417:2: ( ( rule__CharLiteral__VacAssignment ) )
            // InternalLobsterLanguages.g:418:3: ( rule__CharLiteral__VacAssignment )
            {
             before(grammarAccess.getCharLiteralAccess().getVacAssignment()); 
            // InternalLobsterLanguages.g:419:3: ( rule__CharLiteral__VacAssignment )
            // InternalLobsterLanguages.g:419:4: rule__CharLiteral__VacAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CharLiteral__VacAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCharLiteralAccess().getVacAssignment()); 

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
    // $ANTLR end "ruleCharLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalLobsterLanguages.g:428:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:429:1: ( ruleIntLiteral EOF )
            // InternalLobsterLanguages.g:430:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalLobsterLanguages.g:437:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:441:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalLobsterLanguages.g:442:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalLobsterLanguages.g:442:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalLobsterLanguages.g:443:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalLobsterLanguages.g:444:3: ( rule__IntLiteral__ValAssignment )
            // InternalLobsterLanguages.g:444:4: rule__IntLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValAssignment()); 

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleVariableReference"
    // InternalLobsterLanguages.g:453:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // InternalLobsterLanguages.g:454:1: ( ruleVariableReference EOF )
            // InternalLobsterLanguages.g:455:1: ruleVariableReference EOF
            {
             before(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableReference();

            state._fsp--;

             after(grammarAccess.getVariableReferenceRule()); 
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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalLobsterLanguages.g:462:1: ruleVariableReference : ( ( rule__VariableReference__VarAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:466:2: ( ( ( rule__VariableReference__VarAssignment ) ) )
            // InternalLobsterLanguages.g:467:2: ( ( rule__VariableReference__VarAssignment ) )
            {
            // InternalLobsterLanguages.g:467:2: ( ( rule__VariableReference__VarAssignment ) )
            // InternalLobsterLanguages.g:468:3: ( rule__VariableReference__VarAssignment )
            {
             before(grammarAccess.getVariableReferenceAccess().getVarAssignment()); 
            // InternalLobsterLanguages.g:469:3: ( rule__VariableReference__VarAssignment )
            // InternalLobsterLanguages.g:469:4: rule__VariableReference__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableReference__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableReferenceAccess().getVarAssignment()); 

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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "ruleDataType"
    // InternalLobsterLanguages.g:478:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:482:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalLobsterLanguages.g:483:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalLobsterLanguages.g:483:2: ( ( rule__DataType__Alternatives ) )
            // InternalLobsterLanguages.g:484:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalLobsterLanguages.g:485:3: ( rule__DataType__Alternatives )
            // InternalLobsterLanguages.g:485:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleMoreCondition"
    // InternalLobsterLanguages.g:494:1: ruleMoreCondition : ( ( rule__MoreCondition__Alternatives ) ) ;
    public final void ruleMoreCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:498:1: ( ( ( rule__MoreCondition__Alternatives ) ) )
            // InternalLobsterLanguages.g:499:2: ( ( rule__MoreCondition__Alternatives ) )
            {
            // InternalLobsterLanguages.g:499:2: ( ( rule__MoreCondition__Alternatives ) )
            // InternalLobsterLanguages.g:500:3: ( rule__MoreCondition__Alternatives )
            {
             before(grammarAccess.getMoreConditionAccess().getAlternatives()); 
            // InternalLobsterLanguages.g:501:3: ( rule__MoreCondition__Alternatives )
            // InternalLobsterLanguages.g:501:4: rule__MoreCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MoreCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMoreConditionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMoreCondition"


    // $ANTLR start "ruleCaculateCondition"
    // InternalLobsterLanguages.g:510:1: ruleCaculateCondition : ( ( rule__CaculateCondition__Alternatives ) ) ;
    public final void ruleCaculateCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:514:1: ( ( ( rule__CaculateCondition__Alternatives ) ) )
            // InternalLobsterLanguages.g:515:2: ( ( rule__CaculateCondition__Alternatives ) )
            {
            // InternalLobsterLanguages.g:515:2: ( ( rule__CaculateCondition__Alternatives ) )
            // InternalLobsterLanguages.g:516:3: ( rule__CaculateCondition__Alternatives )
            {
             before(grammarAccess.getCaculateConditionAccess().getAlternatives()); 
            // InternalLobsterLanguages.g:517:3: ( rule__CaculateCondition__Alternatives )
            // InternalLobsterLanguages.g:517:4: rule__CaculateCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CaculateCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCaculateConditionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCaculateCondition"


    // $ANTLR start "ruleOrder"
    // InternalLobsterLanguages.g:526:1: ruleOrder : ( ( rule__Order__Alternatives ) ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:530:1: ( ( ( rule__Order__Alternatives ) ) )
            // InternalLobsterLanguages.g:531:2: ( ( rule__Order__Alternatives ) )
            {
            // InternalLobsterLanguages.g:531:2: ( ( rule__Order__Alternatives ) )
            // InternalLobsterLanguages.g:532:3: ( rule__Order__Alternatives )
            {
             before(grammarAccess.getOrderAccess().getAlternatives()); 
            // InternalLobsterLanguages.g:533:3: ( rule__Order__Alternatives )
            // InternalLobsterLanguages.g:533:4: rule__Order__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Order__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOrder"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalLobsterLanguages.g:541:1: rule__Statement__Alternatives : ( ( ruleCreateDatabaseStatement ) | ( ruleCreateTableStatement ) | ( ruleInsertStatement ) | ( ruleDeleteDataStatement ) | ( ruleDeleteTableStatement ) | ( ruleUpdateStatement ) | ( ruleSelectStatement ) | ( ruleVariableCharacter ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:545:1: ( ( ruleCreateDatabaseStatement ) | ( ruleCreateTableStatement ) | ( ruleInsertStatement ) | ( ruleDeleteDataStatement ) | ( ruleDeleteTableStatement ) | ( ruleUpdateStatement ) | ( ruleSelectStatement ) | ( ruleVariableCharacter ) )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalLobsterLanguages.g:546:2: ( ruleCreateDatabaseStatement )
                    {
                    // InternalLobsterLanguages.g:546:2: ( ruleCreateDatabaseStatement )
                    // InternalLobsterLanguages.g:547:3: ruleCreateDatabaseStatement
                    {
                     before(grammarAccess.getStatementAccess().getCreateDatabaseStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateDatabaseStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCreateDatabaseStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLobsterLanguages.g:552:2: ( ruleCreateTableStatement )
                    {
                    // InternalLobsterLanguages.g:552:2: ( ruleCreateTableStatement )
                    // InternalLobsterLanguages.g:553:3: ruleCreateTableStatement
                    {
                     before(grammarAccess.getStatementAccess().getCreateTableStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateTableStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCreateTableStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLobsterLanguages.g:558:2: ( ruleInsertStatement )
                    {
                    // InternalLobsterLanguages.g:558:2: ( ruleInsertStatement )
                    // InternalLobsterLanguages.g:559:3: ruleInsertStatement
                    {
                     before(grammarAccess.getStatementAccess().getInsertStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInsertStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getInsertStatementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLobsterLanguages.g:564:2: ( ruleDeleteDataStatement )
                    {
                    // InternalLobsterLanguages.g:564:2: ( ruleDeleteDataStatement )
                    // InternalLobsterLanguages.g:565:3: ruleDeleteDataStatement
                    {
                     before(grammarAccess.getStatementAccess().getDeleteDataStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDeleteDataStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDeleteDataStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLobsterLanguages.g:570:2: ( ruleDeleteTableStatement )
                    {
                    // InternalLobsterLanguages.g:570:2: ( ruleDeleteTableStatement )
                    // InternalLobsterLanguages.g:571:3: ruleDeleteTableStatement
                    {
                     before(grammarAccess.getStatementAccess().getDeleteTableStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDeleteTableStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDeleteTableStatementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLobsterLanguages.g:576:2: ( ruleUpdateStatement )
                    {
                    // InternalLobsterLanguages.g:576:2: ( ruleUpdateStatement )
                    // InternalLobsterLanguages.g:577:3: ruleUpdateStatement
                    {
                     before(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleUpdateStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalLobsterLanguages.g:582:2: ( ruleSelectStatement )
                    {
                    // InternalLobsterLanguages.g:582:2: ( ruleSelectStatement )
                    // InternalLobsterLanguages.g:583:3: ruleSelectStatement
                    {
                     before(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalLobsterLanguages.g:588:2: ( ruleVariableCharacter )
                    {
                    // InternalLobsterLanguages.g:588:2: ( ruleVariableCharacter )
                    // InternalLobsterLanguages.g:589:3: ruleVariableCharacter
                    {
                     before(grammarAccess.getStatementAccess().getVariableCharacterParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableCharacter();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVariableCharacterParserRuleCall_7()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalLobsterLanguages.g:598:1: rule__PrimaryExpression__Alternatives : ( ( ruleIntLiteral ) | ( ruleCharLiteral ) | ( ruleVariableReference ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:602:1: ( ( ruleIntLiteral ) | ( ruleCharLiteral ) | ( ruleVariableReference ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLobsterLanguages.g:603:2: ( ruleIntLiteral )
                    {
                    // InternalLobsterLanguages.g:603:2: ( ruleIntLiteral )
                    // InternalLobsterLanguages.g:604:3: ruleIntLiteral
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getIntLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getIntLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLobsterLanguages.g:609:2: ( ruleCharLiteral )
                    {
                    // InternalLobsterLanguages.g:609:2: ( ruleCharLiteral )
                    // InternalLobsterLanguages.g:610:3: ruleCharLiteral
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getCharLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCharLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getCharLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLobsterLanguages.g:615:2: ( ruleVariableReference )
                    {
                    // InternalLobsterLanguages.g:615:2: ( ruleVariableReference )
                    // InternalLobsterLanguages.g:616:3: ruleVariableReference
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableReference();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalLobsterLanguages.g:625:1: rule__DataType__Alternatives : ( ( ( 'Integer' ) ) | ( ( 'Character' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:629:1: ( ( ( 'Integer' ) ) | ( ( 'Character' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLobsterLanguages.g:630:2: ( ( 'Integer' ) )
                    {
                    // InternalLobsterLanguages.g:630:2: ( ( 'Integer' ) )
                    // InternalLobsterLanguages.g:631:3: ( 'Integer' )
                    {
                     before(grammarAccess.getDataTypeAccess().getIntegerEnumLiteralDeclaration_0()); 
                    // InternalLobsterLanguages.g:632:3: ( 'Integer' )
                    // InternalLobsterLanguages.g:632:4: 'Integer'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getIntegerEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLobsterLanguages.g:636:2: ( ( 'Character' ) )
                    {
                    // InternalLobsterLanguages.g:636:2: ( ( 'Character' ) )
                    // InternalLobsterLanguages.g:637:3: ( 'Character' )
                    {
                     before(grammarAccess.getDataTypeAccess().getCharacterEnumLiteralDeclaration_1()); 
                    // InternalLobsterLanguages.g:638:3: ( 'Character' )
                    // InternalLobsterLanguages.g:638:4: 'Character'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getCharacterEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__MoreCondition__Alternatives"
    // InternalLobsterLanguages.g:646:1: rule__MoreCondition__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'finish' ) ) );
    public final void rule__MoreCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:650:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'finish' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
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
                    // InternalLobsterLanguages.g:651:2: ( ( 'and' ) )
                    {
                    // InternalLobsterLanguages.g:651:2: ( ( 'and' ) )
                    // InternalLobsterLanguages.g:652:3: ( 'and' )
                    {
                     before(grammarAccess.getMoreConditionAccess().getAndEnumLiteralDeclaration_0()); 
                    // InternalLobsterLanguages.g:653:3: ( 'and' )
                    // InternalLobsterLanguages.g:653:4: 'and'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMoreConditionAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLobsterLanguages.g:657:2: ( ( 'or' ) )
                    {
                    // InternalLobsterLanguages.g:657:2: ( ( 'or' ) )
                    // InternalLobsterLanguages.g:658:3: ( 'or' )
                    {
                     before(grammarAccess.getMoreConditionAccess().getOrEnumLiteralDeclaration_1()); 
                    // InternalLobsterLanguages.g:659:3: ( 'or' )
                    // InternalLobsterLanguages.g:659:4: 'or'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMoreConditionAccess().getOrEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLobsterLanguages.g:663:2: ( ( 'finish' ) )
                    {
                    // InternalLobsterLanguages.g:663:2: ( ( 'finish' ) )
                    // InternalLobsterLanguages.g:664:3: ( 'finish' )
                    {
                     before(grammarAccess.getMoreConditionAccess().getFinishEnumLiteralDeclaration_2()); 
                    // InternalLobsterLanguages.g:665:3: ( 'finish' )
                    // InternalLobsterLanguages.g:665:4: 'finish'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMoreConditionAccess().getFinishEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__MoreCondition__Alternatives"


    // $ANTLR start "rule__CaculateCondition__Alternatives"
    // InternalLobsterLanguages.g:673:1: rule__CaculateCondition__Alternatives : ( ( ( 'maximum' ) ) | ( ( 'minimum' ) ) | ( ( 'average' ) ) | ( ( 'count' ) ) | ( ( 'sum' ) ) );
    public final void rule__CaculateCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:677:1: ( ( ( 'maximum' ) ) | ( ( 'minimum' ) ) | ( ( 'average' ) ) | ( ( 'count' ) ) | ( ( 'sum' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalLobsterLanguages.g:678:2: ( ( 'maximum' ) )
                    {
                    // InternalLobsterLanguages.g:678:2: ( ( 'maximum' ) )
                    // InternalLobsterLanguages.g:679:3: ( 'maximum' )
                    {
                     before(grammarAccess.getCaculateConditionAccess().getMaximumEnumLiteralDeclaration_0()); 
                    // InternalLobsterLanguages.g:680:3: ( 'maximum' )
                    // InternalLobsterLanguages.g:680:4: 'maximum'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCaculateConditionAccess().getMaximumEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLobsterLanguages.g:684:2: ( ( 'minimum' ) )
                    {
                    // InternalLobsterLanguages.g:684:2: ( ( 'minimum' ) )
                    // InternalLobsterLanguages.g:685:3: ( 'minimum' )
                    {
                     before(grammarAccess.getCaculateConditionAccess().getMinimumEnumLiteralDeclaration_1()); 
                    // InternalLobsterLanguages.g:686:3: ( 'minimum' )
                    // InternalLobsterLanguages.g:686:4: 'minimum'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getCaculateConditionAccess().getMinimumEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLobsterLanguages.g:690:2: ( ( 'average' ) )
                    {
                    // InternalLobsterLanguages.g:690:2: ( ( 'average' ) )
                    // InternalLobsterLanguages.g:691:3: ( 'average' )
                    {
                     before(grammarAccess.getCaculateConditionAccess().getAverageEnumLiteralDeclaration_2()); 
                    // InternalLobsterLanguages.g:692:3: ( 'average' )
                    // InternalLobsterLanguages.g:692:4: 'average'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getCaculateConditionAccess().getAverageEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLobsterLanguages.g:696:2: ( ( 'count' ) )
                    {
                    // InternalLobsterLanguages.g:696:2: ( ( 'count' ) )
                    // InternalLobsterLanguages.g:697:3: ( 'count' )
                    {
                     before(grammarAccess.getCaculateConditionAccess().getCountEnumLiteralDeclaration_3()); 
                    // InternalLobsterLanguages.g:698:3: ( 'count' )
                    // InternalLobsterLanguages.g:698:4: 'count'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getCaculateConditionAccess().getCountEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLobsterLanguages.g:702:2: ( ( 'sum' ) )
                    {
                    // InternalLobsterLanguages.g:702:2: ( ( 'sum' ) )
                    // InternalLobsterLanguages.g:703:3: ( 'sum' )
                    {
                     before(grammarAccess.getCaculateConditionAccess().getSumEnumLiteralDeclaration_4()); 
                    // InternalLobsterLanguages.g:704:3: ( 'sum' )
                    // InternalLobsterLanguages.g:704:4: 'sum'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getCaculateConditionAccess().getSumEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__CaculateCondition__Alternatives"


    // $ANTLR start "rule__Order__Alternatives"
    // InternalLobsterLanguages.g:712:1: rule__Order__Alternatives : ( ( ( 'ascending' ) ) | ( ( 'descending' ) ) );
    public final void rule__Order__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:716:1: ( ( ( 'ascending' ) ) | ( ( 'descending' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLobsterLanguages.g:717:2: ( ( 'ascending' ) )
                    {
                    // InternalLobsterLanguages.g:717:2: ( ( 'ascending' ) )
                    // InternalLobsterLanguages.g:718:3: ( 'ascending' )
                    {
                     before(grammarAccess.getOrderAccess().getAscendingEnumLiteralDeclaration_0()); 
                    // InternalLobsterLanguages.g:719:3: ( 'ascending' )
                    // InternalLobsterLanguages.g:719:4: 'ascending'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderAccess().getAscendingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLobsterLanguages.g:723:2: ( ( 'descending' ) )
                    {
                    // InternalLobsterLanguages.g:723:2: ( ( 'descending' ) )
                    // InternalLobsterLanguages.g:724:3: ( 'descending' )
                    {
                     before(grammarAccess.getOrderAccess().getDescendingEnumLiteralDeclaration_1()); 
                    // InternalLobsterLanguages.g:725:3: ( 'descending' )
                    // InternalLobsterLanguages.g:725:4: 'descending'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderAccess().getDescendingEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Order__Alternatives"


    // $ANTLR start "rule__VariableCharacter__Group__0"
    // InternalLobsterLanguages.g:733:1: rule__VariableCharacter__Group__0 : rule__VariableCharacter__Group__0__Impl rule__VariableCharacter__Group__1 ;
    public final void rule__VariableCharacter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:737:1: ( rule__VariableCharacter__Group__0__Impl rule__VariableCharacter__Group__1 )
            // InternalLobsterLanguages.g:738:2: rule__VariableCharacter__Group__0__Impl rule__VariableCharacter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VariableCharacter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableCharacter__Group__1();

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
    // $ANTLR end "rule__VariableCharacter__Group__0"


    // $ANTLR start "rule__VariableCharacter__Group__0__Impl"
    // InternalLobsterLanguages.g:745:1: rule__VariableCharacter__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableCharacter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:749:1: ( ( 'var' ) )
            // InternalLobsterLanguages.g:750:1: ( 'var' )
            {
            // InternalLobsterLanguages.g:750:1: ( 'var' )
            // InternalLobsterLanguages.g:751:2: 'var'
            {
             before(grammarAccess.getVariableCharacterAccess().getVarKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVariableCharacterAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__VariableCharacter__Group__0__Impl"


    // $ANTLR start "rule__VariableCharacter__Group__1"
    // InternalLobsterLanguages.g:760:1: rule__VariableCharacter__Group__1 : rule__VariableCharacter__Group__1__Impl rule__VariableCharacter__Group__2 ;
    public final void rule__VariableCharacter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:764:1: ( rule__VariableCharacter__Group__1__Impl rule__VariableCharacter__Group__2 )
            // InternalLobsterLanguages.g:765:2: rule__VariableCharacter__Group__1__Impl rule__VariableCharacter__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__VariableCharacter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableCharacter__Group__2();

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
    // $ANTLR end "rule__VariableCharacter__Group__1"


    // $ANTLR start "rule__VariableCharacter__Group__1__Impl"
    // InternalLobsterLanguages.g:772:1: rule__VariableCharacter__Group__1__Impl : ( ( rule__VariableCharacter__NameAssignment_1 ) ) ;
    public final void rule__VariableCharacter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:776:1: ( ( ( rule__VariableCharacter__NameAssignment_1 ) ) )
            // InternalLobsterLanguages.g:777:1: ( ( rule__VariableCharacter__NameAssignment_1 ) )
            {
            // InternalLobsterLanguages.g:777:1: ( ( rule__VariableCharacter__NameAssignment_1 ) )
            // InternalLobsterLanguages.g:778:2: ( rule__VariableCharacter__NameAssignment_1 )
            {
             before(grammarAccess.getVariableCharacterAccess().getNameAssignment_1()); 
            // InternalLobsterLanguages.g:779:2: ( rule__VariableCharacter__NameAssignment_1 )
            // InternalLobsterLanguages.g:779:3: rule__VariableCharacter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableCharacter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableCharacterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__VariableCharacter__Group__1__Impl"


    // $ANTLR start "rule__VariableCharacter__Group__2"
    // InternalLobsterLanguages.g:787:1: rule__VariableCharacter__Group__2 : rule__VariableCharacter__Group__2__Impl rule__VariableCharacter__Group__3 ;
    public final void rule__VariableCharacter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:791:1: ( rule__VariableCharacter__Group__2__Impl rule__VariableCharacter__Group__3 )
            // InternalLobsterLanguages.g:792:2: rule__VariableCharacter__Group__2__Impl rule__VariableCharacter__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__VariableCharacter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableCharacter__Group__3();

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
    // $ANTLR end "rule__VariableCharacter__Group__2"


    // $ANTLR start "rule__VariableCharacter__Group__2__Impl"
    // InternalLobsterLanguages.g:799:1: rule__VariableCharacter__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableCharacter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:803:1: ( ( '=' ) )
            // InternalLobsterLanguages.g:804:1: ( '=' )
            {
            // InternalLobsterLanguages.g:804:1: ( '=' )
            // InternalLobsterLanguages.g:805:2: '='
            {
             before(grammarAccess.getVariableCharacterAccess().getEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVariableCharacterAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__VariableCharacter__Group__2__Impl"


    // $ANTLR start "rule__VariableCharacter__Group__3"
    // InternalLobsterLanguages.g:814:1: rule__VariableCharacter__Group__3 : rule__VariableCharacter__Group__3__Impl ;
    public final void rule__VariableCharacter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:818:1: ( rule__VariableCharacter__Group__3__Impl )
            // InternalLobsterLanguages.g:819:2: rule__VariableCharacter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableCharacter__Group__3__Impl();

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
    // $ANTLR end "rule__VariableCharacter__Group__3"


    // $ANTLR start "rule__VariableCharacter__Group__3__Impl"
    // InternalLobsterLanguages.g:825:1: rule__VariableCharacter__Group__3__Impl : ( ( rule__VariableCharacter__ValueAssignment_3 ) ) ;
    public final void rule__VariableCharacter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:829:1: ( ( ( rule__VariableCharacter__ValueAssignment_3 ) ) )
            // InternalLobsterLanguages.g:830:1: ( ( rule__VariableCharacter__ValueAssignment_3 ) )
            {
            // InternalLobsterLanguages.g:830:1: ( ( rule__VariableCharacter__ValueAssignment_3 ) )
            // InternalLobsterLanguages.g:831:2: ( rule__VariableCharacter__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableCharacterAccess().getValueAssignment_3()); 
            // InternalLobsterLanguages.g:832:2: ( rule__VariableCharacter__ValueAssignment_3 )
            // InternalLobsterLanguages.g:832:3: rule__VariableCharacter__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableCharacter__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableCharacterAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__VariableCharacter__Group__3__Impl"


    // $ANTLR start "rule__CreateDatabaseStatement__Group__0"
    // InternalLobsterLanguages.g:841:1: rule__CreateDatabaseStatement__Group__0 : rule__CreateDatabaseStatement__Group__0__Impl rule__CreateDatabaseStatement__Group__1 ;
    public final void rule__CreateDatabaseStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:845:1: ( rule__CreateDatabaseStatement__Group__0__Impl rule__CreateDatabaseStatement__Group__1 )
            // InternalLobsterLanguages.g:846:2: rule__CreateDatabaseStatement__Group__0__Impl rule__CreateDatabaseStatement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CreateDatabaseStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateDatabaseStatement__Group__1();

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
    // $ANTLR end "rule__CreateDatabaseStatement__Group__0"


    // $ANTLR start "rule__CreateDatabaseStatement__Group__0__Impl"
    // InternalLobsterLanguages.g:853:1: rule__CreateDatabaseStatement__Group__0__Impl : ( 'Create' ) ;
    public final void rule__CreateDatabaseStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:857:1: ( ( 'Create' ) )
            // InternalLobsterLanguages.g:858:1: ( 'Create' )
            {
            // InternalLobsterLanguages.g:858:1: ( 'Create' )
            // InternalLobsterLanguages.g:859:2: 'Create'
            {
             before(grammarAccess.getCreateDatabaseStatementAccess().getCreateKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCreateDatabaseStatementAccess().getCreateKeyword_0()); 

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
    // $ANTLR end "rule__CreateDatabaseStatement__Group__0__Impl"


    // $ANTLR start "rule__CreateDatabaseStatement__Group__1"
    // InternalLobsterLanguages.g:868:1: rule__CreateDatabaseStatement__Group__1 : rule__CreateDatabaseStatement__Group__1__Impl rule__CreateDatabaseStatement__Group__2 ;
    public final void rule__CreateDatabaseStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:872:1: ( rule__CreateDatabaseStatement__Group__1__Impl rule__CreateDatabaseStatement__Group__2 )
            // InternalLobsterLanguages.g:873:2: rule__CreateDatabaseStatement__Group__1__Impl rule__CreateDatabaseStatement__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CreateDatabaseStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateDatabaseStatement__Group__2();

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
    // $ANTLR end "rule__CreateDatabaseStatement__Group__1"


    // $ANTLR start "rule__CreateDatabaseStatement__Group__1__Impl"
    // InternalLobsterLanguages.g:880:1: rule__CreateDatabaseStatement__Group__1__Impl : ( 'a' ) ;
    public final void rule__CreateDatabaseStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:884:1: ( ( 'a' ) )
            // InternalLobsterLanguages.g:885:1: ( 'a' )
            {
            // InternalLobsterLanguages.g:885:1: ( 'a' )
            // InternalLobsterLanguages.g:886:2: 'a'
            {
             before(grammarAccess.getCreateDatabaseStatementAccess().getAKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCreateDatabaseStatementAccess().getAKeyword_1()); 

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
    // $ANTLR end "rule__CreateDatabaseStatement__Group__1__Impl"


    // $ANTLR start "rule__CreateDatabaseStatement__Group__2"
    // InternalLobsterLanguages.g:895:1: rule__CreateDatabaseStatement__Group__2 : rule__CreateDatabaseStatement__Group__2__Impl rule__CreateDatabaseStatement__Group__3 ;
    public final void rule__CreateDatabaseStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:899:1: ( rule__CreateDatabaseStatement__Group__2__Impl rule__CreateDatabaseStatement__Group__3 )
            // InternalLobsterLanguages.g:900:2: rule__CreateDatabaseStatement__Group__2__Impl rule__CreateDatabaseStatement__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__CreateDatabaseStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateDatabaseStatement__Group__3();

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
    // $ANTLR end "rule__CreateDatabaseStatement__Group__2"


    // $ANTLR start "rule__CreateDatabaseStatement__Group__2__Impl"
    // InternalLobsterLanguages.g:907:1: rule__CreateDatabaseStatement__Group__2__Impl : ( 'database' ) ;
    public final void rule__CreateDatabaseStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:911:1: ( ( 'database' ) )
            // InternalLobsterLanguages.g:912:1: ( 'database' )
            {
            // InternalLobsterLanguages.g:912:1: ( 'database' )
            // InternalLobsterLanguages.g:913:2: 'database'
            {
             before(grammarAccess.getCreateDatabaseStatementAccess().getDatabaseKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCreateDatabaseStatementAccess().getDatabaseKeyword_2()); 

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
    // $ANTLR end "rule__CreateDatabaseStatement__Group__2__Impl"


    // $ANTLR start "rule__CreateDatabaseStatement__Group__3"
    // InternalLobsterLanguages.g:922:1: rule__CreateDatabaseStatement__Group__3 : rule__CreateDatabaseStatement__Group__3__Impl rule__CreateDatabaseStatement__Group__4 ;
    public final void rule__CreateDatabaseStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:926:1: ( rule__CreateDatabaseStatement__Group__3__Impl rule__CreateDatabaseStatement__Group__4 )
            // InternalLobsterLanguages.g:927:2: rule__CreateDatabaseStatement__Group__3__Impl rule__CreateDatabaseStatement__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__CreateDatabaseStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateDatabaseStatement__Group__4();

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
    // $ANTLR end "rule__CreateDatabaseStatement__Group__3"


    // $ANTLR start "rule__CreateDatabaseStatement__Group__3__Impl"
    // InternalLobsterLanguages.g:934:1: rule__CreateDatabaseStatement__Group__3__Impl : ( 'named' ) ;
    public final void rule__CreateDatabaseStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:938:1: ( ( 'named' ) )
            // InternalLobsterLanguages.g:939:1: ( 'named' )
            {
            // InternalLobsterLanguages.g:939:1: ( 'named' )
            // InternalLobsterLanguages.g:940:2: 'named'
            {
             before(grammarAccess.getCreateDatabaseStatementAccess().getNamedKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCreateDatabaseStatementAccess().getNamedKeyword_3()); 

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
    // $ANTLR end "rule__CreateDatabaseStatement__Group__3__Impl"


    // $ANTLR start "rule__CreateDatabaseStatement__Group__4"
    // InternalLobsterLanguages.g:949:1: rule__CreateDatabaseStatement__Group__4 : rule__CreateDatabaseStatement__Group__4__Impl ;
    public final void rule__CreateDatabaseStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:953:1: ( rule__CreateDatabaseStatement__Group__4__Impl )
            // InternalLobsterLanguages.g:954:2: rule__CreateDatabaseStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateDatabaseStatement__Group__4__Impl();

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
    // $ANTLR end "rule__CreateDatabaseStatement__Group__4"


    // $ANTLR start "rule__CreateDatabaseStatement__Group__4__Impl"
    // InternalLobsterLanguages.g:960:1: rule__CreateDatabaseStatement__Group__4__Impl : ( ( rule__CreateDatabaseStatement__DbnameAssignment_4 ) ) ;
    public final void rule__CreateDatabaseStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:964:1: ( ( ( rule__CreateDatabaseStatement__DbnameAssignment_4 ) ) )
            // InternalLobsterLanguages.g:965:1: ( ( rule__CreateDatabaseStatement__DbnameAssignment_4 ) )
            {
            // InternalLobsterLanguages.g:965:1: ( ( rule__CreateDatabaseStatement__DbnameAssignment_4 ) )
            // InternalLobsterLanguages.g:966:2: ( rule__CreateDatabaseStatement__DbnameAssignment_4 )
            {
             before(grammarAccess.getCreateDatabaseStatementAccess().getDbnameAssignment_4()); 
            // InternalLobsterLanguages.g:967:2: ( rule__CreateDatabaseStatement__DbnameAssignment_4 )
            // InternalLobsterLanguages.g:967:3: rule__CreateDatabaseStatement__DbnameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CreateDatabaseStatement__DbnameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCreateDatabaseStatementAccess().getDbnameAssignment_4()); 

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
    // $ANTLR end "rule__CreateDatabaseStatement__Group__4__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__0"
    // InternalLobsterLanguages.g:976:1: rule__CreateTableStatement__Group__0 : rule__CreateTableStatement__Group__0__Impl rule__CreateTableStatement__Group__1 ;
    public final void rule__CreateTableStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:980:1: ( rule__CreateTableStatement__Group__0__Impl rule__CreateTableStatement__Group__1 )
            // InternalLobsterLanguages.g:981:2: rule__CreateTableStatement__Group__0__Impl rule__CreateTableStatement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CreateTableStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__1();

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
    // $ANTLR end "rule__CreateTableStatement__Group__0"


    // $ANTLR start "rule__CreateTableStatement__Group__0__Impl"
    // InternalLobsterLanguages.g:988:1: rule__CreateTableStatement__Group__0__Impl : ( 'Create' ) ;
    public final void rule__CreateTableStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:992:1: ( ( 'Create' ) )
            // InternalLobsterLanguages.g:993:1: ( 'Create' )
            {
            // InternalLobsterLanguages.g:993:1: ( 'Create' )
            // InternalLobsterLanguages.g:994:2: 'Create'
            {
             before(grammarAccess.getCreateTableStatementAccess().getCreateKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCreateTableStatementAccess().getCreateKeyword_0()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__0__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__1"
    // InternalLobsterLanguages.g:1003:1: rule__CreateTableStatement__Group__1 : rule__CreateTableStatement__Group__1__Impl rule__CreateTableStatement__Group__2 ;
    public final void rule__CreateTableStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1007:1: ( rule__CreateTableStatement__Group__1__Impl rule__CreateTableStatement__Group__2 )
            // InternalLobsterLanguages.g:1008:2: rule__CreateTableStatement__Group__1__Impl rule__CreateTableStatement__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__CreateTableStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__2();

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
    // $ANTLR end "rule__CreateTableStatement__Group__1"


    // $ANTLR start "rule__CreateTableStatement__Group__1__Impl"
    // InternalLobsterLanguages.g:1015:1: rule__CreateTableStatement__Group__1__Impl : ( 'a' ) ;
    public final void rule__CreateTableStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1019:1: ( ( 'a' ) )
            // InternalLobsterLanguages.g:1020:1: ( 'a' )
            {
            // InternalLobsterLanguages.g:1020:1: ( 'a' )
            // InternalLobsterLanguages.g:1021:2: 'a'
            {
             before(grammarAccess.getCreateTableStatementAccess().getAKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCreateTableStatementAccess().getAKeyword_1()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__1__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__2"
    // InternalLobsterLanguages.g:1030:1: rule__CreateTableStatement__Group__2 : rule__CreateTableStatement__Group__2__Impl rule__CreateTableStatement__Group__3 ;
    public final void rule__CreateTableStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1034:1: ( rule__CreateTableStatement__Group__2__Impl rule__CreateTableStatement__Group__3 )
            // InternalLobsterLanguages.g:1035:2: rule__CreateTableStatement__Group__2__Impl rule__CreateTableStatement__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__CreateTableStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__3();

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
    // $ANTLR end "rule__CreateTableStatement__Group__2"


    // $ANTLR start "rule__CreateTableStatement__Group__2__Impl"
    // InternalLobsterLanguages.g:1042:1: rule__CreateTableStatement__Group__2__Impl : ( 'table' ) ;
    public final void rule__CreateTableStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1046:1: ( ( 'table' ) )
            // InternalLobsterLanguages.g:1047:1: ( 'table' )
            {
            // InternalLobsterLanguages.g:1047:1: ( 'table' )
            // InternalLobsterLanguages.g:1048:2: 'table'
            {
             before(grammarAccess.getCreateTableStatementAccess().getTableKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCreateTableStatementAccess().getTableKeyword_2()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__2__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__3"
    // InternalLobsterLanguages.g:1057:1: rule__CreateTableStatement__Group__3 : rule__CreateTableStatement__Group__3__Impl rule__CreateTableStatement__Group__4 ;
    public final void rule__CreateTableStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1061:1: ( rule__CreateTableStatement__Group__3__Impl rule__CreateTableStatement__Group__4 )
            // InternalLobsterLanguages.g:1062:2: rule__CreateTableStatement__Group__3__Impl rule__CreateTableStatement__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__CreateTableStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__4();

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
    // $ANTLR end "rule__CreateTableStatement__Group__3"


    // $ANTLR start "rule__CreateTableStatement__Group__3__Impl"
    // InternalLobsterLanguages.g:1069:1: rule__CreateTableStatement__Group__3__Impl : ( 'named' ) ;
    public final void rule__CreateTableStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1073:1: ( ( 'named' ) )
            // InternalLobsterLanguages.g:1074:1: ( 'named' )
            {
            // InternalLobsterLanguages.g:1074:1: ( 'named' )
            // InternalLobsterLanguages.g:1075:2: 'named'
            {
             before(grammarAccess.getCreateTableStatementAccess().getNamedKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCreateTableStatementAccess().getNamedKeyword_3()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__3__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__4"
    // InternalLobsterLanguages.g:1084:1: rule__CreateTableStatement__Group__4 : rule__CreateTableStatement__Group__4__Impl rule__CreateTableStatement__Group__5 ;
    public final void rule__CreateTableStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1088:1: ( rule__CreateTableStatement__Group__4__Impl rule__CreateTableStatement__Group__5 )
            // InternalLobsterLanguages.g:1089:2: rule__CreateTableStatement__Group__4__Impl rule__CreateTableStatement__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__CreateTableStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__5();

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
    // $ANTLR end "rule__CreateTableStatement__Group__4"


    // $ANTLR start "rule__CreateTableStatement__Group__4__Impl"
    // InternalLobsterLanguages.g:1096:1: rule__CreateTableStatement__Group__4__Impl : ( ( rule__CreateTableStatement__TbnameAssignment_4 ) ) ;
    public final void rule__CreateTableStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1100:1: ( ( ( rule__CreateTableStatement__TbnameAssignment_4 ) ) )
            // InternalLobsterLanguages.g:1101:1: ( ( rule__CreateTableStatement__TbnameAssignment_4 ) )
            {
            // InternalLobsterLanguages.g:1101:1: ( ( rule__CreateTableStatement__TbnameAssignment_4 ) )
            // InternalLobsterLanguages.g:1102:2: ( rule__CreateTableStatement__TbnameAssignment_4 )
            {
             before(grammarAccess.getCreateTableStatementAccess().getTbnameAssignment_4()); 
            // InternalLobsterLanguages.g:1103:2: ( rule__CreateTableStatement__TbnameAssignment_4 )
            // InternalLobsterLanguages.g:1103:3: rule__CreateTableStatement__TbnameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__TbnameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableStatementAccess().getTbnameAssignment_4()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__4__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__5"
    // InternalLobsterLanguages.g:1111:1: rule__CreateTableStatement__Group__5 : rule__CreateTableStatement__Group__5__Impl rule__CreateTableStatement__Group__6 ;
    public final void rule__CreateTableStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1115:1: ( rule__CreateTableStatement__Group__5__Impl rule__CreateTableStatement__Group__6 )
            // InternalLobsterLanguages.g:1116:2: rule__CreateTableStatement__Group__5__Impl rule__CreateTableStatement__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__CreateTableStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__6();

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
    // $ANTLR end "rule__CreateTableStatement__Group__5"


    // $ANTLR start "rule__CreateTableStatement__Group__5__Impl"
    // InternalLobsterLanguages.g:1123:1: rule__CreateTableStatement__Group__5__Impl : ( 'in' ) ;
    public final void rule__CreateTableStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1127:1: ( ( 'in' ) )
            // InternalLobsterLanguages.g:1128:1: ( 'in' )
            {
            // InternalLobsterLanguages.g:1128:1: ( 'in' )
            // InternalLobsterLanguages.g:1129:2: 'in'
            {
             before(grammarAccess.getCreateTableStatementAccess().getInKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCreateTableStatementAccess().getInKeyword_5()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__5__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__6"
    // InternalLobsterLanguages.g:1138:1: rule__CreateTableStatement__Group__6 : rule__CreateTableStatement__Group__6__Impl rule__CreateTableStatement__Group__7 ;
    public final void rule__CreateTableStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1142:1: ( rule__CreateTableStatement__Group__6__Impl rule__CreateTableStatement__Group__7 )
            // InternalLobsterLanguages.g:1143:2: rule__CreateTableStatement__Group__6__Impl rule__CreateTableStatement__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__CreateTableStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__7();

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
    // $ANTLR end "rule__CreateTableStatement__Group__6"


    // $ANTLR start "rule__CreateTableStatement__Group__6__Impl"
    // InternalLobsterLanguages.g:1150:1: rule__CreateTableStatement__Group__6__Impl : ( ( rule__CreateTableStatement__DbnameAssignment_6 ) ) ;
    public final void rule__CreateTableStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1154:1: ( ( ( rule__CreateTableStatement__DbnameAssignment_6 ) ) )
            // InternalLobsterLanguages.g:1155:1: ( ( rule__CreateTableStatement__DbnameAssignment_6 ) )
            {
            // InternalLobsterLanguages.g:1155:1: ( ( rule__CreateTableStatement__DbnameAssignment_6 ) )
            // InternalLobsterLanguages.g:1156:2: ( rule__CreateTableStatement__DbnameAssignment_6 )
            {
             before(grammarAccess.getCreateTableStatementAccess().getDbnameAssignment_6()); 
            // InternalLobsterLanguages.g:1157:2: ( rule__CreateTableStatement__DbnameAssignment_6 )
            // InternalLobsterLanguages.g:1157:3: rule__CreateTableStatement__DbnameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__DbnameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableStatementAccess().getDbnameAssignment_6()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__6__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__7"
    // InternalLobsterLanguages.g:1165:1: rule__CreateTableStatement__Group__7 : rule__CreateTableStatement__Group__7__Impl rule__CreateTableStatement__Group__8 ;
    public final void rule__CreateTableStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1169:1: ( rule__CreateTableStatement__Group__7__Impl rule__CreateTableStatement__Group__8 )
            // InternalLobsterLanguages.g:1170:2: rule__CreateTableStatement__Group__7__Impl rule__CreateTableStatement__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__CreateTableStatement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__8();

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
    // $ANTLR end "rule__CreateTableStatement__Group__7"


    // $ANTLR start "rule__CreateTableStatement__Group__7__Impl"
    // InternalLobsterLanguages.g:1177:1: rule__CreateTableStatement__Group__7__Impl : ( 'include' ) ;
    public final void rule__CreateTableStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1181:1: ( ( 'include' ) )
            // InternalLobsterLanguages.g:1182:1: ( 'include' )
            {
            // InternalLobsterLanguages.g:1182:1: ( 'include' )
            // InternalLobsterLanguages.g:1183:2: 'include'
            {
             before(grammarAccess.getCreateTableStatementAccess().getIncludeKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCreateTableStatementAccess().getIncludeKeyword_7()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__7__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__8"
    // InternalLobsterLanguages.g:1192:1: rule__CreateTableStatement__Group__8 : rule__CreateTableStatement__Group__8__Impl rule__CreateTableStatement__Group__9 ;
    public final void rule__CreateTableStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1196:1: ( rule__CreateTableStatement__Group__8__Impl rule__CreateTableStatement__Group__9 )
            // InternalLobsterLanguages.g:1197:2: rule__CreateTableStatement__Group__8__Impl rule__CreateTableStatement__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__CreateTableStatement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__9();

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
    // $ANTLR end "rule__CreateTableStatement__Group__8"


    // $ANTLR start "rule__CreateTableStatement__Group__8__Impl"
    // InternalLobsterLanguages.g:1204:1: rule__CreateTableStatement__Group__8__Impl : ( '{' ) ;
    public final void rule__CreateTableStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1208:1: ( ( '{' ) )
            // InternalLobsterLanguages.g:1209:1: ( '{' )
            {
            // InternalLobsterLanguages.g:1209:1: ( '{' )
            // InternalLobsterLanguages.g:1210:2: '{'
            {
             before(grammarAccess.getCreateTableStatementAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCreateTableStatementAccess().getLeftCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__8__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__9"
    // InternalLobsterLanguages.g:1219:1: rule__CreateTableStatement__Group__9 : rule__CreateTableStatement__Group__9__Impl rule__CreateTableStatement__Group__10 ;
    public final void rule__CreateTableStatement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1223:1: ( rule__CreateTableStatement__Group__9__Impl rule__CreateTableStatement__Group__10 )
            // InternalLobsterLanguages.g:1224:2: rule__CreateTableStatement__Group__9__Impl rule__CreateTableStatement__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__CreateTableStatement__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__10();

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
    // $ANTLR end "rule__CreateTableStatement__Group__9"


    // $ANTLR start "rule__CreateTableStatement__Group__9__Impl"
    // InternalLobsterLanguages.g:1231:1: rule__CreateTableStatement__Group__9__Impl : ( ( rule__CreateTableStatement__ColumnsAssignment_9 )* ) ;
    public final void rule__CreateTableStatement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1235:1: ( ( ( rule__CreateTableStatement__ColumnsAssignment_9 )* ) )
            // InternalLobsterLanguages.g:1236:1: ( ( rule__CreateTableStatement__ColumnsAssignment_9 )* )
            {
            // InternalLobsterLanguages.g:1236:1: ( ( rule__CreateTableStatement__ColumnsAssignment_9 )* )
            // InternalLobsterLanguages.g:1237:2: ( rule__CreateTableStatement__ColumnsAssignment_9 )*
            {
             before(grammarAccess.getCreateTableStatementAccess().getColumnsAssignment_9()); 
            // InternalLobsterLanguages.g:1238:2: ( rule__CreateTableStatement__ColumnsAssignment_9 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLobsterLanguages.g:1238:3: rule__CreateTableStatement__ColumnsAssignment_9
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__CreateTableStatement__ColumnsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCreateTableStatementAccess().getColumnsAssignment_9()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__9__Impl"


    // $ANTLR start "rule__CreateTableStatement__Group__10"
    // InternalLobsterLanguages.g:1246:1: rule__CreateTableStatement__Group__10 : rule__CreateTableStatement__Group__10__Impl ;
    public final void rule__CreateTableStatement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1250:1: ( rule__CreateTableStatement__Group__10__Impl )
            // InternalLobsterLanguages.g:1251:2: rule__CreateTableStatement__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableStatement__Group__10__Impl();

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
    // $ANTLR end "rule__CreateTableStatement__Group__10"


    // $ANTLR start "rule__CreateTableStatement__Group__10__Impl"
    // InternalLobsterLanguages.g:1257:1: rule__CreateTableStatement__Group__10__Impl : ( '}' ) ;
    public final void rule__CreateTableStatement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1261:1: ( ( '}' ) )
            // InternalLobsterLanguages.g:1262:1: ( '}' )
            {
            // InternalLobsterLanguages.g:1262:1: ( '}' )
            // InternalLobsterLanguages.g:1263:2: '}'
            {
             before(grammarAccess.getCreateTableStatementAccess().getRightCurlyBracketKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCreateTableStatementAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__CreateTableStatement__Group__10__Impl"


    // $ANTLR start "rule__CreateTableColumn__Group__0"
    // InternalLobsterLanguages.g:1273:1: rule__CreateTableColumn__Group__0 : rule__CreateTableColumn__Group__0__Impl rule__CreateTableColumn__Group__1 ;
    public final void rule__CreateTableColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1277:1: ( rule__CreateTableColumn__Group__0__Impl rule__CreateTableColumn__Group__1 )
            // InternalLobsterLanguages.g:1278:2: rule__CreateTableColumn__Group__0__Impl rule__CreateTableColumn__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__CreateTableColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__Group__1();

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
    // $ANTLR end "rule__CreateTableColumn__Group__0"


    // $ANTLR start "rule__CreateTableColumn__Group__0__Impl"
    // InternalLobsterLanguages.g:1285:1: rule__CreateTableColumn__Group__0__Impl : ( 'Column Name:' ) ;
    public final void rule__CreateTableColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1289:1: ( ( 'Column Name:' ) )
            // InternalLobsterLanguages.g:1290:1: ( 'Column Name:' )
            {
            // InternalLobsterLanguages.g:1290:1: ( 'Column Name:' )
            // InternalLobsterLanguages.g:1291:2: 'Column Name:'
            {
             before(grammarAccess.getCreateTableColumnAccess().getColumnNameKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCreateTableColumnAccess().getColumnNameKeyword_0()); 

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
    // $ANTLR end "rule__CreateTableColumn__Group__0__Impl"


    // $ANTLR start "rule__CreateTableColumn__Group__1"
    // InternalLobsterLanguages.g:1300:1: rule__CreateTableColumn__Group__1 : rule__CreateTableColumn__Group__1__Impl rule__CreateTableColumn__Group__2 ;
    public final void rule__CreateTableColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1304:1: ( rule__CreateTableColumn__Group__1__Impl rule__CreateTableColumn__Group__2 )
            // InternalLobsterLanguages.g:1305:2: rule__CreateTableColumn__Group__1__Impl rule__CreateTableColumn__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__CreateTableColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__Group__2();

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
    // $ANTLR end "rule__CreateTableColumn__Group__1"


    // $ANTLR start "rule__CreateTableColumn__Group__1__Impl"
    // InternalLobsterLanguages.g:1312:1: rule__CreateTableColumn__Group__1__Impl : ( ( rule__CreateTableColumn__ColumnNameAssignment_1 ) ) ;
    public final void rule__CreateTableColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1316:1: ( ( ( rule__CreateTableColumn__ColumnNameAssignment_1 ) ) )
            // InternalLobsterLanguages.g:1317:1: ( ( rule__CreateTableColumn__ColumnNameAssignment_1 ) )
            {
            // InternalLobsterLanguages.g:1317:1: ( ( rule__CreateTableColumn__ColumnNameAssignment_1 ) )
            // InternalLobsterLanguages.g:1318:2: ( rule__CreateTableColumn__ColumnNameAssignment_1 )
            {
             before(grammarAccess.getCreateTableColumnAccess().getColumnNameAssignment_1()); 
            // InternalLobsterLanguages.g:1319:2: ( rule__CreateTableColumn__ColumnNameAssignment_1 )
            // InternalLobsterLanguages.g:1319:3: rule__CreateTableColumn__ColumnNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__ColumnNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableColumnAccess().getColumnNameAssignment_1()); 

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
    // $ANTLR end "rule__CreateTableColumn__Group__1__Impl"


    // $ANTLR start "rule__CreateTableColumn__Group__2"
    // InternalLobsterLanguages.g:1327:1: rule__CreateTableColumn__Group__2 : rule__CreateTableColumn__Group__2__Impl rule__CreateTableColumn__Group__3 ;
    public final void rule__CreateTableColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1331:1: ( rule__CreateTableColumn__Group__2__Impl rule__CreateTableColumn__Group__3 )
            // InternalLobsterLanguages.g:1332:2: rule__CreateTableColumn__Group__2__Impl rule__CreateTableColumn__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__CreateTableColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__Group__3();

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
    // $ANTLR end "rule__CreateTableColumn__Group__2"


    // $ANTLR start "rule__CreateTableColumn__Group__2__Impl"
    // InternalLobsterLanguages.g:1339:1: rule__CreateTableColumn__Group__2__Impl : ( 'is' ) ;
    public final void rule__CreateTableColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1343:1: ( ( 'is' ) )
            // InternalLobsterLanguages.g:1344:1: ( 'is' )
            {
            // InternalLobsterLanguages.g:1344:1: ( 'is' )
            // InternalLobsterLanguages.g:1345:2: 'is'
            {
             before(grammarAccess.getCreateTableColumnAccess().getIsKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCreateTableColumnAccess().getIsKeyword_2()); 

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
    // $ANTLR end "rule__CreateTableColumn__Group__2__Impl"


    // $ANTLR start "rule__CreateTableColumn__Group__3"
    // InternalLobsterLanguages.g:1354:1: rule__CreateTableColumn__Group__3 : rule__CreateTableColumn__Group__3__Impl rule__CreateTableColumn__Group__4 ;
    public final void rule__CreateTableColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1358:1: ( rule__CreateTableColumn__Group__3__Impl rule__CreateTableColumn__Group__4 )
            // InternalLobsterLanguages.g:1359:2: rule__CreateTableColumn__Group__3__Impl rule__CreateTableColumn__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__CreateTableColumn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__Group__4();

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
    // $ANTLR end "rule__CreateTableColumn__Group__3"


    // $ANTLR start "rule__CreateTableColumn__Group__3__Impl"
    // InternalLobsterLanguages.g:1366:1: rule__CreateTableColumn__Group__3__Impl : ( ( rule__CreateTableColumn__DatatypeAssignment_3 ) ) ;
    public final void rule__CreateTableColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1370:1: ( ( ( rule__CreateTableColumn__DatatypeAssignment_3 ) ) )
            // InternalLobsterLanguages.g:1371:1: ( ( rule__CreateTableColumn__DatatypeAssignment_3 ) )
            {
            // InternalLobsterLanguages.g:1371:1: ( ( rule__CreateTableColumn__DatatypeAssignment_3 ) )
            // InternalLobsterLanguages.g:1372:2: ( rule__CreateTableColumn__DatatypeAssignment_3 )
            {
             before(grammarAccess.getCreateTableColumnAccess().getDatatypeAssignment_3()); 
            // InternalLobsterLanguages.g:1373:2: ( rule__CreateTableColumn__DatatypeAssignment_3 )
            // InternalLobsterLanguages.g:1373:3: rule__CreateTableColumn__DatatypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__DatatypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableColumnAccess().getDatatypeAssignment_3()); 

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
    // $ANTLR end "rule__CreateTableColumn__Group__3__Impl"


    // $ANTLR start "rule__CreateTableColumn__Group__4"
    // InternalLobsterLanguages.g:1381:1: rule__CreateTableColumn__Group__4 : rule__CreateTableColumn__Group__4__Impl rule__CreateTableColumn__Group__5 ;
    public final void rule__CreateTableColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1385:1: ( rule__CreateTableColumn__Group__4__Impl rule__CreateTableColumn__Group__5 )
            // InternalLobsterLanguages.g:1386:2: rule__CreateTableColumn__Group__4__Impl rule__CreateTableColumn__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__CreateTableColumn__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__Group__5();

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
    // $ANTLR end "rule__CreateTableColumn__Group__4"


    // $ANTLR start "rule__CreateTableColumn__Group__4__Impl"
    // InternalLobsterLanguages.g:1393:1: rule__CreateTableColumn__Group__4__Impl : ( 'type' ) ;
    public final void rule__CreateTableColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1397:1: ( ( 'type' ) )
            // InternalLobsterLanguages.g:1398:1: ( 'type' )
            {
            // InternalLobsterLanguages.g:1398:1: ( 'type' )
            // InternalLobsterLanguages.g:1399:2: 'type'
            {
             before(grammarAccess.getCreateTableColumnAccess().getTypeKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCreateTableColumnAccess().getTypeKeyword_4()); 

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
    // $ANTLR end "rule__CreateTableColumn__Group__4__Impl"


    // $ANTLR start "rule__CreateTableColumn__Group__5"
    // InternalLobsterLanguages.g:1408:1: rule__CreateTableColumn__Group__5 : rule__CreateTableColumn__Group__5__Impl rule__CreateTableColumn__Group__6 ;
    public final void rule__CreateTableColumn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1412:1: ( rule__CreateTableColumn__Group__5__Impl rule__CreateTableColumn__Group__6 )
            // InternalLobsterLanguages.g:1413:2: rule__CreateTableColumn__Group__5__Impl rule__CreateTableColumn__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__CreateTableColumn__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__Group__6();

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
    // $ANTLR end "rule__CreateTableColumn__Group__5"


    // $ANTLR start "rule__CreateTableColumn__Group__5__Impl"
    // InternalLobsterLanguages.g:1420:1: rule__CreateTableColumn__Group__5__Impl : ( ( rule__CreateTableColumn__Group_5__0 )? ) ;
    public final void rule__CreateTableColumn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1424:1: ( ( ( rule__CreateTableColumn__Group_5__0 )? ) )
            // InternalLobsterLanguages.g:1425:1: ( ( rule__CreateTableColumn__Group_5__0 )? )
            {
            // InternalLobsterLanguages.g:1425:1: ( ( rule__CreateTableColumn__Group_5__0 )? )
            // InternalLobsterLanguages.g:1426:2: ( rule__CreateTableColumn__Group_5__0 )?
            {
             before(grammarAccess.getCreateTableColumnAccess().getGroup_5()); 
            // InternalLobsterLanguages.g:1427:2: ( rule__CreateTableColumn__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLobsterLanguages.g:1427:3: rule__CreateTableColumn__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CreateTableColumn__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCreateTableColumnAccess().getGroup_5()); 

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
    // $ANTLR end "rule__CreateTableColumn__Group__5__Impl"


    // $ANTLR start "rule__CreateTableColumn__Group__6"
    // InternalLobsterLanguages.g:1435:1: rule__CreateTableColumn__Group__6 : rule__CreateTableColumn__Group__6__Impl ;
    public final void rule__CreateTableColumn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1439:1: ( rule__CreateTableColumn__Group__6__Impl )
            // InternalLobsterLanguages.g:1440:2: rule__CreateTableColumn__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__Group__6__Impl();

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
    // $ANTLR end "rule__CreateTableColumn__Group__6"


    // $ANTLR start "rule__CreateTableColumn__Group__6__Impl"
    // InternalLobsterLanguages.g:1446:1: rule__CreateTableColumn__Group__6__Impl : ( ( ',' )? ) ;
    public final void rule__CreateTableColumn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1450:1: ( ( ( ',' )? ) )
            // InternalLobsterLanguages.g:1451:1: ( ( ',' )? )
            {
            // InternalLobsterLanguages.g:1451:1: ( ( ',' )? )
            // InternalLobsterLanguages.g:1452:2: ( ',' )?
            {
             before(grammarAccess.getCreateTableColumnAccess().getCommaKeyword_6()); 
            // InternalLobsterLanguages.g:1453:2: ( ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLobsterLanguages.g:1453:3: ','
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCreateTableColumnAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__CreateTableColumn__Group__6__Impl"


    // $ANTLR start "rule__CreateTableColumn__Group_5__0"
    // InternalLobsterLanguages.g:1462:1: rule__CreateTableColumn__Group_5__0 : rule__CreateTableColumn__Group_5__0__Impl rule__CreateTableColumn__Group_5__1 ;
    public final void rule__CreateTableColumn__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1466:1: ( rule__CreateTableColumn__Group_5__0__Impl rule__CreateTableColumn__Group_5__1 )
            // InternalLobsterLanguages.g:1467:2: rule__CreateTableColumn__Group_5__0__Impl rule__CreateTableColumn__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__CreateTableColumn__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__Group_5__1();

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
    // $ANTLR end "rule__CreateTableColumn__Group_5__0"


    // $ANTLR start "rule__CreateTableColumn__Group_5__0__Impl"
    // InternalLobsterLanguages.g:1474:1: rule__CreateTableColumn__Group_5__0__Impl : ( '(' ) ;
    public final void rule__CreateTableColumn__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1478:1: ( ( '(' ) )
            // InternalLobsterLanguages.g:1479:1: ( '(' )
            {
            // InternalLobsterLanguages.g:1479:1: ( '(' )
            // InternalLobsterLanguages.g:1480:2: '('
            {
             before(grammarAccess.getCreateTableColumnAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCreateTableColumnAccess().getLeftParenthesisKeyword_5_0()); 

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
    // $ANTLR end "rule__CreateTableColumn__Group_5__0__Impl"


    // $ANTLR start "rule__CreateTableColumn__Group_5__1"
    // InternalLobsterLanguages.g:1489:1: rule__CreateTableColumn__Group_5__1 : rule__CreateTableColumn__Group_5__1__Impl rule__CreateTableColumn__Group_5__2 ;
    public final void rule__CreateTableColumn__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1493:1: ( rule__CreateTableColumn__Group_5__1__Impl rule__CreateTableColumn__Group_5__2 )
            // InternalLobsterLanguages.g:1494:2: rule__CreateTableColumn__Group_5__1__Impl rule__CreateTableColumn__Group_5__2
            {
            pushFollow(FOLLOW_6);
            rule__CreateTableColumn__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__Group_5__2();

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
    // $ANTLR end "rule__CreateTableColumn__Group_5__1"


    // $ANTLR start "rule__CreateTableColumn__Group_5__1__Impl"
    // InternalLobsterLanguages.g:1501:1: rule__CreateTableColumn__Group_5__1__Impl : ( 'max' ) ;
    public final void rule__CreateTableColumn__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1505:1: ( ( 'max' ) )
            // InternalLobsterLanguages.g:1506:1: ( 'max' )
            {
            // InternalLobsterLanguages.g:1506:1: ( 'max' )
            // InternalLobsterLanguages.g:1507:2: 'max'
            {
             before(grammarAccess.getCreateTableColumnAccess().getMaxKeyword_5_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCreateTableColumnAccess().getMaxKeyword_5_1()); 

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
    // $ANTLR end "rule__CreateTableColumn__Group_5__1__Impl"


    // $ANTLR start "rule__CreateTableColumn__Group_5__2"
    // InternalLobsterLanguages.g:1516:1: rule__CreateTableColumn__Group_5__2 : rule__CreateTableColumn__Group_5__2__Impl rule__CreateTableColumn__Group_5__3 ;
    public final void rule__CreateTableColumn__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1520:1: ( rule__CreateTableColumn__Group_5__2__Impl rule__CreateTableColumn__Group_5__3 )
            // InternalLobsterLanguages.g:1521:2: rule__CreateTableColumn__Group_5__2__Impl rule__CreateTableColumn__Group_5__3
            {
            pushFollow(FOLLOW_22);
            rule__CreateTableColumn__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__Group_5__3();

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
    // $ANTLR end "rule__CreateTableColumn__Group_5__2"


    // $ANTLR start "rule__CreateTableColumn__Group_5__2__Impl"
    // InternalLobsterLanguages.g:1528:1: rule__CreateTableColumn__Group_5__2__Impl : ( ( rule__CreateTableColumn__SizeAssignment_5_2 ) ) ;
    public final void rule__CreateTableColumn__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1532:1: ( ( ( rule__CreateTableColumn__SizeAssignment_5_2 ) ) )
            // InternalLobsterLanguages.g:1533:1: ( ( rule__CreateTableColumn__SizeAssignment_5_2 ) )
            {
            // InternalLobsterLanguages.g:1533:1: ( ( rule__CreateTableColumn__SizeAssignment_5_2 ) )
            // InternalLobsterLanguages.g:1534:2: ( rule__CreateTableColumn__SizeAssignment_5_2 )
            {
             before(grammarAccess.getCreateTableColumnAccess().getSizeAssignment_5_2()); 
            // InternalLobsterLanguages.g:1535:2: ( rule__CreateTableColumn__SizeAssignment_5_2 )
            // InternalLobsterLanguages.g:1535:3: rule__CreateTableColumn__SizeAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__SizeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableColumnAccess().getSizeAssignment_5_2()); 

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
    // $ANTLR end "rule__CreateTableColumn__Group_5__2__Impl"


    // $ANTLR start "rule__CreateTableColumn__Group_5__3"
    // InternalLobsterLanguages.g:1543:1: rule__CreateTableColumn__Group_5__3 : rule__CreateTableColumn__Group_5__3__Impl rule__CreateTableColumn__Group_5__4 ;
    public final void rule__CreateTableColumn__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1547:1: ( rule__CreateTableColumn__Group_5__3__Impl rule__CreateTableColumn__Group_5__4 )
            // InternalLobsterLanguages.g:1548:2: rule__CreateTableColumn__Group_5__3__Impl rule__CreateTableColumn__Group_5__4
            {
            pushFollow(FOLLOW_23);
            rule__CreateTableColumn__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__Group_5__4();

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
    // $ANTLR end "rule__CreateTableColumn__Group_5__3"


    // $ANTLR start "rule__CreateTableColumn__Group_5__3__Impl"
    // InternalLobsterLanguages.g:1555:1: rule__CreateTableColumn__Group_5__3__Impl : ( 'characters' ) ;
    public final void rule__CreateTableColumn__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1559:1: ( ( 'characters' ) )
            // InternalLobsterLanguages.g:1560:1: ( 'characters' )
            {
            // InternalLobsterLanguages.g:1560:1: ( 'characters' )
            // InternalLobsterLanguages.g:1561:2: 'characters'
            {
             before(grammarAccess.getCreateTableColumnAccess().getCharactersKeyword_5_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCreateTableColumnAccess().getCharactersKeyword_5_3()); 

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
    // $ANTLR end "rule__CreateTableColumn__Group_5__3__Impl"


    // $ANTLR start "rule__CreateTableColumn__Group_5__4"
    // InternalLobsterLanguages.g:1570:1: rule__CreateTableColumn__Group_5__4 : rule__CreateTableColumn__Group_5__4__Impl ;
    public final void rule__CreateTableColumn__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1574:1: ( rule__CreateTableColumn__Group_5__4__Impl )
            // InternalLobsterLanguages.g:1575:2: rule__CreateTableColumn__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableColumn__Group_5__4__Impl();

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
    // $ANTLR end "rule__CreateTableColumn__Group_5__4"


    // $ANTLR start "rule__CreateTableColumn__Group_5__4__Impl"
    // InternalLobsterLanguages.g:1581:1: rule__CreateTableColumn__Group_5__4__Impl : ( ')' ) ;
    public final void rule__CreateTableColumn__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1585:1: ( ( ')' ) )
            // InternalLobsterLanguages.g:1586:1: ( ')' )
            {
            // InternalLobsterLanguages.g:1586:1: ( ')' )
            // InternalLobsterLanguages.g:1587:2: ')'
            {
             before(grammarAccess.getCreateTableColumnAccess().getRightParenthesisKeyword_5_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCreateTableColumnAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__CreateTableColumn__Group_5__4__Impl"


    // $ANTLR start "rule__InsertStatement__Group__0"
    // InternalLobsterLanguages.g:1597:1: rule__InsertStatement__Group__0 : rule__InsertStatement__Group__0__Impl rule__InsertStatement__Group__1 ;
    public final void rule__InsertStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1601:1: ( rule__InsertStatement__Group__0__Impl rule__InsertStatement__Group__1 )
            // InternalLobsterLanguages.g:1602:2: rule__InsertStatement__Group__0__Impl rule__InsertStatement__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__InsertStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__1();

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
    // $ANTLR end "rule__InsertStatement__Group__0"


    // $ANTLR start "rule__InsertStatement__Group__0__Impl"
    // InternalLobsterLanguages.g:1609:1: rule__InsertStatement__Group__0__Impl : ( 'Insert' ) ;
    public final void rule__InsertStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1613:1: ( ( 'Insert' ) )
            // InternalLobsterLanguages.g:1614:1: ( 'Insert' )
            {
            // InternalLobsterLanguages.g:1614:1: ( 'Insert' )
            // InternalLobsterLanguages.g:1615:2: 'Insert'
            {
             before(grammarAccess.getInsertStatementAccess().getInsertKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getInsertKeyword_0()); 

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
    // $ANTLR end "rule__InsertStatement__Group__0__Impl"


    // $ANTLR start "rule__InsertStatement__Group__1"
    // InternalLobsterLanguages.g:1624:1: rule__InsertStatement__Group__1 : rule__InsertStatement__Group__1__Impl rule__InsertStatement__Group__2 ;
    public final void rule__InsertStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1628:1: ( rule__InsertStatement__Group__1__Impl rule__InsertStatement__Group__2 )
            // InternalLobsterLanguages.g:1629:2: rule__InsertStatement__Group__1__Impl rule__InsertStatement__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__InsertStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__2();

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
    // $ANTLR end "rule__InsertStatement__Group__1"


    // $ANTLR start "rule__InsertStatement__Group__1__Impl"
    // InternalLobsterLanguages.g:1636:1: rule__InsertStatement__Group__1__Impl : ( 'value' ) ;
    public final void rule__InsertStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1640:1: ( ( 'value' ) )
            // InternalLobsterLanguages.g:1641:1: ( 'value' )
            {
            // InternalLobsterLanguages.g:1641:1: ( 'value' )
            // InternalLobsterLanguages.g:1642:2: 'value'
            {
             before(grammarAccess.getInsertStatementAccess().getValueKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getValueKeyword_1()); 

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
    // $ANTLR end "rule__InsertStatement__Group__1__Impl"


    // $ANTLR start "rule__InsertStatement__Group__2"
    // InternalLobsterLanguages.g:1651:1: rule__InsertStatement__Group__2 : rule__InsertStatement__Group__2__Impl rule__InsertStatement__Group__3 ;
    public final void rule__InsertStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1655:1: ( rule__InsertStatement__Group__2__Impl rule__InsertStatement__Group__3 )
            // InternalLobsterLanguages.g:1656:2: rule__InsertStatement__Group__2__Impl rule__InsertStatement__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__InsertStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__3();

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
    // $ANTLR end "rule__InsertStatement__Group__2"


    // $ANTLR start "rule__InsertStatement__Group__2__Impl"
    // InternalLobsterLanguages.g:1663:1: rule__InsertStatement__Group__2__Impl : ( '{' ) ;
    public final void rule__InsertStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1667:1: ( ( '{' ) )
            // InternalLobsterLanguages.g:1668:1: ( '{' )
            {
            // InternalLobsterLanguages.g:1668:1: ( '{' )
            // InternalLobsterLanguages.g:1669:2: '{'
            {
             before(grammarAccess.getInsertStatementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__InsertStatement__Group__2__Impl"


    // $ANTLR start "rule__InsertStatement__Group__3"
    // InternalLobsterLanguages.g:1678:1: rule__InsertStatement__Group__3 : rule__InsertStatement__Group__3__Impl rule__InsertStatement__Group__4 ;
    public final void rule__InsertStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1682:1: ( rule__InsertStatement__Group__3__Impl rule__InsertStatement__Group__4 )
            // InternalLobsterLanguages.g:1683:2: rule__InsertStatement__Group__3__Impl rule__InsertStatement__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__InsertStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__4();

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
    // $ANTLR end "rule__InsertStatement__Group__3"


    // $ANTLR start "rule__InsertStatement__Group__3__Impl"
    // InternalLobsterLanguages.g:1690:1: rule__InsertStatement__Group__3__Impl : ( ( rule__InsertStatement__Group_3__0 )* ) ;
    public final void rule__InsertStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1694:1: ( ( ( rule__InsertStatement__Group_3__0 )* ) )
            // InternalLobsterLanguages.g:1695:1: ( ( rule__InsertStatement__Group_3__0 )* )
            {
            // InternalLobsterLanguages.g:1695:1: ( ( rule__InsertStatement__Group_3__0 )* )
            // InternalLobsterLanguages.g:1696:2: ( rule__InsertStatement__Group_3__0 )*
            {
             before(grammarAccess.getInsertStatementAccess().getGroup_3()); 
            // InternalLobsterLanguages.g:1697:2: ( rule__InsertStatement__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLobsterLanguages.g:1697:3: rule__InsertStatement__Group_3__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__InsertStatement__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getInsertStatementAccess().getGroup_3()); 

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
    // $ANTLR end "rule__InsertStatement__Group__3__Impl"


    // $ANTLR start "rule__InsertStatement__Group__4"
    // InternalLobsterLanguages.g:1705:1: rule__InsertStatement__Group__4 : rule__InsertStatement__Group__4__Impl rule__InsertStatement__Group__5 ;
    public final void rule__InsertStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1709:1: ( rule__InsertStatement__Group__4__Impl rule__InsertStatement__Group__5 )
            // InternalLobsterLanguages.g:1710:2: rule__InsertStatement__Group__4__Impl rule__InsertStatement__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__InsertStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__5();

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
    // $ANTLR end "rule__InsertStatement__Group__4"


    // $ANTLR start "rule__InsertStatement__Group__4__Impl"
    // InternalLobsterLanguages.g:1717:1: rule__InsertStatement__Group__4__Impl : ( '}' ) ;
    public final void rule__InsertStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1721:1: ( ( '}' ) )
            // InternalLobsterLanguages.g:1722:1: ( '}' )
            {
            // InternalLobsterLanguages.g:1722:1: ( '}' )
            // InternalLobsterLanguages.g:1723:2: '}'
            {
             before(grammarAccess.getInsertStatementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__InsertStatement__Group__4__Impl"


    // $ANTLR start "rule__InsertStatement__Group__5"
    // InternalLobsterLanguages.g:1732:1: rule__InsertStatement__Group__5 : rule__InsertStatement__Group__5__Impl rule__InsertStatement__Group__6 ;
    public final void rule__InsertStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1736:1: ( rule__InsertStatement__Group__5__Impl rule__InsertStatement__Group__6 )
            // InternalLobsterLanguages.g:1737:2: rule__InsertStatement__Group__5__Impl rule__InsertStatement__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__InsertStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__6();

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
    // $ANTLR end "rule__InsertStatement__Group__5"


    // $ANTLR start "rule__InsertStatement__Group__5__Impl"
    // InternalLobsterLanguages.g:1744:1: rule__InsertStatement__Group__5__Impl : ( 'into' ) ;
    public final void rule__InsertStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1748:1: ( ( 'into' ) )
            // InternalLobsterLanguages.g:1749:1: ( 'into' )
            {
            // InternalLobsterLanguages.g:1749:1: ( 'into' )
            // InternalLobsterLanguages.g:1750:2: 'into'
            {
             before(grammarAccess.getInsertStatementAccess().getIntoKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getIntoKeyword_5()); 

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
    // $ANTLR end "rule__InsertStatement__Group__5__Impl"


    // $ANTLR start "rule__InsertStatement__Group__6"
    // InternalLobsterLanguages.g:1759:1: rule__InsertStatement__Group__6 : rule__InsertStatement__Group__6__Impl rule__InsertStatement__Group__7 ;
    public final void rule__InsertStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1763:1: ( rule__InsertStatement__Group__6__Impl rule__InsertStatement__Group__7 )
            // InternalLobsterLanguages.g:1764:2: rule__InsertStatement__Group__6__Impl rule__InsertStatement__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__InsertStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__7();

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
    // $ANTLR end "rule__InsertStatement__Group__6"


    // $ANTLR start "rule__InsertStatement__Group__6__Impl"
    // InternalLobsterLanguages.g:1771:1: rule__InsertStatement__Group__6__Impl : ( ( rule__InsertStatement__TbnameAssignment_6 ) ) ;
    public final void rule__InsertStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1775:1: ( ( ( rule__InsertStatement__TbnameAssignment_6 ) ) )
            // InternalLobsterLanguages.g:1776:1: ( ( rule__InsertStatement__TbnameAssignment_6 ) )
            {
            // InternalLobsterLanguages.g:1776:1: ( ( rule__InsertStatement__TbnameAssignment_6 ) )
            // InternalLobsterLanguages.g:1777:2: ( rule__InsertStatement__TbnameAssignment_6 )
            {
             before(grammarAccess.getInsertStatementAccess().getTbnameAssignment_6()); 
            // InternalLobsterLanguages.g:1778:2: ( rule__InsertStatement__TbnameAssignment_6 )
            // InternalLobsterLanguages.g:1778:3: rule__InsertStatement__TbnameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__TbnameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInsertStatementAccess().getTbnameAssignment_6()); 

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
    // $ANTLR end "rule__InsertStatement__Group__6__Impl"


    // $ANTLR start "rule__InsertStatement__Group__7"
    // InternalLobsterLanguages.g:1786:1: rule__InsertStatement__Group__7 : rule__InsertStatement__Group__7__Impl ;
    public final void rule__InsertStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1790:1: ( rule__InsertStatement__Group__7__Impl )
            // InternalLobsterLanguages.g:1791:2: rule__InsertStatement__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__7__Impl();

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
    // $ANTLR end "rule__InsertStatement__Group__7"


    // $ANTLR start "rule__InsertStatement__Group__7__Impl"
    // InternalLobsterLanguages.g:1797:1: rule__InsertStatement__Group__7__Impl : ( 'table' ) ;
    public final void rule__InsertStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1801:1: ( ( 'table' ) )
            // InternalLobsterLanguages.g:1802:1: ( 'table' )
            {
            // InternalLobsterLanguages.g:1802:1: ( 'table' )
            // InternalLobsterLanguages.g:1803:2: 'table'
            {
             before(grammarAccess.getInsertStatementAccess().getTableKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getTableKeyword_7()); 

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
    // $ANTLR end "rule__InsertStatement__Group__7__Impl"


    // $ANTLR start "rule__InsertStatement__Group_3__0"
    // InternalLobsterLanguages.g:1813:1: rule__InsertStatement__Group_3__0 : rule__InsertStatement__Group_3__0__Impl rule__InsertStatement__Group_3__1 ;
    public final void rule__InsertStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1817:1: ( rule__InsertStatement__Group_3__0__Impl rule__InsertStatement__Group_3__1 )
            // InternalLobsterLanguages.g:1818:2: rule__InsertStatement__Group_3__0__Impl rule__InsertStatement__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__InsertStatement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group_3__1();

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
    // $ANTLR end "rule__InsertStatement__Group_3__0"


    // $ANTLR start "rule__InsertStatement__Group_3__0__Impl"
    // InternalLobsterLanguages.g:1825:1: rule__InsertStatement__Group_3__0__Impl : ( 'Column Name:' ) ;
    public final void rule__InsertStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1829:1: ( ( 'Column Name:' ) )
            // InternalLobsterLanguages.g:1830:1: ( 'Column Name:' )
            {
            // InternalLobsterLanguages.g:1830:1: ( 'Column Name:' )
            // InternalLobsterLanguages.g:1831:2: 'Column Name:'
            {
             before(grammarAccess.getInsertStatementAccess().getColumnNameKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getColumnNameKeyword_3_0()); 

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
    // $ANTLR end "rule__InsertStatement__Group_3__0__Impl"


    // $ANTLR start "rule__InsertStatement__Group_3__1"
    // InternalLobsterLanguages.g:1840:1: rule__InsertStatement__Group_3__1 : rule__InsertStatement__Group_3__1__Impl rule__InsertStatement__Group_3__2 ;
    public final void rule__InsertStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1844:1: ( rule__InsertStatement__Group_3__1__Impl rule__InsertStatement__Group_3__2 )
            // InternalLobsterLanguages.g:1845:2: rule__InsertStatement__Group_3__1__Impl rule__InsertStatement__Group_3__2
            {
            pushFollow(FOLLOW_17);
            rule__InsertStatement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group_3__2();

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
    // $ANTLR end "rule__InsertStatement__Group_3__1"


    // $ANTLR start "rule__InsertStatement__Group_3__1__Impl"
    // InternalLobsterLanguages.g:1852:1: rule__InsertStatement__Group_3__1__Impl : ( ( rule__InsertStatement__ColumnAssignment_3_1 ) ) ;
    public final void rule__InsertStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1856:1: ( ( ( rule__InsertStatement__ColumnAssignment_3_1 ) ) )
            // InternalLobsterLanguages.g:1857:1: ( ( rule__InsertStatement__ColumnAssignment_3_1 ) )
            {
            // InternalLobsterLanguages.g:1857:1: ( ( rule__InsertStatement__ColumnAssignment_3_1 ) )
            // InternalLobsterLanguages.g:1858:2: ( rule__InsertStatement__ColumnAssignment_3_1 )
            {
             before(grammarAccess.getInsertStatementAccess().getColumnAssignment_3_1()); 
            // InternalLobsterLanguages.g:1859:2: ( rule__InsertStatement__ColumnAssignment_3_1 )
            // InternalLobsterLanguages.g:1859:3: rule__InsertStatement__ColumnAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__ColumnAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertStatementAccess().getColumnAssignment_3_1()); 

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
    // $ANTLR end "rule__InsertStatement__Group_3__1__Impl"


    // $ANTLR start "rule__InsertStatement__Group_3__2"
    // InternalLobsterLanguages.g:1867:1: rule__InsertStatement__Group_3__2 : rule__InsertStatement__Group_3__2__Impl rule__InsertStatement__Group_3__3 ;
    public final void rule__InsertStatement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1871:1: ( rule__InsertStatement__Group_3__2__Impl rule__InsertStatement__Group_3__3 )
            // InternalLobsterLanguages.g:1872:2: rule__InsertStatement__Group_3__2__Impl rule__InsertStatement__Group_3__3
            {
            pushFollow(FOLLOW_10);
            rule__InsertStatement__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group_3__3();

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
    // $ANTLR end "rule__InsertStatement__Group_3__2"


    // $ANTLR start "rule__InsertStatement__Group_3__2__Impl"
    // InternalLobsterLanguages.g:1879:1: rule__InsertStatement__Group_3__2__Impl : ( 'is' ) ;
    public final void rule__InsertStatement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1883:1: ( ( 'is' ) )
            // InternalLobsterLanguages.g:1884:1: ( 'is' )
            {
            // InternalLobsterLanguages.g:1884:1: ( 'is' )
            // InternalLobsterLanguages.g:1885:2: 'is'
            {
             before(grammarAccess.getInsertStatementAccess().getIsKeyword_3_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getIsKeyword_3_2()); 

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
    // $ANTLR end "rule__InsertStatement__Group_3__2__Impl"


    // $ANTLR start "rule__InsertStatement__Group_3__3"
    // InternalLobsterLanguages.g:1894:1: rule__InsertStatement__Group_3__3 : rule__InsertStatement__Group_3__3__Impl rule__InsertStatement__Group_3__4 ;
    public final void rule__InsertStatement__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1898:1: ( rule__InsertStatement__Group_3__3__Impl rule__InsertStatement__Group_3__4 )
            // InternalLobsterLanguages.g:1899:2: rule__InsertStatement__Group_3__3__Impl rule__InsertStatement__Group_3__4
            {
            pushFollow(FOLLOW_26);
            rule__InsertStatement__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group_3__4();

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
    // $ANTLR end "rule__InsertStatement__Group_3__3"


    // $ANTLR start "rule__InsertStatement__Group_3__3__Impl"
    // InternalLobsterLanguages.g:1906:1: rule__InsertStatement__Group_3__3__Impl : ( ( rule__InsertStatement__ValueAssignment_3_3 ) ) ;
    public final void rule__InsertStatement__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1910:1: ( ( ( rule__InsertStatement__ValueAssignment_3_3 ) ) )
            // InternalLobsterLanguages.g:1911:1: ( ( rule__InsertStatement__ValueAssignment_3_3 ) )
            {
            // InternalLobsterLanguages.g:1911:1: ( ( rule__InsertStatement__ValueAssignment_3_3 ) )
            // InternalLobsterLanguages.g:1912:2: ( rule__InsertStatement__ValueAssignment_3_3 )
            {
             before(grammarAccess.getInsertStatementAccess().getValueAssignment_3_3()); 
            // InternalLobsterLanguages.g:1913:2: ( rule__InsertStatement__ValueAssignment_3_3 )
            // InternalLobsterLanguages.g:1913:3: rule__InsertStatement__ValueAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__ValueAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertStatementAccess().getValueAssignment_3_3()); 

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
    // $ANTLR end "rule__InsertStatement__Group_3__3__Impl"


    // $ANTLR start "rule__InsertStatement__Group_3__4"
    // InternalLobsterLanguages.g:1921:1: rule__InsertStatement__Group_3__4 : rule__InsertStatement__Group_3__4__Impl ;
    public final void rule__InsertStatement__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1925:1: ( rule__InsertStatement__Group_3__4__Impl )
            // InternalLobsterLanguages.g:1926:2: rule__InsertStatement__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group_3__4__Impl();

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
    // $ANTLR end "rule__InsertStatement__Group_3__4"


    // $ANTLR start "rule__InsertStatement__Group_3__4__Impl"
    // InternalLobsterLanguages.g:1932:1: rule__InsertStatement__Group_3__4__Impl : ( ( ',' )? ) ;
    public final void rule__InsertStatement__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1936:1: ( ( ( ',' )? ) )
            // InternalLobsterLanguages.g:1937:1: ( ( ',' )? )
            {
            // InternalLobsterLanguages.g:1937:1: ( ( ',' )? )
            // InternalLobsterLanguages.g:1938:2: ( ',' )?
            {
             before(grammarAccess.getInsertStatementAccess().getCommaKeyword_3_4()); 
            // InternalLobsterLanguages.g:1939:2: ( ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLobsterLanguages.g:1939:3: ','
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getInsertStatementAccess().getCommaKeyword_3_4()); 

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
    // $ANTLR end "rule__InsertStatement__Group_3__4__Impl"


    // $ANTLR start "rule__DeleteDataStatement__Group__0"
    // InternalLobsterLanguages.g:1948:1: rule__DeleteDataStatement__Group__0 : rule__DeleteDataStatement__Group__0__Impl rule__DeleteDataStatement__Group__1 ;
    public final void rule__DeleteDataStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1952:1: ( rule__DeleteDataStatement__Group__0__Impl rule__DeleteDataStatement__Group__1 )
            // InternalLobsterLanguages.g:1953:2: rule__DeleteDataStatement__Group__0__Impl rule__DeleteDataStatement__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__DeleteDataStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteDataStatement__Group__1();

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
    // $ANTLR end "rule__DeleteDataStatement__Group__0"


    // $ANTLR start "rule__DeleteDataStatement__Group__0__Impl"
    // InternalLobsterLanguages.g:1960:1: rule__DeleteDataStatement__Group__0__Impl : ( 'Delete' ) ;
    public final void rule__DeleteDataStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1964:1: ( ( 'Delete' ) )
            // InternalLobsterLanguages.g:1965:1: ( 'Delete' )
            {
            // InternalLobsterLanguages.g:1965:1: ( 'Delete' )
            // InternalLobsterLanguages.g:1966:2: 'Delete'
            {
             before(grammarAccess.getDeleteDataStatementAccess().getDeleteKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDeleteDataStatementAccess().getDeleteKeyword_0()); 

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
    // $ANTLR end "rule__DeleteDataStatement__Group__0__Impl"


    // $ANTLR start "rule__DeleteDataStatement__Group__1"
    // InternalLobsterLanguages.g:1975:1: rule__DeleteDataStatement__Group__1 : rule__DeleteDataStatement__Group__1__Impl rule__DeleteDataStatement__Group__2 ;
    public final void rule__DeleteDataStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1979:1: ( rule__DeleteDataStatement__Group__1__Impl rule__DeleteDataStatement__Group__2 )
            // InternalLobsterLanguages.g:1980:2: rule__DeleteDataStatement__Group__1__Impl rule__DeleteDataStatement__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__DeleteDataStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteDataStatement__Group__2();

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
    // $ANTLR end "rule__DeleteDataStatement__Group__1"


    // $ANTLR start "rule__DeleteDataStatement__Group__1__Impl"
    // InternalLobsterLanguages.g:1987:1: rule__DeleteDataStatement__Group__1__Impl : ( '{' ) ;
    public final void rule__DeleteDataStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:1991:1: ( ( '{' ) )
            // InternalLobsterLanguages.g:1992:1: ( '{' )
            {
            // InternalLobsterLanguages.g:1992:1: ( '{' )
            // InternalLobsterLanguages.g:1993:2: '{'
            {
             before(grammarAccess.getDeleteDataStatementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDeleteDataStatementAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__DeleteDataStatement__Group__1__Impl"


    // $ANTLR start "rule__DeleteDataStatement__Group__2"
    // InternalLobsterLanguages.g:2002:1: rule__DeleteDataStatement__Group__2 : rule__DeleteDataStatement__Group__2__Impl rule__DeleteDataStatement__Group__3 ;
    public final void rule__DeleteDataStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2006:1: ( rule__DeleteDataStatement__Group__2__Impl rule__DeleteDataStatement__Group__3 )
            // InternalLobsterLanguages.g:2007:2: rule__DeleteDataStatement__Group__2__Impl rule__DeleteDataStatement__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__DeleteDataStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteDataStatement__Group__3();

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
    // $ANTLR end "rule__DeleteDataStatement__Group__2"


    // $ANTLR start "rule__DeleteDataStatement__Group__2__Impl"
    // InternalLobsterLanguages.g:2014:1: rule__DeleteDataStatement__Group__2__Impl : ( ( rule__DeleteDataStatement__ConditionAssignment_2 )* ) ;
    public final void rule__DeleteDataStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2018:1: ( ( ( rule__DeleteDataStatement__ConditionAssignment_2 )* ) )
            // InternalLobsterLanguages.g:2019:1: ( ( rule__DeleteDataStatement__ConditionAssignment_2 )* )
            {
            // InternalLobsterLanguages.g:2019:1: ( ( rule__DeleteDataStatement__ConditionAssignment_2 )* )
            // InternalLobsterLanguages.g:2020:2: ( rule__DeleteDataStatement__ConditionAssignment_2 )*
            {
             before(grammarAccess.getDeleteDataStatementAccess().getConditionAssignment_2()); 
            // InternalLobsterLanguages.g:2021:2: ( rule__DeleteDataStatement__ConditionAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLobsterLanguages.g:2021:3: rule__DeleteDataStatement__ConditionAssignment_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__DeleteDataStatement__ConditionAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDeleteDataStatementAccess().getConditionAssignment_2()); 

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
    // $ANTLR end "rule__DeleteDataStatement__Group__2__Impl"


    // $ANTLR start "rule__DeleteDataStatement__Group__3"
    // InternalLobsterLanguages.g:2029:1: rule__DeleteDataStatement__Group__3 : rule__DeleteDataStatement__Group__3__Impl rule__DeleteDataStatement__Group__4 ;
    public final void rule__DeleteDataStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2033:1: ( rule__DeleteDataStatement__Group__3__Impl rule__DeleteDataStatement__Group__4 )
            // InternalLobsterLanguages.g:2034:2: rule__DeleteDataStatement__Group__3__Impl rule__DeleteDataStatement__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__DeleteDataStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteDataStatement__Group__4();

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
    // $ANTLR end "rule__DeleteDataStatement__Group__3"


    // $ANTLR start "rule__DeleteDataStatement__Group__3__Impl"
    // InternalLobsterLanguages.g:2041:1: rule__DeleteDataStatement__Group__3__Impl : ( '}' ) ;
    public final void rule__DeleteDataStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2045:1: ( ( '}' ) )
            // InternalLobsterLanguages.g:2046:1: ( '}' )
            {
            // InternalLobsterLanguages.g:2046:1: ( '}' )
            // InternalLobsterLanguages.g:2047:2: '}'
            {
             before(grammarAccess.getDeleteDataStatementAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDeleteDataStatementAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__DeleteDataStatement__Group__3__Impl"


    // $ANTLR start "rule__DeleteDataStatement__Group__4"
    // InternalLobsterLanguages.g:2056:1: rule__DeleteDataStatement__Group__4 : rule__DeleteDataStatement__Group__4__Impl rule__DeleteDataStatement__Group__5 ;
    public final void rule__DeleteDataStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2060:1: ( rule__DeleteDataStatement__Group__4__Impl rule__DeleteDataStatement__Group__5 )
            // InternalLobsterLanguages.g:2061:2: rule__DeleteDataStatement__Group__4__Impl rule__DeleteDataStatement__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__DeleteDataStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteDataStatement__Group__5();

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
    // $ANTLR end "rule__DeleteDataStatement__Group__4"


    // $ANTLR start "rule__DeleteDataStatement__Group__4__Impl"
    // InternalLobsterLanguages.g:2068:1: rule__DeleteDataStatement__Group__4__Impl : ( 'from' ) ;
    public final void rule__DeleteDataStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2072:1: ( ( 'from' ) )
            // InternalLobsterLanguages.g:2073:1: ( 'from' )
            {
            // InternalLobsterLanguages.g:2073:1: ( 'from' )
            // InternalLobsterLanguages.g:2074:2: 'from'
            {
             before(grammarAccess.getDeleteDataStatementAccess().getFromKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDeleteDataStatementAccess().getFromKeyword_4()); 

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
    // $ANTLR end "rule__DeleteDataStatement__Group__4__Impl"


    // $ANTLR start "rule__DeleteDataStatement__Group__5"
    // InternalLobsterLanguages.g:2083:1: rule__DeleteDataStatement__Group__5 : rule__DeleteDataStatement__Group__5__Impl rule__DeleteDataStatement__Group__6 ;
    public final void rule__DeleteDataStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2087:1: ( rule__DeleteDataStatement__Group__5__Impl rule__DeleteDataStatement__Group__6 )
            // InternalLobsterLanguages.g:2088:2: rule__DeleteDataStatement__Group__5__Impl rule__DeleteDataStatement__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__DeleteDataStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteDataStatement__Group__6();

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
    // $ANTLR end "rule__DeleteDataStatement__Group__5"


    // $ANTLR start "rule__DeleteDataStatement__Group__5__Impl"
    // InternalLobsterLanguages.g:2095:1: rule__DeleteDataStatement__Group__5__Impl : ( 'Table' ) ;
    public final void rule__DeleteDataStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2099:1: ( ( 'Table' ) )
            // InternalLobsterLanguages.g:2100:1: ( 'Table' )
            {
            // InternalLobsterLanguages.g:2100:1: ( 'Table' )
            // InternalLobsterLanguages.g:2101:2: 'Table'
            {
             before(grammarAccess.getDeleteDataStatementAccess().getTableKeyword_5()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDeleteDataStatementAccess().getTableKeyword_5()); 

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
    // $ANTLR end "rule__DeleteDataStatement__Group__5__Impl"


    // $ANTLR start "rule__DeleteDataStatement__Group__6"
    // InternalLobsterLanguages.g:2110:1: rule__DeleteDataStatement__Group__6 : rule__DeleteDataStatement__Group__6__Impl ;
    public final void rule__DeleteDataStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2114:1: ( rule__DeleteDataStatement__Group__6__Impl )
            // InternalLobsterLanguages.g:2115:2: rule__DeleteDataStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteDataStatement__Group__6__Impl();

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
    // $ANTLR end "rule__DeleteDataStatement__Group__6"


    // $ANTLR start "rule__DeleteDataStatement__Group__6__Impl"
    // InternalLobsterLanguages.g:2121:1: rule__DeleteDataStatement__Group__6__Impl : ( ( rule__DeleteDataStatement__TbnameAssignment_6 ) ) ;
    public final void rule__DeleteDataStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2125:1: ( ( ( rule__DeleteDataStatement__TbnameAssignment_6 ) ) )
            // InternalLobsterLanguages.g:2126:1: ( ( rule__DeleteDataStatement__TbnameAssignment_6 ) )
            {
            // InternalLobsterLanguages.g:2126:1: ( ( rule__DeleteDataStatement__TbnameAssignment_6 ) )
            // InternalLobsterLanguages.g:2127:2: ( rule__DeleteDataStatement__TbnameAssignment_6 )
            {
             before(grammarAccess.getDeleteDataStatementAccess().getTbnameAssignment_6()); 
            // InternalLobsterLanguages.g:2128:2: ( rule__DeleteDataStatement__TbnameAssignment_6 )
            // InternalLobsterLanguages.g:2128:3: rule__DeleteDataStatement__TbnameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DeleteDataStatement__TbnameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDeleteDataStatementAccess().getTbnameAssignment_6()); 

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
    // $ANTLR end "rule__DeleteDataStatement__Group__6__Impl"


    // $ANTLR start "rule__MoreConditionStatement__Group__0"
    // InternalLobsterLanguages.g:2137:1: rule__MoreConditionStatement__Group__0 : rule__MoreConditionStatement__Group__0__Impl rule__MoreConditionStatement__Group__1 ;
    public final void rule__MoreConditionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2141:1: ( rule__MoreConditionStatement__Group__0__Impl rule__MoreConditionStatement__Group__1 )
            // InternalLobsterLanguages.g:2142:2: rule__MoreConditionStatement__Group__0__Impl rule__MoreConditionStatement__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__MoreConditionStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoreConditionStatement__Group__1();

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
    // $ANTLR end "rule__MoreConditionStatement__Group__0"


    // $ANTLR start "rule__MoreConditionStatement__Group__0__Impl"
    // InternalLobsterLanguages.g:2149:1: rule__MoreConditionStatement__Group__0__Impl : ( 'Column Name:' ) ;
    public final void rule__MoreConditionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2153:1: ( ( 'Column Name:' ) )
            // InternalLobsterLanguages.g:2154:1: ( 'Column Name:' )
            {
            // InternalLobsterLanguages.g:2154:1: ( 'Column Name:' )
            // InternalLobsterLanguages.g:2155:2: 'Column Name:'
            {
             before(grammarAccess.getMoreConditionStatementAccess().getColumnNameKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMoreConditionStatementAccess().getColumnNameKeyword_0()); 

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
    // $ANTLR end "rule__MoreConditionStatement__Group__0__Impl"


    // $ANTLR start "rule__MoreConditionStatement__Group__1"
    // InternalLobsterLanguages.g:2164:1: rule__MoreConditionStatement__Group__1 : rule__MoreConditionStatement__Group__1__Impl rule__MoreConditionStatement__Group__2 ;
    public final void rule__MoreConditionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2168:1: ( rule__MoreConditionStatement__Group__1__Impl rule__MoreConditionStatement__Group__2 )
            // InternalLobsterLanguages.g:2169:2: rule__MoreConditionStatement__Group__1__Impl rule__MoreConditionStatement__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__MoreConditionStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoreConditionStatement__Group__2();

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
    // $ANTLR end "rule__MoreConditionStatement__Group__1"


    // $ANTLR start "rule__MoreConditionStatement__Group__1__Impl"
    // InternalLobsterLanguages.g:2176:1: rule__MoreConditionStatement__Group__1__Impl : ( ( rule__MoreConditionStatement__ColumnAssignment_1 ) ) ;
    public final void rule__MoreConditionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2180:1: ( ( ( rule__MoreConditionStatement__ColumnAssignment_1 ) ) )
            // InternalLobsterLanguages.g:2181:1: ( ( rule__MoreConditionStatement__ColumnAssignment_1 ) )
            {
            // InternalLobsterLanguages.g:2181:1: ( ( rule__MoreConditionStatement__ColumnAssignment_1 ) )
            // InternalLobsterLanguages.g:2182:2: ( rule__MoreConditionStatement__ColumnAssignment_1 )
            {
             before(grammarAccess.getMoreConditionStatementAccess().getColumnAssignment_1()); 
            // InternalLobsterLanguages.g:2183:2: ( rule__MoreConditionStatement__ColumnAssignment_1 )
            // InternalLobsterLanguages.g:2183:3: rule__MoreConditionStatement__ColumnAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoreConditionStatement__ColumnAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoreConditionStatementAccess().getColumnAssignment_1()); 

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
    // $ANTLR end "rule__MoreConditionStatement__Group__1__Impl"


    // $ANTLR start "rule__MoreConditionStatement__Group__2"
    // InternalLobsterLanguages.g:2191:1: rule__MoreConditionStatement__Group__2 : rule__MoreConditionStatement__Group__2__Impl rule__MoreConditionStatement__Group__3 ;
    public final void rule__MoreConditionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2195:1: ( rule__MoreConditionStatement__Group__2__Impl rule__MoreConditionStatement__Group__3 )
            // InternalLobsterLanguages.g:2196:2: rule__MoreConditionStatement__Group__2__Impl rule__MoreConditionStatement__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MoreConditionStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoreConditionStatement__Group__3();

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
    // $ANTLR end "rule__MoreConditionStatement__Group__2"


    // $ANTLR start "rule__MoreConditionStatement__Group__2__Impl"
    // InternalLobsterLanguages.g:2203:1: rule__MoreConditionStatement__Group__2__Impl : ( 'is' ) ;
    public final void rule__MoreConditionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2207:1: ( ( 'is' ) )
            // InternalLobsterLanguages.g:2208:1: ( 'is' )
            {
            // InternalLobsterLanguages.g:2208:1: ( 'is' )
            // InternalLobsterLanguages.g:2209:2: 'is'
            {
             before(grammarAccess.getMoreConditionStatementAccess().getIsKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMoreConditionStatementAccess().getIsKeyword_2()); 

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
    // $ANTLR end "rule__MoreConditionStatement__Group__2__Impl"


    // $ANTLR start "rule__MoreConditionStatement__Group__3"
    // InternalLobsterLanguages.g:2218:1: rule__MoreConditionStatement__Group__3 : rule__MoreConditionStatement__Group__3__Impl rule__MoreConditionStatement__Group__4 ;
    public final void rule__MoreConditionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2222:1: ( rule__MoreConditionStatement__Group__3__Impl rule__MoreConditionStatement__Group__4 )
            // InternalLobsterLanguages.g:2223:2: rule__MoreConditionStatement__Group__3__Impl rule__MoreConditionStatement__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__MoreConditionStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoreConditionStatement__Group__4();

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
    // $ANTLR end "rule__MoreConditionStatement__Group__3"


    // $ANTLR start "rule__MoreConditionStatement__Group__3__Impl"
    // InternalLobsterLanguages.g:2230:1: rule__MoreConditionStatement__Group__3__Impl : ( ( rule__MoreConditionStatement__ValueAssignment_3 ) ) ;
    public final void rule__MoreConditionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2234:1: ( ( ( rule__MoreConditionStatement__ValueAssignment_3 ) ) )
            // InternalLobsterLanguages.g:2235:1: ( ( rule__MoreConditionStatement__ValueAssignment_3 ) )
            {
            // InternalLobsterLanguages.g:2235:1: ( ( rule__MoreConditionStatement__ValueAssignment_3 ) )
            // InternalLobsterLanguages.g:2236:2: ( rule__MoreConditionStatement__ValueAssignment_3 )
            {
             before(grammarAccess.getMoreConditionStatementAccess().getValueAssignment_3()); 
            // InternalLobsterLanguages.g:2237:2: ( rule__MoreConditionStatement__ValueAssignment_3 )
            // InternalLobsterLanguages.g:2237:3: rule__MoreConditionStatement__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MoreConditionStatement__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMoreConditionStatementAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__MoreConditionStatement__Group__3__Impl"


    // $ANTLR start "rule__MoreConditionStatement__Group__4"
    // InternalLobsterLanguages.g:2245:1: rule__MoreConditionStatement__Group__4 : rule__MoreConditionStatement__Group__4__Impl ;
    public final void rule__MoreConditionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2249:1: ( rule__MoreConditionStatement__Group__4__Impl )
            // InternalLobsterLanguages.g:2250:2: rule__MoreConditionStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoreConditionStatement__Group__4__Impl();

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
    // $ANTLR end "rule__MoreConditionStatement__Group__4"


    // $ANTLR start "rule__MoreConditionStatement__Group__4__Impl"
    // InternalLobsterLanguages.g:2256:1: rule__MoreConditionStatement__Group__4__Impl : ( ( rule__MoreConditionStatement__MoreconditionAssignment_4 ) ) ;
    public final void rule__MoreConditionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2260:1: ( ( ( rule__MoreConditionStatement__MoreconditionAssignment_4 ) ) )
            // InternalLobsterLanguages.g:2261:1: ( ( rule__MoreConditionStatement__MoreconditionAssignment_4 ) )
            {
            // InternalLobsterLanguages.g:2261:1: ( ( rule__MoreConditionStatement__MoreconditionAssignment_4 ) )
            // InternalLobsterLanguages.g:2262:2: ( rule__MoreConditionStatement__MoreconditionAssignment_4 )
            {
             before(grammarAccess.getMoreConditionStatementAccess().getMoreconditionAssignment_4()); 
            // InternalLobsterLanguages.g:2263:2: ( rule__MoreConditionStatement__MoreconditionAssignment_4 )
            // InternalLobsterLanguages.g:2263:3: rule__MoreConditionStatement__MoreconditionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MoreConditionStatement__MoreconditionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMoreConditionStatementAccess().getMoreconditionAssignment_4()); 

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
    // $ANTLR end "rule__MoreConditionStatement__Group__4__Impl"


    // $ANTLR start "rule__DeleteTableStatement__Group__0"
    // InternalLobsterLanguages.g:2272:1: rule__DeleteTableStatement__Group__0 : rule__DeleteTableStatement__Group__0__Impl rule__DeleteTableStatement__Group__1 ;
    public final void rule__DeleteTableStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2276:1: ( rule__DeleteTableStatement__Group__0__Impl rule__DeleteTableStatement__Group__1 )
            // InternalLobsterLanguages.g:2277:2: rule__DeleteTableStatement__Group__0__Impl rule__DeleteTableStatement__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DeleteTableStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteTableStatement__Group__1();

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
    // $ANTLR end "rule__DeleteTableStatement__Group__0"


    // $ANTLR start "rule__DeleteTableStatement__Group__0__Impl"
    // InternalLobsterLanguages.g:2284:1: rule__DeleteTableStatement__Group__0__Impl : ( 'Delete All From' ) ;
    public final void rule__DeleteTableStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2288:1: ( ( 'Delete All From' ) )
            // InternalLobsterLanguages.g:2289:1: ( 'Delete All From' )
            {
            // InternalLobsterLanguages.g:2289:1: ( 'Delete All From' )
            // InternalLobsterLanguages.g:2290:2: 'Delete All From'
            {
             before(grammarAccess.getDeleteTableStatementAccess().getDeleteAllFromKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDeleteTableStatementAccess().getDeleteAllFromKeyword_0()); 

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
    // $ANTLR end "rule__DeleteTableStatement__Group__0__Impl"


    // $ANTLR start "rule__DeleteTableStatement__Group__1"
    // InternalLobsterLanguages.g:2299:1: rule__DeleteTableStatement__Group__1 : rule__DeleteTableStatement__Group__1__Impl rule__DeleteTableStatement__Group__2 ;
    public final void rule__DeleteTableStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2303:1: ( rule__DeleteTableStatement__Group__1__Impl rule__DeleteTableStatement__Group__2 )
            // InternalLobsterLanguages.g:2304:2: rule__DeleteTableStatement__Group__1__Impl rule__DeleteTableStatement__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__DeleteTableStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteTableStatement__Group__2();

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
    // $ANTLR end "rule__DeleteTableStatement__Group__1"


    // $ANTLR start "rule__DeleteTableStatement__Group__1__Impl"
    // InternalLobsterLanguages.g:2311:1: rule__DeleteTableStatement__Group__1__Impl : ( ( rule__DeleteTableStatement__TbnameAssignment_1 ) ) ;
    public final void rule__DeleteTableStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2315:1: ( ( ( rule__DeleteTableStatement__TbnameAssignment_1 ) ) )
            // InternalLobsterLanguages.g:2316:1: ( ( rule__DeleteTableStatement__TbnameAssignment_1 ) )
            {
            // InternalLobsterLanguages.g:2316:1: ( ( rule__DeleteTableStatement__TbnameAssignment_1 ) )
            // InternalLobsterLanguages.g:2317:2: ( rule__DeleteTableStatement__TbnameAssignment_1 )
            {
             before(grammarAccess.getDeleteTableStatementAccess().getTbnameAssignment_1()); 
            // InternalLobsterLanguages.g:2318:2: ( rule__DeleteTableStatement__TbnameAssignment_1 )
            // InternalLobsterLanguages.g:2318:3: rule__DeleteTableStatement__TbnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeleteTableStatement__TbnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeleteTableStatementAccess().getTbnameAssignment_1()); 

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
    // $ANTLR end "rule__DeleteTableStatement__Group__1__Impl"


    // $ANTLR start "rule__DeleteTableStatement__Group__2"
    // InternalLobsterLanguages.g:2326:1: rule__DeleteTableStatement__Group__2 : rule__DeleteTableStatement__Group__2__Impl ;
    public final void rule__DeleteTableStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2330:1: ( rule__DeleteTableStatement__Group__2__Impl )
            // InternalLobsterLanguages.g:2331:2: rule__DeleteTableStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteTableStatement__Group__2__Impl();

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
    // $ANTLR end "rule__DeleteTableStatement__Group__2"


    // $ANTLR start "rule__DeleteTableStatement__Group__2__Impl"
    // InternalLobsterLanguages.g:2337:1: rule__DeleteTableStatement__Group__2__Impl : ( 'Table' ) ;
    public final void rule__DeleteTableStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2341:1: ( ( 'Table' ) )
            // InternalLobsterLanguages.g:2342:1: ( 'Table' )
            {
            // InternalLobsterLanguages.g:2342:1: ( 'Table' )
            // InternalLobsterLanguages.g:2343:2: 'Table'
            {
             before(grammarAccess.getDeleteTableStatementAccess().getTableKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDeleteTableStatementAccess().getTableKeyword_2()); 

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
    // $ANTLR end "rule__DeleteTableStatement__Group__2__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__0"
    // InternalLobsterLanguages.g:2353:1: rule__UpdateStatement__Group__0 : rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1 ;
    public final void rule__UpdateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2357:1: ( rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1 )
            // InternalLobsterLanguages.g:2358:2: rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__UpdateStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__1();

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
    // $ANTLR end "rule__UpdateStatement__Group__0"


    // $ANTLR start "rule__UpdateStatement__Group__0__Impl"
    // InternalLobsterLanguages.g:2365:1: rule__UpdateStatement__Group__0__Impl : ( 'Update' ) ;
    public final void rule__UpdateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2369:1: ( ( 'Update' ) )
            // InternalLobsterLanguages.g:2370:1: ( 'Update' )
            {
            // InternalLobsterLanguages.g:2370:1: ( 'Update' )
            // InternalLobsterLanguages.g:2371:2: 'Update'
            {
             before(grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0()); 

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
    // $ANTLR end "rule__UpdateStatement__Group__0__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__1"
    // InternalLobsterLanguages.g:2380:1: rule__UpdateStatement__Group__1 : rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2 ;
    public final void rule__UpdateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2384:1: ( rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2 )
            // InternalLobsterLanguages.g:2385:2: rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__UpdateStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__2();

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
    // $ANTLR end "rule__UpdateStatement__Group__1"


    // $ANTLR start "rule__UpdateStatement__Group__1__Impl"
    // InternalLobsterLanguages.g:2392:1: rule__UpdateStatement__Group__1__Impl : ( ( rule__UpdateStatement__TbnameAssignment_1 ) ) ;
    public final void rule__UpdateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2396:1: ( ( ( rule__UpdateStatement__TbnameAssignment_1 ) ) )
            // InternalLobsterLanguages.g:2397:1: ( ( rule__UpdateStatement__TbnameAssignment_1 ) )
            {
            // InternalLobsterLanguages.g:2397:1: ( ( rule__UpdateStatement__TbnameAssignment_1 ) )
            // InternalLobsterLanguages.g:2398:2: ( rule__UpdateStatement__TbnameAssignment_1 )
            {
             before(grammarAccess.getUpdateStatementAccess().getTbnameAssignment_1()); 
            // InternalLobsterLanguages.g:2399:2: ( rule__UpdateStatement__TbnameAssignment_1 )
            // InternalLobsterLanguages.g:2399:3: rule__UpdateStatement__TbnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UpdateStatement__TbnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateStatementAccess().getTbnameAssignment_1()); 

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
    // $ANTLR end "rule__UpdateStatement__Group__1__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__2"
    // InternalLobsterLanguages.g:2407:1: rule__UpdateStatement__Group__2 : rule__UpdateStatement__Group__2__Impl rule__UpdateStatement__Group__3 ;
    public final void rule__UpdateStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2411:1: ( rule__UpdateStatement__Group__2__Impl rule__UpdateStatement__Group__3 )
            // InternalLobsterLanguages.g:2412:2: rule__UpdateStatement__Group__2__Impl rule__UpdateStatement__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__UpdateStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__3();

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
    // $ANTLR end "rule__UpdateStatement__Group__2"


    // $ANTLR start "rule__UpdateStatement__Group__2__Impl"
    // InternalLobsterLanguages.g:2419:1: rule__UpdateStatement__Group__2__Impl : ( 'Table' ) ;
    public final void rule__UpdateStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2423:1: ( ( 'Table' ) )
            // InternalLobsterLanguages.g:2424:1: ( 'Table' )
            {
            // InternalLobsterLanguages.g:2424:1: ( 'Table' )
            // InternalLobsterLanguages.g:2425:2: 'Table'
            {
             before(grammarAccess.getUpdateStatementAccess().getTableKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getUpdateStatementAccess().getTableKeyword_2()); 

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
    // $ANTLR end "rule__UpdateStatement__Group__2__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__3"
    // InternalLobsterLanguages.g:2434:1: rule__UpdateStatement__Group__3 : rule__UpdateStatement__Group__3__Impl rule__UpdateStatement__Group__4 ;
    public final void rule__UpdateStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2438:1: ( rule__UpdateStatement__Group__3__Impl rule__UpdateStatement__Group__4 )
            // InternalLobsterLanguages.g:2439:2: rule__UpdateStatement__Group__3__Impl rule__UpdateStatement__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__UpdateStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__4();

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
    // $ANTLR end "rule__UpdateStatement__Group__3"


    // $ANTLR start "rule__UpdateStatement__Group__3__Impl"
    // InternalLobsterLanguages.g:2446:1: rule__UpdateStatement__Group__3__Impl : ( 'set' ) ;
    public final void rule__UpdateStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2450:1: ( ( 'set' ) )
            // InternalLobsterLanguages.g:2451:1: ( 'set' )
            {
            // InternalLobsterLanguages.g:2451:1: ( 'set' )
            // InternalLobsterLanguages.g:2452:2: 'set'
            {
             before(grammarAccess.getUpdateStatementAccess().getSetKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getUpdateStatementAccess().getSetKeyword_3()); 

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
    // $ANTLR end "rule__UpdateStatement__Group__3__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__4"
    // InternalLobsterLanguages.g:2461:1: rule__UpdateStatement__Group__4 : rule__UpdateStatement__Group__4__Impl rule__UpdateStatement__Group__5 ;
    public final void rule__UpdateStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2465:1: ( rule__UpdateStatement__Group__4__Impl rule__UpdateStatement__Group__5 )
            // InternalLobsterLanguages.g:2466:2: rule__UpdateStatement__Group__4__Impl rule__UpdateStatement__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__UpdateStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__5();

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
    // $ANTLR end "rule__UpdateStatement__Group__4"


    // $ANTLR start "rule__UpdateStatement__Group__4__Impl"
    // InternalLobsterLanguages.g:2473:1: rule__UpdateStatement__Group__4__Impl : ( '{' ) ;
    public final void rule__UpdateStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2477:1: ( ( '{' ) )
            // InternalLobsterLanguages.g:2478:1: ( '{' )
            {
            // InternalLobsterLanguages.g:2478:1: ( '{' )
            // InternalLobsterLanguages.g:2479:2: '{'
            {
             before(grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__UpdateStatement__Group__4__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__5"
    // InternalLobsterLanguages.g:2488:1: rule__UpdateStatement__Group__5 : rule__UpdateStatement__Group__5__Impl rule__UpdateStatement__Group__6 ;
    public final void rule__UpdateStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2492:1: ( rule__UpdateStatement__Group__5__Impl rule__UpdateStatement__Group__6 )
            // InternalLobsterLanguages.g:2493:2: rule__UpdateStatement__Group__5__Impl rule__UpdateStatement__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__UpdateStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__6();

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
    // $ANTLR end "rule__UpdateStatement__Group__5"


    // $ANTLR start "rule__UpdateStatement__Group__5__Impl"
    // InternalLobsterLanguages.g:2500:1: rule__UpdateStatement__Group__5__Impl : ( ( rule__UpdateStatement__SetvalueAssignment_5 )* ) ;
    public final void rule__UpdateStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2504:1: ( ( ( rule__UpdateStatement__SetvalueAssignment_5 )* ) )
            // InternalLobsterLanguages.g:2505:1: ( ( rule__UpdateStatement__SetvalueAssignment_5 )* )
            {
            // InternalLobsterLanguages.g:2505:1: ( ( rule__UpdateStatement__SetvalueAssignment_5 )* )
            // InternalLobsterLanguages.g:2506:2: ( rule__UpdateStatement__SetvalueAssignment_5 )*
            {
             before(grammarAccess.getUpdateStatementAccess().getSetvalueAssignment_5()); 
            // InternalLobsterLanguages.g:2507:2: ( rule__UpdateStatement__SetvalueAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLobsterLanguages.g:2507:3: rule__UpdateStatement__SetvalueAssignment_5
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__UpdateStatement__SetvalueAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getUpdateStatementAccess().getSetvalueAssignment_5()); 

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
    // $ANTLR end "rule__UpdateStatement__Group__5__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__6"
    // InternalLobsterLanguages.g:2515:1: rule__UpdateStatement__Group__6 : rule__UpdateStatement__Group__6__Impl rule__UpdateStatement__Group__7 ;
    public final void rule__UpdateStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2519:1: ( rule__UpdateStatement__Group__6__Impl rule__UpdateStatement__Group__7 )
            // InternalLobsterLanguages.g:2520:2: rule__UpdateStatement__Group__6__Impl rule__UpdateStatement__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__UpdateStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__7();

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
    // $ANTLR end "rule__UpdateStatement__Group__6"


    // $ANTLR start "rule__UpdateStatement__Group__6__Impl"
    // InternalLobsterLanguages.g:2527:1: rule__UpdateStatement__Group__6__Impl : ( '}' ) ;
    public final void rule__UpdateStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2531:1: ( ( '}' ) )
            // InternalLobsterLanguages.g:2532:1: ( '}' )
            {
            // InternalLobsterLanguages.g:2532:1: ( '}' )
            // InternalLobsterLanguages.g:2533:2: '}'
            {
             before(grammarAccess.getUpdateStatementAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUpdateStatementAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__UpdateStatement__Group__6__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__7"
    // InternalLobsterLanguages.g:2542:1: rule__UpdateStatement__Group__7 : rule__UpdateStatement__Group__7__Impl rule__UpdateStatement__Group__8 ;
    public final void rule__UpdateStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2546:1: ( rule__UpdateStatement__Group__7__Impl rule__UpdateStatement__Group__8 )
            // InternalLobsterLanguages.g:2547:2: rule__UpdateStatement__Group__7__Impl rule__UpdateStatement__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__UpdateStatement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__8();

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
    // $ANTLR end "rule__UpdateStatement__Group__7"


    // $ANTLR start "rule__UpdateStatement__Group__7__Impl"
    // InternalLobsterLanguages.g:2554:1: rule__UpdateStatement__Group__7__Impl : ( 'where' ) ;
    public final void rule__UpdateStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2558:1: ( ( 'where' ) )
            // InternalLobsterLanguages.g:2559:1: ( 'where' )
            {
            // InternalLobsterLanguages.g:2559:1: ( 'where' )
            // InternalLobsterLanguages.g:2560:2: 'where'
            {
             before(grammarAccess.getUpdateStatementAccess().getWhereKeyword_7()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getUpdateStatementAccess().getWhereKeyword_7()); 

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
    // $ANTLR end "rule__UpdateStatement__Group__7__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__8"
    // InternalLobsterLanguages.g:2569:1: rule__UpdateStatement__Group__8 : rule__UpdateStatement__Group__8__Impl rule__UpdateStatement__Group__9 ;
    public final void rule__UpdateStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2573:1: ( rule__UpdateStatement__Group__8__Impl rule__UpdateStatement__Group__9 )
            // InternalLobsterLanguages.g:2574:2: rule__UpdateStatement__Group__8__Impl rule__UpdateStatement__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__UpdateStatement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__9();

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
    // $ANTLR end "rule__UpdateStatement__Group__8"


    // $ANTLR start "rule__UpdateStatement__Group__8__Impl"
    // InternalLobsterLanguages.g:2581:1: rule__UpdateStatement__Group__8__Impl : ( '{' ) ;
    public final void rule__UpdateStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2585:1: ( ( '{' ) )
            // InternalLobsterLanguages.g:2586:1: ( '{' )
            {
            // InternalLobsterLanguages.g:2586:1: ( '{' )
            // InternalLobsterLanguages.g:2587:2: '{'
            {
             before(grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__UpdateStatement__Group__8__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__9"
    // InternalLobsterLanguages.g:2596:1: rule__UpdateStatement__Group__9 : rule__UpdateStatement__Group__9__Impl rule__UpdateStatement__Group__10 ;
    public final void rule__UpdateStatement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2600:1: ( rule__UpdateStatement__Group__9__Impl rule__UpdateStatement__Group__10 )
            // InternalLobsterLanguages.g:2601:2: rule__UpdateStatement__Group__9__Impl rule__UpdateStatement__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__UpdateStatement__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__10();

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
    // $ANTLR end "rule__UpdateStatement__Group__9"


    // $ANTLR start "rule__UpdateStatement__Group__9__Impl"
    // InternalLobsterLanguages.g:2608:1: rule__UpdateStatement__Group__9__Impl : ( ( rule__UpdateStatement__ConditionAssignment_9 )* ) ;
    public final void rule__UpdateStatement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2612:1: ( ( ( rule__UpdateStatement__ConditionAssignment_9 )* ) )
            // InternalLobsterLanguages.g:2613:1: ( ( rule__UpdateStatement__ConditionAssignment_9 )* )
            {
            // InternalLobsterLanguages.g:2613:1: ( ( rule__UpdateStatement__ConditionAssignment_9 )* )
            // InternalLobsterLanguages.g:2614:2: ( rule__UpdateStatement__ConditionAssignment_9 )*
            {
             before(grammarAccess.getUpdateStatementAccess().getConditionAssignment_9()); 
            // InternalLobsterLanguages.g:2615:2: ( rule__UpdateStatement__ConditionAssignment_9 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLobsterLanguages.g:2615:3: rule__UpdateStatement__ConditionAssignment_9
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__UpdateStatement__ConditionAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getUpdateStatementAccess().getConditionAssignment_9()); 

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
    // $ANTLR end "rule__UpdateStatement__Group__9__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__10"
    // InternalLobsterLanguages.g:2623:1: rule__UpdateStatement__Group__10 : rule__UpdateStatement__Group__10__Impl ;
    public final void rule__UpdateStatement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2627:1: ( rule__UpdateStatement__Group__10__Impl )
            // InternalLobsterLanguages.g:2628:2: rule__UpdateStatement__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__10__Impl();

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
    // $ANTLR end "rule__UpdateStatement__Group__10"


    // $ANTLR start "rule__UpdateStatement__Group__10__Impl"
    // InternalLobsterLanguages.g:2634:1: rule__UpdateStatement__Group__10__Impl : ( '}' ) ;
    public final void rule__UpdateStatement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2638:1: ( ( '}' ) )
            // InternalLobsterLanguages.g:2639:1: ( '}' )
            {
            // InternalLobsterLanguages.g:2639:1: ( '}' )
            // InternalLobsterLanguages.g:2640:2: '}'
            {
             before(grammarAccess.getUpdateStatementAccess().getRightCurlyBracketKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUpdateStatementAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__UpdateStatement__Group__10__Impl"


    // $ANTLR start "rule__SelectStatement__Group__0"
    // InternalLobsterLanguages.g:2650:1: rule__SelectStatement__Group__0 : rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 ;
    public final void rule__SelectStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2654:1: ( rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 )
            // InternalLobsterLanguages.g:2655:2: rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__SelectStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__1();

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
    // $ANTLR end "rule__SelectStatement__Group__0"


    // $ANTLR start "rule__SelectStatement__Group__0__Impl"
    // InternalLobsterLanguages.g:2662:1: rule__SelectStatement__Group__0__Impl : ( 'Find out' ) ;
    public final void rule__SelectStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2666:1: ( ( 'Find out' ) )
            // InternalLobsterLanguages.g:2667:1: ( 'Find out' )
            {
            // InternalLobsterLanguages.g:2667:1: ( 'Find out' )
            // InternalLobsterLanguages.g:2668:2: 'Find out'
            {
             before(grammarAccess.getSelectStatementAccess().getFindOutKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getFindOutKeyword_0()); 

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
    // $ANTLR end "rule__SelectStatement__Group__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group__1"
    // InternalLobsterLanguages.g:2677:1: rule__SelectStatement__Group__1 : rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 ;
    public final void rule__SelectStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2681:1: ( rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 )
            // InternalLobsterLanguages.g:2682:2: rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__SelectStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__2();

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
    // $ANTLR end "rule__SelectStatement__Group__1"


    // $ANTLR start "rule__SelectStatement__Group__1__Impl"
    // InternalLobsterLanguages.g:2689:1: rule__SelectStatement__Group__1__Impl : ( ( rule__SelectStatement__Group_1__0 )? ) ;
    public final void rule__SelectStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2693:1: ( ( ( rule__SelectStatement__Group_1__0 )? ) )
            // InternalLobsterLanguages.g:2694:1: ( ( rule__SelectStatement__Group_1__0 )? )
            {
            // InternalLobsterLanguages.g:2694:1: ( ( rule__SelectStatement__Group_1__0 )? )
            // InternalLobsterLanguages.g:2695:2: ( rule__SelectStatement__Group_1__0 )?
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_1()); 
            // InternalLobsterLanguages.g:2696:2: ( rule__SelectStatement__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=16 && LA16_0<=20)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLobsterLanguages.g:2696:3: rule__SelectStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectStatement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectStatementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SelectStatement__Group__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group__2"
    // InternalLobsterLanguages.g:2704:1: rule__SelectStatement__Group__2 : rule__SelectStatement__Group__2__Impl rule__SelectStatement__Group__3 ;
    public final void rule__SelectStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2708:1: ( rule__SelectStatement__Group__2__Impl rule__SelectStatement__Group__3 )
            // InternalLobsterLanguages.g:2709:2: rule__SelectStatement__Group__2__Impl rule__SelectStatement__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__SelectStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__3();

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
    // $ANTLR end "rule__SelectStatement__Group__2"


    // $ANTLR start "rule__SelectStatement__Group__2__Impl"
    // InternalLobsterLanguages.g:2716:1: rule__SelectStatement__Group__2__Impl : ( 'Column Name:' ) ;
    public final void rule__SelectStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2720:1: ( ( 'Column Name:' ) )
            // InternalLobsterLanguages.g:2721:1: ( 'Column Name:' )
            {
            // InternalLobsterLanguages.g:2721:1: ( 'Column Name:' )
            // InternalLobsterLanguages.g:2722:2: 'Column Name:'
            {
             before(grammarAccess.getSelectStatementAccess().getColumnNameKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getColumnNameKeyword_2()); 

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
    // $ANTLR end "rule__SelectStatement__Group__2__Impl"


    // $ANTLR start "rule__SelectStatement__Group__3"
    // InternalLobsterLanguages.g:2731:1: rule__SelectStatement__Group__3 : rule__SelectStatement__Group__3__Impl rule__SelectStatement__Group__4 ;
    public final void rule__SelectStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2735:1: ( rule__SelectStatement__Group__3__Impl rule__SelectStatement__Group__4 )
            // InternalLobsterLanguages.g:2736:2: rule__SelectStatement__Group__3__Impl rule__SelectStatement__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__SelectStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__4();

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
    // $ANTLR end "rule__SelectStatement__Group__3"


    // $ANTLR start "rule__SelectStatement__Group__3__Impl"
    // InternalLobsterLanguages.g:2743:1: rule__SelectStatement__Group__3__Impl : ( ( rule__SelectStatement__ColumnAssignment_3 ) ) ;
    public final void rule__SelectStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2747:1: ( ( ( rule__SelectStatement__ColumnAssignment_3 ) ) )
            // InternalLobsterLanguages.g:2748:1: ( ( rule__SelectStatement__ColumnAssignment_3 ) )
            {
            // InternalLobsterLanguages.g:2748:1: ( ( rule__SelectStatement__ColumnAssignment_3 ) )
            // InternalLobsterLanguages.g:2749:2: ( rule__SelectStatement__ColumnAssignment_3 )
            {
             before(grammarAccess.getSelectStatementAccess().getColumnAssignment_3()); 
            // InternalLobsterLanguages.g:2750:2: ( rule__SelectStatement__ColumnAssignment_3 )
            // InternalLobsterLanguages.g:2750:3: rule__SelectStatement__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__ColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getColumnAssignment_3()); 

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
    // $ANTLR end "rule__SelectStatement__Group__3__Impl"


    // $ANTLR start "rule__SelectStatement__Group__4"
    // InternalLobsterLanguages.g:2758:1: rule__SelectStatement__Group__4 : rule__SelectStatement__Group__4__Impl rule__SelectStatement__Group__5 ;
    public final void rule__SelectStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2762:1: ( rule__SelectStatement__Group__4__Impl rule__SelectStatement__Group__5 )
            // InternalLobsterLanguages.g:2763:2: rule__SelectStatement__Group__4__Impl rule__SelectStatement__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__SelectStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__5();

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
    // $ANTLR end "rule__SelectStatement__Group__4"


    // $ANTLR start "rule__SelectStatement__Group__4__Impl"
    // InternalLobsterLanguages.g:2770:1: rule__SelectStatement__Group__4__Impl : ( 'where' ) ;
    public final void rule__SelectStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2774:1: ( ( 'where' ) )
            // InternalLobsterLanguages.g:2775:1: ( 'where' )
            {
            // InternalLobsterLanguages.g:2775:1: ( 'where' )
            // InternalLobsterLanguages.g:2776:2: 'where'
            {
             before(grammarAccess.getSelectStatementAccess().getWhereKeyword_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getWhereKeyword_4()); 

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
    // $ANTLR end "rule__SelectStatement__Group__4__Impl"


    // $ANTLR start "rule__SelectStatement__Group__5"
    // InternalLobsterLanguages.g:2785:1: rule__SelectStatement__Group__5 : rule__SelectStatement__Group__5__Impl rule__SelectStatement__Group__6 ;
    public final void rule__SelectStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2789:1: ( rule__SelectStatement__Group__5__Impl rule__SelectStatement__Group__6 )
            // InternalLobsterLanguages.g:2790:2: rule__SelectStatement__Group__5__Impl rule__SelectStatement__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__SelectStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__6();

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
    // $ANTLR end "rule__SelectStatement__Group__5"


    // $ANTLR start "rule__SelectStatement__Group__5__Impl"
    // InternalLobsterLanguages.g:2797:1: rule__SelectStatement__Group__5__Impl : ( '{' ) ;
    public final void rule__SelectStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2801:1: ( ( '{' ) )
            // InternalLobsterLanguages.g:2802:1: ( '{' )
            {
            // InternalLobsterLanguages.g:2802:1: ( '{' )
            // InternalLobsterLanguages.g:2803:2: '{'
            {
             before(grammarAccess.getSelectStatementAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__SelectStatement__Group__5__Impl"


    // $ANTLR start "rule__SelectStatement__Group__6"
    // InternalLobsterLanguages.g:2812:1: rule__SelectStatement__Group__6 : rule__SelectStatement__Group__6__Impl rule__SelectStatement__Group__7 ;
    public final void rule__SelectStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2816:1: ( rule__SelectStatement__Group__6__Impl rule__SelectStatement__Group__7 )
            // InternalLobsterLanguages.g:2817:2: rule__SelectStatement__Group__6__Impl rule__SelectStatement__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__SelectStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__7();

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
    // $ANTLR end "rule__SelectStatement__Group__6"


    // $ANTLR start "rule__SelectStatement__Group__6__Impl"
    // InternalLobsterLanguages.g:2824:1: rule__SelectStatement__Group__6__Impl : ( ( rule__SelectStatement__ConditionAssignment_6 )* ) ;
    public final void rule__SelectStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2828:1: ( ( ( rule__SelectStatement__ConditionAssignment_6 )* ) )
            // InternalLobsterLanguages.g:2829:1: ( ( rule__SelectStatement__ConditionAssignment_6 )* )
            {
            // InternalLobsterLanguages.g:2829:1: ( ( rule__SelectStatement__ConditionAssignment_6 )* )
            // InternalLobsterLanguages.g:2830:2: ( rule__SelectStatement__ConditionAssignment_6 )*
            {
             before(grammarAccess.getSelectStatementAccess().getConditionAssignment_6()); 
            // InternalLobsterLanguages.g:2831:2: ( rule__SelectStatement__ConditionAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLobsterLanguages.g:2831:3: rule__SelectStatement__ConditionAssignment_6
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__SelectStatement__ConditionAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSelectStatementAccess().getConditionAssignment_6()); 

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
    // $ANTLR end "rule__SelectStatement__Group__6__Impl"


    // $ANTLR start "rule__SelectStatement__Group__7"
    // InternalLobsterLanguages.g:2839:1: rule__SelectStatement__Group__7 : rule__SelectStatement__Group__7__Impl rule__SelectStatement__Group__8 ;
    public final void rule__SelectStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2843:1: ( rule__SelectStatement__Group__7__Impl rule__SelectStatement__Group__8 )
            // InternalLobsterLanguages.g:2844:2: rule__SelectStatement__Group__7__Impl rule__SelectStatement__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__SelectStatement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__8();

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
    // $ANTLR end "rule__SelectStatement__Group__7"


    // $ANTLR start "rule__SelectStatement__Group__7__Impl"
    // InternalLobsterLanguages.g:2851:1: rule__SelectStatement__Group__7__Impl : ( '}' ) ;
    public final void rule__SelectStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2855:1: ( ( '}' ) )
            // InternalLobsterLanguages.g:2856:1: ( '}' )
            {
            // InternalLobsterLanguages.g:2856:1: ( '}' )
            // InternalLobsterLanguages.g:2857:2: '}'
            {
             before(grammarAccess.getSelectStatementAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__SelectStatement__Group__7__Impl"


    // $ANTLR start "rule__SelectStatement__Group__8"
    // InternalLobsterLanguages.g:2866:1: rule__SelectStatement__Group__8 : rule__SelectStatement__Group__8__Impl rule__SelectStatement__Group__9 ;
    public final void rule__SelectStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2870:1: ( rule__SelectStatement__Group__8__Impl rule__SelectStatement__Group__9 )
            // InternalLobsterLanguages.g:2871:2: rule__SelectStatement__Group__8__Impl rule__SelectStatement__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__SelectStatement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__9();

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
    // $ANTLR end "rule__SelectStatement__Group__8"


    // $ANTLR start "rule__SelectStatement__Group__8__Impl"
    // InternalLobsterLanguages.g:2878:1: rule__SelectStatement__Group__8__Impl : ( 'from' ) ;
    public final void rule__SelectStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2882:1: ( ( 'from' ) )
            // InternalLobsterLanguages.g:2883:1: ( 'from' )
            {
            // InternalLobsterLanguages.g:2883:1: ( 'from' )
            // InternalLobsterLanguages.g:2884:2: 'from'
            {
             before(grammarAccess.getSelectStatementAccess().getFromKeyword_8()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getFromKeyword_8()); 

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
    // $ANTLR end "rule__SelectStatement__Group__8__Impl"


    // $ANTLR start "rule__SelectStatement__Group__9"
    // InternalLobsterLanguages.g:2893:1: rule__SelectStatement__Group__9 : rule__SelectStatement__Group__9__Impl rule__SelectStatement__Group__10 ;
    public final void rule__SelectStatement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2897:1: ( rule__SelectStatement__Group__9__Impl rule__SelectStatement__Group__10 )
            // InternalLobsterLanguages.g:2898:2: rule__SelectStatement__Group__9__Impl rule__SelectStatement__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__SelectStatement__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__10();

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
    // $ANTLR end "rule__SelectStatement__Group__9"


    // $ANTLR start "rule__SelectStatement__Group__9__Impl"
    // InternalLobsterLanguages.g:2905:1: rule__SelectStatement__Group__9__Impl : ( 'Table' ) ;
    public final void rule__SelectStatement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2909:1: ( ( 'Table' ) )
            // InternalLobsterLanguages.g:2910:1: ( 'Table' )
            {
            // InternalLobsterLanguages.g:2910:1: ( 'Table' )
            // InternalLobsterLanguages.g:2911:2: 'Table'
            {
             before(grammarAccess.getSelectStatementAccess().getTableKeyword_9()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getTableKeyword_9()); 

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
    // $ANTLR end "rule__SelectStatement__Group__9__Impl"


    // $ANTLR start "rule__SelectStatement__Group__10"
    // InternalLobsterLanguages.g:2920:1: rule__SelectStatement__Group__10 : rule__SelectStatement__Group__10__Impl rule__SelectStatement__Group__11 ;
    public final void rule__SelectStatement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2924:1: ( rule__SelectStatement__Group__10__Impl rule__SelectStatement__Group__11 )
            // InternalLobsterLanguages.g:2925:2: rule__SelectStatement__Group__10__Impl rule__SelectStatement__Group__11
            {
            pushFollow(FOLLOW_33);
            rule__SelectStatement__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__11();

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
    // $ANTLR end "rule__SelectStatement__Group__10"


    // $ANTLR start "rule__SelectStatement__Group__10__Impl"
    // InternalLobsterLanguages.g:2932:1: rule__SelectStatement__Group__10__Impl : ( ( rule__SelectStatement__TbnameAssignment_10 ) ) ;
    public final void rule__SelectStatement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2936:1: ( ( ( rule__SelectStatement__TbnameAssignment_10 ) ) )
            // InternalLobsterLanguages.g:2937:1: ( ( rule__SelectStatement__TbnameAssignment_10 ) )
            {
            // InternalLobsterLanguages.g:2937:1: ( ( rule__SelectStatement__TbnameAssignment_10 ) )
            // InternalLobsterLanguages.g:2938:2: ( rule__SelectStatement__TbnameAssignment_10 )
            {
             before(grammarAccess.getSelectStatementAccess().getTbnameAssignment_10()); 
            // InternalLobsterLanguages.g:2939:2: ( rule__SelectStatement__TbnameAssignment_10 )
            // InternalLobsterLanguages.g:2939:3: rule__SelectStatement__TbnameAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__TbnameAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getTbnameAssignment_10()); 

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
    // $ANTLR end "rule__SelectStatement__Group__10__Impl"


    // $ANTLR start "rule__SelectStatement__Group__11"
    // InternalLobsterLanguages.g:2947:1: rule__SelectStatement__Group__11 : rule__SelectStatement__Group__11__Impl rule__SelectStatement__Group__12 ;
    public final void rule__SelectStatement__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2951:1: ( rule__SelectStatement__Group__11__Impl rule__SelectStatement__Group__12 )
            // InternalLobsterLanguages.g:2952:2: rule__SelectStatement__Group__11__Impl rule__SelectStatement__Group__12
            {
            pushFollow(FOLLOW_33);
            rule__SelectStatement__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__12();

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
    // $ANTLR end "rule__SelectStatement__Group__11"


    // $ANTLR start "rule__SelectStatement__Group__11__Impl"
    // InternalLobsterLanguages.g:2959:1: rule__SelectStatement__Group__11__Impl : ( ( rule__SelectStatement__Group_11__0 )? ) ;
    public final void rule__SelectStatement__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2963:1: ( ( ( rule__SelectStatement__Group_11__0 )? ) )
            // InternalLobsterLanguages.g:2964:1: ( ( rule__SelectStatement__Group_11__0 )? )
            {
            // InternalLobsterLanguages.g:2964:1: ( ( rule__SelectStatement__Group_11__0 )? )
            // InternalLobsterLanguages.g:2965:2: ( rule__SelectStatement__Group_11__0 )?
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_11()); 
            // InternalLobsterLanguages.g:2966:2: ( rule__SelectStatement__Group_11__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==54) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLobsterLanguages.g:2966:3: rule__SelectStatement__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectStatement__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectStatementAccess().getGroup_11()); 

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
    // $ANTLR end "rule__SelectStatement__Group__11__Impl"


    // $ANTLR start "rule__SelectStatement__Group__12"
    // InternalLobsterLanguages.g:2974:1: rule__SelectStatement__Group__12 : rule__SelectStatement__Group__12__Impl rule__SelectStatement__Group__13 ;
    public final void rule__SelectStatement__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2978:1: ( rule__SelectStatement__Group__12__Impl rule__SelectStatement__Group__13 )
            // InternalLobsterLanguages.g:2979:2: rule__SelectStatement__Group__12__Impl rule__SelectStatement__Group__13
            {
            pushFollow(FOLLOW_33);
            rule__SelectStatement__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__13();

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
    // $ANTLR end "rule__SelectStatement__Group__12"


    // $ANTLR start "rule__SelectStatement__Group__12__Impl"
    // InternalLobsterLanguages.g:2986:1: rule__SelectStatement__Group__12__Impl : ( ( rule__SelectStatement__Group_12__0 )? ) ;
    public final void rule__SelectStatement__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:2990:1: ( ( ( rule__SelectStatement__Group_12__0 )? ) )
            // InternalLobsterLanguages.g:2991:1: ( ( rule__SelectStatement__Group_12__0 )? )
            {
            // InternalLobsterLanguages.g:2991:1: ( ( rule__SelectStatement__Group_12__0 )? )
            // InternalLobsterLanguages.g:2992:2: ( rule__SelectStatement__Group_12__0 )?
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_12()); 
            // InternalLobsterLanguages.g:2993:2: ( rule__SelectStatement__Group_12__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==55) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLobsterLanguages.g:2993:3: rule__SelectStatement__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectStatement__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectStatementAccess().getGroup_12()); 

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
    // $ANTLR end "rule__SelectStatement__Group__12__Impl"


    // $ANTLR start "rule__SelectStatement__Group__13"
    // InternalLobsterLanguages.g:3001:1: rule__SelectStatement__Group__13 : rule__SelectStatement__Group__13__Impl ;
    public final void rule__SelectStatement__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3005:1: ( rule__SelectStatement__Group__13__Impl )
            // InternalLobsterLanguages.g:3006:2: rule__SelectStatement__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__13__Impl();

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
    // $ANTLR end "rule__SelectStatement__Group__13"


    // $ANTLR start "rule__SelectStatement__Group__13__Impl"
    // InternalLobsterLanguages.g:3012:1: rule__SelectStatement__Group__13__Impl : ( '}' ) ;
    public final void rule__SelectStatement__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3016:1: ( ( '}' ) )
            // InternalLobsterLanguages.g:3017:1: ( '}' )
            {
            // InternalLobsterLanguages.g:3017:1: ( '}' )
            // InternalLobsterLanguages.g:3018:2: '}'
            {
             before(grammarAccess.getSelectStatementAccess().getRightCurlyBracketKeyword_13()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__SelectStatement__Group__13__Impl"


    // $ANTLR start "rule__SelectStatement__Group_1__0"
    // InternalLobsterLanguages.g:3028:1: rule__SelectStatement__Group_1__0 : rule__SelectStatement__Group_1__0__Impl rule__SelectStatement__Group_1__1 ;
    public final void rule__SelectStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3032:1: ( rule__SelectStatement__Group_1__0__Impl rule__SelectStatement__Group_1__1 )
            // InternalLobsterLanguages.g:3033:2: rule__SelectStatement__Group_1__0__Impl rule__SelectStatement__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__SelectStatement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_1__1();

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
    // $ANTLR end "rule__SelectStatement__Group_1__0"


    // $ANTLR start "rule__SelectStatement__Group_1__0__Impl"
    // InternalLobsterLanguages.g:3040:1: rule__SelectStatement__Group_1__0__Impl : ( ( rule__SelectStatement__CaculateConditionAssignment_1_0 ) ) ;
    public final void rule__SelectStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3044:1: ( ( ( rule__SelectStatement__CaculateConditionAssignment_1_0 ) ) )
            // InternalLobsterLanguages.g:3045:1: ( ( rule__SelectStatement__CaculateConditionAssignment_1_0 ) )
            {
            // InternalLobsterLanguages.g:3045:1: ( ( rule__SelectStatement__CaculateConditionAssignment_1_0 ) )
            // InternalLobsterLanguages.g:3046:2: ( rule__SelectStatement__CaculateConditionAssignment_1_0 )
            {
             before(grammarAccess.getSelectStatementAccess().getCaculateConditionAssignment_1_0()); 
            // InternalLobsterLanguages.g:3047:2: ( rule__SelectStatement__CaculateConditionAssignment_1_0 )
            // InternalLobsterLanguages.g:3047:3: rule__SelectStatement__CaculateConditionAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__CaculateConditionAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getCaculateConditionAssignment_1_0()); 

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
    // $ANTLR end "rule__SelectStatement__Group_1__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_1__1"
    // InternalLobsterLanguages.g:3055:1: rule__SelectStatement__Group_1__1 : rule__SelectStatement__Group_1__1__Impl ;
    public final void rule__SelectStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3059:1: ( rule__SelectStatement__Group_1__1__Impl )
            // InternalLobsterLanguages.g:3060:2: rule__SelectStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_1__1__Impl();

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
    // $ANTLR end "rule__SelectStatement__Group_1__1"


    // $ANTLR start "rule__SelectStatement__Group_1__1__Impl"
    // InternalLobsterLanguages.g:3066:1: rule__SelectStatement__Group_1__1__Impl : ( 'of' ) ;
    public final void rule__SelectStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3070:1: ( ( 'of' ) )
            // InternalLobsterLanguages.g:3071:1: ( 'of' )
            {
            // InternalLobsterLanguages.g:3071:1: ( 'of' )
            // InternalLobsterLanguages.g:3072:2: 'of'
            {
             before(grammarAccess.getSelectStatementAccess().getOfKeyword_1_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getOfKeyword_1_1()); 

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
    // $ANTLR end "rule__SelectStatement__Group_1__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group_11__0"
    // InternalLobsterLanguages.g:3082:1: rule__SelectStatement__Group_11__0 : rule__SelectStatement__Group_11__0__Impl rule__SelectStatement__Group_11__1 ;
    public final void rule__SelectStatement__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3086:1: ( rule__SelectStatement__Group_11__0__Impl rule__SelectStatement__Group_11__1 )
            // InternalLobsterLanguages.g:3087:2: rule__SelectStatement__Group_11__0__Impl rule__SelectStatement__Group_11__1
            {
            pushFollow(FOLLOW_14);
            rule__SelectStatement__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_11__1();

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
    // $ANTLR end "rule__SelectStatement__Group_11__0"


    // $ANTLR start "rule__SelectStatement__Group_11__0__Impl"
    // InternalLobsterLanguages.g:3094:1: rule__SelectStatement__Group_11__0__Impl : ( 'order by' ) ;
    public final void rule__SelectStatement__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3098:1: ( ( 'order by' ) )
            // InternalLobsterLanguages.g:3099:1: ( 'order by' )
            {
            // InternalLobsterLanguages.g:3099:1: ( 'order by' )
            // InternalLobsterLanguages.g:3100:2: 'order by'
            {
             before(grammarAccess.getSelectStatementAccess().getOrderByKeyword_11_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getOrderByKeyword_11_0()); 

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
    // $ANTLR end "rule__SelectStatement__Group_11__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_11__1"
    // InternalLobsterLanguages.g:3109:1: rule__SelectStatement__Group_11__1 : rule__SelectStatement__Group_11__1__Impl rule__SelectStatement__Group_11__2 ;
    public final void rule__SelectStatement__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3113:1: ( rule__SelectStatement__Group_11__1__Impl rule__SelectStatement__Group_11__2 )
            // InternalLobsterLanguages.g:3114:2: rule__SelectStatement__Group_11__1__Impl rule__SelectStatement__Group_11__2
            {
            pushFollow(FOLLOW_35);
            rule__SelectStatement__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_11__2();

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
    // $ANTLR end "rule__SelectStatement__Group_11__1"


    // $ANTLR start "rule__SelectStatement__Group_11__1__Impl"
    // InternalLobsterLanguages.g:3121:1: rule__SelectStatement__Group_11__1__Impl : ( '{' ) ;
    public final void rule__SelectStatement__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3125:1: ( ( '{' ) )
            // InternalLobsterLanguages.g:3126:1: ( '{' )
            {
            // InternalLobsterLanguages.g:3126:1: ( '{' )
            // InternalLobsterLanguages.g:3127:2: '{'
            {
             before(grammarAccess.getSelectStatementAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getLeftCurlyBracketKeyword_11_1()); 

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
    // $ANTLR end "rule__SelectStatement__Group_11__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group_11__2"
    // InternalLobsterLanguages.g:3136:1: rule__SelectStatement__Group_11__2 : rule__SelectStatement__Group_11__2__Impl ;
    public final void rule__SelectStatement__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3140:1: ( rule__SelectStatement__Group_11__2__Impl )
            // InternalLobsterLanguages.g:3141:2: rule__SelectStatement__Group_11__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_11__2__Impl();

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
    // $ANTLR end "rule__SelectStatement__Group_11__2"


    // $ANTLR start "rule__SelectStatement__Group_11__2__Impl"
    // InternalLobsterLanguages.g:3147:1: rule__SelectStatement__Group_11__2__Impl : ( ( rule__SelectStatement__Group_11_2__0 )* ) ;
    public final void rule__SelectStatement__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3151:1: ( ( ( rule__SelectStatement__Group_11_2__0 )* ) )
            // InternalLobsterLanguages.g:3152:1: ( ( rule__SelectStatement__Group_11_2__0 )* )
            {
            // InternalLobsterLanguages.g:3152:1: ( ( rule__SelectStatement__Group_11_2__0 )* )
            // InternalLobsterLanguages.g:3153:2: ( rule__SelectStatement__Group_11_2__0 )*
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_11_2()); 
            // InternalLobsterLanguages.g:3154:2: ( rule__SelectStatement__Group_11_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLobsterLanguages.g:3154:3: rule__SelectStatement__Group_11_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__SelectStatement__Group_11_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSelectStatementAccess().getGroup_11_2()); 

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
    // $ANTLR end "rule__SelectStatement__Group_11__2__Impl"


    // $ANTLR start "rule__SelectStatement__Group_11_2__0"
    // InternalLobsterLanguages.g:3163:1: rule__SelectStatement__Group_11_2__0 : rule__SelectStatement__Group_11_2__0__Impl rule__SelectStatement__Group_11_2__1 ;
    public final void rule__SelectStatement__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3167:1: ( rule__SelectStatement__Group_11_2__0__Impl rule__SelectStatement__Group_11_2__1 )
            // InternalLobsterLanguages.g:3168:2: rule__SelectStatement__Group_11_2__0__Impl rule__SelectStatement__Group_11_2__1
            {
            pushFollow(FOLLOW_36);
            rule__SelectStatement__Group_11_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_11_2__1();

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
    // $ANTLR end "rule__SelectStatement__Group_11_2__0"


    // $ANTLR start "rule__SelectStatement__Group_11_2__0__Impl"
    // InternalLobsterLanguages.g:3175:1: rule__SelectStatement__Group_11_2__0__Impl : ( 'Column Name:' ) ;
    public final void rule__SelectStatement__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3179:1: ( ( 'Column Name:' ) )
            // InternalLobsterLanguages.g:3180:1: ( 'Column Name:' )
            {
            // InternalLobsterLanguages.g:3180:1: ( 'Column Name:' )
            // InternalLobsterLanguages.g:3181:2: 'Column Name:'
            {
             before(grammarAccess.getSelectStatementAccess().getColumnNameKeyword_11_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getColumnNameKeyword_11_2_0()); 

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
    // $ANTLR end "rule__SelectStatement__Group_11_2__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_11_2__1"
    // InternalLobsterLanguages.g:3190:1: rule__SelectStatement__Group_11_2__1 : rule__SelectStatement__Group_11_2__1__Impl rule__SelectStatement__Group_11_2__2 ;
    public final void rule__SelectStatement__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3194:1: ( rule__SelectStatement__Group_11_2__1__Impl rule__SelectStatement__Group_11_2__2 )
            // InternalLobsterLanguages.g:3195:2: rule__SelectStatement__Group_11_2__1__Impl rule__SelectStatement__Group_11_2__2
            {
            pushFollow(FOLLOW_36);
            rule__SelectStatement__Group_11_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_11_2__2();

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
    // $ANTLR end "rule__SelectStatement__Group_11_2__1"


    // $ANTLR start "rule__SelectStatement__Group_11_2__1__Impl"
    // InternalLobsterLanguages.g:3202:1: rule__SelectStatement__Group_11_2__1__Impl : ( ( rule__SelectStatement__Condition1Assignment_11_2_1 )* ) ;
    public final void rule__SelectStatement__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3206:1: ( ( ( rule__SelectStatement__Condition1Assignment_11_2_1 )* ) )
            // InternalLobsterLanguages.g:3207:1: ( ( rule__SelectStatement__Condition1Assignment_11_2_1 )* )
            {
            // InternalLobsterLanguages.g:3207:1: ( ( rule__SelectStatement__Condition1Assignment_11_2_1 )* )
            // InternalLobsterLanguages.g:3208:2: ( rule__SelectStatement__Condition1Assignment_11_2_1 )*
            {
             before(grammarAccess.getSelectStatementAccess().getCondition1Assignment_11_2_1()); 
            // InternalLobsterLanguages.g:3209:2: ( rule__SelectStatement__Condition1Assignment_11_2_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLobsterLanguages.g:3209:3: rule__SelectStatement__Condition1Assignment_11_2_1
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__SelectStatement__Condition1Assignment_11_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSelectStatementAccess().getCondition1Assignment_11_2_1()); 

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
    // $ANTLR end "rule__SelectStatement__Group_11_2__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group_11_2__2"
    // InternalLobsterLanguages.g:3217:1: rule__SelectStatement__Group_11_2__2 : rule__SelectStatement__Group_11_2__2__Impl ;
    public final void rule__SelectStatement__Group_11_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3221:1: ( rule__SelectStatement__Group_11_2__2__Impl )
            // InternalLobsterLanguages.g:3222:2: rule__SelectStatement__Group_11_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_11_2__2__Impl();

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
    // $ANTLR end "rule__SelectStatement__Group_11_2__2"


    // $ANTLR start "rule__SelectStatement__Group_11_2__2__Impl"
    // InternalLobsterLanguages.g:3228:1: rule__SelectStatement__Group_11_2__2__Impl : ( ( ',' )? ) ;
    public final void rule__SelectStatement__Group_11_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3232:1: ( ( ( ',' )? ) )
            // InternalLobsterLanguages.g:3233:1: ( ( ',' )? )
            {
            // InternalLobsterLanguages.g:3233:1: ( ( ',' )? )
            // InternalLobsterLanguages.g:3234:2: ( ',' )?
            {
             before(grammarAccess.getSelectStatementAccess().getCommaKeyword_11_2_2()); 
            // InternalLobsterLanguages.g:3235:2: ( ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLobsterLanguages.g:3235:3: ','
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSelectStatementAccess().getCommaKeyword_11_2_2()); 

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
    // $ANTLR end "rule__SelectStatement__Group_11_2__2__Impl"


    // $ANTLR start "rule__SelectStatement__Group_12__0"
    // InternalLobsterLanguages.g:3244:1: rule__SelectStatement__Group_12__0 : rule__SelectStatement__Group_12__0__Impl rule__SelectStatement__Group_12__1 ;
    public final void rule__SelectStatement__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3248:1: ( rule__SelectStatement__Group_12__0__Impl rule__SelectStatement__Group_12__1 )
            // InternalLobsterLanguages.g:3249:2: rule__SelectStatement__Group_12__0__Impl rule__SelectStatement__Group_12__1
            {
            pushFollow(FOLLOW_38);
            rule__SelectStatement__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_12__1();

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
    // $ANTLR end "rule__SelectStatement__Group_12__0"


    // $ANTLR start "rule__SelectStatement__Group_12__0__Impl"
    // InternalLobsterLanguages.g:3256:1: rule__SelectStatement__Group_12__0__Impl : ( 'sorted in' ) ;
    public final void rule__SelectStatement__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3260:1: ( ( 'sorted in' ) )
            // InternalLobsterLanguages.g:3261:1: ( 'sorted in' )
            {
            // InternalLobsterLanguages.g:3261:1: ( 'sorted in' )
            // InternalLobsterLanguages.g:3262:2: 'sorted in'
            {
             before(grammarAccess.getSelectStatementAccess().getSortedInKeyword_12_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getSortedInKeyword_12_0()); 

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
    // $ANTLR end "rule__SelectStatement__Group_12__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_12__1"
    // InternalLobsterLanguages.g:3271:1: rule__SelectStatement__Group_12__1 : rule__SelectStatement__Group_12__1__Impl ;
    public final void rule__SelectStatement__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3275:1: ( rule__SelectStatement__Group_12__1__Impl )
            // InternalLobsterLanguages.g:3276:2: rule__SelectStatement__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_12__1__Impl();

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
    // $ANTLR end "rule__SelectStatement__Group_12__1"


    // $ANTLR start "rule__SelectStatement__Group_12__1__Impl"
    // InternalLobsterLanguages.g:3282:1: rule__SelectStatement__Group_12__1__Impl : ( ( rule__SelectStatement__OrderAssignment_12_1 ) ) ;
    public final void rule__SelectStatement__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3286:1: ( ( ( rule__SelectStatement__OrderAssignment_12_1 ) ) )
            // InternalLobsterLanguages.g:3287:1: ( ( rule__SelectStatement__OrderAssignment_12_1 ) )
            {
            // InternalLobsterLanguages.g:3287:1: ( ( rule__SelectStatement__OrderAssignment_12_1 ) )
            // InternalLobsterLanguages.g:3288:2: ( rule__SelectStatement__OrderAssignment_12_1 )
            {
             before(grammarAccess.getSelectStatementAccess().getOrderAssignment_12_1()); 
            // InternalLobsterLanguages.g:3289:2: ( rule__SelectStatement__OrderAssignment_12_1 )
            // InternalLobsterLanguages.g:3289:3: rule__SelectStatement__OrderAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__OrderAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getOrderAssignment_12_1()); 

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
    // $ANTLR end "rule__SelectStatement__Group_12__1__Impl"


    // $ANTLR start "rule__ConditionStatement__Group__0"
    // InternalLobsterLanguages.g:3298:1: rule__ConditionStatement__Group__0 : rule__ConditionStatement__Group__0__Impl rule__ConditionStatement__Group__1 ;
    public final void rule__ConditionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3302:1: ( rule__ConditionStatement__Group__0__Impl rule__ConditionStatement__Group__1 )
            // InternalLobsterLanguages.g:3303:2: rule__ConditionStatement__Group__0__Impl rule__ConditionStatement__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ConditionStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionStatement__Group__1();

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
    // $ANTLR end "rule__ConditionStatement__Group__0"


    // $ANTLR start "rule__ConditionStatement__Group__0__Impl"
    // InternalLobsterLanguages.g:3310:1: rule__ConditionStatement__Group__0__Impl : ( 'Column Name:' ) ;
    public final void rule__ConditionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3314:1: ( ( 'Column Name:' ) )
            // InternalLobsterLanguages.g:3315:1: ( 'Column Name:' )
            {
            // InternalLobsterLanguages.g:3315:1: ( 'Column Name:' )
            // InternalLobsterLanguages.g:3316:2: 'Column Name:'
            {
             before(grammarAccess.getConditionStatementAccess().getColumnNameKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConditionStatementAccess().getColumnNameKeyword_0()); 

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
    // $ANTLR end "rule__ConditionStatement__Group__0__Impl"


    // $ANTLR start "rule__ConditionStatement__Group__1"
    // InternalLobsterLanguages.g:3325:1: rule__ConditionStatement__Group__1 : rule__ConditionStatement__Group__1__Impl rule__ConditionStatement__Group__2 ;
    public final void rule__ConditionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3329:1: ( rule__ConditionStatement__Group__1__Impl rule__ConditionStatement__Group__2 )
            // InternalLobsterLanguages.g:3330:2: rule__ConditionStatement__Group__1__Impl rule__ConditionStatement__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ConditionStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionStatement__Group__2();

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
    // $ANTLR end "rule__ConditionStatement__Group__1"


    // $ANTLR start "rule__ConditionStatement__Group__1__Impl"
    // InternalLobsterLanguages.g:3337:1: rule__ConditionStatement__Group__1__Impl : ( ( rule__ConditionStatement__ColumnAssignment_1 ) ) ;
    public final void rule__ConditionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3341:1: ( ( ( rule__ConditionStatement__ColumnAssignment_1 ) ) )
            // InternalLobsterLanguages.g:3342:1: ( ( rule__ConditionStatement__ColumnAssignment_1 ) )
            {
            // InternalLobsterLanguages.g:3342:1: ( ( rule__ConditionStatement__ColumnAssignment_1 ) )
            // InternalLobsterLanguages.g:3343:2: ( rule__ConditionStatement__ColumnAssignment_1 )
            {
             before(grammarAccess.getConditionStatementAccess().getColumnAssignment_1()); 
            // InternalLobsterLanguages.g:3344:2: ( rule__ConditionStatement__ColumnAssignment_1 )
            // InternalLobsterLanguages.g:3344:3: rule__ConditionStatement__ColumnAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionStatement__ColumnAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionStatementAccess().getColumnAssignment_1()); 

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
    // $ANTLR end "rule__ConditionStatement__Group__1__Impl"


    // $ANTLR start "rule__ConditionStatement__Group__2"
    // InternalLobsterLanguages.g:3352:1: rule__ConditionStatement__Group__2 : rule__ConditionStatement__Group__2__Impl rule__ConditionStatement__Group__3 ;
    public final void rule__ConditionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3356:1: ( rule__ConditionStatement__Group__2__Impl rule__ConditionStatement__Group__3 )
            // InternalLobsterLanguages.g:3357:2: rule__ConditionStatement__Group__2__Impl rule__ConditionStatement__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ConditionStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionStatement__Group__3();

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
    // $ANTLR end "rule__ConditionStatement__Group__2"


    // $ANTLR start "rule__ConditionStatement__Group__2__Impl"
    // InternalLobsterLanguages.g:3364:1: rule__ConditionStatement__Group__2__Impl : ( 'is' ) ;
    public final void rule__ConditionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3368:1: ( ( 'is' ) )
            // InternalLobsterLanguages.g:3369:1: ( 'is' )
            {
            // InternalLobsterLanguages.g:3369:1: ( 'is' )
            // InternalLobsterLanguages.g:3370:2: 'is'
            {
             before(grammarAccess.getConditionStatementAccess().getIsKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getConditionStatementAccess().getIsKeyword_2()); 

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
    // $ANTLR end "rule__ConditionStatement__Group__2__Impl"


    // $ANTLR start "rule__ConditionStatement__Group__3"
    // InternalLobsterLanguages.g:3379:1: rule__ConditionStatement__Group__3 : rule__ConditionStatement__Group__3__Impl rule__ConditionStatement__Group__4 ;
    public final void rule__ConditionStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3383:1: ( rule__ConditionStatement__Group__3__Impl rule__ConditionStatement__Group__4 )
            // InternalLobsterLanguages.g:3384:2: rule__ConditionStatement__Group__3__Impl rule__ConditionStatement__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__ConditionStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionStatement__Group__4();

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
    // $ANTLR end "rule__ConditionStatement__Group__3"


    // $ANTLR start "rule__ConditionStatement__Group__3__Impl"
    // InternalLobsterLanguages.g:3391:1: rule__ConditionStatement__Group__3__Impl : ( ( rule__ConditionStatement__ValueAssignment_3 ) ) ;
    public final void rule__ConditionStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3395:1: ( ( ( rule__ConditionStatement__ValueAssignment_3 ) ) )
            // InternalLobsterLanguages.g:3396:1: ( ( rule__ConditionStatement__ValueAssignment_3 ) )
            {
            // InternalLobsterLanguages.g:3396:1: ( ( rule__ConditionStatement__ValueAssignment_3 ) )
            // InternalLobsterLanguages.g:3397:2: ( rule__ConditionStatement__ValueAssignment_3 )
            {
             before(grammarAccess.getConditionStatementAccess().getValueAssignment_3()); 
            // InternalLobsterLanguages.g:3398:2: ( rule__ConditionStatement__ValueAssignment_3 )
            // InternalLobsterLanguages.g:3398:3: rule__ConditionStatement__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConditionStatement__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionStatementAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__ConditionStatement__Group__3__Impl"


    // $ANTLR start "rule__ConditionStatement__Group__4"
    // InternalLobsterLanguages.g:3406:1: rule__ConditionStatement__Group__4 : rule__ConditionStatement__Group__4__Impl ;
    public final void rule__ConditionStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3410:1: ( rule__ConditionStatement__Group__4__Impl )
            // InternalLobsterLanguages.g:3411:2: rule__ConditionStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionStatement__Group__4__Impl();

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
    // $ANTLR end "rule__ConditionStatement__Group__4"


    // $ANTLR start "rule__ConditionStatement__Group__4__Impl"
    // InternalLobsterLanguages.g:3417:1: rule__ConditionStatement__Group__4__Impl : ( ( ',' )? ) ;
    public final void rule__ConditionStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3421:1: ( ( ( ',' )? ) )
            // InternalLobsterLanguages.g:3422:1: ( ( ',' )? )
            {
            // InternalLobsterLanguages.g:3422:1: ( ( ',' )? )
            // InternalLobsterLanguages.g:3423:2: ( ',' )?
            {
             before(grammarAccess.getConditionStatementAccess().getCommaKeyword_4()); 
            // InternalLobsterLanguages.g:3424:2: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLobsterLanguages.g:3424:3: ','
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getConditionStatementAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__ConditionStatement__Group__4__Impl"


    // $ANTLR start "rule__LobsterProgram__StatementsAssignment"
    // InternalLobsterLanguages.g:3433:1: rule__LobsterProgram__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__LobsterProgram__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3437:1: ( ( ruleStatement ) )
            // InternalLobsterLanguages.g:3438:2: ( ruleStatement )
            {
            // InternalLobsterLanguages.g:3438:2: ( ruleStatement )
            // InternalLobsterLanguages.g:3439:3: ruleStatement
            {
             before(grammarAccess.getLobsterProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getLobsterProgramAccess().getStatementsStatementParserRuleCall_0()); 

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
    // $ANTLR end "rule__LobsterProgram__StatementsAssignment"


    // $ANTLR start "rule__VariableCharacter__NameAssignment_1"
    // InternalLobsterLanguages.g:3448:1: rule__VariableCharacter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableCharacter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3452:1: ( ( RULE_ID ) )
            // InternalLobsterLanguages.g:3453:2: ( RULE_ID )
            {
            // InternalLobsterLanguages.g:3453:2: ( RULE_ID )
            // InternalLobsterLanguages.g:3454:3: RULE_ID
            {
             before(grammarAccess.getVariableCharacterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableCharacterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VariableCharacter__NameAssignment_1"


    // $ANTLR start "rule__VariableCharacter__ValueAssignment_3"
    // InternalLobsterLanguages.g:3463:1: rule__VariableCharacter__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableCharacter__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3467:1: ( ( RULE_INT ) )
            // InternalLobsterLanguages.g:3468:2: ( RULE_INT )
            {
            // InternalLobsterLanguages.g:3468:2: ( RULE_INT )
            // InternalLobsterLanguages.g:3469:3: RULE_INT
            {
             before(grammarAccess.getVariableCharacterAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVariableCharacterAccess().getValueINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__VariableCharacter__ValueAssignment_3"


    // $ANTLR start "rule__CreateDatabaseStatement__DbnameAssignment_4"
    // InternalLobsterLanguages.g:3478:1: rule__CreateDatabaseStatement__DbnameAssignment_4 : ( rulePrimaryExpression ) ;
    public final void rule__CreateDatabaseStatement__DbnameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3482:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3483:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3483:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3484:3: rulePrimaryExpression
            {
             before(grammarAccess.getCreateDatabaseStatementAccess().getDbnamePrimaryExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getCreateDatabaseStatementAccess().getDbnamePrimaryExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__CreateDatabaseStatement__DbnameAssignment_4"


    // $ANTLR start "rule__CreateTableStatement__TbnameAssignment_4"
    // InternalLobsterLanguages.g:3493:1: rule__CreateTableStatement__TbnameAssignment_4 : ( rulePrimaryExpression ) ;
    public final void rule__CreateTableStatement__TbnameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3497:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3498:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3498:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3499:3: rulePrimaryExpression
            {
             before(grammarAccess.getCreateTableStatementAccess().getTbnamePrimaryExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getCreateTableStatementAccess().getTbnamePrimaryExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__CreateTableStatement__TbnameAssignment_4"


    // $ANTLR start "rule__CreateTableStatement__DbnameAssignment_6"
    // InternalLobsterLanguages.g:3508:1: rule__CreateTableStatement__DbnameAssignment_6 : ( rulePrimaryExpression ) ;
    public final void rule__CreateTableStatement__DbnameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3512:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3513:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3513:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3514:3: rulePrimaryExpression
            {
             before(grammarAccess.getCreateTableStatementAccess().getDbnamePrimaryExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getCreateTableStatementAccess().getDbnamePrimaryExpressionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__CreateTableStatement__DbnameAssignment_6"


    // $ANTLR start "rule__CreateTableStatement__ColumnsAssignment_9"
    // InternalLobsterLanguages.g:3523:1: rule__CreateTableStatement__ColumnsAssignment_9 : ( ruleCreateTableColumn ) ;
    public final void rule__CreateTableStatement__ColumnsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3527:1: ( ( ruleCreateTableColumn ) )
            // InternalLobsterLanguages.g:3528:2: ( ruleCreateTableColumn )
            {
            // InternalLobsterLanguages.g:3528:2: ( ruleCreateTableColumn )
            // InternalLobsterLanguages.g:3529:3: ruleCreateTableColumn
            {
             before(grammarAccess.getCreateTableStatementAccess().getColumnsCreateTableColumnParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleCreateTableColumn();

            state._fsp--;

             after(grammarAccess.getCreateTableStatementAccess().getColumnsCreateTableColumnParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__CreateTableStatement__ColumnsAssignment_9"


    // $ANTLR start "rule__CreateTableColumn__ColumnNameAssignment_1"
    // InternalLobsterLanguages.g:3538:1: rule__CreateTableColumn__ColumnNameAssignment_1 : ( rulePrimaryExpression ) ;
    public final void rule__CreateTableColumn__ColumnNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3542:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3543:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3543:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3544:3: rulePrimaryExpression
            {
             before(grammarAccess.getCreateTableColumnAccess().getColumnNamePrimaryExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getCreateTableColumnAccess().getColumnNamePrimaryExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CreateTableColumn__ColumnNameAssignment_1"


    // $ANTLR start "rule__CreateTableColumn__DatatypeAssignment_3"
    // InternalLobsterLanguages.g:3553:1: rule__CreateTableColumn__DatatypeAssignment_3 : ( ruleDataType ) ;
    public final void rule__CreateTableColumn__DatatypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3557:1: ( ( ruleDataType ) )
            // InternalLobsterLanguages.g:3558:2: ( ruleDataType )
            {
            // InternalLobsterLanguages.g:3558:2: ( ruleDataType )
            // InternalLobsterLanguages.g:3559:3: ruleDataType
            {
             before(grammarAccess.getCreateTableColumnAccess().getDatatypeDataTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getCreateTableColumnAccess().getDatatypeDataTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__CreateTableColumn__DatatypeAssignment_3"


    // $ANTLR start "rule__CreateTableColumn__SizeAssignment_5_2"
    // InternalLobsterLanguages.g:3568:1: rule__CreateTableColumn__SizeAssignment_5_2 : ( ruleIntLiteral ) ;
    public final void rule__CreateTableColumn__SizeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3572:1: ( ( ruleIntLiteral ) )
            // InternalLobsterLanguages.g:3573:2: ( ruleIntLiteral )
            {
            // InternalLobsterLanguages.g:3573:2: ( ruleIntLiteral )
            // InternalLobsterLanguages.g:3574:3: ruleIntLiteral
            {
             before(grammarAccess.getCreateTableColumnAccess().getSizeIntLiteralParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getCreateTableColumnAccess().getSizeIntLiteralParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__CreateTableColumn__SizeAssignment_5_2"


    // $ANTLR start "rule__InsertStatement__ColumnAssignment_3_1"
    // InternalLobsterLanguages.g:3583:1: rule__InsertStatement__ColumnAssignment_3_1 : ( rulePrimaryExpression ) ;
    public final void rule__InsertStatement__ColumnAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3587:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3588:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3588:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3589:3: rulePrimaryExpression
            {
             before(grammarAccess.getInsertStatementAccess().getColumnPrimaryExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getInsertStatementAccess().getColumnPrimaryExpressionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__InsertStatement__ColumnAssignment_3_1"


    // $ANTLR start "rule__InsertStatement__ValueAssignment_3_3"
    // InternalLobsterLanguages.g:3598:1: rule__InsertStatement__ValueAssignment_3_3 : ( rulePrimaryExpression ) ;
    public final void rule__InsertStatement__ValueAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3602:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3603:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3603:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3604:3: rulePrimaryExpression
            {
             before(grammarAccess.getInsertStatementAccess().getValuePrimaryExpressionParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getInsertStatementAccess().getValuePrimaryExpressionParserRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__InsertStatement__ValueAssignment_3_3"


    // $ANTLR start "rule__InsertStatement__TbnameAssignment_6"
    // InternalLobsterLanguages.g:3613:1: rule__InsertStatement__TbnameAssignment_6 : ( rulePrimaryExpression ) ;
    public final void rule__InsertStatement__TbnameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3617:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3618:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3618:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3619:3: rulePrimaryExpression
            {
             before(grammarAccess.getInsertStatementAccess().getTbnamePrimaryExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getInsertStatementAccess().getTbnamePrimaryExpressionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__InsertStatement__TbnameAssignment_6"


    // $ANTLR start "rule__DeleteDataStatement__ConditionAssignment_2"
    // InternalLobsterLanguages.g:3628:1: rule__DeleteDataStatement__ConditionAssignment_2 : ( ruleMoreConditionStatement ) ;
    public final void rule__DeleteDataStatement__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3632:1: ( ( ruleMoreConditionStatement ) )
            // InternalLobsterLanguages.g:3633:2: ( ruleMoreConditionStatement )
            {
            // InternalLobsterLanguages.g:3633:2: ( ruleMoreConditionStatement )
            // InternalLobsterLanguages.g:3634:3: ruleMoreConditionStatement
            {
             before(grammarAccess.getDeleteDataStatementAccess().getConditionMoreConditionStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMoreConditionStatement();

            state._fsp--;

             after(grammarAccess.getDeleteDataStatementAccess().getConditionMoreConditionStatementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DeleteDataStatement__ConditionAssignment_2"


    // $ANTLR start "rule__DeleteDataStatement__TbnameAssignment_6"
    // InternalLobsterLanguages.g:3643:1: rule__DeleteDataStatement__TbnameAssignment_6 : ( rulePrimaryExpression ) ;
    public final void rule__DeleteDataStatement__TbnameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3647:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3648:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3648:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3649:3: rulePrimaryExpression
            {
             before(grammarAccess.getDeleteDataStatementAccess().getTbnamePrimaryExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getDeleteDataStatementAccess().getTbnamePrimaryExpressionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__DeleteDataStatement__TbnameAssignment_6"


    // $ANTLR start "rule__MoreConditionStatement__ColumnAssignment_1"
    // InternalLobsterLanguages.g:3658:1: rule__MoreConditionStatement__ColumnAssignment_1 : ( rulePrimaryExpression ) ;
    public final void rule__MoreConditionStatement__ColumnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3662:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3663:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3663:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3664:3: rulePrimaryExpression
            {
             before(grammarAccess.getMoreConditionStatementAccess().getColumnPrimaryExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMoreConditionStatementAccess().getColumnPrimaryExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MoreConditionStatement__ColumnAssignment_1"


    // $ANTLR start "rule__MoreConditionStatement__ValueAssignment_3"
    // InternalLobsterLanguages.g:3673:1: rule__MoreConditionStatement__ValueAssignment_3 : ( rulePrimaryExpression ) ;
    public final void rule__MoreConditionStatement__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3677:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3678:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3678:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3679:3: rulePrimaryExpression
            {
             before(grammarAccess.getMoreConditionStatementAccess().getValuePrimaryExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMoreConditionStatementAccess().getValuePrimaryExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MoreConditionStatement__ValueAssignment_3"


    // $ANTLR start "rule__MoreConditionStatement__MoreconditionAssignment_4"
    // InternalLobsterLanguages.g:3688:1: rule__MoreConditionStatement__MoreconditionAssignment_4 : ( ruleMoreCondition ) ;
    public final void rule__MoreConditionStatement__MoreconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3692:1: ( ( ruleMoreCondition ) )
            // InternalLobsterLanguages.g:3693:2: ( ruleMoreCondition )
            {
            // InternalLobsterLanguages.g:3693:2: ( ruleMoreCondition )
            // InternalLobsterLanguages.g:3694:3: ruleMoreCondition
            {
             before(grammarAccess.getMoreConditionStatementAccess().getMoreconditionMoreConditionEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMoreCondition();

            state._fsp--;

             after(grammarAccess.getMoreConditionStatementAccess().getMoreconditionMoreConditionEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__MoreConditionStatement__MoreconditionAssignment_4"


    // $ANTLR start "rule__DeleteTableStatement__TbnameAssignment_1"
    // InternalLobsterLanguages.g:3703:1: rule__DeleteTableStatement__TbnameAssignment_1 : ( rulePrimaryExpression ) ;
    public final void rule__DeleteTableStatement__TbnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3707:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3708:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3708:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3709:3: rulePrimaryExpression
            {
             before(grammarAccess.getDeleteTableStatementAccess().getTbnamePrimaryExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getDeleteTableStatementAccess().getTbnamePrimaryExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DeleteTableStatement__TbnameAssignment_1"


    // $ANTLR start "rule__UpdateStatement__TbnameAssignment_1"
    // InternalLobsterLanguages.g:3718:1: rule__UpdateStatement__TbnameAssignment_1 : ( rulePrimaryExpression ) ;
    public final void rule__UpdateStatement__TbnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3722:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3723:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3723:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3724:3: rulePrimaryExpression
            {
             before(grammarAccess.getUpdateStatementAccess().getTbnamePrimaryExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getUpdateStatementAccess().getTbnamePrimaryExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UpdateStatement__TbnameAssignment_1"


    // $ANTLR start "rule__UpdateStatement__SetvalueAssignment_5"
    // InternalLobsterLanguages.g:3733:1: rule__UpdateStatement__SetvalueAssignment_5 : ( ruleConditionStatement ) ;
    public final void rule__UpdateStatement__SetvalueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3737:1: ( ( ruleConditionStatement ) )
            // InternalLobsterLanguages.g:3738:2: ( ruleConditionStatement )
            {
            // InternalLobsterLanguages.g:3738:2: ( ruleConditionStatement )
            // InternalLobsterLanguages.g:3739:3: ruleConditionStatement
            {
             before(grammarAccess.getUpdateStatementAccess().getSetvalueConditionStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionStatement();

            state._fsp--;

             after(grammarAccess.getUpdateStatementAccess().getSetvalueConditionStatementParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__UpdateStatement__SetvalueAssignment_5"


    // $ANTLR start "rule__UpdateStatement__ConditionAssignment_9"
    // InternalLobsterLanguages.g:3748:1: rule__UpdateStatement__ConditionAssignment_9 : ( ruleConditionStatement ) ;
    public final void rule__UpdateStatement__ConditionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3752:1: ( ( ruleConditionStatement ) )
            // InternalLobsterLanguages.g:3753:2: ( ruleConditionStatement )
            {
            // InternalLobsterLanguages.g:3753:2: ( ruleConditionStatement )
            // InternalLobsterLanguages.g:3754:3: ruleConditionStatement
            {
             before(grammarAccess.getUpdateStatementAccess().getConditionConditionStatementParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionStatement();

            state._fsp--;

             after(grammarAccess.getUpdateStatementAccess().getConditionConditionStatementParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__UpdateStatement__ConditionAssignment_9"


    // $ANTLR start "rule__SelectStatement__CaculateConditionAssignment_1_0"
    // InternalLobsterLanguages.g:3763:1: rule__SelectStatement__CaculateConditionAssignment_1_0 : ( ruleCaculateCondition ) ;
    public final void rule__SelectStatement__CaculateConditionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3767:1: ( ( ruleCaculateCondition ) )
            // InternalLobsterLanguages.g:3768:2: ( ruleCaculateCondition )
            {
            // InternalLobsterLanguages.g:3768:2: ( ruleCaculateCondition )
            // InternalLobsterLanguages.g:3769:3: ruleCaculateCondition
            {
             before(grammarAccess.getSelectStatementAccess().getCaculateConditionCaculateConditionEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCaculateCondition();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getCaculateConditionCaculateConditionEnumRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__SelectStatement__CaculateConditionAssignment_1_0"


    // $ANTLR start "rule__SelectStatement__ColumnAssignment_3"
    // InternalLobsterLanguages.g:3778:1: rule__SelectStatement__ColumnAssignment_3 : ( rulePrimaryExpression ) ;
    public final void rule__SelectStatement__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3782:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3783:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3783:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3784:3: rulePrimaryExpression
            {
             before(grammarAccess.getSelectStatementAccess().getColumnPrimaryExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getColumnPrimaryExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SelectStatement__ColumnAssignment_3"


    // $ANTLR start "rule__SelectStatement__ConditionAssignment_6"
    // InternalLobsterLanguages.g:3793:1: rule__SelectStatement__ConditionAssignment_6 : ( ruleConditionStatement ) ;
    public final void rule__SelectStatement__ConditionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3797:1: ( ( ruleConditionStatement ) )
            // InternalLobsterLanguages.g:3798:2: ( ruleConditionStatement )
            {
            // InternalLobsterLanguages.g:3798:2: ( ruleConditionStatement )
            // InternalLobsterLanguages.g:3799:3: ruleConditionStatement
            {
             before(grammarAccess.getSelectStatementAccess().getConditionConditionStatementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionStatement();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getConditionConditionStatementParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__SelectStatement__ConditionAssignment_6"


    // $ANTLR start "rule__SelectStatement__TbnameAssignment_10"
    // InternalLobsterLanguages.g:3808:1: rule__SelectStatement__TbnameAssignment_10 : ( rulePrimaryExpression ) ;
    public final void rule__SelectStatement__TbnameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3812:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3813:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3813:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3814:3: rulePrimaryExpression
            {
             before(grammarAccess.getSelectStatementAccess().getTbnamePrimaryExpressionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getTbnamePrimaryExpressionParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__SelectStatement__TbnameAssignment_10"


    // $ANTLR start "rule__SelectStatement__Condition1Assignment_11_2_1"
    // InternalLobsterLanguages.g:3823:1: rule__SelectStatement__Condition1Assignment_11_2_1 : ( rulePrimaryExpression ) ;
    public final void rule__SelectStatement__Condition1Assignment_11_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3827:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3828:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3828:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3829:3: rulePrimaryExpression
            {
             before(grammarAccess.getSelectStatementAccess().getCondition1PrimaryExpressionParserRuleCall_11_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getCondition1PrimaryExpressionParserRuleCall_11_2_1_0()); 

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
    // $ANTLR end "rule__SelectStatement__Condition1Assignment_11_2_1"


    // $ANTLR start "rule__SelectStatement__OrderAssignment_12_1"
    // InternalLobsterLanguages.g:3838:1: rule__SelectStatement__OrderAssignment_12_1 : ( ruleOrder ) ;
    public final void rule__SelectStatement__OrderAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3842:1: ( ( ruleOrder ) )
            // InternalLobsterLanguages.g:3843:2: ( ruleOrder )
            {
            // InternalLobsterLanguages.g:3843:2: ( ruleOrder )
            // InternalLobsterLanguages.g:3844:3: ruleOrder
            {
             before(grammarAccess.getSelectStatementAccess().getOrderOrderEnumRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getOrderOrderEnumRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__SelectStatement__OrderAssignment_12_1"


    // $ANTLR start "rule__ConditionStatement__ColumnAssignment_1"
    // InternalLobsterLanguages.g:3853:1: rule__ConditionStatement__ColumnAssignment_1 : ( rulePrimaryExpression ) ;
    public final void rule__ConditionStatement__ColumnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3857:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3858:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3858:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3859:3: rulePrimaryExpression
            {
             before(grammarAccess.getConditionStatementAccess().getColumnPrimaryExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getConditionStatementAccess().getColumnPrimaryExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConditionStatement__ColumnAssignment_1"


    // $ANTLR start "rule__ConditionStatement__ValueAssignment_3"
    // InternalLobsterLanguages.g:3868:1: rule__ConditionStatement__ValueAssignment_3 : ( rulePrimaryExpression ) ;
    public final void rule__ConditionStatement__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3872:1: ( ( rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:3873:2: ( rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:3873:2: ( rulePrimaryExpression )
            // InternalLobsterLanguages.g:3874:3: rulePrimaryExpression
            {
             before(grammarAccess.getConditionStatementAccess().getValuePrimaryExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getConditionStatementAccess().getValuePrimaryExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ConditionStatement__ValueAssignment_3"


    // $ANTLR start "rule__CharLiteral__VacAssignment"
    // InternalLobsterLanguages.g:3883:1: rule__CharLiteral__VacAssignment : ( RULE_STRING ) ;
    public final void rule__CharLiteral__VacAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3887:1: ( ( RULE_STRING ) )
            // InternalLobsterLanguages.g:3888:2: ( RULE_STRING )
            {
            // InternalLobsterLanguages.g:3888:2: ( RULE_STRING )
            // InternalLobsterLanguages.g:3889:3: RULE_STRING
            {
             before(grammarAccess.getCharLiteralAccess().getVacSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCharLiteralAccess().getVacSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__CharLiteral__VacAssignment"


    // $ANTLR start "rule__IntLiteral__ValAssignment"
    // InternalLobsterLanguages.g:3898:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3902:1: ( ( RULE_INT ) )
            // InternalLobsterLanguages.g:3903:2: ( RULE_INT )
            {
            // InternalLobsterLanguages.g:3903:2: ( RULE_INT )
            // InternalLobsterLanguages.g:3904:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IntLiteral__ValAssignment"


    // $ANTLR start "rule__VariableReference__VarAssignment"
    // InternalLobsterLanguages.g:3913:1: rule__VariableReference__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLobsterLanguages.g:3917:1: ( ( ( RULE_ID ) ) )
            // InternalLobsterLanguages.g:3918:2: ( ( RULE_ID ) )
            {
            // InternalLobsterLanguages.g:3918:2: ( ( RULE_ID ) )
            // InternalLobsterLanguages.g:3919:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableReferenceAccess().getVarVariableCharacterCrossReference_0()); 
            // InternalLobsterLanguages.g:3920:3: ( RULE_ID )
            // InternalLobsterLanguages.g:3921:4: RULE_ID
            {
             before(grammarAccess.getVariableReferenceAccess().getVarVariableCharacterIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableReferenceAccess().getVarVariableCharacterIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVariableReferenceAccess().getVarVariableCharacterCrossReference_0()); 

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
    // $ANTLR end "rule__VariableReference__VarAssignment"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\27\1\32\6\uffff\1\33\2\uffff";
    static final String dfa_3s = "\1\64\1\32\6\uffff\1\35\2\uffff";
    static final String dfa_4s = "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\2\1\1";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\1\uffff\1\1\20\uffff\1\2\2\uffff\1\3\2\uffff\1\4\1\5\2\uffff\1\6",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\uffff\1\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "541:1: rule__Statement__Alternatives : ( ( ruleCreateDatabaseStatement ) | ( ruleCreateTableStatement ) | ( ruleInsertStatement ) | ( ruleDeleteDataStatement ) | ( ruleDeleteTableStatement ) | ( ruleUpdateStatement ) | ( ruleSelectStatement ) | ( ruleVariableCharacter ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0013240002800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000004001F0000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00C0000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000070L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000600000L});

}