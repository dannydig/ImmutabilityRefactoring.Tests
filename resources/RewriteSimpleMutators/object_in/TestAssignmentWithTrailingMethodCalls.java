package object_in;

public class TestAssignmentWithTrailingMethodCalls {
	int i;

	public TestAssignmentWithTrailingMethodCalls(int anInt) {
		i = anInt;
	}

	void bar() { System.out.println(i); }

	void setI(int anInt) {
		bar();
		i = anInt;
		bar();
	}
}