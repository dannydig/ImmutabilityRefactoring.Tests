package object_out;

public class TestReplaceNestedSetters {
	private final int x, y;
	
	public TestReplaceNestedSetters() {
		this.x = 0;
		this.y = 0;
	}

	public TestReplaceNestedSetters(int x, int y) {
		this.x = x;
		this.y = y;
	}

	TestReplaceNestedSetters setX(int x) {
		return new TestReplaceNestedSetters(x, this.y); 
	}
	
	TestReplaceNestedSetters setY(int y) {
		return new TestReplaceNestedSetters(this.x, y);
	}
	
	TestReplaceNestedSetters moveTo(int x, int y) {
		TestReplaceNestedSetters tmp = setX(x);
		return tmp.setY(y);
	}
}
