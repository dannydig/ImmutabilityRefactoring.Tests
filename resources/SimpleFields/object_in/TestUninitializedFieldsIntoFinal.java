package object_in;

public class TestUninitializedFieldsIntoFinal {
	
	int a;
	int b, c;
	
	// Check non-ints
	boolean d;
	byte e;
	char f; 
	float g;
	double h;
	short i;
	long j;
	String k;
	Object l;
	
	// Check that it does not destroy the present initialization in a list where only one is initialized
	int m, n = 42;
	
	// Check that it does not initialize values that are initialized in a constructor
	int o;
	TestUninitializedFieldsIntoFinal(int o) {
		this.o = o;
	}
	
	// Check that it adds an initialization of o to a second constructor so that it is initialized in all cases
	TestUninitializedFieldsIntoFinal(float irrelevant) {
		
	}
}