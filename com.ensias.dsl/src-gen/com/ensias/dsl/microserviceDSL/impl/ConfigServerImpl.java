/**
 * generated by Xtext 2.37.0
 */
package com.ensias.dsl.microserviceDSL.impl;

import com.ensias.dsl.microserviceDSL.ConfigServer;
import com.ensias.dsl.microserviceDSL.Dependency;
import com.ensias.dsl.microserviceDSL.MicroserviceDSLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ensias.dsl.microserviceDSL.impl.ConfigServerImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ensias.dsl.microserviceDSL.impl.ConfigServerImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.ensias.dsl.microserviceDSL.impl.ConfigServerImpl#getGitUri <em>Git Uri</em>}</li>
 *   <li>{@link com.ensias.dsl.microserviceDSL.impl.ConfigServerImpl#getGitBranch <em>Git Branch</em>}</li>
 *   <li>{@link com.ensias.dsl.microserviceDSL.impl.ConfigServerImpl#getCustomDeps <em>Custom Deps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigServerImpl extends MinimalEObjectImpl.Container implements ConfigServer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGitUri() <em>Git Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGitUri()
	 * @generated
	 * @ordered
	 */
	protected static final String GIT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGitUri() <em>Git Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGitUri()
	 * @generated
	 * @ordered
	 */
	protected String gitUri = GIT_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getGitBranch() <em>Git Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGitBranch()
	 * @generated
	 * @ordered
	 */
	protected static final String GIT_BRANCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGitBranch() <em>Git Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGitBranch()
	 * @generated
	 * @ordered
	 */
	protected String gitBranch = GIT_BRANCH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomDeps() <em>Custom Deps</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomDeps()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> customDeps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroserviceDSLPackage.Literals.CONFIG_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceDSLPackage.CONFIG_SERVER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceDSLPackage.CONFIG_SERVER__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGitUri() {
		return gitUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGitUri(String newGitUri) {
		String oldGitUri = gitUri;
		gitUri = newGitUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceDSLPackage.CONFIG_SERVER__GIT_URI, oldGitUri, gitUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGitBranch() {
		return gitBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGitBranch(String newGitBranch) {
		String oldGitBranch = gitBranch;
		gitBranch = newGitBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroserviceDSLPackage.CONFIG_SERVER__GIT_BRANCH, oldGitBranch, gitBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dependency> getCustomDeps() {
		if (customDeps == null) {
			customDeps = new EDataTypeEList<Dependency>(Dependency.class, this, MicroserviceDSLPackage.CONFIG_SERVER__CUSTOM_DEPS);
		}
		return customDeps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroserviceDSLPackage.CONFIG_SERVER__NAME:
				return getName();
			case MicroserviceDSLPackage.CONFIG_SERVER__PORT:
				return getPort();
			case MicroserviceDSLPackage.CONFIG_SERVER__GIT_URI:
				return getGitUri();
			case MicroserviceDSLPackage.CONFIG_SERVER__GIT_BRANCH:
				return getGitBranch();
			case MicroserviceDSLPackage.CONFIG_SERVER__CUSTOM_DEPS:
				return getCustomDeps();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MicroserviceDSLPackage.CONFIG_SERVER__NAME:
				setName((String)newValue);
				return;
			case MicroserviceDSLPackage.CONFIG_SERVER__PORT:
				setPort((Integer)newValue);
				return;
			case MicroserviceDSLPackage.CONFIG_SERVER__GIT_URI:
				setGitUri((String)newValue);
				return;
			case MicroserviceDSLPackage.CONFIG_SERVER__GIT_BRANCH:
				setGitBranch((String)newValue);
				return;
			case MicroserviceDSLPackage.CONFIG_SERVER__CUSTOM_DEPS:
				getCustomDeps().clear();
				getCustomDeps().addAll((Collection<? extends Dependency>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case MicroserviceDSLPackage.CONFIG_SERVER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MicroserviceDSLPackage.CONFIG_SERVER__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case MicroserviceDSLPackage.CONFIG_SERVER__GIT_URI:
				setGitUri(GIT_URI_EDEFAULT);
				return;
			case MicroserviceDSLPackage.CONFIG_SERVER__GIT_BRANCH:
				setGitBranch(GIT_BRANCH_EDEFAULT);
				return;
			case MicroserviceDSLPackage.CONFIG_SERVER__CUSTOM_DEPS:
				getCustomDeps().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MicroserviceDSLPackage.CONFIG_SERVER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MicroserviceDSLPackage.CONFIG_SERVER__PORT:
				return port != PORT_EDEFAULT;
			case MicroserviceDSLPackage.CONFIG_SERVER__GIT_URI:
				return GIT_URI_EDEFAULT == null ? gitUri != null : !GIT_URI_EDEFAULT.equals(gitUri);
			case MicroserviceDSLPackage.CONFIG_SERVER__GIT_BRANCH:
				return GIT_BRANCH_EDEFAULT == null ? gitBranch != null : !GIT_BRANCH_EDEFAULT.equals(gitBranch);
			case MicroserviceDSLPackage.CONFIG_SERVER__CUSTOM_DEPS:
				return customDeps != null && !customDeps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", port: ");
		result.append(port);
		result.append(", gitUri: ");
		result.append(gitUri);
		result.append(", gitBranch: ");
		result.append(gitBranch);
		result.append(", customDeps: ");
		result.append(customDeps);
		result.append(')');
		return result.toString();
	}

} //ConfigServerImpl
