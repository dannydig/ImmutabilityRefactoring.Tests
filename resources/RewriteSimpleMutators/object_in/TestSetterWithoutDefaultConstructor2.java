package object_in;

public class TestSetterWithoutDefaultConstructor {
	int i = 0;

	public TestSetterWithoutDefaultConstructor(int i) {
		this.i = i;
	}

	void setI(int anInt) {
		this.i = anInt;
	}
}