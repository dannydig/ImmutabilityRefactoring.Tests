package object_in;

public class TestAssignmentWithTrailingCode {
	int i;

	public TestAssignmentWithTrailingCode(int anInt) {
		i = anInt;
	}

	void setI(int anInt) {
		System.out.println();
		i = anInt;
		System.out.println();
	}
}