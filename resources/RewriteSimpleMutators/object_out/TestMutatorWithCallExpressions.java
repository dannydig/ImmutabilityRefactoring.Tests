package object_out;

public class TestMutatorWithCallExpressions {
	private final int i;

	public TestMutatorWithCallExpressions(int i) {
		this.i = 0;
	}

	public TestMutatorWithCallExpressions(int i) {
		this.i = i;
	}

	int getInt() { 
		System.out.println("Returning int");
		return 42;
	}

	TestMutatorWithCallExpressions mutateFields() {
		return TestMutatorWithCallExpressions(getInt());
	}
}
