package unl.cse.sorting;

import java.util.Arrays;

public class SortingAlgorithms {

	public static Location [] javaSort(Location list[]) {
		Location result[] = Arrays.copyOf(list, list.length);
		Arrays.sort(result);
		return result;
	}
	
	public static Location [] selectionSort(Location list[]) {
		Location result[] = Arrays.copyOf(list, list.length);
		for(int i=0; i<result.length; i++) {
			int minIndex = i;
			for(int j=i+1; j<result.length; j++) {
				if(result[j].compareTo(result[minIndex]) < 0)
					minIndex = j;
			}
			Location tmp = result[i];
			result[i] = result[minIndex];
			result[minIndex] = tmp;
		}
		return result;
	}

	public static Location [] insertionSort(Location list[]) {
		Location result[] = Arrays.copyOf(list, list.length);
		//TODO: implement insertion sort here
		return result;
	}
	
	public static Location [] quickSort(Location list[]) {
		Location result[] = Arrays.copyOf(list, list.length);
		quickSortRecursive(result, 0, result.length-1);
		return result;
	}   //stuff

	private static void quickSortRecursive(Location list[], int low, int high) {
		//TODO: implement quick sort here
	}
}
