package object_out;

public class TestReplaceSimpleSetterWithFactoryMethod{
	final int i;
	
	public TestReplaceSimpleSetterWithFactoryMethod(int anInt) {
		i = anInt;
	}
	
	TestReplaceSimpleSetterWithFactoryMethod setI(int anInt) {
		return new TestReplaceSimpleSetterWithFactoryMethod(anInt);
	}
}