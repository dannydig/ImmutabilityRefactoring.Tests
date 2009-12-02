wpackage object_out;

public class TestAssignmentWithTrailingCode {
	private final int i;
	
	public TestAssignmentWithTrailingCode(int anInt) {
		i = anInt;
	}
	
	TestAssignmentWithTrailingCode setI(int anInt) {
		System.out.println();
		TestAssignmentWithTrailingCode _this;
		_this = new TestAssignmentWithTrailingCode(anInt);
		System.out.println();
		return _this;
	}
}