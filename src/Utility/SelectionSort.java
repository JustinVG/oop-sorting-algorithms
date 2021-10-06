package Utility;

 

import java.util.Comparator;
import Abstracts.Shape;

 
// code adapted from https://www.geeksforgeeks.org/selection-sort/
public class SelectionSort
{
    public static <T> void selectionSorter (T[] shapes, Comparator<? super T> comp) {
    	long start = System.currentTimeMillis();

 

        
        for (int a = 0; a < shapes.length-1; a++) 
        { 
            
            int min_idx = a; 
            for (int b = a+1; b < shapes.length; b++) { 
                if (comp.compare(shapes[b], shapes[min_idx])>0) {
                    min_idx = b;  
                } 
            }
            
            T temp = shapes[min_idx]; 
            shapes[min_idx] = shapes[a]; 
            shapes[a] = temp;
        
        }
        long stop = System.currentTimeMillis();
		System.out.println("Selection sort took : " + (stop - start) + " milliseconds");
    }
        
    public static <T extends Comparable<? super T>> void selectionSorter (T[] shapes) {
    	long start = System.currentTimeMillis();
 

            // One by one move boundary of unsorted subarray 
            for (int a = 0; a < shapes.length-1; a++) 
            { 
                // Find the minimum element in unsorted array 
                int min_idx = a; 
                for (int b = a+1; b < shapes.length; b++) { 
                    if (shapes[b].compareTo(shapes[min_idx])>0) {
                     min_idx = b; 
                    } 
            
                }
            
                T temp = shapes[min_idx]; 
                shapes[min_idx] = shapes[a]; 
                shapes[a] = temp; 
            }
            long stop = System.currentTimeMillis();
    		System.out.println("Selection sort took : " + (stop - start) + " milliseconds");
    
    }
}
