package object_out;

public class TestChainedAssignments {
	private final int i, j;

	public TestChainedAssignments(int i, int j) {
		this.i = i;
		this.j = j;
	}

	TestChainedAssignments init(int anInt) {
		System.out.println();
		TestChainedAssignments _this;
		_this = new TestChainedAssignments(i, anInt);
		_this = new TestChainedAssignments(anInt, j);
		System.out.println();
		return _this;
	}
}