/**
 * generated by Xtext 2.24.0
 */
package kcl.mmdd.course.languages.lobster.lobsterLanguages;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.VariableCharacter#getName <em>Name</em>}</li>
 *   <li>{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.VariableCharacter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage#getVariableCharacter()
 * @model
 * @generated
 */
public interface VariableCharacter extends Statement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage#getVariableCharacter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.VariableCharacter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage#getVariableCharacter_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.VariableCharacter#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // VariableCharacter