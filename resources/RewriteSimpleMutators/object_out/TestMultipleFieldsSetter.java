package object_out;

public class TestMultipleFieldsSetter {
	private final int i, j;

	public TestMultipleFieldsSetter() {
		this.i = 0;
		this.j = 0;
	}

	public TestMultipleFieldsSetter(int i, int j) {
		this.i = i;
		this.j = j;
	}

	TestMultipleFieldsSetter setFields(int anInt1, int anInt2) {
		TestMultipleFieldsSetter _this = this;
		_this = new TestMultipleFieldsSetter(anInt1, _this.j);
		_this = new TestMultipleFieldsSetter(_this.i, anInt2);
		return _this;
	}
}
