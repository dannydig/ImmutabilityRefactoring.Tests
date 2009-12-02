wpackage object_out;

public class TestAssignmentWithTrailingFieldPrint {
	private final int i;

	public TestAssignmentWithTrailingFieldPrint() {
		i = 0;
	}

	public TestAssignmentWithTrailingFieldPrint(int anInt) {
		i = anInt;
	}

	public int getI() { return i; }

	TestAssignmentWithTrailingFieldPrint setI(int anInt) {
		TestAssignmentWithTrailingFieldPrint _this = this;
		System.out.println(this.i);
		_this = new TestAssignmentWithTrailingFieldPrint(anInt);
		System.out.println(_this.getI());
		return _this;
	}
}