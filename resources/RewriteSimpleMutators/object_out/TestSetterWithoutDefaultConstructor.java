package object_out;

public class TestSetterWithoutDefaultConstructor {
	private final int i;

	public TestSetterWithoutDefaultConstructor() {
		this.i = 0;
	}

	public TestSetterWithoutDefaultConstructor(int i) {
		this.i = i;
	}

	TestSetterWithoutDefaultConstructor setI(int anInt) {
		TestSetterWithoutDefaultConstructor _this = this;
		_this = new TestSetterWithoutDefaultConstructor(anInt);
		return _this;
	}
}