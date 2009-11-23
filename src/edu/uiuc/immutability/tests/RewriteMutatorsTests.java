package edu.uiuc.immutability.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import edu.uiuc.immutability.MakeImmutableRefactoring;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Preferences;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.tests.refactoring.infra.AbstractSelectionTestCase;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;

public class RewriteMutatorsTests extends AbstractSelectionTestCase {

	private static TestSetup fgTestSetup;
	
	public RewriteMutatorsTests(String name) {
		super(name);
	}
	
	public static Test suite() {
		fgTestSetup= new TestSetup(new TestSuite(RewriteMutatorsTests.class));
		return fgTestSetup;
	}
	
	public static Test setUpTest(Test test) {
		fgTestSetup= new TestSetup(test);
		return fgTestSetup;
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		fIsPreDeltaTest= true;
	}

	protected String getResourceLocation() {
		return "RewriteMutators/";
	}
	
	protected String adaptName(String name) {
		return Character.toUpperCase(name.charAt(0)) + name.substring(1) + ".java";
	}	
	
	protected void performTest(IPackageFragment packageFragment, String id, String outputFolder, String className) throws Exception {
		ICompilationUnit unit= createCU(packageFragment, id);
		IType targetClass = getClass(unit, className);
		assertNotNull(targetClass);
		
		initializePreferences();

		MakeImmutableRefactoring refactoring= new MakeImmutableRefactoring(targetClass);
		performTest(unit, refactoring, COMPARE_WITH_OUTPUT, getProofedContent(outputFolder, id), true);
	}

	private IType getClass(ICompilationUnit unit, String className) throws JavaModelException {
		IType[] allTypes = unit.getAllTypes();
		for (int i = 0; i < allTypes.length; i++) {
			IType iType = allTypes[i];
			if (iType.getElementName().equals(className))
				return iType;
		}
		
		return null;
	}

	protected void performInvalidTest(IPackageFragment packageFragment, String id, String className) throws Exception {
		ICompilationUnit unit= createCU(packageFragment, id);
		IType targetClass = getClass(unit, className);
		assertNotNull(targetClass);

		initializePreferences();

		MakeImmutableRefactoring refactoring= new MakeImmutableRefactoring(targetClass);
		if (refactoring != null) {
			RefactoringStatus status= refactoring.checkAllConditions(new NullProgressMonitor());
			assertTrue(status.hasError());
		}
	}	
	
	private void initializePreferences() {
		Preferences preferences= JavaCore.getPlugin().getPluginPreferences();
		preferences.setValue(JavaCore.CODEASSIST_FIELD_PREFIXES, "");
		preferences.setValue(JavaCore.CODEASSIST_STATIC_FIELD_PREFIXES, "");
		preferences.setValue(JavaCore.CODEASSIST_FIELD_SUFFIXES, "");
		preferences.setValue(JavaCore.CODEASSIST_STATIC_FIELD_SUFFIXES, "");
	}
	

	private void objectTest(String fieldName) throws Exception {
		performTest(fgTestSetup.getObjectPackage(), getName(), "object_out", fieldName);
	}
	
	private void baseTest(String fieldName) throws Exception {
		performTest(fgTestSetup.getBasePackage(), getName(), "base_out", fieldName);
	}
	
	private void invalidTest(String fieldName) throws Exception {
		performInvalidTest(fgTestSetup.getInvalidPackage(), getName(), fieldName);
	}
	
	
	//=====================================================================================
	// Basic Object Test
	//=====================================================================================
	
	// === General tests ===	
	public void testReplaceSimpleSetterWithFactoryMethod() throws Exception {
		objectTest("TestReplaceSimpleSetterWithFactoryMethod");
	}

	public void testReplaceSimpleSetter() throws Exception {
		objectTest("TestReplaceSimpleSetter");
	}
	
	public void testReplaceSimpleSetter2() throws Exception {
		objectTest("TestReplaceSimpleSetter2");
	}
	
	public void testReplaceSimpleInitializedSetter() throws Exception {
		objectTest("TestReplaceSimpleInitializedSetter");
	}
	
	public void testReplaceSimpleSetterWithFactoryMethodSeveralFieldsWithThis() throws Exception {
		objectTest("TestReplaceSimpleSetterWithFactoryMethodSeveralFieldsWithThis");
	}
	
	public void testReplaceSimpleSetterWithFactoryMethodSeveralFields() throws Exception {
		objectTest("TestReplaceSimpleSetterWithFactoryMethodSeveralFields");
	}
	
	public void testReplaceSetterWithoutConstructorMultipleFields() throws Exception {
		objectTest("TestReplaceSetterWithoutConstructorMultipleFields");
	}
	
	public void testReplaceSetterWithoutConstructor() throws Exception {
		objectTest("TestReplaceSetterWithoutConstructor");
	}
	
	public void testReplaceNestedSetters() throws Exception {
		objectTest("testReplaceNestedSetters");
	}
}
