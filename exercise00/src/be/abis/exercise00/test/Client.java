package be.abis.exercise00.test;

import java.util.ArrayList;
import java.util.List;

import be.abis.exercise00.model.Circle;
import be.abis.exercise00.model.Rectangle;
import be.abis.exercise00.model.Shape;

public class Client {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 3);
		Circle c = new Circle("blue", 4);
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(r);
		shapes.add(c);
		for(Shape s : shapes){
			System.out.println("area of shape with color" + s.setColor( ) + "is " + s.area());
		}
	}
}
