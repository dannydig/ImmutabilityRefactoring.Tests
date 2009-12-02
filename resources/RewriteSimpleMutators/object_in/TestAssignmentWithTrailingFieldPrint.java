package object_in;

public class TestAssignmentWithTrailingFieldPrint {
	int i;
	
	public TestAssignmentWithTrailingFieldPrint(int anInt) {
		i = anInt;
	}
	
	void setI(int anInt) {
		System.out.println(this.i);
		i = anInt;
		System.out.println(this.i);
	}
}