package Exercice3;

public class AnotherCircle {
	private double radius;
	
	public AnotherCircle() {
		radius = 1.0;
	}
	
	public AnotherCircle(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + "]";
	}
	
}
