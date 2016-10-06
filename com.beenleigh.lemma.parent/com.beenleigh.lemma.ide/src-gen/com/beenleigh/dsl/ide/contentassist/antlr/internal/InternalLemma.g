/*
 * generated by Xtext 2.10.0
 */
grammar InternalLemma;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package com.beenleigh.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleLemmamodel
entryRuleLemmamodel
:
{ before(grammarAccess.getLemmamodelRule()); }
	 ruleLemmamodel
{ after(grammarAccess.getLemmamodelRule()); } 
	 EOF 
;

// Rule Lemmamodel
ruleLemmamodel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLemmamodelAccess().getElementsAssignment()); }
		(rule__Lemmamodel__ElementsAssignment)*
		{ after(grammarAccess.getLemmamodelAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataModel
entryRuleDataModel
:
{ before(grammarAccess.getDataModelRule()); }
	 ruleDataModel
{ after(grammarAccess.getDataModelRule()); } 
	 EOF 
;

// Rule DataModel
ruleDataModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataModelAccess().getGroup()); }
		(rule__DataModel__Group__0)
		{ after(grammarAccess.getDataModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractItem
entryRuleAbstractItem
:
{ before(grammarAccess.getAbstractItemRule()); }
	 ruleAbstractItem
{ after(grammarAccess.getAbstractItemRule()); } 
	 EOF 
;

// Rule AbstractItem
ruleAbstractItem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractItemAccess().getAlternatives()); }
		(rule__AbstractItem__Alternatives)
		{ after(grammarAccess.getAbstractItemAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImport
entryRuleImport
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImportAccess().getGroup()); }
		(rule__Import__Group__0)
		{ after(grammarAccess.getImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard
:
{ before(grammarAccess.getQualifiedNameWithWildcardRule()); }
	 ruleQualifiedNameWithWildcard
{ after(grammarAccess.getQualifiedNameWithWildcardRule()); } 
	 EOF 
;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); }
		(rule__QualifiedNameWithWildcard__Group__0)
		{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataType
entryRuleDataType
:
{ before(grammarAccess.getDataTypeRule()); }
	 ruleDataType
{ after(grammarAccess.getDataTypeRule()); } 
	 EOF 
;

// Rule DataType
ruleDataType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataTypeAccess().getGroup()); }
		(rule__DataType__Group__0)
		{ after(grammarAccess.getDataTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleContainerElement
entryRuleContainerElement
:
{ before(grammarAccess.getContainerElementRule()); }
	 ruleContainerElement
{ after(grammarAccess.getContainerElementRule()); } 
	 EOF 
;

// Rule ContainerElement
ruleContainerElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getContainerElementAccess().getAlternatives()); }
		(rule__ContainerElement__Alternatives)
		{ after(grammarAccess.getContainerElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataClass
entryRuleDataClass
:
{ before(grammarAccess.getDataClassRule()); }
	 ruleDataClass
{ after(grammarAccess.getDataClassRule()); } 
	 EOF 
;

// Rule DataClass
ruleDataClass 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataClassAccess().getGroup()); }
		(rule__DataClass__Group__0)
		{ after(grammarAccess.getDataClassAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataElement
entryRuleDataElement
:
{ before(grammarAccess.getDataElementRule()); }
	 ruleDataElement
{ after(grammarAccess.getDataElementRule()); } 
	 EOF 
;

// Rule DataElement
ruleDataElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataElementAccess().getGroup()); }
		(rule__DataElement__Group__0)
		{ after(grammarAccess.getDataElementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractItem__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractItemAccess().getDataModelParserRuleCall_0()); }
		ruleDataModel
		{ after(grammarAccess.getAbstractItemAccess().getDataModelParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractItemAccess().getDataClassParserRuleCall_1()); }
		ruleDataClass
		{ after(grammarAccess.getAbstractItemAccess().getDataClassParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractItemAccess().getDataTypeParserRuleCall_2()); }
		ruleDataType
		{ after(grammarAccess.getAbstractItemAccess().getDataTypeParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractItemAccess().getImportParserRuleCall_3()); }
		ruleImport
		{ after(grammarAccess.getAbstractItemAccess().getImportParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ContainerElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getContainerElementAccess().getDataClassParserRuleCall_0()); }
		ruleDataClass
		{ after(grammarAccess.getContainerElementAccess().getDataClassParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getContainerElementAccess().getDataElementParserRuleCall_1()); }
		ruleDataElement
		{ after(grammarAccess.getContainerElementAccess().getDataElementParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataModel__Group__0__Impl
	rule__DataModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataModelAccess().getDataModelKeyword_0()); }
	'DataModel'
	{ after(grammarAccess.getDataModelAccess().getDataModelKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataModel__Group__1__Impl
	rule__DataModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataModelAccess().getNameAssignment_1()); }
	(rule__DataModel__NameAssignment_1)
	{ after(grammarAccess.getDataModelAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataModel__Group__2__Impl
	rule__DataModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataModel__Group__3__Impl
	rule__DataModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataModelAccess().getElementsAssignment_3()); }
	(rule__DataModel__ElementsAssignment_3)*
	{ after(grammarAccess.getDataModelAccess().getElementsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataModel__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportKeyword_0()); }
	'import'
	{ after(grammarAccess.getImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
	(rule__Import__ImportedNamespaceAssignment_1)
	{ after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedNameWithWildcard__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedNameWithWildcard__Group__0__Impl
	rule__QualifiedNameWithWildcard__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); }
	ruleQualifiedName
	{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedNameWithWildcard__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); }
	('.*')?
	{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType__Group__0__Impl
	rule__DataType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); }
	'datatype'
	{ after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); }
	(rule__DataType__NameAssignment_1)
	{ after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataClass__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataClass__Group__0__Impl
	rule__DataClass__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataClassAccess().getDataClassKeyword_0()); }
	'DataClass'
	{ after(grammarAccess.getDataClassAccess().getDataClassKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataClass__Group__1__Impl
	rule__DataClass__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataClassAccess().getNameAssignment_1()); }
	(rule__DataClass__NameAssignment_1)
	{ after(grammarAccess.getDataClassAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataClass__Group__2__Impl
	rule__DataClass__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataClassAccess().getGroup_2()); }
	(rule__DataClass__Group_2__0)?
	{ after(grammarAccess.getDataClassAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataClass__Group__3__Impl
	rule__DataClass__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataClassAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getDataClassAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataClass__Group__4__Impl
	rule__DataClass__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataClassAccess().getDataelementsAssignment_4()); }
	(rule__DataClass__DataelementsAssignment_4)*
	{ after(grammarAccess.getDataClassAccess().getDataelementsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataClass__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataClassAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getDataClassAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataClass__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataClass__Group_2__0__Impl
	rule__DataClass__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataClassAccess().getExtendsKeyword_2_0()); }
	'extends'
	{ after(grammarAccess.getDataClassAccess().getExtendsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataClass__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataClassAccess().getSuperTypeAssignment_2_1()); }
	(rule__DataClass__SuperTypeAssignment_2_1)
	{ after(grammarAccess.getDataClassAccess().getSuperTypeAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataElement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataElement__Group__0__Impl
	rule__DataElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataElement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataElementAccess().getDataElementKeyword_0()); }
	'DataElement'
	{ after(grammarAccess.getDataElementAccess().getDataElementKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataElement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataElement__Group__1__Impl
	rule__DataElement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataElement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataElementAccess().getNameAssignment_1()); }
	(rule__DataElement__NameAssignment_1)
	{ after(grammarAccess.getDataElementAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataElement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataElement__Group__2__Impl
	rule__DataElement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataElement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataElementAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getDataElementAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataElement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataElement__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataElement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataElementAccess().getTypeAssignment_3()); }
	(rule__DataElement__TypeAssignment_3)
	{ after(grammarAccess.getDataElementAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Lemmamodel__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLemmamodelAccess().getElementsAbstractItemParserRuleCall_0()); }
		ruleAbstractItem
		{ after(grammarAccess.getLemmamodelAccess().getElementsAbstractItemParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataModelAccess().getNameQualifiedNameParserRuleCall_1_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getDataModelAccess().getNameQualifiedNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataModel__ElementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataModelAccess().getElementsAbstractItemParserRuleCall_3_0()); }
		ruleAbstractItem
		{ after(grammarAccess.getDataModelAccess().getElementsAbstractItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportedNamespaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); }
		ruleQualifiedNameWithWildcard
		{ after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataClassAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDataClassAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__SuperTypeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataClassAccess().getSuperTypeDataClassCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getDataClassAccess().getSuperTypeDataClassIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDataClassAccess().getSuperTypeDataClassIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getDataClassAccess().getSuperTypeDataClassCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataClass__DataelementsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataClassAccess().getDataelementsContainerElementParserRuleCall_4_0()); }
		ruleContainerElement
		{ after(grammarAccess.getDataClassAccess().getDataelementsContainerElementParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataElement__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataElementAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDataElementAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataElement__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataElementAccess().getTypeDataTypeCrossReference_3_0()); }
		(
			{ before(grammarAccess.getDataElementAccess().getTypeDataTypeQualifiedNameParserRuleCall_3_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getDataElementAccess().getTypeDataTypeQualifiedNameParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getDataElementAccess().getTypeDataTypeCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
