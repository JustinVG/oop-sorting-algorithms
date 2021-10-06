package shapes;

public class SquarePrism extends Prism {
	
	

	@Override
	public double getVolume() {
		double volume = (edgeLength * edgeLength) * height;
		return volume;
	}

	@Override
	public double getBaseArea() {
		double baseArea = edgeLength * edgeLength;
		return baseArea;
	}
	
	public SquarePrism (double height, double edgeLength) {
		super(height, edgeLength);
	}
	
	public String toString() {
		String str = ("Square Prism- "+"height: " +height+" edgeLength: "+getEdgeLength());
		return str;
	}

	private double getEdgeLength()
	{
		return edgeLength;
	}

}