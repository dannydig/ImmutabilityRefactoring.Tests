package object_in;

public class TestReplaceSetterWithoutConstructorMultipleFields {
	int i, j, k;
	
	public TestReplaceSetterWithoutConstructorMultipleFields() {
		this.i = 0;
		this.j = 0;
		this.k = 0;
	}
	
	void setI(int anInt) {
		this.i = anInt;
	}
}