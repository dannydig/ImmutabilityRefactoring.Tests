package object_out;

public class TestMutatorWithCallExpressionsMultipleFields {
	private final int i, j;

	public TestMutatorWithCallExpressionsMultipleFields() {
		this.i = 0;
		this.j = 0;
	}

	public TestMutatorWithCallExpressionsMultipleFields(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int getI() { return i; }

	public int getInt() { 
		System.out.println("Returning int");
		return 42;
	}

	// Retain call order in case the method has side effects - must also create a getter
	TestMutatorWithCallExpressionsMultipleFields mutateFields() {
		TestMutatorWithCallExpressionsMultipleFields _this = this;
		_this = new TestMutatorWithCallExpressionsMultipleFields(i, this.j);
		_this = new TestMutatorWithCallExpressionsMultipleFields(_this.getI(), j);
		return _this;
	}
}
