package oopsdemo4;

/**
 * Author :Jetty.Srikar
 * Date :Sep 6, 2025
 * Time :9:52:08 AM
 *project : projCoreJava
 */

public class Circle implements Shape{
	private double radius;
	
	
	
	
	public Circle(double radius) {
		this.radius = radius;
	}




	@Override
	public void draw() {
		System.out.println("Drawing circle");
		
	}




	@Override
	public double getArea() {
		System.out.println();
		return Math.PI*this.radius*this.radius;
		
	}




	public double getRadius() {
		return radius;
	}

	
	

}
