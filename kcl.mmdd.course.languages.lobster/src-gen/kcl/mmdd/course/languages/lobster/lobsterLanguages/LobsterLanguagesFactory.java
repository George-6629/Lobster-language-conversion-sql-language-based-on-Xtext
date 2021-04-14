/**
 * generated by Xtext 2.24.0
 */
package kcl.mmdd.course.languages.lobster.lobsterLanguages;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage
 * @generated
 */
public interface LobsterLanguagesFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LobsterLanguagesFactory eINSTANCE = kcl.mmdd.course.languages.lobster.lobsterLanguages.impl.LobsterLanguagesFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Lobster Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lobster Program</em>'.
   * @generated
   */
  LobsterProgram createLobsterProgram();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Variable Character</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Character</em>'.
   * @generated
   */
  VariableCharacter createVariableCharacter();

  /**
   * Returns a new object of class '<em>Create Database Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Database Statement</em>'.
   * @generated
   */
  CreateDatabaseStatement createCreateDatabaseStatement();

  /**
   * Returns a new object of class '<em>Create Table Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Table Statement</em>'.
   * @generated
   */
  CreateTableStatement createCreateTableStatement();

  /**
   * Returns a new object of class '<em>Create Table Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Table Column</em>'.
   * @generated
   */
  CreateTableColumn createCreateTableColumn();

  /**
   * Returns a new object of class '<em>Insert Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert Statement</em>'.
   * @generated
   */
  InsertStatement createInsertStatement();

  /**
   * Returns a new object of class '<em>Delete Data Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete Data Statement</em>'.
   * @generated
   */
  DeleteDataStatement createDeleteDataStatement();

  /**
   * Returns a new object of class '<em>More Condition Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>More Condition Statement</em>'.
   * @generated
   */
  MoreConditionStatement createMoreConditionStatement();

  /**
   * Returns a new object of class '<em>Delete Table Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete Table Statement</em>'.
   * @generated
   */
  DeleteTableStatement createDeleteTableStatement();

  /**
   * Returns a new object of class '<em>Update Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Statement</em>'.
   * @generated
   */
  UpdateStatement createUpdateStatement();

  /**
   * Returns a new object of class '<em>Select Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Statement</em>'.
   * @generated
   */
  SelectStatement createSelectStatement();

  /**
   * Returns a new object of class '<em>Condition Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition Statement</em>'.
   * @generated
   */
  ConditionStatement createConditionStatement();

  /**
   * Returns a new object of class '<em>Primary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Expression</em>'.
   * @generated
   */
  PrimaryExpression createPrimaryExpression();

  /**
   * Returns a new object of class '<em>Char Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Char Literal</em>'.
   * @generated
   */
  CharLiteral createCharLiteral();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>Variable Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Reference</em>'.
   * @generated
   */
  VariableReference createVariableReference();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LobsterLanguagesPackage getLobsterLanguagesPackage();

} //LobsterLanguagesFactory