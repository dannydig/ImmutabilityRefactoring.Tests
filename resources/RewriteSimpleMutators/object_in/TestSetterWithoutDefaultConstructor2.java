package object_in;

public class TestSetterWithoutDefaultConstructor2 {
	int i = 0;

	public TestSetterWithoutDefaultConstructor2(int i) {
		this.i = i;
	}

	void setI(int anInt) {
		this.i = anInt;
	}
}