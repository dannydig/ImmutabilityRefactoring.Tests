package object_in;

public class TestChainedSetterWithThis {
	int i = 0, j = 0;

	void setI(int anInt) {
		this.i = this.j = anInt;
	}
}
