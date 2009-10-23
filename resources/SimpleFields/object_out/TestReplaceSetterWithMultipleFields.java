package object_out;

public class TestReplaceSimpleSetterWithFactoryMethod{
	final int i, j, k;

	public TestReplaceSetterWithMultipleFields(int i, int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
	public TestReplaceSetterWithMultipleFields() {
		this.i = 0;
		this.j = 0;
		this.k = 0;
	}
	
	TestReplaceSetterWithMultipleFields setI(int anInt) {
		return new TestReplaceSetterWithMultipleFields(anInt, this.j, this.k);
	}
}