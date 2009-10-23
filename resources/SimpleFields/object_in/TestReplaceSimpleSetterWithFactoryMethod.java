package object_in;

public class TestReplaceSimpleSetterWithFactoryMethod{
	int i;
	
	public TestReplaceSimpleSetterWithFactoryMethod(int anInt) {
		i = anInt;
	}
	
	void setI(int anInt) {
		System.out.println();
		i = anInt;
		System.out.println();
	}
}