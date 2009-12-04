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
		TestSetterWithoutFullConstructor _this = this;
		_this = new TestSetterWithoutFullConstructor(anInt);
		return _this;
	}
}