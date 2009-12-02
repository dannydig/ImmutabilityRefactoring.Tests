package object_out;

public class TestMultipleFieldsSingleSetter {
	private final int i, j, k;

	public TestMultipleFieldsSingleSetter() {
		this.i = 0;
		this.j = 0;
		this.k = 0;
	}

	public TestMultipleFieldsSingleSetter(int i, int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}

	TestMultipleFieldsSingleSetter setI(int anInt) {
		return new TestMultipleFieldsSingleSetter(this.i, anInt, this.k);
	}
}