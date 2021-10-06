package AppDriver;

import java.util.Scanner;

import Abstracts.Shape;
import Utility.BaseAreaCompare;
import Utility.BubbleSort;
import Utility.ChosenSort;
import Utility.InsertionSort;
import Utility.MergeSort;
import Utility.QuickSort;
import Utility.SelectionSort;
import Utility.VolumeCompare;

import java.io.*;

import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Prism;
import shapes.Pyramid;
import shapes.SquarePrism;
import shapes.TriangularPrism;

public class fileReader {

	public static void main(String[] args) throws FileNotFoundException
	{
		String filename = "";
		for (int i = 0; i < args.length; i++) {
			args[i].toLowerCase();
			if (args[i].charAt(1) == 'f') {
				filename = args[i].substring(2);
				
			}
		}
		
		// TODO Auto-generated method stub
		File file = new File("res/" + filename);
		Scanner inFile = new Scanner(file);
		int arraySize = inFile.nextInt();
		Shape[] shapesArray = new Shape[arraySize];
		int i=0;
		while (inFile.hasNext()) {
			String shape = inFile.next();
			
			double h;
			double r;
			double eL;
			switch(shape) {
				case "Cylinder":
					h = inFile.nextDouble();
					r = inFile.nextDouble();
					shapesArray[i] = new Cylinder(h,r);
					break;
				case "Cone":
					h = inFile.nextDouble();
					r = inFile.nextDouble();
					shapesArray[i] = new Cone(h,r);
					break;
				case "Pyramid":
					h = inFile.nextDouble();
					eL = inFile.nextDouble();
					shapesArray[i] = new Pyramid(h,eL);
					break;
				case "SquarePrism":
					h = inFile.nextDouble();
					eL = inFile.nextDouble();
					shapesArray[i] = new SquarePrism(h,eL);
					break;
				case "TriangularPrism":
					h = inFile.nextDouble();
					eL = inFile.nextDouble();
					shapesArray[i] =  new TriangularPrism(h,eL);
					break;
				case "PentagonalPrism":
					h = inFile.nextDouble();
					eL = inFile.nextDouble();
					shapesArray[i] =  new PentagonalPrism(h,eL);
					break;
				case "OctagonalPrism":
					h = inFile.nextDouble();
					eL = inFile.nextDouble();
					shapesArray[i] = (Shape) new OctagonalPrism(h,eL);
					break;
				default: System.out.println("Shape not found!");
			}
			i++;
		}
		inFile.close();
		char sortby = '\0';
		char sortType = '\0';
		VolumeCompare vc = new VolumeCompare();
		BaseAreaCompare bc = new BaseAreaCompare();
		for (int b = 0; b < args.length; b++) {
			args[b].toLowerCase();
			if (args[b].charAt(1) == 't') {
				sortby = args[b].charAt(2);
				
			}
			else if (args[b].charAt(1) == 's') {
				sortType = args[b].charAt(2);
			}
		}
		
			if (sortby == 'v') {
				switch(sortType) {
				case 'b':
					BubbleSort.bubbleSorter(shapesArray, vc);
					break;
				case 's':
					SelectionSort.selectionSorter(shapesArray, vc);
					break;
				case 'i':
					InsertionSort.insertionSorter(shapesArray, vc);
					break;
				case 'm':
					MergeSort.sort(shapesArray, vc);
					break;
				case 'q':
					long start = System.currentTimeMillis();
					QuickSort.quickSorter(shapesArray, 0, shapesArray.length - 1, vc);
					long stop = System.currentTimeMillis();
			        System.out.println("Quick sort took :" + (stop - start) + "milliseconds");
					break;
				case 'z':
					ChosenSort.gnomeSorter(shapesArray, vc);
					break;
				}
				for (int a  = 1; a<arraySize; a++) {
					if (a % 1000 == 0 ) {
						System.out.println(shapesArray[a].getVolume());
					}
				}
			
			}
				
			else if (sortby == 'a') {
					switch(sortType) {
					case 'b':
						BubbleSort.bubbleSorter(shapesArray, bc);
						break;
					case 's':
						SelectionSort.selectionSorter(shapesArray, bc);
						break;
					case 'i':
						InsertionSort.insertionSorter(shapesArray, bc);
						break;
					case 'm':
						MergeSort.sort(shapesArray, bc);
						break;
					case 'q':
						long start = System.currentTimeMillis();
						QuickSort.quickSorter(shapesArray, 0, shapesArray.length - 1, bc);
						long stop = System.currentTimeMillis();
				        System.out.println("Quick sort took : " + (stop - start) + " milliseconds");
						break;
					case 'z':
						ChosenSort.gnomeSorter(shapesArray, bc);
						break;
					}
					for (int a  = 1; a<arraySize; a++) {
						if (a % 1000 == 0 ) {
							System.out.println(shapesArray[a].getBaseArea());
						}
					}
			}
					
					
			else if (sortby == 'h') {
						switch(sortType) {
						case 'b':
							BubbleSort.bubbleSorter(shapesArray);
							break;
						case 's':
							SelectionSort.selectionSorter(shapesArray);
							break;
						case 'i':
							InsertionSort.insertionSorter(shapesArray);
							break;
						case 'm':
							MergeSort.sort(shapesArray);
							break;
						case 'q':
							long start = System.currentTimeMillis();
							QuickSort.quickSorter(shapesArray, 0, shapesArray.length - 1);
							long stop = System.currentTimeMillis();
					        System.out.println("Quick sort took : " + (stop - start) + " milliseconds");
							break;
						case 'z':
							ChosenSort.gnomeSorter(shapesArray);
							break;
						}
						for (int a  = 1; a<arraySize; a++) {
							if (a % 1000 == 0 ) {
								System.out.println(shapesArray[a].getHeight());
							}
						}
						
			}
				
				
		}
		
}
	


