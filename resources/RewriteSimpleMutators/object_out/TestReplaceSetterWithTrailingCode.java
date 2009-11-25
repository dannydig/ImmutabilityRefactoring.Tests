package object_out;

public class TestReplaceSetterWithTrailingCode {
	private final int i;
	
	public TestReplaceSetterWithTrailingCode(int anInt) {
		i = anInt;
	}
	
	TestReplaceSetterWithTrailingCode setI(int anInt) {
		System.out.println();
		System.out.println();
		return new TestReplaceSetterWithTrailingCode(anInt);
	}
}