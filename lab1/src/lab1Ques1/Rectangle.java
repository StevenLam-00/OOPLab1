package lab1Ques1;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		if (width < 0 || height < 0) {
			System.out.print ("Error > length or height must be postitive");
		}
		if (width < 0 ) {
			this.width = 1; 
		}
		else {
			this.width = width;
		}
		
		if (height < 0 ) {
			this.width = 1; 
		}
		else {
			this.width = width;
		}
		
	}
	public int getHeigth() {
		return height;
	}
	public void setHeight(int height) {
		if(height < 0) {
			this.height = 1;
		}else {
			this.height = height;
		}
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width < 0) {
			this.width = 1;
		}else {
			this.width = width;
		}
	}
	
	public void visualize() {
		for(int i = 1; i<= width; i++) {
			for(int j = 1; j<=height; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
