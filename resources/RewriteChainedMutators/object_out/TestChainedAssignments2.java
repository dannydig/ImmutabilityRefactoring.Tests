package object_out;

public class TestChainedAssignments2 {
	private final int i, j;

	public TestChainedAssignments2() {
		this.i = 0;
		this.j = 0;
	}

	public TestChainedAssignments2(int i, int j) {
		this.i = i;
		this.j = j;
	}

	TestChainedAssignments2 init(int anInt) {
		TestChainedAssignments2 _this = this;
		System.out.println();
		_this = new TestChainedAssignments2(anInt, anInt);
		System.out.println();
		return _this;
	}
}