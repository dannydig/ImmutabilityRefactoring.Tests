package object_in;

public class TestSetterWithoutDefaultConstructor {
	int i;

	public TestSetterWithoutDefaultConstructor(int i) {
		this.i = i;
	}

	void setI(int anInt) {
		this.i = anInt;
	}
}