package object_in;

public class TestReplaceSetterWithoutConstructor {
	int i;
	
	public TestReplaceSetterWithoutConstructor() {
		this.i = 0;
	}
	
	void setI(int anInt) {
		this.i = anInt;
	}
}