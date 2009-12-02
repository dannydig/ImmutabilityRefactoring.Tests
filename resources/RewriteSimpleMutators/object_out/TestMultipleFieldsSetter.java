package object_out;

public class TestMultipleFieldsSetter {
	private final int i, j;

	public TestMultipleFieldsSetter(int i, int j) {
		this.i = 0;
		this.j = 0;
	}

	public TestMultipleFieldsSetter(int i, int j) {
		this.i = i;
		this.j = j;
	}

	TestMultipleFieldsSetter setFields(int anInt1, int anInt2) {
		return new TestMultipleFieldsSetter(anInt1, anInt2);
	}
}
