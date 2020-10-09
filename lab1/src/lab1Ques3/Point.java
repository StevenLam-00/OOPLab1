package lab1Ques3;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distance (double x, double y) {
		return Math.sqrt( Math.pow( this.x -x, 2) + Math.pow( this.y -y, 2) );
	}



	public double distance(Point test) {
		return distance(test.getX(), test.getY());
	}

	
}
