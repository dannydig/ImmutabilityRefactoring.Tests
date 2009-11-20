package object_out;

public class TestReplaceSimpleSetterWithFactoryMethod{
	private final int i;
	
	public TestReplaceSimpleSetterWithFactoryMethod(int anInt) {
		i = anInt;
	}
	
	TestReplaceSimpleSetterWithFactoryMethod setI(int anInt) {
		System.out.println();
		System.out.println();
		return new TestReplaceSimpleSetterWithFactoryMethod(anInt);
	}
}