package com.phxsoftcrafties;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

public class SortingAlgorithmTest {
	@Test
	public void canSortNumbers() {
		SortingAlgorithm<Integer> toTest = new InsertionSort<Integer>();
		Integer[] numbers = new Integer[]{  5, 2, 4, 6, 1, 3 };
		Collection<Integer> nums = Arrays.asList(numbers);
		Collection<Integer> result = toTest.sort(nums);
		Collection<Integer> expected = Arrays.asList(new Integer[]{  1, 2, 3, 4, 5, 6 });
		assertEquals(expected, result);
	}
	
	@Test
	public void canSortWords() {
		SortingAlgorithm<String> toTest = new InsertionSort<String>();
		String[] animals = new String[]{  "anaconda", "dog", "bear", "puma", "cat", "bird"};
		Collection<String> ans = Arrays.asList(animals);
		Collection<String> result = toTest.sort(ans);
		Collection<String> expected = Arrays.asList(new String[]{  "anaconda", "bear", "bird", "cat", "dog", "puma" });
		assertEquals(expected, result);
	}

}
