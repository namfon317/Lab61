package lap8;

public class Rectangle extends Square {
protected double height;
	
	public Rectangle(double width, double h) {
		super(width);
		this.height = h;
	}
	
	public double getArea() {
		return width * height;
	}

}
