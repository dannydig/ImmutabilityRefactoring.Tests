package object_in;

public class TestAssignmentWithTrailingCode {
	int i = 0;

	public TestAssignmentWithTrailingCode(int anInt) {
		i = anInt;
	}

	void setI(int anInt) {
		System.out.println();
		i = anInt;
		System.out.println();
	}
}