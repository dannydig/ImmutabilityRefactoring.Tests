package object_in;

public class TestChainedSetterWithThis {
	int i, j;

	void setI(int anInt) {
		this.i = this.j = anInt;
	}
}
