package kcl.mmdd.course.languages.lobster.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import kcl.mmdd.course.languages.lobster.services.LobsterLanguagesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLobsterLanguagesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'Create'", "'a'", "'database'", "'named'", "'table'", "'in'", "'include'", "'{'", "'}'", "'Column Name:'", "'is'", "'type'", "'('", "'max'", "'characters'", "')'", "','", "'Insert'", "'value'", "'into'", "'Delete'", "'from'", "'Table'", "'Delete All From'", "'Update'", "'set'", "'where'", "'Find out'", "'of'", "'order by'", "'sorted in'", "'Integer'", "'Character'", "'and'", "'or'", "'finish'", "'maximum'", "'minimum'", "'average'", "'count'", "'sum'", "'ascending'", "'descending'"
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

        public InternalLobsterLanguagesParser(TokenStream input, LobsterLanguagesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "LobsterProgram";
       	}

       	@Override
       	protected LobsterLanguagesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLobsterProgram"
    // InternalLobsterLanguages.g:65:1: entryRuleLobsterProgram returns [EObject current=null] : iv_ruleLobsterProgram= ruleLobsterProgram EOF ;
    public final EObject entryRuleLobsterProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLobsterProgram = null;


        try {
            // InternalLobsterLanguages.g:65:55: (iv_ruleLobsterProgram= ruleLobsterProgram EOF )
            // InternalLobsterLanguages.g:66:2: iv_ruleLobsterProgram= ruleLobsterProgram EOF
            {
             newCompositeNode(grammarAccess.getLobsterProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLobsterProgram=ruleLobsterProgram();

            state._fsp--;

             current =iv_ruleLobsterProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLobsterProgram"


    // $ANTLR start "ruleLobsterProgram"
    // InternalLobsterLanguages.g:72:1: ruleLobsterProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleLobsterProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalLobsterLanguages.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalLobsterLanguages.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalLobsterLanguages.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13||LA1_0==30||LA1_0==33||(LA1_0>=36 && LA1_0<=37)||LA1_0==40) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLobsterLanguages.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalLobsterLanguages.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalLobsterLanguages.g:81:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getLobsterProgramAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getLobsterProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"kcl.mmdd.course.languages.lobster.LobsterLanguages.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLobsterProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalLobsterLanguages.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalLobsterLanguages.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalLobsterLanguages.g:102:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalLobsterLanguages.g:108:1: ruleStatement returns [EObject current=null] : (this_CreateDatabaseStatement_0= ruleCreateDatabaseStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_InsertStatement_2= ruleInsertStatement | this_DeleteDataStatement_3= ruleDeleteDataStatement | this_DeleteTableStatement_4= ruleDeleteTableStatement | this_UpdateStatement_5= ruleUpdateStatement | this_SelectStatement_6= ruleSelectStatement | this_VariableCharacter_7= ruleVariableCharacter ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_CreateDatabaseStatement_0 = null;

        EObject this_CreateTableStatement_1 = null;

        EObject this_InsertStatement_2 = null;

        EObject this_DeleteDataStatement_3 = null;

        EObject this_DeleteTableStatement_4 = null;

        EObject this_UpdateStatement_5 = null;

        EObject this_SelectStatement_6 = null;

        EObject this_VariableCharacter_7 = null;



        	enterRule();

        try {
            // InternalLobsterLanguages.g:114:2: ( (this_CreateDatabaseStatement_0= ruleCreateDatabaseStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_InsertStatement_2= ruleInsertStatement | this_DeleteDataStatement_3= ruleDeleteDataStatement | this_DeleteTableStatement_4= ruleDeleteTableStatement | this_UpdateStatement_5= ruleUpdateStatement | this_SelectStatement_6= ruleSelectStatement | this_VariableCharacter_7= ruleVariableCharacter ) )
            // InternalLobsterLanguages.g:115:2: (this_CreateDatabaseStatement_0= ruleCreateDatabaseStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_InsertStatement_2= ruleInsertStatement | this_DeleteDataStatement_3= ruleDeleteDataStatement | this_DeleteTableStatement_4= ruleDeleteTableStatement | this_UpdateStatement_5= ruleUpdateStatement | this_SelectStatement_6= ruleSelectStatement | this_VariableCharacter_7= ruleVariableCharacter )
            {
            // InternalLobsterLanguages.g:115:2: (this_CreateDatabaseStatement_0= ruleCreateDatabaseStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_InsertStatement_2= ruleInsertStatement | this_DeleteDataStatement_3= ruleDeleteDataStatement | this_DeleteTableStatement_4= ruleDeleteTableStatement | this_UpdateStatement_5= ruleUpdateStatement | this_SelectStatement_6= ruleSelectStatement | this_VariableCharacter_7= ruleVariableCharacter )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalLobsterLanguages.g:116:3: this_CreateDatabaseStatement_0= ruleCreateDatabaseStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCreateDatabaseStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateDatabaseStatement_0=ruleCreateDatabaseStatement();

                    state._fsp--;


                    			current = this_CreateDatabaseStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLobsterLanguages.g:125:3: this_CreateTableStatement_1= ruleCreateTableStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCreateTableStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateTableStatement_1=ruleCreateTableStatement();

                    state._fsp--;


                    			current = this_CreateTableStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLobsterLanguages.g:134:3: this_InsertStatement_2= ruleInsertStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getInsertStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InsertStatement_2=ruleInsertStatement();

                    state._fsp--;


                    			current = this_InsertStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLobsterLanguages.g:143:3: this_DeleteDataStatement_3= ruleDeleteDataStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDeleteDataStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeleteDataStatement_3=ruleDeleteDataStatement();

                    state._fsp--;


                    			current = this_DeleteDataStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalLobsterLanguages.g:152:3: this_DeleteTableStatement_4= ruleDeleteTableStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDeleteTableStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeleteTableStatement_4=ruleDeleteTableStatement();

                    state._fsp--;


                    			current = this_DeleteTableStatement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalLobsterLanguages.g:161:3: this_UpdateStatement_5= ruleUpdateStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_UpdateStatement_5=ruleUpdateStatement();

                    state._fsp--;


                    			current = this_UpdateStatement_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalLobsterLanguages.g:170:3: this_SelectStatement_6= ruleSelectStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectStatement_6=ruleSelectStatement();

                    state._fsp--;


                    			current = this_SelectStatement_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalLobsterLanguages.g:179:3: this_VariableCharacter_7= ruleVariableCharacter
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableCharacterParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableCharacter_7=ruleVariableCharacter();

                    state._fsp--;


                    			current = this_VariableCharacter_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariableCharacter"
    // InternalLobsterLanguages.g:191:1: entryRuleVariableCharacter returns [EObject current=null] : iv_ruleVariableCharacter= ruleVariableCharacter EOF ;
    public final EObject entryRuleVariableCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCharacter = null;


        try {
            // InternalLobsterLanguages.g:191:58: (iv_ruleVariableCharacter= ruleVariableCharacter EOF )
            // InternalLobsterLanguages.g:192:2: iv_ruleVariableCharacter= ruleVariableCharacter EOF
            {
             newCompositeNode(grammarAccess.getVariableCharacterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableCharacter=ruleVariableCharacter();

            state._fsp--;

             current =iv_ruleVariableCharacter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableCharacter"


    // $ANTLR start "ruleVariableCharacter"
    // InternalLobsterLanguages.g:198:1: ruleVariableCharacter returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalLobsterLanguages.g:204:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalLobsterLanguages.g:205:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalLobsterLanguages.g:205:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalLobsterLanguages.g:206:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableCharacterAccess().getVarKeyword_0());
            		
            // InternalLobsterLanguages.g:210:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLobsterLanguages.g:211:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLobsterLanguages.g:211:4: (lv_name_1_0= RULE_ID )
            // InternalLobsterLanguages.g:212:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableCharacterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableCharacterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableCharacterAccess().getEqualsSignKeyword_2());
            		
            // InternalLobsterLanguages.g:232:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalLobsterLanguages.g:233:4: (lv_value_3_0= RULE_INT )
            {
            // InternalLobsterLanguages.g:233:4: (lv_value_3_0= RULE_INT )
            // InternalLobsterLanguages.g:234:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getVariableCharacterAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableCharacterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableCharacter"


    // $ANTLR start "entryRuleCreateDatabaseStatement"
    // InternalLobsterLanguages.g:254:1: entryRuleCreateDatabaseStatement returns [EObject current=null] : iv_ruleCreateDatabaseStatement= ruleCreateDatabaseStatement EOF ;
    public final EObject entryRuleCreateDatabaseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateDatabaseStatement = null;


        try {
            // InternalLobsterLanguages.g:254:64: (iv_ruleCreateDatabaseStatement= ruleCreateDatabaseStatement EOF )
            // InternalLobsterLanguages.g:255:2: iv_ruleCreateDatabaseStatement= ruleCreateDatabaseStatement EOF
            {
             newCompositeNode(grammarAccess.getCreateDatabaseStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateDatabaseStatement=ruleCreateDatabaseStatement();

            state._fsp--;

             current =iv_ruleCreateDatabaseStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateDatabaseStatement"


    // $ANTLR start "ruleCreateDatabaseStatement"
    // InternalLobsterLanguages.g:261:1: ruleCreateDatabaseStatement returns [EObject current=null] : (otherlv_0= 'Create' otherlv_1= 'a' otherlv_2= 'database' otherlv_3= 'named' ( (lv_dbname_4_0= rulePrimaryExpression ) ) ) ;
    public final EObject ruleCreateDatabaseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_dbname_4_0 = null;



        	enterRule();

        try {
            // InternalLobsterLanguages.g:267:2: ( (otherlv_0= 'Create' otherlv_1= 'a' otherlv_2= 'database' otherlv_3= 'named' ( (lv_dbname_4_0= rulePrimaryExpression ) ) ) )
            // InternalLobsterLanguages.g:268:2: (otherlv_0= 'Create' otherlv_1= 'a' otherlv_2= 'database' otherlv_3= 'named' ( (lv_dbname_4_0= rulePrimaryExpression ) ) )
            {
            // InternalLobsterLanguages.g:268:2: (otherlv_0= 'Create' otherlv_1= 'a' otherlv_2= 'database' otherlv_3= 'named' ( (lv_dbname_4_0= rulePrimaryExpression ) ) )
            // InternalLobsterLanguages.g:269:3: otherlv_0= 'Create' otherlv_1= 'a' otherlv_2= 'database' otherlv_3= 'named' ( (lv_dbname_4_0= rulePrimaryExpression ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateDatabaseStatementAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateDatabaseStatementAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateDatabaseStatementAccess().getDatabaseKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateDatabaseStatementAccess().getNamedKeyword_3());
            		
            // InternalLobsterLanguages.g:285:3: ( (lv_dbname_4_0= rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:286:4: (lv_dbname_4_0= rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:286:4: (lv_dbname_4_0= rulePrimaryExpression )
            // InternalLobsterLanguages.g:287:5: lv_dbname_4_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getCreateDatabaseStatementAccess().getDbnamePrimaryExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_dbname_4_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateDatabaseStatementRule());
            					}
            					set(
            						current,
            						"dbname",
            						lv_dbname_4_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateDatabaseStatement"


    // $ANTLR start "entryRuleCreateTableStatement"
    // InternalLobsterLanguages.g:308:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // InternalLobsterLanguages.g:308:61: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // InternalLobsterLanguages.g:309:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
            {
             newCompositeNode(grammarAccess.getCreateTableStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateTableStatement=ruleCreateTableStatement();

            state._fsp--;

             current =iv_ruleCreateTableStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateTableStatement"


    // $ANTLR start "ruleCreateTableStatement"
    // InternalLobsterLanguages.g:315:1: ruleCreateTableStatement returns [EObject current=null] : (otherlv_0= 'Create' otherlv_1= 'a' otherlv_2= 'table' otherlv_3= 'named' ( (lv_tbname_4_0= rulePrimaryExpression ) ) otherlv_5= 'in' ( (lv_dbname_6_0= rulePrimaryExpression ) ) otherlv_7= 'include' otherlv_8= '{' ( (lv_columns_9_0= ruleCreateTableColumn ) )* otherlv_10= '}' ) ;
    public final EObject ruleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_tbname_4_0 = null;

        EObject lv_dbname_6_0 = null;

        EObject lv_columns_9_0 = null;



        	enterRule();

        try {
            // InternalLobsterLanguages.g:321:2: ( (otherlv_0= 'Create' otherlv_1= 'a' otherlv_2= 'table' otherlv_3= 'named' ( (lv_tbname_4_0= rulePrimaryExpression ) ) otherlv_5= 'in' ( (lv_dbname_6_0= rulePrimaryExpression ) ) otherlv_7= 'include' otherlv_8= '{' ( (lv_columns_9_0= ruleCreateTableColumn ) )* otherlv_10= '}' ) )
            // InternalLobsterLanguages.g:322:2: (otherlv_0= 'Create' otherlv_1= 'a' otherlv_2= 'table' otherlv_3= 'named' ( (lv_tbname_4_0= rulePrimaryExpression ) ) otherlv_5= 'in' ( (lv_dbname_6_0= rulePrimaryExpression ) ) otherlv_7= 'include' otherlv_8= '{' ( (lv_columns_9_0= ruleCreateTableColumn ) )* otherlv_10= '}' )
            {
            // InternalLobsterLanguages.g:322:2: (otherlv_0= 'Create' otherlv_1= 'a' otherlv_2= 'table' otherlv_3= 'named' ( (lv_tbname_4_0= rulePrimaryExpression ) ) otherlv_5= 'in' ( (lv_dbname_6_0= rulePrimaryExpression ) ) otherlv_7= 'include' otherlv_8= '{' ( (lv_columns_9_0= ruleCreateTableColumn ) )* otherlv_10= '}' )
            // InternalLobsterLanguages.g:323:3: otherlv_0= 'Create' otherlv_1= 'a' otherlv_2= 'table' otherlv_3= 'named' ( (lv_tbname_4_0= rulePrimaryExpression ) ) otherlv_5= 'in' ( (lv_dbname_6_0= rulePrimaryExpression ) ) otherlv_7= 'include' otherlv_8= '{' ( (lv_columns_9_0= ruleCreateTableColumn ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateTableStatementAccess().getTableKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateTableStatementAccess().getNamedKeyword_3());
            		
            // InternalLobsterLanguages.g:339:3: ( (lv_tbname_4_0= rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:340:4: (lv_tbname_4_0= rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:340:4: (lv_tbname_4_0= rulePrimaryExpression )
            // InternalLobsterLanguages.g:341:5: lv_tbname_4_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getCreateTableStatementAccess().getTbnamePrimaryExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_tbname_4_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            					}
            					set(
            						current,
            						"tbname",
            						lv_tbname_4_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getCreateTableStatementAccess().getInKeyword_5());
            		
            // InternalLobsterLanguages.g:362:3: ( (lv_dbname_6_0= rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:363:4: (lv_dbname_6_0= rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:363:4: (lv_dbname_6_0= rulePrimaryExpression )
            // InternalLobsterLanguages.g:364:5: lv_dbname_6_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getCreateTableStatementAccess().getDbnamePrimaryExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_dbname_6_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            					}
            					set(
            						current,
            						"dbname",
            						lv_dbname_6_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getCreateTableStatementAccess().getIncludeKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getCreateTableStatementAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalLobsterLanguages.g:389:3: ( (lv_columns_9_0= ruleCreateTableColumn ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLobsterLanguages.g:390:4: (lv_columns_9_0= ruleCreateTableColumn )
            	    {
            	    // InternalLobsterLanguages.g:390:4: (lv_columns_9_0= ruleCreateTableColumn )
            	    // InternalLobsterLanguages.g:391:5: lv_columns_9_0= ruleCreateTableColumn
            	    {

            	    					newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnsCreateTableColumnParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_columns_9_0=ruleCreateTableColumn();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"columns",
            	    						lv_columns_9_0,
            	    						"kcl.mmdd.course.languages.lobster.LobsterLanguages.CreateTableColumn");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCreateTableStatementAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateTableStatement"


    // $ANTLR start "entryRuleCreateTableColumn"
    // InternalLobsterLanguages.g:416:1: entryRuleCreateTableColumn returns [EObject current=null] : iv_ruleCreateTableColumn= ruleCreateTableColumn EOF ;
    public final EObject entryRuleCreateTableColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableColumn = null;


        try {
            // InternalLobsterLanguages.g:416:58: (iv_ruleCreateTableColumn= ruleCreateTableColumn EOF )
            // InternalLobsterLanguages.g:417:2: iv_ruleCreateTableColumn= ruleCreateTableColumn EOF
            {
             newCompositeNode(grammarAccess.getCreateTableColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateTableColumn=ruleCreateTableColumn();

            state._fsp--;

             current =iv_ruleCreateTableColumn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateTableColumn"


    // $ANTLR start "ruleCreateTableColumn"
    // InternalLobsterLanguages.g:423:1: ruleCreateTableColumn returns [EObject current=null] : (otherlv_0= 'Column Name:' ( (lv_columnName_1_0= rulePrimaryExpression ) ) otherlv_2= 'is' ( (lv_datatype_3_0= ruleDataType ) ) otherlv_4= 'type' (otherlv_5= '(' otherlv_6= 'max' ( (lv_size_7_0= ruleIntLiteral ) ) otherlv_8= 'characters' otherlv_9= ')' )? (otherlv_10= ',' )? ) ;
    public final EObject ruleCreateTableColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_columnName_1_0 = null;

        Enumerator lv_datatype_3_0 = null;

        EObject lv_size_7_0 = null;



        	enterRule();

        try {
            // InternalLobsterLanguages.g:429:2: ( (otherlv_0= 'Column Name:' ( (lv_columnName_1_0= rulePrimaryExpression ) ) otherlv_2= 'is' ( (lv_datatype_3_0= ruleDataType ) ) otherlv_4= 'type' (otherlv_5= '(' otherlv_6= 'max' ( (lv_size_7_0= ruleIntLiteral ) ) otherlv_8= 'characters' otherlv_9= ')' )? (otherlv_10= ',' )? ) )
            // InternalLobsterLanguages.g:430:2: (otherlv_0= 'Column Name:' ( (lv_columnName_1_0= rulePrimaryExpression ) ) otherlv_2= 'is' ( (lv_datatype_3_0= ruleDataType ) ) otherlv_4= 'type' (otherlv_5= '(' otherlv_6= 'max' ( (lv_size_7_0= ruleIntLiteral ) ) otherlv_8= 'characters' otherlv_9= ')' )? (otherlv_10= ',' )? )
            {
            // InternalLobsterLanguages.g:430:2: (otherlv_0= 'Column Name:' ( (lv_columnName_1_0= rulePrimaryExpression ) ) otherlv_2= 'is' ( (lv_datatype_3_0= ruleDataType ) ) otherlv_4= 'type' (otherlv_5= '(' otherlv_6= 'max' ( (lv_size_7_0= ruleIntLiteral ) ) otherlv_8= 'characters' otherlv_9= ')' )? (otherlv_10= ',' )? )
            // InternalLobsterLanguages.g:431:3: otherlv_0= 'Column Name:' ( (lv_columnName_1_0= rulePrimaryExpression ) ) otherlv_2= 'is' ( (lv_datatype_3_0= ruleDataType ) ) otherlv_4= 'type' (otherlv_5= '(' otherlv_6= 'max' ( (lv_size_7_0= ruleIntLiteral ) ) otherlv_8= 'characters' otherlv_9= ')' )? (otherlv_10= ',' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateTableColumnAccess().getColumnNameKeyword_0());
            		
            // InternalLobsterLanguages.g:435:3: ( (lv_columnName_1_0= rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:436:4: (lv_columnName_1_0= rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:436:4: (lv_columnName_1_0= rulePrimaryExpression )
            // InternalLobsterLanguages.g:437:5: lv_columnName_1_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getCreateTableColumnAccess().getColumnNamePrimaryExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_columnName_1_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateTableColumnRule());
            					}
            					set(
            						current,
            						"columnName",
            						lv_columnName_1_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateTableColumnAccess().getIsKeyword_2());
            		
            // InternalLobsterLanguages.g:458:3: ( (lv_datatype_3_0= ruleDataType ) )
            // InternalLobsterLanguages.g:459:4: (lv_datatype_3_0= ruleDataType )
            {
            // InternalLobsterLanguages.g:459:4: (lv_datatype_3_0= ruleDataType )
            // InternalLobsterLanguages.g:460:5: lv_datatype_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getCreateTableColumnAccess().getDatatypeDataTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_datatype_3_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateTableColumnRule());
            					}
            					set(
            						current,
            						"datatype",
            						lv_datatype_3_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getCreateTableColumnAccess().getTypeKeyword_4());
            		
            // InternalLobsterLanguages.g:481:3: (otherlv_5= '(' otherlv_6= 'max' ( (lv_size_7_0= ruleIntLiteral ) ) otherlv_8= 'characters' otherlv_9= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalLobsterLanguages.g:482:4: otherlv_5= '(' otherlv_6= 'max' ( (lv_size_7_0= ruleIntLiteral ) ) otherlv_8= 'characters' otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getCreateTableColumnAccess().getLeftParenthesisKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getCreateTableColumnAccess().getMaxKeyword_5_1());
                    			
                    // InternalLobsterLanguages.g:490:4: ( (lv_size_7_0= ruleIntLiteral ) )
                    // InternalLobsterLanguages.g:491:5: (lv_size_7_0= ruleIntLiteral )
                    {
                    // InternalLobsterLanguages.g:491:5: (lv_size_7_0= ruleIntLiteral )
                    // InternalLobsterLanguages.g:492:6: lv_size_7_0= ruleIntLiteral
                    {

                    						newCompositeNode(grammarAccess.getCreateTableColumnAccess().getSizeIntLiteralParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_size_7_0=ruleIntLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreateTableColumnRule());
                    						}
                    						set(
                    							current,
                    							"size",
                    							lv_size_7_0,
                    							"kcl.mmdd.course.languages.lobster.LobsterLanguages.IntLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getCreateTableColumnAccess().getCharactersKeyword_5_3());
                    			
                    otherlv_9=(Token)match(input,28,FOLLOW_23); 

                    				newLeafNode(otherlv_9, grammarAccess.getCreateTableColumnAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalLobsterLanguages.g:518:3: (otherlv_10= ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalLobsterLanguages.g:519:4: otherlv_10= ','
                    {
                    otherlv_10=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getCreateTableColumnAccess().getCommaKeyword_6());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateTableColumn"


    // $ANTLR start "entryRuleInsertStatement"
    // InternalLobsterLanguages.g:528:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // InternalLobsterLanguages.g:528:56: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // InternalLobsterLanguages.g:529:2: iv_ruleInsertStatement= ruleInsertStatement EOF
            {
             newCompositeNode(grammarAccess.getInsertStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsertStatement=ruleInsertStatement();

            state._fsp--;

             current =iv_ruleInsertStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsertStatement"


    // $ANTLR start "ruleInsertStatement"
    // InternalLobsterLanguages.g:535:1: ruleInsertStatement returns [EObject current=null] : (otherlv_0= 'Insert' otherlv_1= 'value' otherlv_2= '{' (otherlv_3= 'Column Name:' ( (lv_column_4_0= rulePrimaryExpression ) ) otherlv_5= 'is' ( (lv_value_6_0= rulePrimaryExpression ) ) (otherlv_7= ',' )? )* otherlv_8= '}' otherlv_9= 'into' ( (lv_tbname_10_0= rulePrimaryExpression ) ) otherlv_11= 'table' ) ;
    public final EObject ruleInsertStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_column_4_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_tbname_10_0 = null;



        	enterRule();

        try {
            // InternalLobsterLanguages.g:541:2: ( (otherlv_0= 'Insert' otherlv_1= 'value' otherlv_2= '{' (otherlv_3= 'Column Name:' ( (lv_column_4_0= rulePrimaryExpression ) ) otherlv_5= 'is' ( (lv_value_6_0= rulePrimaryExpression ) ) (otherlv_7= ',' )? )* otherlv_8= '}' otherlv_9= 'into' ( (lv_tbname_10_0= rulePrimaryExpression ) ) otherlv_11= 'table' ) )
            // InternalLobsterLanguages.g:542:2: (otherlv_0= 'Insert' otherlv_1= 'value' otherlv_2= '{' (otherlv_3= 'Column Name:' ( (lv_column_4_0= rulePrimaryExpression ) ) otherlv_5= 'is' ( (lv_value_6_0= rulePrimaryExpression ) ) (otherlv_7= ',' )? )* otherlv_8= '}' otherlv_9= 'into' ( (lv_tbname_10_0= rulePrimaryExpression ) ) otherlv_11= 'table' )
            {
            // InternalLobsterLanguages.g:542:2: (otherlv_0= 'Insert' otherlv_1= 'value' otherlv_2= '{' (otherlv_3= 'Column Name:' ( (lv_column_4_0= rulePrimaryExpression ) ) otherlv_5= 'is' ( (lv_value_6_0= rulePrimaryExpression ) ) (otherlv_7= ',' )? )* otherlv_8= '}' otherlv_9= 'into' ( (lv_tbname_10_0= rulePrimaryExpression ) ) otherlv_11= 'table' )
            // InternalLobsterLanguages.g:543:3: otherlv_0= 'Insert' otherlv_1= 'value' otherlv_2= '{' (otherlv_3= 'Column Name:' ( (lv_column_4_0= rulePrimaryExpression ) ) otherlv_5= 'is' ( (lv_value_6_0= rulePrimaryExpression ) ) (otherlv_7= ',' )? )* otherlv_8= '}' otherlv_9= 'into' ( (lv_tbname_10_0= rulePrimaryExpression ) ) otherlv_11= 'table'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getValueKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertStatementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLobsterLanguages.g:555:3: (otherlv_3= 'Column Name:' ( (lv_column_4_0= rulePrimaryExpression ) ) otherlv_5= 'is' ( (lv_value_6_0= rulePrimaryExpression ) ) (otherlv_7= ',' )? )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLobsterLanguages.g:556:4: otherlv_3= 'Column Name:' ( (lv_column_4_0= rulePrimaryExpression ) ) otherlv_5= 'is' ( (lv_value_6_0= rulePrimaryExpression ) ) (otherlv_7= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getColumnNameKeyword_3_0());
            	    			
            	    // InternalLobsterLanguages.g:560:4: ( (lv_column_4_0= rulePrimaryExpression ) )
            	    // InternalLobsterLanguages.g:561:5: (lv_column_4_0= rulePrimaryExpression )
            	    {
            	    // InternalLobsterLanguages.g:561:5: (lv_column_4_0= rulePrimaryExpression )
            	    // InternalLobsterLanguages.g:562:6: lv_column_4_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getInsertStatementAccess().getColumnPrimaryExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_column_4_0=rulePrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInsertStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"column",
            	    							lv_column_4_0,
            	    							"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,23,FOLLOW_10); 

            	    				newLeafNode(otherlv_5, grammarAccess.getInsertStatementAccess().getIsKeyword_3_2());
            	    			
            	    // InternalLobsterLanguages.g:583:4: ( (lv_value_6_0= rulePrimaryExpression ) )
            	    // InternalLobsterLanguages.g:584:5: (lv_value_6_0= rulePrimaryExpression )
            	    {
            	    // InternalLobsterLanguages.g:584:5: (lv_value_6_0= rulePrimaryExpression )
            	    // InternalLobsterLanguages.g:585:6: lv_value_6_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getInsertStatementAccess().getValuePrimaryExpressionParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_value_6_0=rulePrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInsertStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_6_0,
            	    							"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalLobsterLanguages.g:602:4: (otherlv_7= ',' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==29) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalLobsterLanguages.g:603:5: otherlv_7= ','
            	            {
            	            otherlv_7=(Token)match(input,29,FOLLOW_15); 

            	            					newLeafNode(otherlv_7, grammarAccess.getInsertStatementAccess().getCommaKeyword_3_4());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_26); 

            			newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_9=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getInsertStatementAccess().getIntoKeyword_5());
            		
            // InternalLobsterLanguages.g:617:3: ( (lv_tbname_10_0= rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:618:4: (lv_tbname_10_0= rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:618:4: (lv_tbname_10_0= rulePrimaryExpression )
            // InternalLobsterLanguages.g:619:5: lv_tbname_10_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getInsertStatementAccess().getTbnamePrimaryExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_tbname_10_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertStatementRule());
            					}
            					set(
            						current,
            						"tbname",
            						lv_tbname_10_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getTableKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsertStatement"


    // $ANTLR start "entryRuleDeleteDataStatement"
    // InternalLobsterLanguages.g:644:1: entryRuleDeleteDataStatement returns [EObject current=null] : iv_ruleDeleteDataStatement= ruleDeleteDataStatement EOF ;
    public final EObject entryRuleDeleteDataStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteDataStatement = null;


        try {
            // InternalLobsterLanguages.g:644:60: (iv_ruleDeleteDataStatement= ruleDeleteDataStatement EOF )
            // InternalLobsterLanguages.g:645:2: iv_ruleDeleteDataStatement= ruleDeleteDataStatement EOF
            {
             newCompositeNode(grammarAccess.getDeleteDataStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteDataStatement=ruleDeleteDataStatement();

            state._fsp--;

             current =iv_ruleDeleteDataStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteDataStatement"


    // $ANTLR start "ruleDeleteDataStatement"
    // InternalLobsterLanguages.g:651:1: ruleDeleteDataStatement returns [EObject current=null] : (otherlv_0= 'Delete' otherlv_1= '{' ( (lv_condition_2_0= ruleMoreConditionStatement ) )* otherlv_3= '}' otherlv_4= 'from' otherlv_5= 'Table' ( (lv_tbname_6_0= rulePrimaryExpression ) ) ) ;
    public final EObject ruleDeleteDataStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_tbname_6_0 = null;



        	enterRule();

        try {
            // InternalLobsterLanguages.g:657:2: ( (otherlv_0= 'Delete' otherlv_1= '{' ( (lv_condition_2_0= ruleMoreConditionStatement ) )* otherlv_3= '}' otherlv_4= 'from' otherlv_5= 'Table' ( (lv_tbname_6_0= rulePrimaryExpression ) ) ) )
            // InternalLobsterLanguages.g:658:2: (otherlv_0= 'Delete' otherlv_1= '{' ( (lv_condition_2_0= ruleMoreConditionStatement ) )* otherlv_3= '}' otherlv_4= 'from' otherlv_5= 'Table' ( (lv_tbname_6_0= rulePrimaryExpression ) ) )
            {
            // InternalLobsterLanguages.g:658:2: (otherlv_0= 'Delete' otherlv_1= '{' ( (lv_condition_2_0= ruleMoreConditionStatement ) )* otherlv_3= '}' otherlv_4= 'from' otherlv_5= 'Table' ( (lv_tbname_6_0= rulePrimaryExpression ) ) )
            // InternalLobsterLanguages.g:659:3: otherlv_0= 'Delete' otherlv_1= '{' ( (lv_condition_2_0= ruleMoreConditionStatement ) )* otherlv_3= '}' otherlv_4= 'from' otherlv_5= 'Table' ( (lv_tbname_6_0= rulePrimaryExpression ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteDataStatementAccess().getDeleteKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteDataStatementAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLobsterLanguages.g:667:3: ( (lv_condition_2_0= ruleMoreConditionStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLobsterLanguages.g:668:4: (lv_condition_2_0= ruleMoreConditionStatement )
            	    {
            	    // InternalLobsterLanguages.g:668:4: (lv_condition_2_0= ruleMoreConditionStatement )
            	    // InternalLobsterLanguages.g:669:5: lv_condition_2_0= ruleMoreConditionStatement
            	    {

            	    					newCompositeNode(grammarAccess.getDeleteDataStatementAccess().getConditionMoreConditionStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_condition_2_0=ruleMoreConditionStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeleteDataStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"condition",
            	    						lv_condition_2_0,
            	    						"kcl.mmdd.course.languages.lobster.LobsterLanguages.MoreConditionStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteDataStatementAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getDeleteDataStatementAccess().getFromKeyword_4());
            		
            otherlv_5=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getDeleteDataStatementAccess().getTableKeyword_5());
            		
            // InternalLobsterLanguages.g:698:3: ( (lv_tbname_6_0= rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:699:4: (lv_tbname_6_0= rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:699:4: (lv_tbname_6_0= rulePrimaryExpression )
            // InternalLobsterLanguages.g:700:5: lv_tbname_6_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getDeleteDataStatementAccess().getTbnamePrimaryExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_tbname_6_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteDataStatementRule());
            					}
            					set(
            						current,
            						"tbname",
            						lv_tbname_6_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteDataStatement"


    // $ANTLR start "entryRuleMoreConditionStatement"
    // InternalLobsterLanguages.g:721:1: entryRuleMoreConditionStatement returns [EObject current=null] : iv_ruleMoreConditionStatement= ruleMoreConditionStatement EOF ;
    public final EObject entryRuleMoreConditionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoreConditionStatement = null;


        try {
            // InternalLobsterLanguages.g:721:63: (iv_ruleMoreConditionStatement= ruleMoreConditionStatement EOF )
            // InternalLobsterLanguages.g:722:2: iv_ruleMoreConditionStatement= ruleMoreConditionStatement EOF
            {
             newCompositeNode(grammarAccess.getMoreConditionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoreConditionStatement=ruleMoreConditionStatement();

            state._fsp--;

             current =iv_ruleMoreConditionStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoreConditionStatement"


    // $ANTLR start "ruleMoreConditionStatement"
    // InternalLobsterLanguages.g:728:1: ruleMoreConditionStatement returns [EObject current=null] : (otherlv_0= 'Column Name:' ( (lv_column_1_0= rulePrimaryExpression ) ) otherlv_2= 'is' ( (lv_value_3_0= rulePrimaryExpression ) ) ( (lv_morecondition_4_0= ruleMoreCondition ) ) ) ;
    public final EObject ruleMoreConditionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_column_1_0 = null;

        EObject lv_value_3_0 = null;

        Enumerator lv_morecondition_4_0 = null;



        	enterRule();

        try {
            // InternalLobsterLanguages.g:734:2: ( (otherlv_0= 'Column Name:' ( (lv_column_1_0= rulePrimaryExpression ) ) otherlv_2= 'is' ( (lv_value_3_0= rulePrimaryExpression ) ) ( (lv_morecondition_4_0= ruleMoreCondition ) ) ) )
            // InternalLobsterLanguages.g:735:2: (otherlv_0= 'Column Name:' ( (lv_column_1_0= rulePrimaryExpression ) ) otherlv_2= 'is' ( (lv_value_3_0= rulePrimaryExpression ) ) ( (lv_morecondition_4_0= ruleMoreCondition ) ) )
            {
            // InternalLobsterLanguages.g:735:2: (otherlv_0= 'Column Name:' ( (lv_column_1_0= rulePrimaryExpression ) ) otherlv_2= 'is' ( (lv_value_3_0= rulePrimaryExpression ) ) ( (lv_morecondition_4_0= ruleMoreCondition ) ) )
            // InternalLobsterLanguages.g:736:3: otherlv_0= 'Column Name:' ( (lv_column_1_0= rulePrimaryExpression ) ) otherlv_2= 'is' ( (lv_value_3_0= rulePrimaryExpression ) ) ( (lv_morecondition_4_0= ruleMoreCondition ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMoreConditionStatementAccess().getColumnNameKeyword_0());
            		
            // InternalLobsterLanguages.g:740:3: ( (lv_column_1_0= rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:741:4: (lv_column_1_0= rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:741:4: (lv_column_1_0= rulePrimaryExpression )
            // InternalLobsterLanguages.g:742:5: lv_column_1_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getMoreConditionStatementAccess().getColumnPrimaryExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_column_1_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoreConditionStatementRule());
            					}
            					set(
            						current,
            						"column",
            						lv_column_1_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMoreConditionStatementAccess().getIsKeyword_2());
            		
            // InternalLobsterLanguages.g:763:3: ( (lv_value_3_0= rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:764:4: (lv_value_3_0= rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:764:4: (lv_value_3_0= rulePrimaryExpression )
            // InternalLobsterLanguages.g:765:5: lv_value_3_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getMoreConditionStatementAccess().getValuePrimaryExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_value_3_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoreConditionStatementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLobsterLanguages.g:782:3: ( (lv_morecondition_4_0= ruleMoreCondition ) )
            // InternalLobsterLanguages.g:783:4: (lv_morecondition_4_0= ruleMoreCondition )
            {
            // InternalLobsterLanguages.g:783:4: (lv_morecondition_4_0= ruleMoreCondition )
            // InternalLobsterLanguages.g:784:5: lv_morecondition_4_0= ruleMoreCondition
            {

            					newCompositeNode(grammarAccess.getMoreConditionStatementAccess().getMoreconditionMoreConditionEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_morecondition_4_0=ruleMoreCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoreConditionStatementRule());
            					}
            					set(
            						current,
            						"morecondition",
            						lv_morecondition_4_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.MoreCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoreConditionStatement"


    // $ANTLR start "entryRuleDeleteTableStatement"
    // InternalLobsterLanguages.g:805:1: entryRuleDeleteTableStatement returns [EObject current=null] : iv_ruleDeleteTableStatement= ruleDeleteTableStatement EOF ;
    public final EObject entryRuleDeleteTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteTableStatement = null;


        try {
            // InternalLobsterLanguages.g:805:61: (iv_ruleDeleteTableStatement= ruleDeleteTableStatement EOF )
            // InternalLobsterLanguages.g:806:2: iv_ruleDeleteTableStatement= ruleDeleteTableStatement EOF
            {
             newCompositeNode(grammarAccess.getDeleteTableStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteTableStatement=ruleDeleteTableStatement();

            state._fsp--;

             current =iv_ruleDeleteTableStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteTableStatement"


    // $ANTLR start "ruleDeleteTableStatement"
    // InternalLobsterLanguages.g:812:1: ruleDeleteTableStatement returns [EObject current=null] : (otherlv_0= 'Delete All From' ( (lv_tbname_1_0= rulePrimaryExpression ) ) otherlv_2= 'Table' ) ;
    public final EObject ruleDeleteTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_tbname_1_0 = null;



        	enterRule();

        try {
            // InternalLobsterLanguages.g:818:2: ( (otherlv_0= 'Delete All From' ( (lv_tbname_1_0= rulePrimaryExpression ) ) otherlv_2= 'Table' ) )
            // InternalLobsterLanguages.g:819:2: (otherlv_0= 'Delete All From' ( (lv_tbname_1_0= rulePrimaryExpression ) ) otherlv_2= 'Table' )
            {
            // InternalLobsterLanguages.g:819:2: (otherlv_0= 'Delete All From' ( (lv_tbname_1_0= rulePrimaryExpression ) ) otherlv_2= 'Table' )
            // InternalLobsterLanguages.g:820:3: otherlv_0= 'Delete All From' ( (lv_tbname_1_0= rulePrimaryExpression ) ) otherlv_2= 'Table'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteTableStatementAccess().getDeleteAllFromKeyword_0());
            		
            // InternalLobsterLanguages.g:824:3: ( (lv_tbname_1_0= rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:825:4: (lv_tbname_1_0= rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:825:4: (lv_tbname_1_0= rulePrimaryExpression )
            // InternalLobsterLanguages.g:826:5: lv_tbname_1_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getDeleteTableStatementAccess().getTbnamePrimaryExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_tbname_1_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteTableStatementRule());
            					}
            					set(
            						current,
            						"tbname",
            						lv_tbname_1_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDeleteTableStatementAccess().getTableKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteTableStatement"


    // $ANTLR start "entryRuleUpdateStatement"
    // InternalLobsterLanguages.g:851:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // InternalLobsterLanguages.g:851:56: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // InternalLobsterLanguages.g:852:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
             newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;

             current =iv_ruleUpdateStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdateStatement"


    // $ANTLR start "ruleUpdateStatement"
    // InternalLobsterLanguages.g:858:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'Update' ( (lv_tbname_1_0= rulePrimaryExpression ) ) otherlv_2= 'Table' otherlv_3= 'set' otherlv_4= '{' ( (lv_setvalue_5_0= ruleConditionStatement ) )* otherlv_6= '}' otherlv_7= 'where' otherlv_8= '{' ( (lv_condition_9_0= ruleConditionStatement ) )* otherlv_10= '}' ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_tbname_1_0 = null;

        EObject lv_setvalue_5_0 = null;

        EObject lv_condition_9_0 = null;



        	enterRule();

        try {
            // InternalLobsterLanguages.g:864:2: ( (otherlv_0= 'Update' ( (lv_tbname_1_0= rulePrimaryExpression ) ) otherlv_2= 'Table' otherlv_3= 'set' otherlv_4= '{' ( (lv_setvalue_5_0= ruleConditionStatement ) )* otherlv_6= '}' otherlv_7= 'where' otherlv_8= '{' ( (lv_condition_9_0= ruleConditionStatement ) )* otherlv_10= '}' ) )
            // InternalLobsterLanguages.g:865:2: (otherlv_0= 'Update' ( (lv_tbname_1_0= rulePrimaryExpression ) ) otherlv_2= 'Table' otherlv_3= 'set' otherlv_4= '{' ( (lv_setvalue_5_0= ruleConditionStatement ) )* otherlv_6= '}' otherlv_7= 'where' otherlv_8= '{' ( (lv_condition_9_0= ruleConditionStatement ) )* otherlv_10= '}' )
            {
            // InternalLobsterLanguages.g:865:2: (otherlv_0= 'Update' ( (lv_tbname_1_0= rulePrimaryExpression ) ) otherlv_2= 'Table' otherlv_3= 'set' otherlv_4= '{' ( (lv_setvalue_5_0= ruleConditionStatement ) )* otherlv_6= '}' otherlv_7= 'where' otherlv_8= '{' ( (lv_condition_9_0= ruleConditionStatement ) )* otherlv_10= '}' )
            // InternalLobsterLanguages.g:866:3: otherlv_0= 'Update' ( (lv_tbname_1_0= rulePrimaryExpression ) ) otherlv_2= 'Table' otherlv_3= 'set' otherlv_4= '{' ( (lv_setvalue_5_0= ruleConditionStatement ) )* otherlv_6= '}' otherlv_7= 'where' otherlv_8= '{' ( (lv_condition_9_0= ruleConditionStatement ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
            		
            // InternalLobsterLanguages.g:870:3: ( (lv_tbname_1_0= rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:871:4: (lv_tbname_1_0= rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:871:4: (lv_tbname_1_0= rulePrimaryExpression )
            // InternalLobsterLanguages.g:872:5: lv_tbname_1_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getUpdateStatementAccess().getTbnamePrimaryExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_tbname_1_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
            					}
            					set(
            						current,
            						"tbname",
            						lv_tbname_1_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdateStatementAccess().getTableKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdateStatementAccess().getSetKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalLobsterLanguages.g:901:3: ( (lv_setvalue_5_0= ruleConditionStatement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLobsterLanguages.g:902:4: (lv_setvalue_5_0= ruleConditionStatement )
            	    {
            	    // InternalLobsterLanguages.g:902:4: (lv_setvalue_5_0= ruleConditionStatement )
            	    // InternalLobsterLanguages.g:903:5: lv_setvalue_5_0= ruleConditionStatement
            	    {

            	    					newCompositeNode(grammarAccess.getUpdateStatementAccess().getSetvalueConditionStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_setvalue_5_0=ruleConditionStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"setvalue",
            	    						lv_setvalue_5_0,
            	    						"kcl.mmdd.course.languages.lobster.LobsterLanguages.ConditionStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_31); 

            			newLeafNode(otherlv_6, grammarAccess.getUpdateStatementAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,39,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getUpdateStatementAccess().getWhereKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getUpdateStatementAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalLobsterLanguages.g:932:3: ( (lv_condition_9_0= ruleConditionStatement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLobsterLanguages.g:933:4: (lv_condition_9_0= ruleConditionStatement )
            	    {
            	    // InternalLobsterLanguages.g:933:4: (lv_condition_9_0= ruleConditionStatement )
            	    // InternalLobsterLanguages.g:934:5: lv_condition_9_0= ruleConditionStatement
            	    {

            	    					newCompositeNode(grammarAccess.getUpdateStatementAccess().getConditionConditionStatementParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_condition_9_0=ruleConditionStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"condition",
            	    						lv_condition_9_0,
            	    						"kcl.mmdd.course.languages.lobster.LobsterLanguages.ConditionStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getUpdateStatementAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdateStatement"


    // $ANTLR start "entryRuleSelectStatement"
    // InternalLobsterLanguages.g:959:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // InternalLobsterLanguages.g:959:56: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // InternalLobsterLanguages.g:960:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
             newCompositeNode(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;

             current =iv_ruleSelectStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // InternalLobsterLanguages.g:966:1: ruleSelectStatement returns [EObject current=null] : (otherlv_0= 'Find out' ( ( (lv_caculateCondition_1_0= ruleCaculateCondition ) ) otherlv_2= 'of' )? otherlv_3= 'Column Name:' ( (lv_column_4_0= rulePrimaryExpression ) ) otherlv_5= 'where' otherlv_6= '{' ( (lv_condition_7_0= ruleConditionStatement ) )* otherlv_8= '}' otherlv_9= 'from' otherlv_10= 'Table' ( (lv_tbname_11_0= rulePrimaryExpression ) ) (otherlv_12= 'order by' otherlv_13= '{' (otherlv_14= 'Column Name:' ( (lv_condition1_15_0= rulePrimaryExpression ) )* (otherlv_16= ',' )? )* )? (otherlv_17= 'sorted in' ( (lv_order_18_0= ruleOrder ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Enumerator lv_caculateCondition_1_0 = null;

        EObject lv_column_4_0 = null;

        EObject lv_condition_7_0 = null;

        EObject lv_tbname_11_0 = null;

        EObject lv_condition1_15_0 = null;

        Enumerator lv_order_18_0 = null;



        	enterRule();

        try {
            // InternalLobsterLanguages.g:972:2: ( (otherlv_0= 'Find out' ( ( (lv_caculateCondition_1_0= ruleCaculateCondition ) ) otherlv_2= 'of' )? otherlv_3= 'Column Name:' ( (lv_column_4_0= rulePrimaryExpression ) ) otherlv_5= 'where' otherlv_6= '{' ( (lv_condition_7_0= ruleConditionStatement ) )* otherlv_8= '}' otherlv_9= 'from' otherlv_10= 'Table' ( (lv_tbname_11_0= rulePrimaryExpression ) ) (otherlv_12= 'order by' otherlv_13= '{' (otherlv_14= 'Column Name:' ( (lv_condition1_15_0= rulePrimaryExpression ) )* (otherlv_16= ',' )? )* )? (otherlv_17= 'sorted in' ( (lv_order_18_0= ruleOrder ) ) )? otherlv_19= '}' ) )
            // InternalLobsterLanguages.g:973:2: (otherlv_0= 'Find out' ( ( (lv_caculateCondition_1_0= ruleCaculateCondition ) ) otherlv_2= 'of' )? otherlv_3= 'Column Name:' ( (lv_column_4_0= rulePrimaryExpression ) ) otherlv_5= 'where' otherlv_6= '{' ( (lv_condition_7_0= ruleConditionStatement ) )* otherlv_8= '}' otherlv_9= 'from' otherlv_10= 'Table' ( (lv_tbname_11_0= rulePrimaryExpression ) ) (otherlv_12= 'order by' otherlv_13= '{' (otherlv_14= 'Column Name:' ( (lv_condition1_15_0= rulePrimaryExpression ) )* (otherlv_16= ',' )? )* )? (otherlv_17= 'sorted in' ( (lv_order_18_0= ruleOrder ) ) )? otherlv_19= '}' )
            {
            // InternalLobsterLanguages.g:973:2: (otherlv_0= 'Find out' ( ( (lv_caculateCondition_1_0= ruleCaculateCondition ) ) otherlv_2= 'of' )? otherlv_3= 'Column Name:' ( (lv_column_4_0= rulePrimaryExpression ) ) otherlv_5= 'where' otherlv_6= '{' ( (lv_condition_7_0= ruleConditionStatement ) )* otherlv_8= '}' otherlv_9= 'from' otherlv_10= 'Table' ( (lv_tbname_11_0= rulePrimaryExpression ) ) (otherlv_12= 'order by' otherlv_13= '{' (otherlv_14= 'Column Name:' ( (lv_condition1_15_0= rulePrimaryExpression ) )* (otherlv_16= ',' )? )* )? (otherlv_17= 'sorted in' ( (lv_order_18_0= ruleOrder ) ) )? otherlv_19= '}' )
            // InternalLobsterLanguages.g:974:3: otherlv_0= 'Find out' ( ( (lv_caculateCondition_1_0= ruleCaculateCondition ) ) otherlv_2= 'of' )? otherlv_3= 'Column Name:' ( (lv_column_4_0= rulePrimaryExpression ) ) otherlv_5= 'where' otherlv_6= '{' ( (lv_condition_7_0= ruleConditionStatement ) )* otherlv_8= '}' otherlv_9= 'from' otherlv_10= 'Table' ( (lv_tbname_11_0= rulePrimaryExpression ) ) (otherlv_12= 'order by' otherlv_13= '{' (otherlv_14= 'Column Name:' ( (lv_condition1_15_0= rulePrimaryExpression ) )* (otherlv_16= ',' )? )* )? (otherlv_17= 'sorted in' ( (lv_order_18_0= ruleOrder ) ) )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectStatementAccess().getFindOutKeyword_0());
            		
            // InternalLobsterLanguages.g:978:3: ( ( (lv_caculateCondition_1_0= ruleCaculateCondition ) ) otherlv_2= 'of' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=49 && LA11_0<=53)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLobsterLanguages.g:979:4: ( (lv_caculateCondition_1_0= ruleCaculateCondition ) ) otherlv_2= 'of'
                    {
                    // InternalLobsterLanguages.g:979:4: ( (lv_caculateCondition_1_0= ruleCaculateCondition ) )
                    // InternalLobsterLanguages.g:980:5: (lv_caculateCondition_1_0= ruleCaculateCondition )
                    {
                    // InternalLobsterLanguages.g:980:5: (lv_caculateCondition_1_0= ruleCaculateCondition )
                    // InternalLobsterLanguages.g:981:6: lv_caculateCondition_1_0= ruleCaculateCondition
                    {

                    						newCompositeNode(grammarAccess.getSelectStatementAccess().getCaculateConditionCaculateConditionEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_caculateCondition_1_0=ruleCaculateCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    						}
                    						set(
                    							current,
                    							"caculateCondition",
                    							lv_caculateCondition_1_0,
                    							"kcl.mmdd.course.languages.lobster.LobsterLanguages.CaculateCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,41,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getSelectStatementAccess().getOfKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getColumnNameKeyword_2());
            		
            // InternalLobsterLanguages.g:1007:3: ( (lv_column_4_0= rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:1008:4: (lv_column_4_0= rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:1008:4: (lv_column_4_0= rulePrimaryExpression )
            // InternalLobsterLanguages.g:1009:5: lv_column_4_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getSelectStatementAccess().getColumnPrimaryExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_column_4_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectStatementRule());
            					}
            					set(
            						current,
            						"column",
            						lv_column_4_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getWhereKeyword_4());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalLobsterLanguages.g:1034:3: ( (lv_condition_7_0= ruleConditionStatement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLobsterLanguages.g:1035:4: (lv_condition_7_0= ruleConditionStatement )
            	    {
            	    // InternalLobsterLanguages.g:1035:4: (lv_condition_7_0= ruleConditionStatement )
            	    // InternalLobsterLanguages.g:1036:5: lv_condition_7_0= ruleConditionStatement
            	    {

            	    					newCompositeNode(grammarAccess.getSelectStatementAccess().getConditionConditionStatementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_condition_7_0=ruleConditionStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSelectStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"condition",
            	    						lv_condition_7_0,
            	    						"kcl.mmdd.course.languages.lobster.LobsterLanguages.ConditionStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getSelectStatementAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_9, grammarAccess.getSelectStatementAccess().getFromKeyword_8());
            		
            otherlv_10=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getSelectStatementAccess().getTableKeyword_9());
            		
            // InternalLobsterLanguages.g:1065:3: ( (lv_tbname_11_0= rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:1066:4: (lv_tbname_11_0= rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:1066:4: (lv_tbname_11_0= rulePrimaryExpression )
            // InternalLobsterLanguages.g:1067:5: lv_tbname_11_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getSelectStatementAccess().getTbnamePrimaryExpressionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_35);
            lv_tbname_11_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectStatementRule());
            					}
            					set(
            						current,
            						"tbname",
            						lv_tbname_11_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLobsterLanguages.g:1084:3: (otherlv_12= 'order by' otherlv_13= '{' (otherlv_14= 'Column Name:' ( (lv_condition1_15_0= rulePrimaryExpression ) )* (otherlv_16= ',' )? )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLobsterLanguages.g:1085:4: otherlv_12= 'order by' otherlv_13= '{' (otherlv_14= 'Column Name:' ( (lv_condition1_15_0= rulePrimaryExpression ) )* (otherlv_16= ',' )? )*
                    {
                    otherlv_12=(Token)match(input,42,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getSelectStatementAccess().getOrderByKeyword_11_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_36); 

                    				newLeafNode(otherlv_13, grammarAccess.getSelectStatementAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalLobsterLanguages.g:1093:4: (otherlv_14= 'Column Name:' ( (lv_condition1_15_0= rulePrimaryExpression ) )* (otherlv_16= ',' )? )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==22) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalLobsterLanguages.g:1094:5: otherlv_14= 'Column Name:' ( (lv_condition1_15_0= rulePrimaryExpression ) )* (otherlv_16= ',' )?
                    	    {
                    	    otherlv_14=(Token)match(input,22,FOLLOW_37); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getSelectStatementAccess().getColumnNameKeyword_11_2_0());
                    	    				
                    	    // InternalLobsterLanguages.g:1098:5: ( (lv_condition1_15_0= rulePrimaryExpression ) )*
                    	    loop13:
                    	    do {
                    	        int alt13=2;
                    	        int LA13_0 = input.LA(1);

                    	        if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)) ) {
                    	            alt13=1;
                    	        }


                    	        switch (alt13) {
                    	    	case 1 :
                    	    	    // InternalLobsterLanguages.g:1099:6: (lv_condition1_15_0= rulePrimaryExpression )
                    	    	    {
                    	    	    // InternalLobsterLanguages.g:1099:6: (lv_condition1_15_0= rulePrimaryExpression )
                    	    	    // InternalLobsterLanguages.g:1100:7: lv_condition1_15_0= rulePrimaryExpression
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getSelectStatementAccess().getCondition1PrimaryExpressionParserRuleCall_11_2_1_0());
                    	    	    						
                    	    	    pushFollow(FOLLOW_37);
                    	    	    lv_condition1_15_0=rulePrimaryExpression();

                    	    	    state._fsp--;


                    	    	    							if (current==null) {
                    	    	    								current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    	    	    							}
                    	    	    							add(
                    	    	    								current,
                    	    	    								"condition1",
                    	    	    								lv_condition1_15_0,
                    	    	    								"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop13;
                    	        }
                    	    } while (true);

                    	    // InternalLobsterLanguages.g:1117:5: (otherlv_16= ',' )?
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==29) ) {
                    	        alt14=1;
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // InternalLobsterLanguages.g:1118:6: otherlv_16= ','
                    	            {
                    	            otherlv_16=(Token)match(input,29,FOLLOW_36); 

                    	            						newLeafNode(otherlv_16, grammarAccess.getSelectStatementAccess().getCommaKeyword_11_2_2());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalLobsterLanguages.g:1125:3: (otherlv_17= 'sorted in' ( (lv_order_18_0= ruleOrder ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLobsterLanguages.g:1126:4: otherlv_17= 'sorted in' ( (lv_order_18_0= ruleOrder ) )
                    {
                    otherlv_17=(Token)match(input,43,FOLLOW_38); 

                    				newLeafNode(otherlv_17, grammarAccess.getSelectStatementAccess().getSortedInKeyword_12_0());
                    			
                    // InternalLobsterLanguages.g:1130:4: ( (lv_order_18_0= ruleOrder ) )
                    // InternalLobsterLanguages.g:1131:5: (lv_order_18_0= ruleOrder )
                    {
                    // InternalLobsterLanguages.g:1131:5: (lv_order_18_0= ruleOrder )
                    // InternalLobsterLanguages.g:1132:6: lv_order_18_0= ruleOrder
                    {

                    						newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderOrderEnumRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_order_18_0=ruleOrder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    						}
                    						set(
                    							current,
                    							"order",
                    							lv_order_18_0,
                    							"kcl.mmdd.course.languages.lobster.LobsterLanguages.Order");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getSelectStatementAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleConditionStatement"
    // InternalLobsterLanguages.g:1158:1: entryRuleConditionStatement returns [EObject current=null] : iv_ruleConditionStatement= ruleConditionStatement EOF ;
    public final EObject entryRuleConditionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionStatement = null;


        try {
            // InternalLobsterLanguages.g:1158:59: (iv_ruleConditionStatement= ruleConditionStatement EOF )
            // InternalLobsterLanguages.g:1159:2: iv_ruleConditionStatement= ruleConditionStatement EOF
            {
             newCompositeNode(grammarAccess.getConditionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionStatement=ruleConditionStatement();

            state._fsp--;

             current =iv_ruleConditionStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionStatement"


    // $ANTLR start "ruleConditionStatement"
    // InternalLobsterLanguages.g:1165:1: ruleConditionStatement returns [EObject current=null] : (otherlv_0= 'Column Name:' ( (lv_column_1_0= rulePrimaryExpression ) ) otherlv_2= 'is' ( (lv_value_3_0= rulePrimaryExpression ) ) (otherlv_4= ',' )? ) ;
    public final EObject ruleConditionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_column_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalLobsterLanguages.g:1171:2: ( (otherlv_0= 'Column Name:' ( (lv_column_1_0= rulePrimaryExpression ) ) otherlv_2= 'is' ( (lv_value_3_0= rulePrimaryExpression ) ) (otherlv_4= ',' )? ) )
            // InternalLobsterLanguages.g:1172:2: (otherlv_0= 'Column Name:' ( (lv_column_1_0= rulePrimaryExpression ) ) otherlv_2= 'is' ( (lv_value_3_0= rulePrimaryExpression ) ) (otherlv_4= ',' )? )
            {
            // InternalLobsterLanguages.g:1172:2: (otherlv_0= 'Column Name:' ( (lv_column_1_0= rulePrimaryExpression ) ) otherlv_2= 'is' ( (lv_value_3_0= rulePrimaryExpression ) ) (otherlv_4= ',' )? )
            // InternalLobsterLanguages.g:1173:3: otherlv_0= 'Column Name:' ( (lv_column_1_0= rulePrimaryExpression ) ) otherlv_2= 'is' ( (lv_value_3_0= rulePrimaryExpression ) ) (otherlv_4= ',' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionStatementAccess().getColumnNameKeyword_0());
            		
            // InternalLobsterLanguages.g:1177:3: ( (lv_column_1_0= rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:1178:4: (lv_column_1_0= rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:1178:4: (lv_column_1_0= rulePrimaryExpression )
            // InternalLobsterLanguages.g:1179:5: lv_column_1_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getConditionStatementAccess().getColumnPrimaryExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_column_1_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionStatementRule());
            					}
            					set(
            						current,
            						"column",
            						lv_column_1_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionStatementAccess().getIsKeyword_2());
            		
            // InternalLobsterLanguages.g:1200:3: ( (lv_value_3_0= rulePrimaryExpression ) )
            // InternalLobsterLanguages.g:1201:4: (lv_value_3_0= rulePrimaryExpression )
            {
            // InternalLobsterLanguages.g:1201:4: (lv_value_3_0= rulePrimaryExpression )
            // InternalLobsterLanguages.g:1202:5: lv_value_3_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getConditionStatementAccess().getValuePrimaryExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_value_3_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionStatementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"kcl.mmdd.course.languages.lobster.LobsterLanguages.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLobsterLanguages.g:1219:3: (otherlv_4= ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLobsterLanguages.g:1220:4: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionStatementAccess().getCommaKeyword_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionStatement"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalLobsterLanguages.g:1229:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalLobsterLanguages.g:1229:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalLobsterLanguages.g:1230:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalLobsterLanguages.g:1236:1: rulePrimaryExpression returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_CharLiteral_1= ruleCharLiteral | this_VariableReference_2= ruleVariableReference ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_CharLiteral_1 = null;

        EObject this_VariableReference_2 = null;



        	enterRule();

        try {
            // InternalLobsterLanguages.g:1242:2: ( (this_IntLiteral_0= ruleIntLiteral | this_CharLiteral_1= ruleCharLiteral | this_VariableReference_2= ruleVariableReference ) )
            // InternalLobsterLanguages.g:1243:2: (this_IntLiteral_0= ruleIntLiteral | this_CharLiteral_1= ruleCharLiteral | this_VariableReference_2= ruleVariableReference )
            {
            // InternalLobsterLanguages.g:1243:2: (this_IntLiteral_0= ruleIntLiteral | this_CharLiteral_1= ruleCharLiteral | this_VariableReference_2= ruleVariableReference )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case RULE_STRING:
                {
                alt19=2;
                }
                break;
            case RULE_ID:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalLobsterLanguages.g:1244:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLobsterLanguages.g:1253:3: this_CharLiteral_1= ruleCharLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCharLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CharLiteral_1=ruleCharLiteral();

                    state._fsp--;


                    			current = this_CharLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLobsterLanguages.g:1262:3: this_VariableReference_2= ruleVariableReference
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableReference_2=ruleVariableReference();

                    state._fsp--;


                    			current = this_VariableReference_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleCharLiteral"
    // InternalLobsterLanguages.g:1274:1: entryRuleCharLiteral returns [EObject current=null] : iv_ruleCharLiteral= ruleCharLiteral EOF ;
    public final EObject entryRuleCharLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharLiteral = null;


        try {
            // InternalLobsterLanguages.g:1274:52: (iv_ruleCharLiteral= ruleCharLiteral EOF )
            // InternalLobsterLanguages.g:1275:2: iv_ruleCharLiteral= ruleCharLiteral EOF
            {
             newCompositeNode(grammarAccess.getCharLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharLiteral=ruleCharLiteral();

            state._fsp--;

             current =iv_ruleCharLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharLiteral"


    // $ANTLR start "ruleCharLiteral"
    // InternalLobsterLanguages.g:1281:1: ruleCharLiteral returns [EObject current=null] : ( (lv_vac_0_0= RULE_STRING ) ) ;
    public final EObject ruleCharLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_vac_0_0=null;


        	enterRule();

        try {
            // InternalLobsterLanguages.g:1287:2: ( ( (lv_vac_0_0= RULE_STRING ) ) )
            // InternalLobsterLanguages.g:1288:2: ( (lv_vac_0_0= RULE_STRING ) )
            {
            // InternalLobsterLanguages.g:1288:2: ( (lv_vac_0_0= RULE_STRING ) )
            // InternalLobsterLanguages.g:1289:3: (lv_vac_0_0= RULE_STRING )
            {
            // InternalLobsterLanguages.g:1289:3: (lv_vac_0_0= RULE_STRING )
            // InternalLobsterLanguages.g:1290:4: lv_vac_0_0= RULE_STRING
            {
            lv_vac_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_vac_0_0, grammarAccess.getCharLiteralAccess().getVacSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCharLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"vac",
            					lv_vac_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalLobsterLanguages.g:1309:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalLobsterLanguages.g:1309:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalLobsterLanguages.g:1310:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalLobsterLanguages.g:1316:1: ruleIntLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalLobsterLanguages.g:1322:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalLobsterLanguages.g:1323:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalLobsterLanguages.g:1323:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalLobsterLanguages.g:1324:3: (lv_val_0_0= RULE_INT )
            {
            // InternalLobsterLanguages.g:1324:3: (lv_val_0_0= RULE_INT )
            // InternalLobsterLanguages.g:1325:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleVariableReference"
    // InternalLobsterLanguages.g:1344:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalLobsterLanguages.g:1344:58: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalLobsterLanguages.g:1345:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;

             current =iv_ruleVariableReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalLobsterLanguages.g:1351:1: ruleVariableReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalLobsterLanguages.g:1357:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalLobsterLanguages.g:1358:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalLobsterLanguages.g:1358:2: ( (otherlv_0= RULE_ID ) )
            // InternalLobsterLanguages.g:1359:3: (otherlv_0= RULE_ID )
            {
            // InternalLobsterLanguages.g:1359:3: (otherlv_0= RULE_ID )
            // InternalLobsterLanguages.g:1360:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableReferenceAccess().getVarVariableCharacterCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "ruleDataType"
    // InternalLobsterLanguages.g:1374:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Character' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLobsterLanguages.g:1380:2: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Character' ) ) )
            // InternalLobsterLanguages.g:1381:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Character' ) )
            {
            // InternalLobsterLanguages.g:1381:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Character' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            else if ( (LA20_0==45) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalLobsterLanguages.g:1382:3: (enumLiteral_0= 'Integer' )
                    {
                    // InternalLobsterLanguages.g:1382:3: (enumLiteral_0= 'Integer' )
                    // InternalLobsterLanguages.g:1383:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getIntegerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getIntegerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLobsterLanguages.g:1390:3: (enumLiteral_1= 'Character' )
                    {
                    // InternalLobsterLanguages.g:1390:3: (enumLiteral_1= 'Character' )
                    // InternalLobsterLanguages.g:1391:4: enumLiteral_1= 'Character'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getCharacterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getCharacterEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleMoreCondition"
    // InternalLobsterLanguages.g:1401:1: ruleMoreCondition returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'finish' ) ) ;
    public final Enumerator ruleMoreCondition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLobsterLanguages.g:1407:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'finish' ) ) )
            // InternalLobsterLanguages.g:1408:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'finish' ) )
            {
            // InternalLobsterLanguages.g:1408:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'finish' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt21=1;
                }
                break;
            case 47:
                {
                alt21=2;
                }
                break;
            case 48:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalLobsterLanguages.g:1409:3: (enumLiteral_0= 'and' )
                    {
                    // InternalLobsterLanguages.g:1409:3: (enumLiteral_0= 'and' )
                    // InternalLobsterLanguages.g:1410:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getMoreConditionAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMoreConditionAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLobsterLanguages.g:1417:3: (enumLiteral_1= 'or' )
                    {
                    // InternalLobsterLanguages.g:1417:3: (enumLiteral_1= 'or' )
                    // InternalLobsterLanguages.g:1418:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getMoreConditionAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMoreConditionAccess().getOrEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLobsterLanguages.g:1425:3: (enumLiteral_2= 'finish' )
                    {
                    // InternalLobsterLanguages.g:1425:3: (enumLiteral_2= 'finish' )
                    // InternalLobsterLanguages.g:1426:4: enumLiteral_2= 'finish'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getMoreConditionAccess().getFinishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMoreConditionAccess().getFinishEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoreCondition"


    // $ANTLR start "ruleCaculateCondition"
    // InternalLobsterLanguages.g:1436:1: ruleCaculateCondition returns [Enumerator current=null] : ( (enumLiteral_0= 'maximum' ) | (enumLiteral_1= 'minimum' ) | (enumLiteral_2= 'average' ) | (enumLiteral_3= 'count' ) | (enumLiteral_4= 'sum' ) ) ;
    public final Enumerator ruleCaculateCondition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalLobsterLanguages.g:1442:2: ( ( (enumLiteral_0= 'maximum' ) | (enumLiteral_1= 'minimum' ) | (enumLiteral_2= 'average' ) | (enumLiteral_3= 'count' ) | (enumLiteral_4= 'sum' ) ) )
            // InternalLobsterLanguages.g:1443:2: ( (enumLiteral_0= 'maximum' ) | (enumLiteral_1= 'minimum' ) | (enumLiteral_2= 'average' ) | (enumLiteral_3= 'count' ) | (enumLiteral_4= 'sum' ) )
            {
            // InternalLobsterLanguages.g:1443:2: ( (enumLiteral_0= 'maximum' ) | (enumLiteral_1= 'minimum' ) | (enumLiteral_2= 'average' ) | (enumLiteral_3= 'count' ) | (enumLiteral_4= 'sum' ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt22=1;
                }
                break;
            case 50:
                {
                alt22=2;
                }
                break;
            case 51:
                {
                alt22=3;
                }
                break;
            case 52:
                {
                alt22=4;
                }
                break;
            case 53:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalLobsterLanguages.g:1444:3: (enumLiteral_0= 'maximum' )
                    {
                    // InternalLobsterLanguages.g:1444:3: (enumLiteral_0= 'maximum' )
                    // InternalLobsterLanguages.g:1445:4: enumLiteral_0= 'maximum'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getCaculateConditionAccess().getMaximumEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCaculateConditionAccess().getMaximumEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLobsterLanguages.g:1452:3: (enumLiteral_1= 'minimum' )
                    {
                    // InternalLobsterLanguages.g:1452:3: (enumLiteral_1= 'minimum' )
                    // InternalLobsterLanguages.g:1453:4: enumLiteral_1= 'minimum'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getCaculateConditionAccess().getMinimumEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCaculateConditionAccess().getMinimumEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLobsterLanguages.g:1460:3: (enumLiteral_2= 'average' )
                    {
                    // InternalLobsterLanguages.g:1460:3: (enumLiteral_2= 'average' )
                    // InternalLobsterLanguages.g:1461:4: enumLiteral_2= 'average'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getCaculateConditionAccess().getAverageEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCaculateConditionAccess().getAverageEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLobsterLanguages.g:1468:3: (enumLiteral_3= 'count' )
                    {
                    // InternalLobsterLanguages.g:1468:3: (enumLiteral_3= 'count' )
                    // InternalLobsterLanguages.g:1469:4: enumLiteral_3= 'count'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getCaculateConditionAccess().getCountEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCaculateConditionAccess().getCountEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLobsterLanguages.g:1476:3: (enumLiteral_4= 'sum' )
                    {
                    // InternalLobsterLanguages.g:1476:3: (enumLiteral_4= 'sum' )
                    // InternalLobsterLanguages.g:1477:4: enumLiteral_4= 'sum'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getCaculateConditionAccess().getSumEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCaculateConditionAccess().getSumEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaculateCondition"


    // $ANTLR start "ruleOrder"
    // InternalLobsterLanguages.g:1487:1: ruleOrder returns [Enumerator current=null] : ( (enumLiteral_0= 'ascending' ) | (enumLiteral_1= 'descending' ) ) ;
    public final Enumerator ruleOrder() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLobsterLanguages.g:1493:2: ( ( (enumLiteral_0= 'ascending' ) | (enumLiteral_1= 'descending' ) ) )
            // InternalLobsterLanguages.g:1494:2: ( (enumLiteral_0= 'ascending' ) | (enumLiteral_1= 'descending' ) )
            {
            // InternalLobsterLanguages.g:1494:2: ( (enumLiteral_0= 'ascending' ) | (enumLiteral_1= 'descending' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==54) ) {
                alt23=1;
            }
            else if ( (LA23_0==55) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalLobsterLanguages.g:1495:3: (enumLiteral_0= 'ascending' )
                    {
                    // InternalLobsterLanguages.g:1495:3: (enumLiteral_0= 'ascending' )
                    // InternalLobsterLanguages.g:1496:4: enumLiteral_0= 'ascending'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getOrderAccess().getAscendingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOrderAccess().getAscendingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLobsterLanguages.g:1503:3: (enumLiteral_1= 'descending' )
                    {
                    // InternalLobsterLanguages.g:1503:3: (enumLiteral_1= 'descending' )
                    // InternalLobsterLanguages.g:1504:4: enumLiteral_1= 'descending'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getOrderAccess().getDescendingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOrderAccess().getDescendingEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrder"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\13\1\16\6\uffff\1\17\2\uffff";
    static final String dfa_3s = "\1\50\1\16\6\uffff\1\21\2\uffff";
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
            return "115:2: (this_CreateDatabaseStatement_0= ruleCreateDatabaseStatement | this_CreateTableStatement_1= ruleCreateTableStatement | this_InsertStatement_2= ruleInsertStatement | this_DeleteDataStatement_3= ruleDeleteDataStatement | this_DeleteTableStatement_4= ruleDeleteTableStatement | this_UpdateStatement_5= ruleUpdateStatement | this_SelectStatement_6= ruleSelectStatement | this_VariableCharacter_7= ruleVariableCharacter )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000013240002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000022000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020600000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x003E000000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000C0000200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000600000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080020600070L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000200000L});

}