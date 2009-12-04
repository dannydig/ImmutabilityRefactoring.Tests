package object_out;

public class TestChainedAssignments {
	private final int i, j;

	public TestChainedAssignments() {
		this.i = 0;
		this.j = 0;
	}

	public TestChainedAssignments(int i, int j) {
		this.i = i;
		this.j = j;
	}

	TestChainedAssignments init(int anInt) {
		TestChainedAssignments _this = this;
		System.out.println();
		_this = new TestChainedAssignments(anInt, anInt);
		System.out.println();
		return _this;
	}
}