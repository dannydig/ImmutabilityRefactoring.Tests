package object_out;

public class TestReplaceSetterWithTrailingCode {
	private final int i;
	
	public TestReplaceSetterWithTrailingCode(int anInt) {
		i = anInt;
	}
	
	TestReplaceSetterWithTrailingCode setI(int anInt) {
		int tmp_i;
		System.out.println();
		tmp_i = anInt;
		System.out.println();
		return new TestReplaceSetterWithTrailingCode(tmp_i);
	}
}