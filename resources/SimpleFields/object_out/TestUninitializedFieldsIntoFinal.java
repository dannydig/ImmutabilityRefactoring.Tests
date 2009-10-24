package object_out;

public class TestUninitializedFieldsIntoFinal {
	
	final int a = 0;
	final int b = 0, c = 0;
	
	// Check non-ints
	final boolean d = false;
	final byte e = 0;
	final char f = '\0'; 
	final float g = 0.0f;
	final double h = 0.0d;
	final short i = 0;
	final long j = 0L;
	final String k = null;
	final Object l = null;
	
	// Check that it does not destroy the present initialization in a list where only one is initialized
	final int m = 0, n = 42;
	
	// Check that it does not initialize values that are initialized in a constructor
	final int o;
	TestUninitializedFieldsIntoFinal(int o) {
		this.o = o;
		this.p = 0;
		this.q = false;
		this.r = 0;
		this.s = '\0';
		this.t = 0.0f;
		this.u = 0.0d;
		this.v = 0;
		this.w = 0L;
		this.x = null;
		this.y = null;
	}
	
	// Check that it adds correct initialization of the following variables to the previous constructor so that they 
	// are initialized in all cases
	final int p;
	final boolean q;
	final byte r;
	final char s; 
	final float t;
	final double u;
	final short v;
	final long w;
	final String x;
	final Object y;
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