package Utility;

 

import java.util.Comparator;

 
// quick sort adapted from https://www.geeksforgeeks.org/quick-sort/
public class QuickSort
{
    static <T> int partition(T[] array, int begin, int end, Comparator<? super T> comp) {
    	
        int pivot = end;

 

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (comp.compare(array[i], array[pivot]) > 0) {
                T temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        T temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

 
        
        return counter;
    }

 

    public static <T> void quickSorter(T[] array, int startValue, int endValue, Comparator<? super T> comp) {
    	
        if (endValue <= startValue) return;
        int pivot = partition(array, startValue, endValue, comp);
        quickSorter(array, startValue, pivot-1,comp);
        quickSorter(array, pivot+1, endValue,comp);
        
		
    }
    
    static <T extends Comparable<? super T>> int partition(T[] array, int begin, int end) {
        int pivot = end;

 

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i].compareTo(array[pivot]) > 0) {
                T temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        T temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

 

        return counter;
    }

 

    public static <T extends Comparable<? super T>> void quickSorter(T[] array, int startValue, int endValue) {
    	
        if (endValue <= startValue) return;
        int pivot = partition(array, startValue, endValue);
        quickSorter(array, startValue, pivot-1);
        quickSorter(array, pivot+1, endValue);
        
    }

 

}
