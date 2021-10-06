package shapes;

public class PentagonalPrism extends Prism {
	

	@Override
	public double getVolume() {
		double volume = ((5 * (edgeLength * edgeLength) * (Math.tan(54))) / 4) * height;
		return volume;
	}

	@Override
	public double getBaseArea() {
		double baseArea = (5 * (edgeLength * edgeLength) * (Math.tan(54))) / 4 ;
		return baseArea;
	}
	public PentagonalPrism(double height, double edgeLength) {
		super(height, edgeLength);
	}
	
	public String toString() {
		String str = ("Pentagonal Prism- "+"height: " +height+" edgeLength: "+getEdgeLength());
		return str;
	}

	private double getEdgeLength()
	{
		return edgeLength;
	}
}