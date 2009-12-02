package object_out;

public class TestReplaceRecursiveNestedSetters {
	private final int x, y;

	public TestReplaceRecursiveNestedSetters() {
		this.x = 0;
		this.y = 0;
	}

	public TestReplaceRecursiveNestedSetters(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public TestReplaceRecursiveNestedSetters setX(int x) {
		return new TestReplaceRecursiveNestedSetters(x, this.y); 
	}

	public TestReplaceRecursiveNestedSetters setY(int y) {
		return new TestReplaceRecursiveNestedSetters(this.x, y);
	}

	// Tail-recursion to move the point to the x axis
	public TestReplaceRecursiveNestedSetters moveToXAxis() {
		TestReplaceRecursiveNestedSetters _this = this;
		if (x > 0) {
			_this = new TestReplaceRecursiveNestedSetters(x - 1);
			_this = _this.moveToXAxis();
		}
		return _this;
	}
}
