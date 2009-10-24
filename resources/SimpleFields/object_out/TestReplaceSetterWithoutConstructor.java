package object_out;

public class TestReplaceSetterWithoutConstructor {
	final int i;
	
	public TestReplaceSetterWithoutConstructor(int i) {
		this.i = i;
	}
	
	public TestReplaceSetterWithoutConstructor() {
		this.i = 0;
	}
	
	TestReplaceSetterWithoutConstructor setI(int anInt) {
		return new TestReplaceSetterWithoutConstructor(anInt);
	}
}