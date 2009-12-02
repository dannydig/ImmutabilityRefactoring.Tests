package object_in;

public class TestSetterWithoutFullConstructor {
	int i;
	
	public TestSetterWithoutFullConstructor() {
		this.i = 0;
	}
	
	void setI(int anInt) {
		this.i = anInt;
	}
}