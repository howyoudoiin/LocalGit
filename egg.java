package project5;

//egg class
public class Egg {
	private int x;
	private int y;
	private int width;
	private int height;

	public Egg() {
		x = 0;
		y = 0;
	}

	public Egg(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Egg(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
