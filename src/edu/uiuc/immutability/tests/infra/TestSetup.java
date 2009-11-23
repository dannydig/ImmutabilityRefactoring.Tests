package edu.uiuc.immutability.tests.infra;

import junit.framework.Test;

import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.ui.tests.refactoring.infra.RefactoringTestSetup;

public class TestSetup extends RefactoringTestSetup {
	
	private IPackageFragment fBaseTypes;
	private IPackageFragment fObjectTypes;
	private IPackageFragment fInvalid;
	
	public TestSetup(Test test) {
		super(test);
	}	
	
	protected void setUp() throws Exception {
		super.setUp();

		IPackageFragmentRoot root= getDefaultSourceFolder();
		
		fBaseTypes= root.createPackageFragment("base_in", true, null);
		fObjectTypes= root.createPackageFragment("object_in", true, null);
		fInvalid= root.createPackageFragment("invalid", true, null);
	}

	public IPackageFragment getBasePackage() {
		return fBaseTypes;
	}	

	public IPackageFragment getObjectPackage() {
		return fObjectTypes;
	}	

	public IPackageFragment getInvalidPackage() {
		return fInvalid;
	}
}