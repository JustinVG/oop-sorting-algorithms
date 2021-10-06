package shapes;

import Abstracts.Shape;

/**
 * @author 709488
 *
 */
public class Cone extends Shape {
	private double radius;


	@Override
	public double getVolume() {
		double volume = (1.0/3.0) * Math.PI * (radius * radius) * height;
		return volume;
		
	}

	@Override
	public double getBaseArea() {
		double baseArea = Math.PI * (radius * radius);
		return baseArea;
	
	}
	public Cone (double height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	public String toString() {
		String str = ("Cone- "+"height: " +getHeight()+" radius: "+getRadius());
		return str;
	}

	private double getRadius()
	{
		return radius;
	}

}
