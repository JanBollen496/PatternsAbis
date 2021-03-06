package be.abis.exercise00.model;

public abstract class Shape  {

	private String color;
	private Point origin;


  	public Shape(){}

	public Shape(String color) {
		this.color = color;
	}

	public Shape(Point origin) {
		this.origin = origin;
	}

	public Shape(String color, Point origin) {
		this.color = color;
		this.origin = origin;
	}

	public Point getOrigin() {
		return origin;
	}

	public void setOrigin(Point origin) {
		this.origin = origin;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public abstract double area();

	public String toString(){
		return "area of " + this.getClass().getSimpleName() +" with color " + this.getColor() + " is " + this.area();
	}

}
