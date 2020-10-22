package be.abis.exercise.model;

public class Circle extends Shape  {

	private static final double PI = 3.14;
	private double radius;

	public Circle(String color,  double radius) {
		super(color);
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(String color, double radius){
		super(color);
		return getRadius();
	}

	public double getRadius() {
		return radius;
	}
@Override
	public double area() {
		return Math.PI * Math.pow(radius,2);
	}
}
