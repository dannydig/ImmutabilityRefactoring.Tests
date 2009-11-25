package object_out;

public class TestReplaceSimpleSetterWithFactoryMethodSeveralFieldsWithThis {
	private final int i, j;
	
	public TestReplaceSimpleSetterWithFactoryMethodSeveralFieldsWithThis(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	TestReplaceSimpleSetterWithFactoryMethodSeveralFieldsWithThis setI(int anInt) {
		return new TestReplaceSimpleSetterWithFactoryMethodSeveralFieldsWithThis(anInt, anInt);
	}
}
