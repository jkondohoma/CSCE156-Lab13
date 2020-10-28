package unl.cse.sorting;

import java.util.List;

public class SortingAlgorithms {

	/**
	 * @param locations
	 */
	public static void selectionSort(List<Location> locations) {
		for (int i = 0; i < locations.size(); i++) {
			int minIndex = i;
			for (int j = i + 1; j < locations.size(); j++) {
				if (locations.get(j).compareTo(locations.get(minIndex)) < 0) {
					minIndex = j;
				}
			}
			// swap
			Location temp = locations.get(i);
			locations.set(i, locations.get(minIndex));
			locations.set(minIndex, temp);
		}
	}

	/**
	 * @param locations
	 */
	public static void insertionSort(List<Location> locations) {
		// TODO: implement insertion sort here
	}

	/**
	 * A recursive implementation of
	 * @param locations
	 */
	public static void quickSort(List<Location> locations) {
		quickSortRecursive(locations, 0, locations.size() - 1);
	}

	/**
	 * Recursive call for the {@link #quickSort(List)} method.
	 * @param locations
	 * @param low
	 * @param high
	 */
	private static void quickSortRecursive(List<Location> locations, int low, int high) {
		// TODO: implement quick sort here
	}
}
