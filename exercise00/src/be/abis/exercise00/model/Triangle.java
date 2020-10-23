package be.abis.exercise00.model;

public class Triangle extends Shape{
	private double	height;
	private double  base;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public Triangle(String color, double height, double base) {
		super(color);
		this.height = height;
		this.base = base;
	}

	@Override
	public double area() {
		return height*base/2;
	}

	public String toString(){
		String baseString
	}
}
