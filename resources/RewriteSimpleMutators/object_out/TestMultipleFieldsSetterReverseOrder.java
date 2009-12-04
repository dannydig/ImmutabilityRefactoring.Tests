package object_out;

public class TestMultipleFieldsSetterReverseOrder {
	private final int i, j;

	public TestMultipleFieldsSetterReverseOrder() {
		this.i = 0;
		this.j = 0;
	}

	public TestMultipleFieldsSetterReverseOrder(int i, int j) {
		this.i = i;
		this.j = j;
	}

	TestMultipleFieldsSetterReverseOrder setFields(int anInt1, int anInt2) {
		TestMultipleFieldsSetterReverseOrder _this = this;
		_this = new TestMultipleFieldsSetterReverseOrder(_this.i, anInt2);
		_this = new TestMultipleFieldsSetterReverseOrder(anInt1, _this.j);
		return _this;
	}
}
