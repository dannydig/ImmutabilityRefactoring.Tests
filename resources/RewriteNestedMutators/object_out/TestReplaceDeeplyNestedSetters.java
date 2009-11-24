package object_out;

public class TestReplaceDeeplyNestedSetters {
	private final int x, y;

	public TestReplaceDeeplyNestedSetters() {
		this.x = 0;
		this.y = 0;
	}

	public TestReplaceDeeplyNestedSetters(int x, int y) {
		this.x = x;
		this.y = y;
	}

	TestReplaceDeeplyNestedSetters setX(int x) {
		return new TestReplaceDeeplyNestedSetters(x, this.y); 
	}

	TestReplaceDeeplyNestedSetters setY(int y) {
		return new TestReplaceDeeplyNestedSetters(this.x, y);
	}

	TestReplaceDeeplyNestedSetters moveTo(int x, int y) {
		TestReplaceDeeplyNestedSetters tmp = setX(x);
		return tmp.setY(y);
	}

	TestReplaceDeeplyNestedSetters moveBy(int dx, int dy) {
		return moveTo(x + dx, y + dy);
	}
}
