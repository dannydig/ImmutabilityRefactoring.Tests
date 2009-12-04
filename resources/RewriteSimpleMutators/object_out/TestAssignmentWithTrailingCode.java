wpackage object_out;

public class TestAssignmentWithTrailingCode {
	private final int i;

	public TestAssignmentWithTrailingCode() {
		this.i = 0;
	}

	public TestAssignmentWithTrailingCode(int anInt) {
		i = anInt;
	}

	TestAssignmentWithTrailingCode setI(int anInt) {
		TestAssignmentWithTrailingCode _this = this;
		System.out.println();
		_this = new TestAssignmentWithTrailingCode(anInt);
		System.out.println();
		return _this;
	}
}