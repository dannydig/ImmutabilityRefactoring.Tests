package object_out;

public class TestSimpleInitializedSetter {
	private final int i;
	
	public TestSimpleInitializedSetter() {
		this.i = 42;
	}

	public TestSimpleInitializedSetter(int i) {
		this.i = i;
	}

	TestSimpleInitializedSetter setI(int i) {
		return new TestSimpleInitializedSetter(i);
	}
}