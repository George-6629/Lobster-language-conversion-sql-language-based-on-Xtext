/**
 * generated by Xtext 2.24.0
 */
package kcl.mmdd.course.languages.lobster.lobsterLanguages.impl;

import kcl.mmdd.course.languages.lobster.lobsterLanguages.CharLiteral;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Char Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.impl.CharLiteralImpl#getVac <em>Vac</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharLiteralImpl extends PrimaryExpressionImpl implements CharLiteral
{
  /**
   * The default value of the '{@link #getVac() <em>Vac</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVac()
   * @generated
   * @ordered
   */
  protected static final String VAC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVac() <em>Vac</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVac()
   * @generated
   * @ordered
   */
  protected String vac = VAC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharLiteralImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LobsterLanguagesPackage.Literals.CHAR_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVac()
  {
    return vac;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVac(String newVac)
  {
    String oldVac = vac;
    vac = newVac;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LobsterLanguagesPackage.CHAR_LITERAL__VAC, oldVac, vac));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LobsterLanguagesPackage.CHAR_LITERAL__VAC:
        return getVac();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LobsterLanguagesPackage.CHAR_LITERAL__VAC:
        setVac((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LobsterLanguagesPackage.CHAR_LITERAL__VAC:
        setVac(VAC_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LobsterLanguagesPackage.CHAR_LITERAL__VAC:
        return VAC_EDEFAULT == null ? vac != null : !VAC_EDEFAULT.equals(vac);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (vac: ");
    result.append(vac);
    result.append(')');
    return result.toString();
  }

} //CharLiteralImpl
