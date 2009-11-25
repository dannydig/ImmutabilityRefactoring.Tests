package object_in;

public class TestReplaceSetterWithTrailingCode {
	int i;
	
	public TestReplaceSetterWithTrailingCode(int anInt) {
		i = anInt;
	}
	
	void setI(int anInt) {
		System.out.println();
		i = anInt;
		System.out.println();
	}
}