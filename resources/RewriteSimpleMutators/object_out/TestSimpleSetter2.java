package object_out;

public class TestSimpleSetter2 {
	private final int i;
	
	public TestSimpleSetter2() {
		this.i = 0;
	}

	public TestSimpleSetter2(int i) {
		this.i = i;
	}

	TestSimpleSetter2 setI(int i) {
		TestSimpleSetter2 _this = this;
		_this = new TestSimpleSetter2(i);
		return _this;
	}
}