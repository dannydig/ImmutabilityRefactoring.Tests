package object_out;

public class TestChainedLocalField {
	int i, j;

	void setI(int anInt) {
		TestChainedLocalField _this = this;
		int x, y;

		int temp = func(anInt);
		x = y = temp;
		_this = new TestChainedLocalField(temp, temp);
		
		return _this;
	}
	
	int func(int anInt) {
		return 42;
	}
}
