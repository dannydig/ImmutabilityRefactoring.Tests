package object_out;

public class TestUninitializedFieldsIntoFinal {
	
	private final int a = 0;
	private final int b = 0, c = 0;
	
	// Check non-ints
	private final boolean d = false;
	private final byte e = 0;
	private final char f = '\0'; 
	private final float g = 0.0f;
	private final double h = 0.0d;
	private final short i = 0;
	private final long j = 0L;
	private final String k = null;
	private final Object l = null;
	
	// Check that it does not destroy the present initialization in a list where only one is initialized
	private final int m = 0, n = 42;
	
	// Check that it does not initialize values that are initialized in a constructor
	private final int o;
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
	private final int p;
	private final boolean q;
	private final byte r;
	private final char s; 
	private final float t;
	private final double u;
	private final short v;
	private final long w;
	private final String x;
	private final Object y;
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