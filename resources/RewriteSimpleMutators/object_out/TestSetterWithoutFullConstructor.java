package object_out;

public class TestSetterWithoutFullConstructor {
	private final int i;
	
	public TestSetterWithoutFullConstructor() {
		this.i = 0;
	}

	public TestSetterWithoutFullConstructor(int i) {
		this.i = i;
	}
	
	TestSetterWithoutFullConstructor setI(int anInt) {
		return new TestSetterWithoutFullConstructor(anInt);
	}
}