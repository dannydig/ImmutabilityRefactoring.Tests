public class Test {
	private final int x, y;
	
	public Test(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Test setX(int x) {
		return new Test(x, this.y); 
	}
	
	Test setY(int y) {
		return new Test(this.x, y);
	}
	
	void moveTo(int x, int y) {
		setX(x);
		setY(y);
	}
}
