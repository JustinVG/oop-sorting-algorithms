package Utility;

import java.util.Comparator;

import Abstracts.Shape;

// bubble sort adapted from https://www.geeksforgeeks.org/bubble-sort/

public class BubbleSort
{
	
	public static <T> void bubbleSorter (T[] shapes, Comparator<? super T > comp) {
		long start = System.currentTimeMillis();
		for (int a = 1; a < shapes.length; a++)
			for (int b = 0; b < shapes.length - a; b++) {	
				if ((comp.compare(shapes[b], shapes[b + 1])) < 0) {
					T temp = shapes[b];
					shapes[b] = shapes[b + 1];
					shapes[b + 1] = temp;
				}
			}
		long stop = System.currentTimeMillis();
		System.out.println("Bubble sort took : " + (stop - start) + " milliseconds");
	}

	public static <T extends Comparable<? super T>> void bubbleSorter (T[] shapes) {
		long start = System.currentTimeMillis();
		for (int a = 1; a < shapes.length; a++)
			for (int b = 0; b < shapes.length - a; b++) {	
				if ((shapes[b].compareTo(shapes[b + 1]) < 0)) {
					T temp = shapes[b];
					shapes[b] = shapes[b + 1];
					shapes[b + 1] = temp;
			
				}
			}
		long stop = System.currentTimeMillis();
		System.out.println("Bubble sort took : " + (stop - start) + " milliseconds");
	}
}
