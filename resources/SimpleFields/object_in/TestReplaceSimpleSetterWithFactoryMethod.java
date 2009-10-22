package object_in;

public class TestReplaceSimpleSetterWithFactoryMethod{
	int i;
	
	public TestReplaceSimpleSetterWithFactoryMethod(int anInt) {
		i = anInt;
	}
	
	void setI(int anInt) {
		i = anInt;
	}
}