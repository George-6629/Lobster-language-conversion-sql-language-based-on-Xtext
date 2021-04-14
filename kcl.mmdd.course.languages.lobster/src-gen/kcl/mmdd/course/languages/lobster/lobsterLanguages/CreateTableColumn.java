/**
 * generated by Xtext 2.24.0
 */
package kcl.mmdd.course.languages.lobster.lobsterLanguages;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Table Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.CreateTableColumn#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.CreateTableColumn#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.CreateTableColumn#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage#getCreateTableColumn()
 * @model
 * @generated
 */
public interface CreateTableColumn extends EObject
{
  /**
   * Returns the value of the '<em><b>Column Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Name</em>' containment reference.
   * @see #setColumnName(PrimaryExpression)
   * @see kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage#getCreateTableColumn_ColumnName()
   * @model containment="true"
   * @generated
   */
  PrimaryExpression getColumnName();

  /**
   * Sets the value of the '{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.CreateTableColumn#getColumnName <em>Column Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Name</em>' containment reference.
   * @see #getColumnName()
   * @generated
   */
  void setColumnName(PrimaryExpression value);

  /**
   * Returns the value of the '<em><b>Datatype</b></em>' attribute.
   * The literals are from the enumeration {@link kcl.mmdd.course.languages.lobster.lobsterLanguages.DataType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype</em>' attribute.
   * @see kcl.mmdd.course.languages.lobster.lobsterLanguages.DataType
   * @see #setDatatype(DataType)
   * @see kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage#getCreateTableColumn_Datatype()
   * @model
   * @generated
   */
  DataType getDatatype();

  /**
   * Sets the value of the '{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.CreateTableColumn#getDatatype <em>Datatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype</em>' attribute.
   * @see kcl.mmdd.course.languages.lobster.lobsterLanguages.DataType
   * @see #getDatatype()
   * @generated
   */
  void setDatatype(DataType value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(IntLiteral)
   * @see kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage#getCreateTableColumn_Size()
   * @model containment="true"
   * @generated
   */
  IntLiteral getSize();

  /**
   * Sets the value of the '{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.CreateTableColumn#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(IntLiteral value);

} // CreateTableColumn