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
		return new TestMultipleFieldsSetterWithThis(anInt1, anInt2);
	}
}
