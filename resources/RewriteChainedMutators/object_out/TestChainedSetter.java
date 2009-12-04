package object_out;

public class TestChainedSetter {
	private final int i, j;

	public TestChainedSetter(int i, int j) {
		this.i = 0;
		this.j = 0;
	}

	public TestChainedSetter(int i, int j) {
		this.i = i;
		this.j = j;
	}

	TestChainedSetter setI(int anInt) {
		return new TestChainedSetter(anInt, anInt);
	}
}
