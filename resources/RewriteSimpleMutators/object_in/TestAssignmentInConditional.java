package object_in;

public class TestAssignmentInConditional {
	int i;

	public TestAssignmentInConditional(int anInt) {
		i = anInt;
	}

	void setI(int anInt) {
		System.out.println();
		if (i == 0) {
			i = anInt;
		}
		System.out.println();
	}
}