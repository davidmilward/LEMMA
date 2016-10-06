/**
 * generated by Xtext 2.10.0
 */
package com.beenleigh.dsl.validation;

import com.beenleigh.dsl.lemma.ContainerElement;
import com.beenleigh.dsl.lemma.DataClass;
import com.beenleigh.dsl.lemma.DataElement;
import com.beenleigh.dsl.lemma.LemmaPackage;
import com.beenleigh.dsl.validation.AbstractLemmaValidator;
import com.google.common.base.Objects;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class LemmaValidator extends AbstractLemmaValidator {
  public final static String INVALID_NAME = "invalidName";
  
  @Check
  public void checkDataClassStartsWithCapital(final DataClass dataClass) {
    String _name = dataClass.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Name should start with a capital", 
        LemmaPackage.Literals.CONTAINER_ELEMENT__NAME, 
        LemmaValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkDataElementStartsWithLowerCase(final DataElement dataElement) {
    String _name = dataElement.getName();
    char _charAt = _name.charAt(0);
    boolean _isLowerCase = Character.isLowerCase(_charAt);
    boolean _not = (!_isLowerCase);
    if (_not) {
      this.warning("Name should start with a lower case letter", 
        LemmaPackage.Literals.CONTAINER_ELEMENT__NAME, 
        LemmaValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkDataClassNameIsUnique(final DataClass dc) {
    DataClass _superType = dc.getSuperType();
    boolean _equals = Objects.equal(_superType, DataClass.class);
    if (_equals) {
      EObject _eContainer = dc.eContainer();
      DataClass superEntity = ((DataClass) _eContainer).getSuperType();
      while ((!Objects.equal(superEntity, null))) {
        {
          EList<ContainerElement> _dataelements = superEntity.getDataelements();
          for (final ContainerElement other : _dataelements) {
            String _name = dc.getName();
            String _name_1 = other.getName();
            boolean _equals_1 = Objects.equal(_name, _name_1);
            if (_equals_1) {
              this.error("DataClass names have to be unique", 
                LemmaPackage.Literals.CONTAINER_ELEMENT__NAME);
              return;
            }
          }
          DataClass _superType_1 = superEntity.getSuperType();
          superEntity = _superType_1;
        }
      }
    }
  }
  
  @Check
  public void checkNoCycleInEntityHierarchy(final DataClass dataclass) {
    DataClass _superType = dataclass.getSuperType();
    boolean _equals = Objects.equal(_superType, null);
    if (_equals) {
      return;
    }
    final HashSet<DataClass> visitedEntities = CollectionLiterals.<DataClass>newHashSet();
    visitedEntities.add(dataclass);
    DataClass current = dataclass.getSuperType();
    while ((!Objects.equal(current, null))) {
      {
        boolean _contains = visitedEntities.contains(current);
        if (_contains) {
          String _name = current.getName();
          String _plus = ("cycle in hierarchy of entity \'" + _name);
          String _plus_1 = (_plus + "\'");
          this.error(_plus_1, LemmaPackage.Literals.CONTAINER_ELEMENT__NAME);
          return;
        }
        visitedEntities.add(current);
        DataClass _superType_1 = current.getSuperType();
        current = _superType_1;
      }
    }
  }
}