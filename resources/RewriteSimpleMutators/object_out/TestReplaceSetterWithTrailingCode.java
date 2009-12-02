package object_out;

public class TestReplaceSetterWithTrailingCode {
	private final int i;
	
	public TestReplaceSetterWithTrailingCode(int anInt) {
		i = anInt;
	}
	
	TestReplaceSetterWithTrailingCode setI(int anInt) {
		System.out.println();
		TestReplaceSetterWithTrailingCode _this;
		_this = new TestReplaceSetterWithTrailingCode(anInt);
		System.out.println();
		return _this;
	}
}