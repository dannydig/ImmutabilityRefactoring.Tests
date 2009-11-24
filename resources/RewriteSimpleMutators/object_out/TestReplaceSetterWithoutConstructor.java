package object_out;

public class TestReplaceSetterWithoutConstructor {
	private final int i;
	
	public TestReplaceSetterWithoutConstructor() {
		this.i = 0;
	}

	public TestReplaceSetterWithoutConstructor(int i) {
		this.i = i;
	}
	
	TestReplaceSetterWithoutConstructor setI(int anInt) {
		return new TestReplaceSetterWithoutConstructor(anInt);
	}
}