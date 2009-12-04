package object_out;

public class TestSimpleSetter {
	private final int i;
	
	public TestSimpleSetter() {
		this.i = 0;
	}

	public TestSimpleSetter(int i) {
		this.i = i;
	}

	TestSimpleSetter setI(int anInt) {
		TestSimpleSetter _this = this;
		_this = new TestSimpleSetter(anInt);
		return _this;
	}
}