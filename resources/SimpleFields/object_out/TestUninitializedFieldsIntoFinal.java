package object_out;

public class TestUninitializedFieldsIntoFinal {
	
	final int a = 0;
	final int b = 0, c = 0;
	
	// Check non-ints
	final float d = 0.0f;
	final double e = 0.0;
	final String f = "";
	final Object g = null;
	
	// Check that it does not destroy the present initialization in a list where only one is initialized
	final int h = 0, i = 42;
	
	// Check that it does not initialize values that are initialized in a constructor
	final int j;
	TestUninitializedFieldsIntoFinal(int j) {
		this.j = j;
	}
	
	// Check that it adds an initialization of j to a second constructor so that it is initialized in all cases
	TestUninitializedFieldsIntoFinal(float irrelevant) {
		this.j = 0;
	}
}