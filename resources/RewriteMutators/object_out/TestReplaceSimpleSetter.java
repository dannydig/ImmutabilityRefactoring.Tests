package object_out;

public class TestReplaceSimpleSetter {
	private final int i;
	
	public TestReplaceSimpleSetter() {
		this.i = 0;
	}

	public TestReplaceSimpleSetter(int i) {
		this.i = i;
	}

	TestReplaceSimpleSetter setI(int anInt) {
		return new TestReplaceSimpleSetter(anInt);
	}
}