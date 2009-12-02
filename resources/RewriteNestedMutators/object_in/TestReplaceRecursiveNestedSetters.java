package object_in;

public class TestReplaceRecursiveNestedSetters {
	private int x, y;

	public void setX(int x) {
		this.x = x; 
	}

	public void setY(int y) {
		this.y = y;
	}

	// Tail-recursion to move the point to the x axis
	public void moveToXAxis() {
		if (x > 0) {
			x--;
			moveToXAxis();
		}
	}
}
