package shapes;

import Abstracts.Shape;

public class Pyramid extends Shape {
	private double edgeLength;
	private double volume;
	private double baseArea;

	@Override
	public double getVolume() {
		volume = (1.0/3) * ((edgeLength * edgeLength) * height);
		return volume;
	}

	@Override
	public double getBaseArea() {
		baseArea = edgeLength * edgeLength;
		return baseArea;
	}
	public Pyramid (double height, double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
		
	}
	
	public String toString() {
		String str = ("Pyramid- "+"height: " +getHeight()+" edgeLength: "+getEdgeLength());
		return str;
	}

	private double getEdgeLength()
	{
		return edgeLength;
	}


}
