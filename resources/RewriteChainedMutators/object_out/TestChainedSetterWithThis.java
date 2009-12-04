package object_out;

public class TestChainedSetterWithThis {
	private final int i, j;

	public TestChainedSetterWithThis() {
		this.i = 0;
		this.j = 0;
	}

	public TestChainedSetterWithThis(int i, int j) {
		this.i = i;
		this.j = j;
	}

	TestChainedSetterWithThis setI(int anInt) {
		TestChainedSetterWithThis _this = this;
		_this = new TestChainedSetterWithThis(anInt, anInt);
		return _this;
	}
}
