package object_out;

public class TestReplaceSimpleSetter2 {
	private final int i;
	
	public TestReplaceSimpleSetter2() {
		this.i = 0;
	}

	public TestReplaceSimpleSetter2(int i) {
		this.i = i;
	}

	TestReplaceSimpleSetter2 setI(int i) {
		return new TestReplaceSimpleSetter2(i);
	}
}