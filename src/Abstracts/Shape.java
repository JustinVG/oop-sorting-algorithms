package Abstracts;

public abstract class Shape implements Comparable<Shape> {
	
	protected double height;
	
	
	
	public Shape(double height2) {
		this.height = height2;
	}

	public abstract double getVolume();
	
	public abstract double getBaseArea();
	

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public int compareTo(Shape that) {
		
	if (this.height > that.height){
		return 1;
	}
	else if (this.height < that.height) {
		return -1;
	}
	else {
		return 0;
	}	
	
	}
	

}
