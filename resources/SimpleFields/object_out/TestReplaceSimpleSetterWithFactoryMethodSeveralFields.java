package object_out;

public class TestReplaceSimpleSetterWithFactoryMethodSeveralFields {
	final int i, j;
	
	public TestReplaceSimpleSetterWithFactoryMethodSeveralFields(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	TestReplaceSimpleSetterWithFactoryMethodSeveralFields setI(int anInt) {
		System.out.println();
		System.out.println();
		return new TestReplaceSimpleSetterWithFactoryMethodSeveralFields(anInt, anInt);
	}
}
