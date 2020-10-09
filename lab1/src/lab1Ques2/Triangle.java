package lab1Ques2;

public class Triangle {
	private int x;
	private int y;
	private int z;
	
	
	public Triangle(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
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


	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
	}
	
	public String verify() {
		if (x <=0 ||  y <=0 || z <=0) {
			return "Not a Triangle";
		}
		else if ( x == y && x == z) {
			return "Equalateral";
		}
		else if ( x == y || x == z || y==z) {
			return "Isosceles";}
		else {
			return "Scalene";
		}
	}
	public void display() {
		System.out.println(verify());
	}
	
	

}
