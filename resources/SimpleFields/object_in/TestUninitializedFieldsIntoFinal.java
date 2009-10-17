package object_in;

public class TestUninitializedFieldsIntoFinal {
	
	int a;
	int b, c;
	
	// Check non-ints
	float d;
	double e;
	String f;
	Object g;
	
	// Check that it does not destroy the present initialization in a list where only one is initialized
	int h, i = 42;
	
	// Check that it does not initialize values that are initialized in a constructor
	int j;
	TestUninitializedFieldsIntoFinal(int j) {
		this.j = j;
	}
	
	// Check that it adds an initialization of j to a second constructor so that it is initialized in all cases
	TestUninitializedFieldsIntoFinal(float irrelevant) {
			
	}
}