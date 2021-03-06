/**
 * generated by Xtext 2.24.0
 */
package kcl.mmdd.course.languages.lobster.lobsterLanguages.impl;

import kcl.mmdd.course.languages.lobster.lobsterLanguages.DeleteTableStatement;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.PrimaryExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Table Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.impl.DeleteTableStatementImpl#getTbname <em>Tbname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteTableStatementImpl extends StatementImpl implements DeleteTableStatement
{
  /**
   * The cached value of the '{@link #getTbname() <em>Tbname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTbname()
   * @generated
   * @ordered
   */
  protected PrimaryExpression tbname;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeleteTableStatementImpl()
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
    return LobsterLanguagesPackage.Literals.DELETE_TABLE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimaryExpression getTbname()
  {
    return tbname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTbname(PrimaryExpression newTbname, NotificationChain msgs)
  {
    PrimaryExpression oldTbname = tbname;
    tbname = newTbname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobsterLanguagesPackage.DELETE_TABLE_STATEMENT__TBNAME, oldTbname, newTbname);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTbname(PrimaryExpression newTbname)
  {
    if (newTbname != tbname)
    {
      NotificationChain msgs = null;
      if (tbname != null)
        msgs = ((InternalEObject)tbname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobsterLanguagesPackage.DELETE_TABLE_STATEMENT__TBNAME, null, msgs);
      if (newTbname != null)
        msgs = ((InternalEObject)newTbname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobsterLanguagesPackage.DELETE_TABLE_STATEMENT__TBNAME, null, msgs);
      msgs = basicSetTbname(newTbname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LobsterLanguagesPackage.DELETE_TABLE_STATEMENT__TBNAME, newTbname, newTbname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LobsterLanguagesPackage.DELETE_TABLE_STATEMENT__TBNAME:
        return basicSetTbname(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LobsterLanguagesPackage.DELETE_TABLE_STATEMENT__TBNAME:
        return getTbname();
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
      case LobsterLanguagesPackage.DELETE_TABLE_STATEMENT__TBNAME:
        setTbname((PrimaryExpression)newValue);
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
      case LobsterLanguagesPackage.DELETE_TABLE_STATEMENT__TBNAME:
        setTbname((PrimaryExpression)null);
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
      case LobsterLanguagesPackage.DELETE_TABLE_STATEMENT__TBNAME:
        return tbname != null;
    }
    return super.eIsSet(featureID);
  }

} //DeleteTableStatementImpl
