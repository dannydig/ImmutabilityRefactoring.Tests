package object_in;

public class TestReplaceSimpleSetterWithFactoryMethodSeveralFieldsWithThis {
	int i, j;
	
	public TestReplaceSimpleSetterWithFactoryMethodSeveralFieldsWithThis(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	void setI(int anInt) {
		this.i = this.j = anInt;
	}
}
