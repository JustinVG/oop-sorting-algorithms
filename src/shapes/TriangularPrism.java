package shapes;

public class TriangularPrism extends Prism {


	@Override
	public double getVolume() {
		double volume = height * ((edgeLength * edgeLength) * (Math.sqrt(3) / 4));
		return volume;
		
	}

	@Override
	public double getBaseArea() {
		double baseArea = (edgeLength * edgeLength) * (Math.sqrt(3) / 4);
		
		return baseArea;
	}
	public TriangularPrism(double height, double edgeLength) {
		super(height, edgeLength);
	}
	
	public String toString() {
		String str = ("Triangular Prism- "+"height: " +height+" edgeLength: "+getEdgeLength());
		return str;
	}

	private double getEdgeLength()
	{
		return edgeLength;
	}
	
}