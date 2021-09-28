package solution.tut3.demo;

public class Rectangle extends Object{

	private double width, height;
	private static String color;
	
	public Rectangle() {
	}
	
	//overloaded-constructor
	public Rectangle( double width, double height, String color ) {
		this.width = width;
		this.height = height;
		Rectangle.color = color;
	}

	//get/set methods
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public static String getColor() {
		return color;
	}
	
	public void setWidth( double width ) {
		this.width = width;
	}

	public void setheight( double height ) {
		this.height = height;
	}
	
	public static void setColor( String color ) {
		Rectangle.color = color;
	}
	
	public double findArea() {
		return width * height;
	}

	public double findPerimeter() {
		return 2 * ( width + height );
	}
	
	@Override
	public String toString() {
		String header = "\n>>> Rectangle >>>";
		String line = "width: " + width;
		line += "\nheight: " + height;
		line += "\nArea: " + findArea();
		return header + "\n" + line ;
	}
	
}
