wpackage object_out;

public class TestAssignmentWithTrailingMethodCalls {
	private final int i;

	public TestAssignmentWithTrailingMethodCalls() {
		i = 0;
	}

	public TestAssignmentWithTrailingMethodCalls(int anInt) {
		i = anInt;
	}

	void bar() { System.out.println(i); }

	TestAssignmentWithTrailingMethodCalls setI(int anInt) {
		TestAssignmentWithTrailingMethodCalls _this = this;
		bar();
		_this = new TestAssignmentWithTrailingMethodCalls(anInt);
		_this.bar();
		return _this;
	}
}