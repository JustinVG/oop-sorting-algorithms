package shapes;

public class OctagonalPrism extends Prism {

	@Override
	public double getVolume() {
		double volume = (2 * ((1 + Math.sqrt(2)) * (edgeLength * edgeLength))) * height;
		return volume;
	}
	@Override
	public double getBaseArea() {
		double baseArea = 2 * ((1 + Math.sqrt(2)) * (edgeLength * edgeLength));
		return baseArea;
	}
	public OctagonalPrism(double height, double edgeLength) {
		super(height, edgeLength);
	}
	
	public String toString() {
		String str = ("Octagonal Prism- "+"height: " +height+" edgeLength: "+getEdgeLength());
		return str;
	}

	private double getEdgeLength()
	{
		return edgeLength;
	}
	
}
