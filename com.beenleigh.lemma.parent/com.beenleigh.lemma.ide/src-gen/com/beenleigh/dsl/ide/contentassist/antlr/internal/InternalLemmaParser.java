package com.beenleigh.dsl.ide.contentassist.antlr.internal;

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
import com.beenleigh.dsl.services.LemmaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLemmaParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(LemmaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleLemmamodel"
    // InternalLemma.g:53:1: entryRuleLemmamodel : ruleLemmamodel EOF ;
    public final void entryRuleLemmamodel() throws RecognitionException {
        try {
            // InternalLemma.g:54:1: ( ruleLemmamodel EOF )
            // InternalLemma.g:55:1: ruleLemmamodel EOF
            {
             before(grammarAccess.getLemmamodelRule()); 
            pushFollow(FOLLOW_1);
            ruleLemmamodel();

            state._fsp--;

             after(grammarAccess.getLemmamodelRule()); 
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
    // $ANTLR end "entryRuleLemmamodel"


    // $ANTLR start "ruleLemmamodel"
    // InternalLemma.g:62:1: ruleLemmamodel : ( ( rule__Lemmamodel__ElementsAssignment )* ) ;
    public final void ruleLemmamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:66:2: ( ( ( rule__Lemmamodel__ElementsAssignment )* ) )
            // InternalLemma.g:67:2: ( ( rule__Lemmamodel__ElementsAssignment )* )
            {
            // InternalLemma.g:67:2: ( ( rule__Lemmamodel__ElementsAssignment )* )
            // InternalLemma.g:68:3: ( rule__Lemmamodel__ElementsAssignment )*
            {
             before(grammarAccess.getLemmamodelAccess().getElementsAssignment()); 
            // InternalLemma.g:69:3: ( rule__Lemmamodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLemma.g:69:4: rule__Lemmamodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Lemmamodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLemmamodelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLemmamodel"


    // $ANTLR start "entryRuleDataModel"
    // InternalLemma.g:78:1: entryRuleDataModel : ruleDataModel EOF ;
    public final void entryRuleDataModel() throws RecognitionException {
        try {
            // InternalLemma.g:79:1: ( ruleDataModel EOF )
            // InternalLemma.g:80:1: ruleDataModel EOF
            {
             before(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDataModel();

            state._fsp--;

             after(grammarAccess.getDataModelRule()); 
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
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // InternalLemma.g:87:1: ruleDataModel : ( ( rule__DataModel__Group__0 ) ) ;
    public final void ruleDataModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:91:2: ( ( ( rule__DataModel__Group__0 ) ) )
            // InternalLemma.g:92:2: ( ( rule__DataModel__Group__0 ) )
            {
            // InternalLemma.g:92:2: ( ( rule__DataModel__Group__0 ) )
            // InternalLemma.g:93:3: ( rule__DataModel__Group__0 )
            {
             before(grammarAccess.getDataModelAccess().getGroup()); 
            // InternalLemma.g:94:3: ( rule__DataModel__Group__0 )
            // InternalLemma.g:94:4: rule__DataModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleAbstractItem"
    // InternalLemma.g:103:1: entryRuleAbstractItem : ruleAbstractItem EOF ;
    public final void entryRuleAbstractItem() throws RecognitionException {
        try {
            // InternalLemma.g:104:1: ( ruleAbstractItem EOF )
            // InternalLemma.g:105:1: ruleAbstractItem EOF
            {
             before(grammarAccess.getAbstractItemRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractItem();

            state._fsp--;

             after(grammarAccess.getAbstractItemRule()); 
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
    // $ANTLR end "entryRuleAbstractItem"


    // $ANTLR start "ruleAbstractItem"
    // InternalLemma.g:112:1: ruleAbstractItem : ( ( rule__AbstractItem__Alternatives ) ) ;
    public final void ruleAbstractItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:116:2: ( ( ( rule__AbstractItem__Alternatives ) ) )
            // InternalLemma.g:117:2: ( ( rule__AbstractItem__Alternatives ) )
            {
            // InternalLemma.g:117:2: ( ( rule__AbstractItem__Alternatives ) )
            // InternalLemma.g:118:3: ( rule__AbstractItem__Alternatives )
            {
             before(grammarAccess.getAbstractItemAccess().getAlternatives()); 
            // InternalLemma.g:119:3: ( rule__AbstractItem__Alternatives )
            // InternalLemma.g:119:4: rule__AbstractItem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractItem"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLemma.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalLemma.g:129:1: ( ruleQualifiedName EOF )
            // InternalLemma.g:130:1: ruleQualifiedName EOF
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
    // InternalLemma.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalLemma.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalLemma.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalLemma.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalLemma.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalLemma.g:144:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleImport"
    // InternalLemma.g:153:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalLemma.g:154:1: ( ruleImport EOF )
            // InternalLemma.g:155:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalLemma.g:162:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:166:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalLemma.g:167:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalLemma.g:167:2: ( ( rule__Import__Group__0 ) )
            // InternalLemma.g:168:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalLemma.g:169:3: ( rule__Import__Group__0 )
            // InternalLemma.g:169:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalLemma.g:178:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalLemma.g:179:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalLemma.g:180:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalLemma.g:187:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:191:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalLemma.g:192:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalLemma.g:192:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalLemma.g:193:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalLemma.g:194:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalLemma.g:194:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleDataType"
    // InternalLemma.g:203:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalLemma.g:204:1: ( ruleDataType EOF )
            // InternalLemma.g:205:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalLemma.g:212:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:216:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalLemma.g:217:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalLemma.g:217:2: ( ( rule__DataType__Group__0 ) )
            // InternalLemma.g:218:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalLemma.g:219:3: ( rule__DataType__Group__0 )
            // InternalLemma.g:219:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleContainerElement"
    // InternalLemma.g:228:1: entryRuleContainerElement : ruleContainerElement EOF ;
    public final void entryRuleContainerElement() throws RecognitionException {
        try {
            // InternalLemma.g:229:1: ( ruleContainerElement EOF )
            // InternalLemma.g:230:1: ruleContainerElement EOF
            {
             before(grammarAccess.getContainerElementRule()); 
            pushFollow(FOLLOW_1);
            ruleContainerElement();

            state._fsp--;

             after(grammarAccess.getContainerElementRule()); 
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
    // $ANTLR end "entryRuleContainerElement"


    // $ANTLR start "ruleContainerElement"
    // InternalLemma.g:237:1: ruleContainerElement : ( ( rule__ContainerElement__Alternatives ) ) ;
    public final void ruleContainerElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:241:2: ( ( ( rule__ContainerElement__Alternatives ) ) )
            // InternalLemma.g:242:2: ( ( rule__ContainerElement__Alternatives ) )
            {
            // InternalLemma.g:242:2: ( ( rule__ContainerElement__Alternatives ) )
            // InternalLemma.g:243:3: ( rule__ContainerElement__Alternatives )
            {
             before(grammarAccess.getContainerElementAccess().getAlternatives()); 
            // InternalLemma.g:244:3: ( rule__ContainerElement__Alternatives )
            // InternalLemma.g:244:4: rule__ContainerElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ContainerElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContainerElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainerElement"


    // $ANTLR start "entryRuleDataClass"
    // InternalLemma.g:253:1: entryRuleDataClass : ruleDataClass EOF ;
    public final void entryRuleDataClass() throws RecognitionException {
        try {
            // InternalLemma.g:254:1: ( ruleDataClass EOF )
            // InternalLemma.g:255:1: ruleDataClass EOF
            {
             before(grammarAccess.getDataClassRule()); 
            pushFollow(FOLLOW_1);
            ruleDataClass();

            state._fsp--;

             after(grammarAccess.getDataClassRule()); 
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
    // $ANTLR end "entryRuleDataClass"


    // $ANTLR start "ruleDataClass"
    // InternalLemma.g:262:1: ruleDataClass : ( ( rule__DataClass__Group__0 ) ) ;
    public final void ruleDataClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:266:2: ( ( ( rule__DataClass__Group__0 ) ) )
            // InternalLemma.g:267:2: ( ( rule__DataClass__Group__0 ) )
            {
            // InternalLemma.g:267:2: ( ( rule__DataClass__Group__0 ) )
            // InternalLemma.g:268:3: ( rule__DataClass__Group__0 )
            {
             before(grammarAccess.getDataClassAccess().getGroup()); 
            // InternalLemma.g:269:3: ( rule__DataClass__Group__0 )
            // InternalLemma.g:269:4: rule__DataClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataClass"


    // $ANTLR start "entryRuleDataElement"
    // InternalLemma.g:278:1: entryRuleDataElement : ruleDataElement EOF ;
    public final void entryRuleDataElement() throws RecognitionException {
        try {
            // InternalLemma.g:279:1: ( ruleDataElement EOF )
            // InternalLemma.g:280:1: ruleDataElement EOF
            {
             before(grammarAccess.getDataElementRule()); 
            pushFollow(FOLLOW_1);
            ruleDataElement();

            state._fsp--;

             after(grammarAccess.getDataElementRule()); 
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
    // $ANTLR end "entryRuleDataElement"


    // $ANTLR start "ruleDataElement"
    // InternalLemma.g:287:1: ruleDataElement : ( ( rule__DataElement__Group__0 ) ) ;
    public final void ruleDataElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:291:2: ( ( ( rule__DataElement__Group__0 ) ) )
            // InternalLemma.g:292:2: ( ( rule__DataElement__Group__0 ) )
            {
            // InternalLemma.g:292:2: ( ( rule__DataElement__Group__0 ) )
            // InternalLemma.g:293:3: ( rule__DataElement__Group__0 )
            {
             before(grammarAccess.getDataElementAccess().getGroup()); 
            // InternalLemma.g:294:3: ( rule__DataElement__Group__0 )
            // InternalLemma.g:294:4: rule__DataElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataElement"


    // $ANTLR start "rule__AbstractItem__Alternatives"
    // InternalLemma.g:302:1: rule__AbstractItem__Alternatives : ( ( ruleDataModel ) | ( ruleDataClass ) | ( ruleDataType ) | ( ruleImport ) );
    public final void rule__AbstractItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:306:1: ( ( ruleDataModel ) | ( ruleDataClass ) | ( ruleDataType ) | ( ruleImport ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLemma.g:307:2: ( ruleDataModel )
                    {
                    // InternalLemma.g:307:2: ( ruleDataModel )
                    // InternalLemma.g:308:3: ruleDataModel
                    {
                     before(grammarAccess.getAbstractItemAccess().getDataModelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataModel();

                    state._fsp--;

                     after(grammarAccess.getAbstractItemAccess().getDataModelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLemma.g:313:2: ( ruleDataClass )
                    {
                    // InternalLemma.g:313:2: ( ruleDataClass )
                    // InternalLemma.g:314:3: ruleDataClass
                    {
                     before(grammarAccess.getAbstractItemAccess().getDataClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataClass();

                    state._fsp--;

                     after(grammarAccess.getAbstractItemAccess().getDataClassParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLemma.g:319:2: ( ruleDataType )
                    {
                    // InternalLemma.g:319:2: ( ruleDataType )
                    // InternalLemma.g:320:3: ruleDataType
                    {
                     before(grammarAccess.getAbstractItemAccess().getDataTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getAbstractItemAccess().getDataTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLemma.g:325:2: ( ruleImport )
                    {
                    // InternalLemma.g:325:2: ( ruleImport )
                    // InternalLemma.g:326:3: ruleImport
                    {
                     before(grammarAccess.getAbstractItemAccess().getImportParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractItemAccess().getImportParserRuleCall_3()); 

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
    // $ANTLR end "rule__AbstractItem__Alternatives"


    // $ANTLR start "rule__ContainerElement__Alternatives"
    // InternalLemma.g:335:1: rule__ContainerElement__Alternatives : ( ( ruleDataClass ) | ( ruleDataElement ) );
    public final void rule__ContainerElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:339:1: ( ( ruleDataClass ) | ( ruleDataElement ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLemma.g:340:2: ( ruleDataClass )
                    {
                    // InternalLemma.g:340:2: ( ruleDataClass )
                    // InternalLemma.g:341:3: ruleDataClass
                    {
                     before(grammarAccess.getContainerElementAccess().getDataClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataClass();

                    state._fsp--;

                     after(grammarAccess.getContainerElementAccess().getDataClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLemma.g:346:2: ( ruleDataElement )
                    {
                    // InternalLemma.g:346:2: ( ruleDataElement )
                    // InternalLemma.g:347:3: ruleDataElement
                    {
                     before(grammarAccess.getContainerElementAccess().getDataElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataElement();

                    state._fsp--;

                     after(grammarAccess.getContainerElementAccess().getDataElementParserRuleCall_1()); 

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
    // $ANTLR end "rule__ContainerElement__Alternatives"


    // $ANTLR start "rule__DataModel__Group__0"
    // InternalLemma.g:356:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:360:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // InternalLemma.g:361:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__1();

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
    // $ANTLR end "rule__DataModel__Group__0"


    // $ANTLR start "rule__DataModel__Group__0__Impl"
    // InternalLemma.g:368:1: rule__DataModel__Group__0__Impl : ( 'DataModel' ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:372:1: ( ( 'DataModel' ) )
            // InternalLemma.g:373:1: ( 'DataModel' )
            {
            // InternalLemma.g:373:1: ( 'DataModel' )
            // InternalLemma.g:374:2: 'DataModel'
            {
             before(grammarAccess.getDataModelAccess().getDataModelKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getDataModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__0__Impl"


    // $ANTLR start "rule__DataModel__Group__1"
    // InternalLemma.g:383:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:387:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // InternalLemma.g:388:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DataModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__2();

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
    // $ANTLR end "rule__DataModel__Group__1"


    // $ANTLR start "rule__DataModel__Group__1__Impl"
    // InternalLemma.g:395:1: rule__DataModel__Group__1__Impl : ( ( rule__DataModel__NameAssignment_1 ) ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:399:1: ( ( ( rule__DataModel__NameAssignment_1 ) ) )
            // InternalLemma.g:400:1: ( ( rule__DataModel__NameAssignment_1 ) )
            {
            // InternalLemma.g:400:1: ( ( rule__DataModel__NameAssignment_1 ) )
            // InternalLemma.g:401:2: ( rule__DataModel__NameAssignment_1 )
            {
             before(grammarAccess.getDataModelAccess().getNameAssignment_1()); 
            // InternalLemma.g:402:2: ( rule__DataModel__NameAssignment_1 )
            // InternalLemma.g:402:3: rule__DataModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__1__Impl"


    // $ANTLR start "rule__DataModel__Group__2"
    // InternalLemma.g:410:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl rule__DataModel__Group__3 ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:414:1: ( rule__DataModel__Group__2__Impl rule__DataModel__Group__3 )
            // InternalLemma.g:415:2: rule__DataModel__Group__2__Impl rule__DataModel__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DataModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__3();

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
    // $ANTLR end "rule__DataModel__Group__2"


    // $ANTLR start "rule__DataModel__Group__2__Impl"
    // InternalLemma.g:422:1: rule__DataModel__Group__2__Impl : ( '{' ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:426:1: ( ( '{' ) )
            // InternalLemma.g:427:1: ( '{' )
            {
            // InternalLemma.g:427:1: ( '{' )
            // InternalLemma.g:428:2: '{'
            {
             before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__2__Impl"


    // $ANTLR start "rule__DataModel__Group__3"
    // InternalLemma.g:437:1: rule__DataModel__Group__3 : rule__DataModel__Group__3__Impl rule__DataModel__Group__4 ;
    public final void rule__DataModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:441:1: ( rule__DataModel__Group__3__Impl rule__DataModel__Group__4 )
            // InternalLemma.g:442:2: rule__DataModel__Group__3__Impl rule__DataModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DataModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__4();

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
    // $ANTLR end "rule__DataModel__Group__3"


    // $ANTLR start "rule__DataModel__Group__3__Impl"
    // InternalLemma.g:449:1: rule__DataModel__Group__3__Impl : ( ( rule__DataModel__ElementsAssignment_3 )* ) ;
    public final void rule__DataModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:453:1: ( ( ( rule__DataModel__ElementsAssignment_3 )* ) )
            // InternalLemma.g:454:1: ( ( rule__DataModel__ElementsAssignment_3 )* )
            {
            // InternalLemma.g:454:1: ( ( rule__DataModel__ElementsAssignment_3 )* )
            // InternalLemma.g:455:2: ( rule__DataModel__ElementsAssignment_3 )*
            {
             before(grammarAccess.getDataModelAccess().getElementsAssignment_3()); 
            // InternalLemma.g:456:2: ( rule__DataModel__ElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11||LA4_0==15||(LA4_0>=17 && LA4_0<=18)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLemma.g:456:3: rule__DataModel__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DataModel__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__3__Impl"


    // $ANTLR start "rule__DataModel__Group__4"
    // InternalLemma.g:464:1: rule__DataModel__Group__4 : rule__DataModel__Group__4__Impl ;
    public final void rule__DataModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:468:1: ( rule__DataModel__Group__4__Impl )
            // InternalLemma.g:469:2: rule__DataModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group__4__Impl();

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
    // $ANTLR end "rule__DataModel__Group__4"


    // $ANTLR start "rule__DataModel__Group__4__Impl"
    // InternalLemma.g:475:1: rule__DataModel__Group__4__Impl : ( '}' ) ;
    public final void rule__DataModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:479:1: ( ( '}' ) )
            // InternalLemma.g:480:1: ( '}' )
            {
            // InternalLemma.g:480:1: ( '}' )
            // InternalLemma.g:481:2: '}'
            {
             before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalLemma.g:491:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:495:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalLemma.g:496:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalLemma.g:503:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:507:1: ( ( RULE_ID ) )
            // InternalLemma.g:508:1: ( RULE_ID )
            {
            // InternalLemma.g:508:1: ( RULE_ID )
            // InternalLemma.g:509:2: RULE_ID
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
    // InternalLemma.g:518:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:522:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalLemma.g:523:2: rule__QualifiedName__Group__1__Impl
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
    // InternalLemma.g:529:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:533:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalLemma.g:534:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalLemma.g:534:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalLemma.g:535:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalLemma.g:536:2: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLemma.g:536:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalLemma.g:545:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:549:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalLemma.g:550:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalLemma.g:557:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:561:1: ( ( '.' ) )
            // InternalLemma.g:562:1: ( '.' )
            {
            // InternalLemma.g:562:1: ( '.' )
            // InternalLemma.g:563:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalLemma.g:572:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:576:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalLemma.g:577:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalLemma.g:583:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:587:1: ( ( RULE_ID ) )
            // InternalLemma.g:588:1: ( RULE_ID )
            {
            // InternalLemma.g:588:1: ( RULE_ID )
            // InternalLemma.g:589:2: RULE_ID
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


    // $ANTLR start "rule__Import__Group__0"
    // InternalLemma.g:599:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:603:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalLemma.g:604:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalLemma.g:611:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:615:1: ( ( 'import' ) )
            // InternalLemma.g:616:1: ( 'import' )
            {
            // InternalLemma.g:616:1: ( 'import' )
            // InternalLemma.g:617:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalLemma.g:626:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:630:1: ( rule__Import__Group__1__Impl )
            // InternalLemma.g:631:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalLemma.g:637:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:641:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalLemma.g:642:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalLemma.g:642:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalLemma.g:643:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalLemma.g:644:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalLemma.g:644:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalLemma.g:653:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:657:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalLemma.g:658:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalLemma.g:665:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:669:1: ( ( ruleQualifiedName ) )
            // InternalLemma.g:670:1: ( ruleQualifiedName )
            {
            // InternalLemma.g:670:1: ( ruleQualifiedName )
            // InternalLemma.g:671:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalLemma.g:680:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:684:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalLemma.g:685:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalLemma.g:691:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:695:1: ( ( ( '.*' )? ) )
            // InternalLemma.g:696:1: ( ( '.*' )? )
            {
            // InternalLemma.g:696:1: ( ( '.*' )? )
            // InternalLemma.g:697:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalLemma.g:698:2: ( '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLemma.g:698:3: '.*'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalLemma.g:707:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:711:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalLemma.g:712:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

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
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalLemma.g:719:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:723:1: ( ( 'datatype' ) )
            // InternalLemma.g:724:1: ( 'datatype' )
            {
            // InternalLemma.g:724:1: ( 'datatype' )
            // InternalLemma.g:725:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalLemma.g:734:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:738:1: ( rule__DataType__Group__1__Impl )
            // InternalLemma.g:739:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

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
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalLemma.g:745:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:749:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalLemma.g:750:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalLemma.g:750:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalLemma.g:751:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalLemma.g:752:2: ( rule__DataType__NameAssignment_1 )
            // InternalLemma.g:752:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__DataClass__Group__0"
    // InternalLemma.g:761:1: rule__DataClass__Group__0 : rule__DataClass__Group__0__Impl rule__DataClass__Group__1 ;
    public final void rule__DataClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:765:1: ( rule__DataClass__Group__0__Impl rule__DataClass__Group__1 )
            // InternalLemma.g:766:2: rule__DataClass__Group__0__Impl rule__DataClass__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__1();

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
    // $ANTLR end "rule__DataClass__Group__0"


    // $ANTLR start "rule__DataClass__Group__0__Impl"
    // InternalLemma.g:773:1: rule__DataClass__Group__0__Impl : ( 'DataClass' ) ;
    public final void rule__DataClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:777:1: ( ( 'DataClass' ) )
            // InternalLemma.g:778:1: ( 'DataClass' )
            {
            // InternalLemma.g:778:1: ( 'DataClass' )
            // InternalLemma.g:779:2: 'DataClass'
            {
             before(grammarAccess.getDataClassAccess().getDataClassKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataClassAccess().getDataClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__0__Impl"


    // $ANTLR start "rule__DataClass__Group__1"
    // InternalLemma.g:788:1: rule__DataClass__Group__1 : rule__DataClass__Group__1__Impl rule__DataClass__Group__2 ;
    public final void rule__DataClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:792:1: ( rule__DataClass__Group__1__Impl rule__DataClass__Group__2 )
            // InternalLemma.g:793:2: rule__DataClass__Group__1__Impl rule__DataClass__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DataClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__2();

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
    // $ANTLR end "rule__DataClass__Group__1"


    // $ANTLR start "rule__DataClass__Group__1__Impl"
    // InternalLemma.g:800:1: rule__DataClass__Group__1__Impl : ( ( rule__DataClass__NameAssignment_1 ) ) ;
    public final void rule__DataClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:804:1: ( ( ( rule__DataClass__NameAssignment_1 ) ) )
            // InternalLemma.g:805:1: ( ( rule__DataClass__NameAssignment_1 ) )
            {
            // InternalLemma.g:805:1: ( ( rule__DataClass__NameAssignment_1 ) )
            // InternalLemma.g:806:2: ( rule__DataClass__NameAssignment_1 )
            {
             before(grammarAccess.getDataClassAccess().getNameAssignment_1()); 
            // InternalLemma.g:807:2: ( rule__DataClass__NameAssignment_1 )
            // InternalLemma.g:807:3: rule__DataClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__1__Impl"


    // $ANTLR start "rule__DataClass__Group__2"
    // InternalLemma.g:815:1: rule__DataClass__Group__2 : rule__DataClass__Group__2__Impl rule__DataClass__Group__3 ;
    public final void rule__DataClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:819:1: ( rule__DataClass__Group__2__Impl rule__DataClass__Group__3 )
            // InternalLemma.g:820:2: rule__DataClass__Group__2__Impl rule__DataClass__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__DataClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__3();

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
    // $ANTLR end "rule__DataClass__Group__2"


    // $ANTLR start "rule__DataClass__Group__2__Impl"
    // InternalLemma.g:827:1: rule__DataClass__Group__2__Impl : ( ( rule__DataClass__Group_2__0 )? ) ;
    public final void rule__DataClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:831:1: ( ( ( rule__DataClass__Group_2__0 )? ) )
            // InternalLemma.g:832:1: ( ( rule__DataClass__Group_2__0 )? )
            {
            // InternalLemma.g:832:1: ( ( rule__DataClass__Group_2__0 )? )
            // InternalLemma.g:833:2: ( rule__DataClass__Group_2__0 )?
            {
             before(grammarAccess.getDataClassAccess().getGroup_2()); 
            // InternalLemma.g:834:2: ( rule__DataClass__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLemma.g:834:3: rule__DataClass__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataClass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataClassAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__2__Impl"


    // $ANTLR start "rule__DataClass__Group__3"
    // InternalLemma.g:842:1: rule__DataClass__Group__3 : rule__DataClass__Group__3__Impl rule__DataClass__Group__4 ;
    public final void rule__DataClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:846:1: ( rule__DataClass__Group__3__Impl rule__DataClass__Group__4 )
            // InternalLemma.g:847:2: rule__DataClass__Group__3__Impl rule__DataClass__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__DataClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__4();

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
    // $ANTLR end "rule__DataClass__Group__3"


    // $ANTLR start "rule__DataClass__Group__3__Impl"
    // InternalLemma.g:854:1: rule__DataClass__Group__3__Impl : ( '{' ) ;
    public final void rule__DataClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:858:1: ( ( '{' ) )
            // InternalLemma.g:859:1: ( '{' )
            {
            // InternalLemma.g:859:1: ( '{' )
            // InternalLemma.g:860:2: '{'
            {
             before(grammarAccess.getDataClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDataClassAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__3__Impl"


    // $ANTLR start "rule__DataClass__Group__4"
    // InternalLemma.g:869:1: rule__DataClass__Group__4 : rule__DataClass__Group__4__Impl rule__DataClass__Group__5 ;
    public final void rule__DataClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:873:1: ( rule__DataClass__Group__4__Impl rule__DataClass__Group__5 )
            // InternalLemma.g:874:2: rule__DataClass__Group__4__Impl rule__DataClass__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__DataClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group__5();

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
    // $ANTLR end "rule__DataClass__Group__4"


    // $ANTLR start "rule__DataClass__Group__4__Impl"
    // InternalLemma.g:881:1: rule__DataClass__Group__4__Impl : ( ( rule__DataClass__DataelementsAssignment_4 )* ) ;
    public final void rule__DataClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:885:1: ( ( ( rule__DataClass__DataelementsAssignment_4 )* ) )
            // InternalLemma.g:886:1: ( ( rule__DataClass__DataelementsAssignment_4 )* )
            {
            // InternalLemma.g:886:1: ( ( rule__DataClass__DataelementsAssignment_4 )* )
            // InternalLemma.g:887:2: ( rule__DataClass__DataelementsAssignment_4 )*
            {
             before(grammarAccess.getDataClassAccess().getDataelementsAssignment_4()); 
            // InternalLemma.g:888:2: ( rule__DataClass__DataelementsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18||LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLemma.g:888:3: rule__DataClass__DataelementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__DataClass__DataelementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDataClassAccess().getDataelementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__4__Impl"


    // $ANTLR start "rule__DataClass__Group__5"
    // InternalLemma.g:896:1: rule__DataClass__Group__5 : rule__DataClass__Group__5__Impl ;
    public final void rule__DataClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:900:1: ( rule__DataClass__Group__5__Impl )
            // InternalLemma.g:901:2: rule__DataClass__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataClass__Group__5__Impl();

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
    // $ANTLR end "rule__DataClass__Group__5"


    // $ANTLR start "rule__DataClass__Group__5__Impl"
    // InternalLemma.g:907:1: rule__DataClass__Group__5__Impl : ( '}' ) ;
    public final void rule__DataClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:911:1: ( ( '}' ) )
            // InternalLemma.g:912:1: ( '}' )
            {
            // InternalLemma.g:912:1: ( '}' )
            // InternalLemma.g:913:2: '}'
            {
             before(grammarAccess.getDataClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDataClassAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group__5__Impl"


    // $ANTLR start "rule__DataClass__Group_2__0"
    // InternalLemma.g:923:1: rule__DataClass__Group_2__0 : rule__DataClass__Group_2__0__Impl rule__DataClass__Group_2__1 ;
    public final void rule__DataClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:927:1: ( rule__DataClass__Group_2__0__Impl rule__DataClass__Group_2__1 )
            // InternalLemma.g:928:2: rule__DataClass__Group_2__0__Impl rule__DataClass__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__DataClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataClass__Group_2__1();

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
    // $ANTLR end "rule__DataClass__Group_2__0"


    // $ANTLR start "rule__DataClass__Group_2__0__Impl"
    // InternalLemma.g:935:1: rule__DataClass__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__DataClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:939:1: ( ( 'extends' ) )
            // InternalLemma.g:940:1: ( 'extends' )
            {
            // InternalLemma.g:940:1: ( 'extends' )
            // InternalLemma.g:941:2: 'extends'
            {
             before(grammarAccess.getDataClassAccess().getExtendsKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDataClassAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group_2__0__Impl"


    // $ANTLR start "rule__DataClass__Group_2__1"
    // InternalLemma.g:950:1: rule__DataClass__Group_2__1 : rule__DataClass__Group_2__1__Impl ;
    public final void rule__DataClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:954:1: ( rule__DataClass__Group_2__1__Impl )
            // InternalLemma.g:955:2: rule__DataClass__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataClass__Group_2__1__Impl();

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
    // $ANTLR end "rule__DataClass__Group_2__1"


    // $ANTLR start "rule__DataClass__Group_2__1__Impl"
    // InternalLemma.g:961:1: rule__DataClass__Group_2__1__Impl : ( ( rule__DataClass__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__DataClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:965:1: ( ( ( rule__DataClass__SuperTypeAssignment_2_1 ) ) )
            // InternalLemma.g:966:1: ( ( rule__DataClass__SuperTypeAssignment_2_1 ) )
            {
            // InternalLemma.g:966:1: ( ( rule__DataClass__SuperTypeAssignment_2_1 ) )
            // InternalLemma.g:967:2: ( rule__DataClass__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getDataClassAccess().getSuperTypeAssignment_2_1()); 
            // InternalLemma.g:968:2: ( rule__DataClass__SuperTypeAssignment_2_1 )
            // InternalLemma.g:968:3: rule__DataClass__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataClass__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataClassAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__Group_2__1__Impl"


    // $ANTLR start "rule__DataElement__Group__0"
    // InternalLemma.g:977:1: rule__DataElement__Group__0 : rule__DataElement__Group__0__Impl rule__DataElement__Group__1 ;
    public final void rule__DataElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:981:1: ( rule__DataElement__Group__0__Impl rule__DataElement__Group__1 )
            // InternalLemma.g:982:2: rule__DataElement__Group__0__Impl rule__DataElement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataElement__Group__1();

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
    // $ANTLR end "rule__DataElement__Group__0"


    // $ANTLR start "rule__DataElement__Group__0__Impl"
    // InternalLemma.g:989:1: rule__DataElement__Group__0__Impl : ( 'DataElement' ) ;
    public final void rule__DataElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:993:1: ( ( 'DataElement' ) )
            // InternalLemma.g:994:1: ( 'DataElement' )
            {
            // InternalLemma.g:994:1: ( 'DataElement' )
            // InternalLemma.g:995:2: 'DataElement'
            {
             before(grammarAccess.getDataElementAccess().getDataElementKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDataElementAccess().getDataElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__0__Impl"


    // $ANTLR start "rule__DataElement__Group__1"
    // InternalLemma.g:1004:1: rule__DataElement__Group__1 : rule__DataElement__Group__1__Impl rule__DataElement__Group__2 ;
    public final void rule__DataElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1008:1: ( rule__DataElement__Group__1__Impl rule__DataElement__Group__2 )
            // InternalLemma.g:1009:2: rule__DataElement__Group__1__Impl rule__DataElement__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__DataElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataElement__Group__2();

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
    // $ANTLR end "rule__DataElement__Group__1"


    // $ANTLR start "rule__DataElement__Group__1__Impl"
    // InternalLemma.g:1016:1: rule__DataElement__Group__1__Impl : ( ( rule__DataElement__NameAssignment_1 ) ) ;
    public final void rule__DataElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1020:1: ( ( ( rule__DataElement__NameAssignment_1 ) ) )
            // InternalLemma.g:1021:1: ( ( rule__DataElement__NameAssignment_1 ) )
            {
            // InternalLemma.g:1021:1: ( ( rule__DataElement__NameAssignment_1 ) )
            // InternalLemma.g:1022:2: ( rule__DataElement__NameAssignment_1 )
            {
             before(grammarAccess.getDataElementAccess().getNameAssignment_1()); 
            // InternalLemma.g:1023:2: ( rule__DataElement__NameAssignment_1 )
            // InternalLemma.g:1023:3: rule__DataElement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__1__Impl"


    // $ANTLR start "rule__DataElement__Group__2"
    // InternalLemma.g:1031:1: rule__DataElement__Group__2 : rule__DataElement__Group__2__Impl rule__DataElement__Group__3 ;
    public final void rule__DataElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1035:1: ( rule__DataElement__Group__2__Impl rule__DataElement__Group__3 )
            // InternalLemma.g:1036:2: rule__DataElement__Group__2__Impl rule__DataElement__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__DataElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataElement__Group__3();

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
    // $ANTLR end "rule__DataElement__Group__2"


    // $ANTLR start "rule__DataElement__Group__2__Impl"
    // InternalLemma.g:1043:1: rule__DataElement__Group__2__Impl : ( ':' ) ;
    public final void rule__DataElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1047:1: ( ( ':' ) )
            // InternalLemma.g:1048:1: ( ':' )
            {
            // InternalLemma.g:1048:1: ( ':' )
            // InternalLemma.g:1049:2: ':'
            {
             before(grammarAccess.getDataElementAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataElementAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__2__Impl"


    // $ANTLR start "rule__DataElement__Group__3"
    // InternalLemma.g:1058:1: rule__DataElement__Group__3 : rule__DataElement__Group__3__Impl ;
    public final void rule__DataElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1062:1: ( rule__DataElement__Group__3__Impl )
            // InternalLemma.g:1063:2: rule__DataElement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataElement__Group__3__Impl();

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
    // $ANTLR end "rule__DataElement__Group__3"


    // $ANTLR start "rule__DataElement__Group__3__Impl"
    // InternalLemma.g:1069:1: rule__DataElement__Group__3__Impl : ( ( rule__DataElement__TypeAssignment_3 ) ) ;
    public final void rule__DataElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1073:1: ( ( ( rule__DataElement__TypeAssignment_3 ) ) )
            // InternalLemma.g:1074:1: ( ( rule__DataElement__TypeAssignment_3 ) )
            {
            // InternalLemma.g:1074:1: ( ( rule__DataElement__TypeAssignment_3 ) )
            // InternalLemma.g:1075:2: ( rule__DataElement__TypeAssignment_3 )
            {
             before(grammarAccess.getDataElementAccess().getTypeAssignment_3()); 
            // InternalLemma.g:1076:2: ( rule__DataElement__TypeAssignment_3 )
            // InternalLemma.g:1076:3: rule__DataElement__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataElement__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataElementAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__Group__3__Impl"


    // $ANTLR start "rule__Lemmamodel__ElementsAssignment"
    // InternalLemma.g:1085:1: rule__Lemmamodel__ElementsAssignment : ( ruleAbstractItem ) ;
    public final void rule__Lemmamodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1089:1: ( ( ruleAbstractItem ) )
            // InternalLemma.g:1090:2: ( ruleAbstractItem )
            {
            // InternalLemma.g:1090:2: ( ruleAbstractItem )
            // InternalLemma.g:1091:3: ruleAbstractItem
            {
             before(grammarAccess.getLemmamodelAccess().getElementsAbstractItemParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractItem();

            state._fsp--;

             after(grammarAccess.getLemmamodelAccess().getElementsAbstractItemParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lemmamodel__ElementsAssignment"


    // $ANTLR start "rule__DataModel__NameAssignment_1"
    // InternalLemma.g:1100:1: rule__DataModel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__DataModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1104:1: ( ( ruleQualifiedName ) )
            // InternalLemma.g:1105:2: ( ruleQualifiedName )
            {
            // InternalLemma.g:1105:2: ( ruleQualifiedName )
            // InternalLemma.g:1106:3: ruleQualifiedName
            {
             before(grammarAccess.getDataModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__NameAssignment_1"


    // $ANTLR start "rule__DataModel__ElementsAssignment_3"
    // InternalLemma.g:1115:1: rule__DataModel__ElementsAssignment_3 : ( ruleAbstractItem ) ;
    public final void rule__DataModel__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1119:1: ( ( ruleAbstractItem ) )
            // InternalLemma.g:1120:2: ( ruleAbstractItem )
            {
            // InternalLemma.g:1120:2: ( ruleAbstractItem )
            // InternalLemma.g:1121:3: ruleAbstractItem
            {
             before(grammarAccess.getDataModelAccess().getElementsAbstractItemParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractItem();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getElementsAbstractItemParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__ElementsAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalLemma.g:1130:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1134:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalLemma.g:1135:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalLemma.g:1135:2: ( ruleQualifiedNameWithWildcard )
            // InternalLemma.g:1136:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalLemma.g:1145:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1149:1: ( ( RULE_ID ) )
            // InternalLemma.g:1150:2: ( RULE_ID )
            {
            // InternalLemma.g:1150:2: ( RULE_ID )
            // InternalLemma.g:1151:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__DataClass__NameAssignment_1"
    // InternalLemma.g:1160:1: rule__DataClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1164:1: ( ( RULE_ID ) )
            // InternalLemma.g:1165:2: ( RULE_ID )
            {
            // InternalLemma.g:1165:2: ( RULE_ID )
            // InternalLemma.g:1166:3: RULE_ID
            {
             before(grammarAccess.getDataClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__NameAssignment_1"


    // $ANTLR start "rule__DataClass__SuperTypeAssignment_2_1"
    // InternalLemma.g:1175:1: rule__DataClass__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataClass__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1179:1: ( ( ( RULE_ID ) ) )
            // InternalLemma.g:1180:2: ( ( RULE_ID ) )
            {
            // InternalLemma.g:1180:2: ( ( RULE_ID ) )
            // InternalLemma.g:1181:3: ( RULE_ID )
            {
             before(grammarAccess.getDataClassAccess().getSuperTypeDataClassCrossReference_2_1_0()); 
            // InternalLemma.g:1182:3: ( RULE_ID )
            // InternalLemma.g:1183:4: RULE_ID
            {
             before(grammarAccess.getDataClassAccess().getSuperTypeDataClassIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataClassAccess().getSuperTypeDataClassIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDataClassAccess().getSuperTypeDataClassCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__DataClass__DataelementsAssignment_4"
    // InternalLemma.g:1194:1: rule__DataClass__DataelementsAssignment_4 : ( ruleContainerElement ) ;
    public final void rule__DataClass__DataelementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1198:1: ( ( ruleContainerElement ) )
            // InternalLemma.g:1199:2: ( ruleContainerElement )
            {
            // InternalLemma.g:1199:2: ( ruleContainerElement )
            // InternalLemma.g:1200:3: ruleContainerElement
            {
             before(grammarAccess.getDataClassAccess().getDataelementsContainerElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleContainerElement();

            state._fsp--;

             after(grammarAccess.getDataClassAccess().getDataelementsContainerElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataClass__DataelementsAssignment_4"


    // $ANTLR start "rule__DataElement__NameAssignment_1"
    // InternalLemma.g:1209:1: rule__DataElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1213:1: ( ( RULE_ID ) )
            // InternalLemma.g:1214:2: ( RULE_ID )
            {
            // InternalLemma.g:1214:2: ( RULE_ID )
            // InternalLemma.g:1215:3: RULE_ID
            {
             before(grammarAccess.getDataElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__NameAssignment_1"


    // $ANTLR start "rule__DataElement__TypeAssignment_3"
    // InternalLemma.g:1224:1: rule__DataElement__TypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataElement__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLemma.g:1228:1: ( ( ( ruleQualifiedName ) ) )
            // InternalLemma.g:1229:2: ( ( ruleQualifiedName ) )
            {
            // InternalLemma.g:1229:2: ( ( ruleQualifiedName ) )
            // InternalLemma.g:1230:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataElementAccess().getTypeDataTypeCrossReference_3_0()); 
            // InternalLemma.g:1231:3: ( ruleQualifiedName )
            // InternalLemma.g:1232:4: ruleQualifiedName
            {
             before(grammarAccess.getDataElementAccess().getTypeDataTypeQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataElementAccess().getTypeDataTypeQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDataElementAccess().getTypeDataTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataElement__TypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000068802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000006A800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000142000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});

}