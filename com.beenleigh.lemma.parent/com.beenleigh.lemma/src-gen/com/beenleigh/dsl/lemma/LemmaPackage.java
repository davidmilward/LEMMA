/**
 * generated by Xtext 2.10.0
 */
package com.beenleigh.dsl.lemma;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.beenleigh.dsl.lemma.LemmaFactory
 * @model kind="package"
 * @generated
 */
public interface LemmaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lemma";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.beenleigh.com/dsl/Lemma";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lemma";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LemmaPackage eINSTANCE = com.beenleigh.dsl.lemma.impl.LemmaPackageImpl.init();

  /**
   * The meta object id for the '{@link com.beenleigh.dsl.lemma.impl.LemmamodelImpl <em>Lemmamodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.beenleigh.dsl.lemma.impl.LemmamodelImpl
   * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getLemmamodel()
   * @generated
   */
  int LEMMAMODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEMMAMODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Lemmamodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEMMAMODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.beenleigh.dsl.lemma.impl.AbstractItemImpl <em>Abstract Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.beenleigh.dsl.lemma.impl.AbstractItemImpl
   * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getAbstractItem()
   * @generated
   */
  int ABSTRACT_ITEM = 2;

  /**
   * The number of structural features of the '<em>Abstract Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.beenleigh.dsl.lemma.impl.DataModelImpl <em>Data Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.beenleigh.dsl.lemma.impl.DataModelImpl
   * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getDataModel()
   * @generated
   */
  int DATA_MODEL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__NAME = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL__ELEMENTS = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MODEL_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.beenleigh.dsl.lemma.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.beenleigh.dsl.lemma.impl.ImportImpl
   * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 3;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.beenleigh.dsl.lemma.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.beenleigh.dsl.lemma.impl.DataTypeImpl
   * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.beenleigh.dsl.lemma.impl.ContainerElementImpl <em>Container Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.beenleigh.dsl.lemma.impl.ContainerElementImpl
   * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getContainerElement()
   * @generated
   */
  int CONTAINER_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Container Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.beenleigh.dsl.lemma.impl.DataClassImpl <em>Data Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.beenleigh.dsl.lemma.impl.DataClassImpl
   * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getDataClass()
   * @generated
   */
  int DATA_CLASS = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CLASS__NAME = ABSTRACT_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CLASS__SUPER_TYPE = ABSTRACT_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dataelements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CLASS__DATAELEMENTS = ABSTRACT_ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CLASS_FEATURE_COUNT = ABSTRACT_ITEM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.beenleigh.dsl.lemma.impl.DataElementImpl <em>Data Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.beenleigh.dsl.lemma.impl.DataElementImpl
   * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getDataElement()
   * @generated
   */
  int DATA_ELEMENT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ELEMENT__NAME = CONTAINER_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ELEMENT__TYPE = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ELEMENT_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link com.beenleigh.dsl.lemma.Lemmamodel <em>Lemmamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lemmamodel</em>'.
   * @see com.beenleigh.dsl.lemma.Lemmamodel
   * @generated
   */
  EClass getLemmamodel();

  /**
   * Returns the meta object for the containment reference list '{@link com.beenleigh.dsl.lemma.Lemmamodel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.beenleigh.dsl.lemma.Lemmamodel#getElements()
   * @see #getLemmamodel()
   * @generated
   */
  EReference getLemmamodel_Elements();

  /**
   * Returns the meta object for class '{@link com.beenleigh.dsl.lemma.DataModel <em>Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Model</em>'.
   * @see com.beenleigh.dsl.lemma.DataModel
   * @generated
   */
  EClass getDataModel();

  /**
   * Returns the meta object for the attribute '{@link com.beenleigh.dsl.lemma.DataModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.beenleigh.dsl.lemma.DataModel#getName()
   * @see #getDataModel()
   * @generated
   */
  EAttribute getDataModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.beenleigh.dsl.lemma.DataModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.beenleigh.dsl.lemma.DataModel#getElements()
   * @see #getDataModel()
   * @generated
   */
  EReference getDataModel_Elements();

  /**
   * Returns the meta object for class '{@link com.beenleigh.dsl.lemma.AbstractItem <em>Abstract Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Item</em>'.
   * @see com.beenleigh.dsl.lemma.AbstractItem
   * @generated
   */
  EClass getAbstractItem();

  /**
   * Returns the meta object for class '{@link com.beenleigh.dsl.lemma.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.beenleigh.dsl.lemma.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link com.beenleigh.dsl.lemma.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see com.beenleigh.dsl.lemma.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link com.beenleigh.dsl.lemma.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see com.beenleigh.dsl.lemma.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link com.beenleigh.dsl.lemma.DataType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.beenleigh.dsl.lemma.DataType#getName()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Name();

  /**
   * Returns the meta object for class '{@link com.beenleigh.dsl.lemma.ContainerElement <em>Container Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Element</em>'.
   * @see com.beenleigh.dsl.lemma.ContainerElement
   * @generated
   */
  EClass getContainerElement();

  /**
   * Returns the meta object for the attribute '{@link com.beenleigh.dsl.lemma.ContainerElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.beenleigh.dsl.lemma.ContainerElement#getName()
   * @see #getContainerElement()
   * @generated
   */
  EAttribute getContainerElement_Name();

  /**
   * Returns the meta object for class '{@link com.beenleigh.dsl.lemma.DataClass <em>Data Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Class</em>'.
   * @see com.beenleigh.dsl.lemma.DataClass
   * @generated
   */
  EClass getDataClass();

  /**
   * Returns the meta object for the reference '{@link com.beenleigh.dsl.lemma.DataClass#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see com.beenleigh.dsl.lemma.DataClass#getSuperType()
   * @see #getDataClass()
   * @generated
   */
  EReference getDataClass_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link com.beenleigh.dsl.lemma.DataClass#getDataelements <em>Dataelements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dataelements</em>'.
   * @see com.beenleigh.dsl.lemma.DataClass#getDataelements()
   * @see #getDataClass()
   * @generated
   */
  EReference getDataClass_Dataelements();

  /**
   * Returns the meta object for class '{@link com.beenleigh.dsl.lemma.DataElement <em>Data Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Element</em>'.
   * @see com.beenleigh.dsl.lemma.DataElement
   * @generated
   */
  EClass getDataElement();

  /**
   * Returns the meta object for the reference '{@link com.beenleigh.dsl.lemma.DataElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.beenleigh.dsl.lemma.DataElement#getType()
   * @see #getDataElement()
   * @generated
   */
  EReference getDataElement_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LemmaFactory getLemmaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.beenleigh.dsl.lemma.impl.LemmamodelImpl <em>Lemmamodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.beenleigh.dsl.lemma.impl.LemmamodelImpl
     * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getLemmamodel()
     * @generated
     */
    EClass LEMMAMODEL = eINSTANCE.getLemmamodel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEMMAMODEL__ELEMENTS = eINSTANCE.getLemmamodel_Elements();

    /**
     * The meta object literal for the '{@link com.beenleigh.dsl.lemma.impl.DataModelImpl <em>Data Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.beenleigh.dsl.lemma.impl.DataModelImpl
     * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getDataModel()
     * @generated
     */
    EClass DATA_MODEL = eINSTANCE.getDataModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_MODEL__NAME = eINSTANCE.getDataModel_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MODEL__ELEMENTS = eINSTANCE.getDataModel_Elements();

    /**
     * The meta object literal for the '{@link com.beenleigh.dsl.lemma.impl.AbstractItemImpl <em>Abstract Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.beenleigh.dsl.lemma.impl.AbstractItemImpl
     * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getAbstractItem()
     * @generated
     */
    EClass ABSTRACT_ITEM = eINSTANCE.getAbstractItem();

    /**
     * The meta object literal for the '{@link com.beenleigh.dsl.lemma.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.beenleigh.dsl.lemma.impl.ImportImpl
     * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link com.beenleigh.dsl.lemma.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.beenleigh.dsl.lemma.impl.DataTypeImpl
     * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

    /**
     * The meta object literal for the '{@link com.beenleigh.dsl.lemma.impl.ContainerElementImpl <em>Container Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.beenleigh.dsl.lemma.impl.ContainerElementImpl
     * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getContainerElement()
     * @generated
     */
    EClass CONTAINER_ELEMENT = eINSTANCE.getContainerElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_ELEMENT__NAME = eINSTANCE.getContainerElement_Name();

    /**
     * The meta object literal for the '{@link com.beenleigh.dsl.lemma.impl.DataClassImpl <em>Data Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.beenleigh.dsl.lemma.impl.DataClassImpl
     * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getDataClass()
     * @generated
     */
    EClass DATA_CLASS = eINSTANCE.getDataClass();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CLASS__SUPER_TYPE = eINSTANCE.getDataClass_SuperType();

    /**
     * The meta object literal for the '<em><b>Dataelements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CLASS__DATAELEMENTS = eINSTANCE.getDataClass_Dataelements();

    /**
     * The meta object literal for the '{@link com.beenleigh.dsl.lemma.impl.DataElementImpl <em>Data Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.beenleigh.dsl.lemma.impl.DataElementImpl
     * @see com.beenleigh.dsl.lemma.impl.LemmaPackageImpl#getDataElement()
     * @generated
     */
    EClass DATA_ELEMENT = eINSTANCE.getDataElement();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ELEMENT__TYPE = eINSTANCE.getDataElement_Type();

  }

} //LemmaPackage
