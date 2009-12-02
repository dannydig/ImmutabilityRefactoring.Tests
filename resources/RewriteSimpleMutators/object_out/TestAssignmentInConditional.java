package object_out;

public class TestAssignmentInConditional {
	private final int i = 0;
	
	public TestAssignmentInConditional(int anInt) {
		i = anInt;
	}
	
	TestAssignmentInConditional setI(int anInt) {
		TestAssignmentInConditional _this = this;
		System.out.println();
		if (i == 0) {
			_this = new TestAssignmentInConditional(anInt);
		}
		System.out.println();
		return _this;
	}
}