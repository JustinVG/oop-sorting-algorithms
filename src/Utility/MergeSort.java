package Utility;

import java.lang.reflect.Array;
import java.util.Comparator;

import Abstracts.Shape;
// merge sort adapted from https://www.geeksforgeeks.org/merge-sort/
public class MergeSort
{
	
	public static <T> void sort(T[] array,Comparator<? super T > comp) {
		long start = System.currentTimeMillis();
		T[]tempArray = (T[]) new Object[array.length];
		mergeSort(array,tempArray,0,array.length-1, comp);
		long stop = System.currentTimeMillis();
		System.out.println("Merge sort took : " + (stop - start) + " milliseconds");
		
	}
	public static <T> void mergeSort (T[] array, T[] tempArray,int lowerIndex, int upperIndex,Comparator<? super T > comp ) {
		if(lowerIndex == upperIndex) {
			return;
		}
		else {
			int mid = (lowerIndex+upperIndex)/2;
			mergeSort(array,tempArray, lowerIndex, mid, comp);
			mergeSort(array,tempArray, mid+1, upperIndex, comp);
			merge(array,tempArray,lowerIndex,mid+1,upperIndex, comp);
		}
	}
	public static <T> void merge(T[] array, T[] tempArray, int lowerIndexCursor, int higherIndex,int upperIndex,Comparator<? super T > comp) {
		int tempIndex=0;
		int lowerIndex = lowerIndexCursor;
		int midIndex = higherIndex-1;
		int totalItems = upperIndex-lowerIndex+1;
		while(lowerIndex <= midIndex && higherIndex <= upperIndex) {
			if (comp.compare(array[lowerIndex], array[higherIndex]) < 0) {
				tempArray[tempIndex++] = array[lowerIndex++];
			}
			else {
				tempArray[tempIndex++] = array[higherIndex++];
			}
			
		}
		while(lowerIndex <= midIndex) {
			tempArray[tempIndex++] = array[lowerIndex++];
		}
		while (higherIndex<= upperIndex) {
			tempArray[tempIndex++] = array[higherIndex++];
		}
		for (int i = 0; i<totalItems; i++) {
			array[lowerIndexCursor+i]= tempArray[i];
		}
	}
	
	public static <T extends Comparable <? super T>> void sort(T[] array) {
		long start = System.currentTimeMillis();
		Object[]tempArray = new Object[array.length];
		mergeSort(array,tempArray,0,array.length-1);
		long stop = System.currentTimeMillis();
		System.out.println("Merge sort took : " + (stop - start) + " milliseconds");
	}
	public static <T extends Comparable <? super T>> void mergeSort (T[] array, Object[] tempArray,int lowerIndex, int upperIndex ) {
		if(lowerIndex == upperIndex) {
			return;
		}
		else {
			int mid = (lowerIndex+upperIndex)/2;
			mergeSort(array,tempArray, lowerIndex, mid);
			mergeSort(array,tempArray, mid+1, upperIndex);
			merge(array,tempArray,lowerIndex,mid+1,upperIndex);
		}
	}
	public static <T extends Comparable <? super T>> void merge(T[] array, Object[] tempArray, int lowerIndexCursor, int higherIndex,int upperIndex) {
		int tempIndex=0;
		int lowerIndex = lowerIndexCursor;
		int midIndex = higherIndex-1;
		int totalItems = upperIndex-lowerIndex+1;
		while(lowerIndex <= midIndex && higherIndex <= upperIndex) {
			if (array[lowerIndex].compareTo(array[higherIndex]) < 0) {
				tempArray[tempIndex++] = array[lowerIndex++];
			}
			else {
				tempArray[tempIndex++] = array[higherIndex++];
			}
			
		}
		while(lowerIndex <= midIndex) {
			tempArray[tempIndex++] = array[lowerIndex++];
		}
		while (higherIndex<= upperIndex) {
			tempArray[tempIndex++] = array[higherIndex++];
		}
		for (int i = 0; i<totalItems; i++) {
			array[lowerIndexCursor+i]= (T) tempArray[i];
		}
	}

}
