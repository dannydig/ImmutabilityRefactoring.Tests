package object_out;

public class TestReplaceSimpleSetterWithFactoryMethodSeveralFieldsWithThis {
	private final int i;
	
	public TestReplaceSimpleSetterWithFactoryMethodSeveralFieldsWithThis(int anInt) {
		this.i = anInt;
	}
	
	TestReplaceSimpleSetterWithFactoryMethodSeveralFieldsWithThis setI(int anInt) {
		System.out.println();
		System.out.println();
		return new TestReplaceSimpleSetterWithFactoryMethodSeveralFieldsWithThis(anInt);
	}
}
