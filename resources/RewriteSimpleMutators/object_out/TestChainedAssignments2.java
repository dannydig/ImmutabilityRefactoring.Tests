package object_out;

public class TestChainedAssignments {
	private final int i, j;

	public TestChainedAssignments(int i, int j) {
		this.i = i;
		this.j = j;
	}

	TestChainedAssignments init(int anInt) {
		TestChainedAssignments _this = this;
		System.out.println();
		_this = new TestChainedAssignments(this.i, anInt);
		_this = new TestChainedAssignments(anInt, this.j);
		System.out.println();
		return _this;
	}
}