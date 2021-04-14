/**
 * generated by Xtext 2.24.0
 */
package kcl.mmdd.course.languages.lobster.lobsterLanguages;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.ConditionStatement#getColumn <em>Column</em>}</li>
 *   <li>{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.ConditionStatement#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage#getConditionStatement()
 * @model
 * @generated
 */
public interface ConditionStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' containment reference.
   * @see #setColumn(PrimaryExpression)
   * @see kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage#getConditionStatement_Column()
   * @model containment="true"
   * @generated
   */
  PrimaryExpression getColumn();

  /**
   * Sets the value of the '{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.ConditionStatement#getColumn <em>Column</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' containment reference.
   * @see #getColumn()
   * @generated
   */
  void setColumn(PrimaryExpression value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(PrimaryExpression)
   * @see kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage#getConditionStatement_Value()
   * @model containment="true"
   * @generated
   */
  PrimaryExpression getValue();

  /**
   * Sets the value of the '{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.ConditionStatement#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(PrimaryExpression value);

} // ConditionStatement
