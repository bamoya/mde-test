/**
 * generated by Xtext 2.37.0
 */
package com.ensias.dsl.microserviceDSL.tests;

import com.ensias.dsl.microserviceDSL.DatabaseConfig;
import com.ensias.dsl.microserviceDSL.MicroserviceDSLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Database Config</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseConfigTest extends ServiceConfigEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatabaseConfigTest.class);
	}

	/**
	 * Constructs a new Database Config test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseConfigTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Database Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DatabaseConfig getFixture() {
		return (DatabaseConfig)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicroserviceDSLFactory.eINSTANCE.createDatabaseConfig());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DatabaseConfigTest
