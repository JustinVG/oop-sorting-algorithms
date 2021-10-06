package shapes;

import Abstracts.Shape;

public class Cylinder extends Shape {
	private double radius;
	

	@Override
	public double getVolume() {
		double volume = Math.PI * (radius * radius) * height;
		
		return volume;
	}

	@Override
	public double getBaseArea() {
		double baseArea = Math.PI * (radius * radius);
		return baseArea;
	}
	public Cylinder (double height, double radius) {
		super(height);
		this.radius = radius; 
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String toString() {
		String str = ("Cylinder- "+"height: " +getHeight()+" radius: "+getRadius());
		return str;
	}

}
