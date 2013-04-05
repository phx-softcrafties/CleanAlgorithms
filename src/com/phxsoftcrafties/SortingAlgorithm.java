package com.phxsoftcrafties;

import java.util.Collection;

public interface SortingAlgorithm<T extends Comparable<? super T>> {
	Collection<T> sort(Collection<T> numbers);
}
