package com.phxsoftcrafties;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InsertionSort<T extends Comparable<? super T>> implements SortingAlgorithm<T> {
	List<T> sorted;
	
	@Override
	public Collection<T> sort(Collection<T> elements) {
		sorted = new ArrayList<T>(elements);
		insertionSort(sorted);
		System.out.println("the resulting sorted array is "+ sorted);
		return sorted;
	}

	private void insertionSort(List<T> sorted) {
		for(int currentIndex = 1; currentIndex < sorted.size(); currentIndex++ ) {
			T key = sorted.get(currentIndex);
			System.out.println("Currently on " + key);
			int previousIndex = currentIndex - 1;
			previousIndex = insertInOrder(key, previousIndex);
			System.out.println("set element " + (previousIndex + 1) + " to " + key);
			System.out.println("new array is " + sorted);
		}
	}

	private int insertInOrder(T key, int previousIndex) {
		T previous = sorted.get(previousIndex);
		System.out.println("previous element was " + previous);
		while(previousIndex >= 0 && key.compareTo(previous) < 0){
			System.out.println("rearranging " + key + " with " + previous);
			sorted.set(previousIndex + 1, previous);
			previousIndex = previousIndex - 1;
			previous = (previousIndex > -1) ? sorted.get(previousIndex) : previous;
		}
		sorted.set(previousIndex + 1, key);
		return previousIndex;
	}
}
