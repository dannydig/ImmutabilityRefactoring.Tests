package object_out;

public class TestMultipleFieldsSetterWithThis {
	private final int i, j;

	public TestMultipleFieldsSetterWithThis() {
		this.i = 0;
		this.j = 0;
	}

	public TestMultipleFieldsSetterWithThis(int i, int j) {
		this.i = i;
		this.j = j;
	}

	TestMultipleFieldsSetterWithThis setFields(int anInt1, int anInt2) {
		TestMultipleFieldsSetterWithThis _this = this;
		_this = new TestMultipleFieldsSetterWithThis(anInt1, _this.j);
		_this = new TestMultipleFieldsSetterWithThis(_this.i, anInt2);
		return _this;
	}
}
