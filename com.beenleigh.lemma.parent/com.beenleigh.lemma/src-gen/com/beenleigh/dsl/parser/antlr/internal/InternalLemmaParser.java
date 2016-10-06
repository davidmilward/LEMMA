package com.beenleigh.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.beenleigh.dsl.services.LemmaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLemmaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DataModel'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'datatype'", "'DataClass'", "'extends'", "'DataElement'", "':'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLemmaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLemmaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLemmaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLemma.g"; }



     	private LemmaGrammarAccess grammarAccess;

        public InternalLemmaParser(TokenStream input, LemmaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Lemmamodel";
       	}

       	@Override
       	protected LemmaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLemmamodel"
    // InternalLemma.g:64:1: entryRuleLemmamodel returns [EObject current=null] : iv_ruleLemmamodel= ruleLemmamodel EOF ;
    public final EObject entryRuleLemmamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLemmamodel = null;


        try {
            // InternalLemma.g:64:51: (iv_ruleLemmamodel= ruleLemmamodel EOF )
            // InternalLemma.g:65:2: iv_ruleLemmamodel= ruleLemmamodel EOF
            {
             newCompositeNode(grammarAccess.getLemmamodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLemmamodel=ruleLemmamodel();

            state._fsp--;

             current =iv_ruleLemmamodel; 
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
    // $ANTLR end "entryRuleLemmamodel"


    // $ANTLR start "ruleLemmamodel"
    // InternalLemma.g:71:1: ruleLemmamodel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractItem ) )* ;
    public final EObject ruleLemmamodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalLemma.g:77:2: ( ( (lv_elements_0_0= ruleAbstractItem ) )* )
            // InternalLemma.g:78:2: ( (lv_elements_0_0= ruleAbstractItem ) )*
            {
            // InternalLemma.g:78:2: ( (lv_elements_0_0= ruleAbstractItem ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLemma.g:79:3: (lv_elements_0_0= ruleAbstractItem )
            	    {
            	    // InternalLemma.g:79:3: (lv_elements_0_0= ruleAbstractItem )
            	    // InternalLemma.g:80:4: lv_elements_0_0= ruleAbstractItem
            	    {

            	    				newCompositeNode(grammarAccess.getLemmamodelAccess().getElementsAbstractItemParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractItem();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getLemmamodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"com.beenleigh.dsl.Lemma.AbstractItem");
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
    // $ANTLR end "ruleLemmamodel"


    // $ANTLR start "entryRuleDataModel"
    // InternalLemma.g:100:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // InternalLemma.g:100:50: (iv_ruleDataModel= ruleDataModel EOF )
            // InternalLemma.g:101:2: iv_ruleDataModel= ruleDataModel EOF
            {
             newCompositeNode(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataModel=ruleDataModel();

            state._fsp--;

             current =iv_ruleDataModel; 
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
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // InternalLemma.g:107:1: ruleDataModel returns [EObject current=null] : (otherlv_0= 'DataModel' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalLemma.g:113:2: ( (otherlv_0= 'DataModel' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractItem ) )* otherlv_4= '}' ) )
            // InternalLemma.g:114:2: (otherlv_0= 'DataModel' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractItem ) )* otherlv_4= '}' )
            {
            // InternalLemma.g:114:2: (otherlv_0= 'DataModel' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractItem ) )* otherlv_4= '}' )
            // InternalLemma.g:115:3: otherlv_0= 'DataModel' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractItem ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataModelAccess().getDataModelKeyword_0());
            		
            // InternalLemma.g:119:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalLemma.g:120:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalLemma.g:120:4: (lv_name_1_0= ruleQualifiedName )
            // InternalLemma.g:121:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getDataModelAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.beenleigh.dsl.Lemma.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLemma.g:142:3: ( (lv_elements_3_0= ruleAbstractItem ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==15||(LA2_0>=17 && LA2_0<=18)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLemma.g:143:4: (lv_elements_3_0= ruleAbstractItem )
            	    {
            	    // InternalLemma.g:143:4: (lv_elements_3_0= ruleAbstractItem )
            	    // InternalLemma.g:144:5: lv_elements_3_0= ruleAbstractItem
            	    {

            	    					newCompositeNode(grammarAccess.getDataModelAccess().getElementsAbstractItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleAbstractItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"com.beenleigh.dsl.Lemma.AbstractItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleAbstractItem"
    // InternalLemma.g:169:1: entryRuleAbstractItem returns [EObject current=null] : iv_ruleAbstractItem= ruleAbstractItem EOF ;
    public final EObject entryRuleAbstractItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractItem = null;


        try {
            // InternalLemma.g:169:53: (iv_ruleAbstractItem= ruleAbstractItem EOF )
            // InternalLemma.g:170:2: iv_ruleAbstractItem= ruleAbstractItem EOF
            {
             newCompositeNode(grammarAccess.getAbstractItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractItem=ruleAbstractItem();

            state._fsp--;

             current =iv_ruleAbstractItem; 
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
    // $ANTLR end "entryRuleAbstractItem"


    // $ANTLR start "ruleAbstractItem"
    // InternalLemma.g:176:1: ruleAbstractItem returns [EObject current=null] : (this_DataModel_0= ruleDataModel | this_DataClass_1= ruleDataClass | this_DataType_2= ruleDataType | this_Import_3= ruleImport ) ;
    public final EObject ruleAbstractItem() throws RecognitionException {
        EObject current = null;

        EObject this_DataModel_0 = null;

        EObject this_DataClass_1 = null;

        EObject this_DataType_2 = null;

        EObject this_Import_3 = null;



        	enterRule();

        try {
            // InternalLemma.g:182:2: ( (this_DataModel_0= ruleDataModel | this_DataClass_1= ruleDataClass | this_DataType_2= ruleDataType | this_Import_3= ruleImport ) )
            // InternalLemma.g:183:2: (this_DataModel_0= ruleDataModel | this_DataClass_1= ruleDataClass | this_DataType_2= ruleDataType | this_Import_3= ruleImport )
            {
            // InternalLemma.g:183:2: (this_DataModel_0= ruleDataModel | this_DataClass_1= ruleDataClass | this_DataType_2= ruleDataType | this_Import_3= ruleImport )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLemma.g:184:3: this_DataModel_0= ruleDataModel
                    {

                    			newCompositeNode(grammarAccess.getAbstractItemAccess().getDataModelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataModel_0=ruleDataModel();

                    state._fsp--;


                    			current = this_DataModel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLemma.g:193:3: this_DataClass_1= ruleDataClass
                    {

                    			newCompositeNode(grammarAccess.getAbstractItemAccess().getDataClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataClass_1=ruleDataClass();

                    state._fsp--;


                    			current = this_DataClass_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLemma.g:202:3: this_DataType_2= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getAbstractItemAccess().getDataTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_2=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLemma.g:211:3: this_Import_3= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getAbstractItemAccess().getImportParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_3=ruleImport();

                    state._fsp--;


                    			current = this_Import_3;
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
    // $ANTLR end "ruleAbstractItem"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLemma.g:223:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalLemma.g:223:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalLemma.g:224:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalLemma.g:230:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLemma.g:236:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalLemma.g:237:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalLemma.g:237:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalLemma.g:238:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalLemma.g:245:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLemma.g:246:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // InternalLemma.g:263:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalLemma.g:263:47: (iv_ruleImport= ruleImport EOF )
            // InternalLemma.g:264:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalLemma.g:270:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalLemma.g:276:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalLemma.g:277:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalLemma.g:277:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalLemma.g:278:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalLemma.g:282:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalLemma.g:283:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalLemma.g:283:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalLemma.g:284:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"com.beenleigh.dsl.Lemma.QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalLemma.g:305:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalLemma.g:305:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalLemma.g:306:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalLemma.g:312:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalLemma.g:318:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalLemma.g:319:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalLemma.g:319:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalLemma.g:320:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLemma.g:330:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalLemma.g:331:4: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleDataType"
    // InternalLemma.g:341:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalLemma.g:341:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalLemma.g:342:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalLemma.g:348:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalLemma.g:354:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalLemma.g:355:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalLemma.g:355:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalLemma.g:356:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalLemma.g:360:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLemma.g:361:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLemma.g:361:4: (lv_name_1_0= RULE_ID )
            // InternalLemma.g:362:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleContainerElement"
    // InternalLemma.g:382:1: entryRuleContainerElement returns [EObject current=null] : iv_ruleContainerElement= ruleContainerElement EOF ;
    public final EObject entryRuleContainerElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerElement = null;


        try {
            // InternalLemma.g:382:57: (iv_ruleContainerElement= ruleContainerElement EOF )
            // InternalLemma.g:383:2: iv_ruleContainerElement= ruleContainerElement EOF
            {
             newCompositeNode(grammarAccess.getContainerElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerElement=ruleContainerElement();

            state._fsp--;

             current =iv_ruleContainerElement; 
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
    // $ANTLR end "entryRuleContainerElement"


    // $ANTLR start "ruleContainerElement"
    // InternalLemma.g:389:1: ruleContainerElement returns [EObject current=null] : (this_DataClass_0= ruleDataClass | this_DataElement_1= ruleDataElement ) ;
    public final EObject ruleContainerElement() throws RecognitionException {
        EObject current = null;

        EObject this_DataClass_0 = null;

        EObject this_DataElement_1 = null;



        	enterRule();

        try {
            // InternalLemma.g:395:2: ( (this_DataClass_0= ruleDataClass | this_DataElement_1= ruleDataElement ) )
            // InternalLemma.g:396:2: (this_DataClass_0= ruleDataClass | this_DataElement_1= ruleDataElement )
            {
            // InternalLemma.g:396:2: (this_DataClass_0= ruleDataClass | this_DataElement_1= ruleDataElement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLemma.g:397:3: this_DataClass_0= ruleDataClass
                    {

                    			newCompositeNode(grammarAccess.getContainerElementAccess().getDataClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataClass_0=ruleDataClass();

                    state._fsp--;


                    			current = this_DataClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLemma.g:406:3: this_DataElement_1= ruleDataElement
                    {

                    			newCompositeNode(grammarAccess.getContainerElementAccess().getDataElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataElement_1=ruleDataElement();

                    state._fsp--;


                    			current = this_DataElement_1;
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
    // $ANTLR end "ruleContainerElement"


    // $ANTLR start "entryRuleDataClass"
    // InternalLemma.g:418:1: entryRuleDataClass returns [EObject current=null] : iv_ruleDataClass= ruleDataClass EOF ;
    public final EObject entryRuleDataClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataClass = null;


        try {
            // InternalLemma.g:418:50: (iv_ruleDataClass= ruleDataClass EOF )
            // InternalLemma.g:419:2: iv_ruleDataClass= ruleDataClass EOF
            {
             newCompositeNode(grammarAccess.getDataClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataClass=ruleDataClass();

            state._fsp--;

             current =iv_ruleDataClass; 
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
    // $ANTLR end "entryRuleDataClass"


    // $ANTLR start "ruleDataClass"
    // InternalLemma.g:425:1: ruleDataClass returns [EObject current=null] : (otherlv_0= 'DataClass' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_dataelements_5_0= ruleContainerElement ) )* otherlv_6= '}' ) ;
    public final EObject ruleDataClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_dataelements_5_0 = null;



        	enterRule();

        try {
            // InternalLemma.g:431:2: ( (otherlv_0= 'DataClass' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_dataelements_5_0= ruleContainerElement ) )* otherlv_6= '}' ) )
            // InternalLemma.g:432:2: (otherlv_0= 'DataClass' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_dataelements_5_0= ruleContainerElement ) )* otherlv_6= '}' )
            {
            // InternalLemma.g:432:2: (otherlv_0= 'DataClass' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_dataelements_5_0= ruleContainerElement ) )* otherlv_6= '}' )
            // InternalLemma.g:433:3: otherlv_0= 'DataClass' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_dataelements_5_0= ruleContainerElement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataClassAccess().getDataClassKeyword_0());
            		
            // InternalLemma.g:437:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLemma.g:438:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLemma.g:438:4: (lv_name_1_0= RULE_ID )
            // InternalLemma.g:439:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLemma.g:455:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLemma.g:456:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataClassAccess().getExtendsKeyword_2_0());
                    			
                    // InternalLemma.g:460:4: ( (otherlv_3= RULE_ID ) )
                    // InternalLemma.g:461:5: (otherlv_3= RULE_ID )
                    {
                    // InternalLemma.g:461:5: (otherlv_3= RULE_ID )
                    // InternalLemma.g:462:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataClassRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_3, grammarAccess.getDataClassAccess().getSuperTypeDataClassCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDataClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLemma.g:478:3: ( (lv_dataelements_5_0= ruleContainerElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18||LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLemma.g:479:4: (lv_dataelements_5_0= ruleContainerElement )
            	    {
            	    // InternalLemma.g:479:4: (lv_dataelements_5_0= ruleContainerElement )
            	    // InternalLemma.g:480:5: lv_dataelements_5_0= ruleContainerElement
            	    {

            	    					newCompositeNode(grammarAccess.getDataClassAccess().getDataelementsContainerElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_dataelements_5_0=ruleContainerElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataelements",
            	    						lv_dataelements_5_0,
            	    						"com.beenleigh.dsl.Lemma.ContainerElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDataClassAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDataClass"


    // $ANTLR start "entryRuleDataElement"
    // InternalLemma.g:505:1: entryRuleDataElement returns [EObject current=null] : iv_ruleDataElement= ruleDataElement EOF ;
    public final EObject entryRuleDataElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataElement = null;


        try {
            // InternalLemma.g:505:52: (iv_ruleDataElement= ruleDataElement EOF )
            // InternalLemma.g:506:2: iv_ruleDataElement= ruleDataElement EOF
            {
             newCompositeNode(grammarAccess.getDataElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataElement=ruleDataElement();

            state._fsp--;

             current =iv_ruleDataElement; 
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
    // $ANTLR end "entryRuleDataElement"


    // $ANTLR start "ruleDataElement"
    // InternalLemma.g:512:1: ruleDataElement returns [EObject current=null] : (otherlv_0= 'DataElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleDataElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLemma.g:518:2: ( (otherlv_0= 'DataElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalLemma.g:519:2: (otherlv_0= 'DataElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalLemma.g:519:2: (otherlv_0= 'DataElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            // InternalLemma.g:520:3: otherlv_0= 'DataElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataElementAccess().getDataElementKeyword_0());
            		
            // InternalLemma.g:524:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLemma.g:525:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLemma.g:525:4: (lv_name_1_0= RULE_ID )
            // InternalLemma.g:526:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataElementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDataElementAccess().getColonKeyword_2());
            		
            // InternalLemma.g:546:3: ( ( ruleQualifiedName ) )
            // InternalLemma.g:547:4: ( ruleQualifiedName )
            {
            // InternalLemma.g:547:4: ( ruleQualifiedName )
            // InternalLemma.g:548:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataElementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataElementAccess().getTypeDataTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "ruleDataElement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000068802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000006A800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000142000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});

}