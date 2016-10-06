/*
 * generated by Xtext 2.10.0
 */
grammar InternalLemma;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.beenleigh.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleLemmamodel
entryRuleLemmamodel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLemmamodelRule()); }
	iv_ruleLemmamodel=ruleLemmamodel
	{ $current=$iv_ruleLemmamodel.current; }
	EOF;

// Rule Lemmamodel
ruleLemmamodel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getLemmamodelAccess().getElementsAbstractItemParserRuleCall_0());
			}
			lv_elements_0_0=ruleAbstractItem
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getLemmamodelRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"com.beenleigh.dsl.Lemma.AbstractItem");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleDataModel
entryRuleDataModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataModelRule()); }
	iv_ruleDataModel=ruleDataModel
	{ $current=$iv_ruleDataModel.current; }
	EOF;

// Rule DataModel
ruleDataModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DataModel'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataModelAccess().getDataModelKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDataModelAccess().getNameQualifiedNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDataModelRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"com.beenleigh.dsl.Lemma.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDataModelAccess().getElementsAbstractItemParserRuleCall_3_0());
				}
				lv_elements_3_0=ruleAbstractItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDataModelRule());
					}
					add(
						$current,
						"elements",
						lv_elements_3_0,
						"com.beenleigh.dsl.Lemma.AbstractItem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleAbstractItem
entryRuleAbstractItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractItemRule()); }
	iv_ruleAbstractItem=ruleAbstractItem
	{ $current=$iv_ruleAbstractItem.current; }
	EOF;

// Rule AbstractItem
ruleAbstractItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractItemAccess().getDataModelParserRuleCall_0());
		}
		this_DataModel_0=ruleDataModel
		{
			$current = $this_DataModel_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractItemAccess().getDataClassParserRuleCall_1());
		}
		this_DataClass_1=ruleDataClass
		{
			$current = $this_DataClass_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractItemAccess().getDataTypeParserRuleCall_2());
		}
		this_DataType_2=ruleDataType
		{
			$current = $this_DataType_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractItemAccess().getImportParserRuleCall_3());
		}
		this_Import_3=ruleImport
		{
			$current = $this_Import_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
				}
				lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_1_0,
						"com.beenleigh.dsl.Lemma.QualifiedNameWithWildcard");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); }
	iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard
	{ $current=$iv_ruleQualifiedNameWithWildcard.current.getText(); }
	EOF;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
		}
		this_QualifiedName_0=ruleQualifiedName
		{
			$current.merge(this_QualifiedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='.*'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleDataType
entryRuleDataType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); }
	iv_ruleDataType=ruleDataType
	{ $current=$iv_ruleDataType.current; }
	EOF;

// Rule DataType
ruleDataType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='datatype'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleContainerElement
entryRuleContainerElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainerElementRule()); }
	iv_ruleContainerElement=ruleContainerElement
	{ $current=$iv_ruleContainerElement.current; }
	EOF;

// Rule ContainerElement
ruleContainerElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getContainerElementAccess().getDataClassParserRuleCall_0());
		}
		this_DataClass_0=ruleDataClass
		{
			$current = $this_DataClass_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getContainerElementAccess().getDataElementParserRuleCall_1());
		}
		this_DataElement_1=ruleDataElement
		{
			$current = $this_DataElement_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDataClass
entryRuleDataClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataClassRule()); }
	iv_ruleDataClass=ruleDataClass
	{ $current=$iv_ruleDataClass.current; }
	EOF;

// Rule DataClass
ruleDataClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DataClass'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataClassAccess().getDataClassKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDataClassAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='extends'
			{
				newLeafNode(otherlv_2, grammarAccess.getDataClassAccess().getExtendsKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataClassRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getDataClassAccess().getSuperTypeDataClassCrossReference_2_1_0());
					}
				)
			)
		)?
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getDataClassAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDataClassAccess().getDataelementsContainerElementParserRuleCall_4_0());
				}
				lv_dataelements_5_0=ruleContainerElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDataClassRule());
					}
					add(
						$current,
						"dataelements",
						lv_dataelements_5_0,
						"com.beenleigh.dsl.Lemma.ContainerElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getDataClassAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleDataElement
entryRuleDataElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataElementRule()); }
	iv_ruleDataElement=ruleDataElement
	{ $current=$iv_ruleDataElement.current; }
	EOF;

// Rule DataElement
ruleDataElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DataElement'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataElementAccess().getDataElementKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDataElementAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataElementRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getDataElementAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataElementRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDataElementAccess().getTypeDataTypeCrossReference_3_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
