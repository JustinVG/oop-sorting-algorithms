package Utility;

 

import java.util.Comparator;

 // insertion sort adapted from https://www.geeksforgeeks.org/insertion-sort/

public class InsertionSort
{
    public static <T> void insertionSorter (T[] shapes, Comparator<? super T > comp) {
    	long start = System.currentTimeMillis();
        for(int i=0;i<shapes.length;i++) {
            T key = shapes[i];
            int j = i-1;
            while(j>=0 && (comp.compare(key, shapes[j])) > 0) {
                shapes[j+1]= shapes[j];
                j=j-1;
            }
            shapes[j+1]=key;
        }
        long stop = System.currentTimeMillis();
		System.out.println("Insertion sort took : " + (stop - start) + " milliseconds");
    }
    
    public static <T extends Comparable<? super T>> void insertionSorter (T[] shapes) {
    	long start = System.currentTimeMillis();
        for(int i=0;i<shapes.length;i++) {
            T key = shapes[i];
            int j = i-1;
            
            while(j>=0 && (key.compareTo(shapes[j]) > 0)) {
                shapes[j+1]= shapes[j];
                j=j-1;
            }
            shapes[j+1]=key;
        }
        long stop = System.currentTimeMillis();
        System.out.println("Insertion sort took : " + (stop - start) + " milliseconds");
    }
   
    
}