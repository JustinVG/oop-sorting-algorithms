package shapes;

import Abstracts.Shape;

public abstract class Prism extends Shape {
	protected double edgeLength;
	public Prism(double height, double edgeLength2) {
		super(height);
		this.edgeLength = edgeLength2;
	}
 
	
	
}
