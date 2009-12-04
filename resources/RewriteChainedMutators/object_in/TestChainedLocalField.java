package object_in;

public class TestChainedLocalField {
	int i, j;

	void setI(int anInt) {
		int x, y;

		x = i = y = j = func(anInt);
	}
	
	int func(int anInt) {
		return 42;
	}
}
