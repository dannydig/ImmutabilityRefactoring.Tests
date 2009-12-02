package object_out;

public class TestSetterWithoutDefaultConstructor2 {
	private final int i;

	public TestSetterWithoutDefaultConstructor2() {
		this.i = 0;
	}

	public TestSetterWithoutDefaultConstructor2(int i) {
		this.i = i;
	}

	TestSetterWithoutDefaultConstructor2 setI(int anInt) {
		return new TestSetterWithoutDefaultConstructor2(anInt);
	}
}