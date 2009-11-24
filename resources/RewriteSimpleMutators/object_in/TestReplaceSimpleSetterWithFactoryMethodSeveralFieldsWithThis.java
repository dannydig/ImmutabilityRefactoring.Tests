package object_in;

public class TestReplaceSimpleSetterWithFactoryMethodSeveralFieldsWithThis {
	int i;
	
	public TestReplaceSimpleSetterWithFactoryMethodSeveralFieldsWithThis(int anInt) {
		this.i = anInt;
	}
	
	void setI(int anInt) {
		System.out.println();
		this.i = anInt;
		System.out.println();
	}
}
