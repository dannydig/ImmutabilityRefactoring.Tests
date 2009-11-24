package object_in;

public class TestReplaceDeeplyNestedSetters {
	int x, y;

	void setX(int x) {
		this.x = x; 
	}

	void setY(int y) {
		this.y = y;
	}

	void moveTo(int x, int y) {
		setX(x);
		setY(y);
	}

	void moveBy(int dx, int dy) {
		moveTo(x + dx, y + dy);
	}
}
