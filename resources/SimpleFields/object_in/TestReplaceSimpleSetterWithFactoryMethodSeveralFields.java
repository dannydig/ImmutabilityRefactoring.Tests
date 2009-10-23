package object_in;

public class TestReplaceSimpleSetterWithFactoryMethodSeveralFields {
	int i, j;
	
	public TestReplaceSimpleSetterWithFactoryMethodSeveralFields(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	void setI(int anInt) {
		System.out.println();
		i = j= anInt;
		System.out.println();
	}
}
