package Utility;

import java.util.Comparator;
import Abstracts.Shape;

public class BaseAreaCompare implements Comparator<Shape> {

	@Override
	public int compare(Shape shape1, Shape shape2) {
		return Double.compare(shape1.getBaseArea(), shape2.getBaseArea());
	}
}
