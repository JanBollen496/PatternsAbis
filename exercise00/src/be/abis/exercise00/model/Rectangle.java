package be.abis.exercise.model;

public class Rectangle extends Shape {

	private double height;
	private double width ;


	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Rectangle(String color, Point origin, double height) {
		super(color, origin);
		this.height = height;
	}

	public Rectangle(double height, double width){
		height=getHeight();
		width=getWidth();
	}

	public double getHeight {
		return height;

	}
	public double getWidth{
		return width;
	}
@Override
  	public double area(){
		return height*width;
	}

}
