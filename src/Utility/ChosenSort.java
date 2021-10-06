package Utility;

import java.util.Comparator;
// gnome sort adapted from https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/
public class ChosenSort {
	public static <T> void gnomeSorter(T[] arr, Comparator<? super T> comp) {
		long start = System.currentTimeMillis();
		int i = 1;
		int j = 2;

		while (i < arr.length) {
			if ((comp.compare(arr[i - 1], arr[i]) >= 0)) {
				i = j;
				j++;
			} else {
				T tmp = (T) arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i--] = tmp;
				i = (i == 0) ? j++ : i;
			}
		}
		long stop = System.currentTimeMillis();
		System.out.println("Gnome sort took : " + (stop - start) + " milliseconds");
	}



	public static <T extends Comparable<? super T>> void gnomeSorter(T[] arr) {
		long start = System.currentTimeMillis();
		int i = 1;
		int j = 2;

		while (i < arr.length) {
			if (((arr[i - 1].compareTo( arr[i]) >= 0))) {
				i = j;
				j++;
			} else {
				T tmp = (T) arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i--] = tmp;
				i = (i == 0) ? j++ : i;
			}
		}
		long stop = System.currentTimeMillis();
		System.out.println("Gnome sort took : " + (stop - start) + " milliseconds");
	}
	
}

