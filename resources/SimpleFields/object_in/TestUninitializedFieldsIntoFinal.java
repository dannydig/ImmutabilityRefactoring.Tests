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
	
	// Check that it adds correct initialization of the following variables to the previous constructor so that they 
	// are initialized in all cases
	int p;
	boolean q;
	byte r;
	char s; 
	float t;
	double u;
	short v;
	long w;
	String x;
	Object y;
	TestUninitializedFieldsIntoFinal(int o, int p, boolean q, byte r, char s, float t, double u, 
	                                 short v, long w, String x, Object y) {
		this.o = o;
		this.p = p;
		this.q = q;
		this.r = r;
		this.s = s;
		this.t = t;
		this.u = u;
		this.v = v;
		this.w = w;
		this.x = x;
		this.y = y;
	}
}