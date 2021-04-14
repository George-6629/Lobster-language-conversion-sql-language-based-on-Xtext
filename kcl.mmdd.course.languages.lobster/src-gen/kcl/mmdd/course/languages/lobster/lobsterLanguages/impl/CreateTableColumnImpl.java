/**
 * generated by Xtext 2.24.0
 */
package kcl.mmdd.course.languages.lobster.lobsterLanguages.impl;

import kcl.mmdd.course.languages.lobster.lobsterLanguages.CreateTableColumn;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.DataType;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.IntLiteral;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.LobsterLanguagesPackage;
import kcl.mmdd.course.languages.lobster.lobsterLanguages.PrimaryExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Table Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.impl.CreateTableColumnImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.impl.CreateTableColumnImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link kcl.mmdd.course.languages.lobster.lobsterLanguages.impl.CreateTableColumnImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateTableColumnImpl extends MinimalEObjectImpl.Container implements CreateTableColumn
{
  /**
   * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnName()
   * @generated
   * @ordered
   */
  protected PrimaryExpression columnName;

  /**
   * The default value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatype()
   * @generated
   * @ordered
   */
  protected static final DataType DATATYPE_EDEFAULT = DataType.INTEGER;

  /**
   * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatype()
   * @generated
   * @ordered
   */
  protected DataType datatype = DATATYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected IntLiteral size;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateTableColumnImpl()
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
    return LobsterLanguagesPackage.Literals.CREATE_TABLE_COLUMN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimaryExpression getColumnName()
  {
    return columnName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumnName(PrimaryExpression newColumnName, NotificationChain msgs)
  {
    PrimaryExpression oldColumnName = columnName;
    columnName = newColumnName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobsterLanguagesPackage.CREATE_TABLE_COLUMN__COLUMN_NAME, oldColumnName, newColumnName);
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
  public void setColumnName(PrimaryExpression newColumnName)
  {
    if (newColumnName != columnName)
    {
      NotificationChain msgs = null;
      if (columnName != null)
        msgs = ((InternalEObject)columnName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobsterLanguagesPackage.CREATE_TABLE_COLUMN__COLUMN_NAME, null, msgs);
      if (newColumnName != null)
        msgs = ((InternalEObject)newColumnName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobsterLanguagesPackage.CREATE_TABLE_COLUMN__COLUMN_NAME, null, msgs);
      msgs = basicSetColumnName(newColumnName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LobsterLanguagesPackage.CREATE_TABLE_COLUMN__COLUMN_NAME, newColumnName, newColumnName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataType getDatatype()
  {
    return datatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDatatype(DataType newDatatype)
  {
    DataType oldDatatype = datatype;
    datatype = newDatatype == null ? DATATYPE_EDEFAULT : newDatatype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LobsterLanguagesPackage.CREATE_TABLE_COLUMN__DATATYPE, oldDatatype, datatype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntLiteral getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSize(IntLiteral newSize, NotificationChain msgs)
  {
    IntLiteral oldSize = size;
    size = newSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobsterLanguagesPackage.CREATE_TABLE_COLUMN__SIZE, oldSize, newSize);
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
  public void setSize(IntLiteral newSize)
  {
    if (newSize != size)
    {
      NotificationChain msgs = null;
      if (size != null)
        msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobsterLanguagesPackage.CREATE_TABLE_COLUMN__SIZE, null, msgs);
      if (newSize != null)
        msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobsterLanguagesPackage.CREATE_TABLE_COLUMN__SIZE, null, msgs);
      msgs = basicSetSize(newSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LobsterLanguagesPackage.CREATE_TABLE_COLUMN__SIZE, newSize, newSize));
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
      case LobsterLanguagesPackage.CREATE_TABLE_COLUMN__COLUMN_NAME:
        return basicSetColumnName(null, msgs);
      case LobsterLanguagesPackage.CREATE_TABLE_COLUMN__SIZE:
        return basicSetSize(null, msgs);
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
      case LobsterLanguagesPackage.CREATE_TABLE_COLUMN__COLUMN_NAME:
        return getColumnName();
      case LobsterLanguagesPackage.CREATE_TABLE_COLUMN__DATATYPE:
        return getDatatype();
      case LobsterLanguagesPackage.CREATE_TABLE_COLUMN__SIZE:
        return getSize();
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
      case LobsterLanguagesPackage.CREATE_TABLE_COLUMN__COLUMN_NAME:
        setColumnName((PrimaryExpression)newValue);
        return;
      case LobsterLanguagesPackage.CREATE_TABLE_COLUMN__DATATYPE:
        setDatatype((DataType)newValue);
        return;
      case LobsterLanguagesPackage.CREATE_TABLE_COLUMN__SIZE:
        setSize((IntLiteral)newValue);
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
      case LobsterLanguagesPackage.CREATE_TABLE_COLUMN__COLUMN_NAME:
        setColumnName((PrimaryExpression)null);
        return;
      case LobsterLanguagesPackage.CREATE_TABLE_COLUMN__DATATYPE:
        setDatatype(DATATYPE_EDEFAULT);
        return;
      case LobsterLanguagesPackage.CREATE_TABLE_COLUMN__SIZE:
        setSize((IntLiteral)null);
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
      case LobsterLanguagesPackage.CREATE_TABLE_COLUMN__COLUMN_NAME:
        return columnName != null;
      case LobsterLanguagesPackage.CREATE_TABLE_COLUMN__DATATYPE:
        return datatype != DATATYPE_EDEFAULT;
      case LobsterLanguagesPackage.CREATE_TABLE_COLUMN__SIZE:
        return size != null;
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
    result.append(" (datatype: ");
    result.append(datatype);
    result.append(')');
    return result.toString();
  }

} //CreateTableColumnImpl