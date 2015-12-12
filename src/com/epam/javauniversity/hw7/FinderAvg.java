package com.epam.javauniversity.hw7;

import java.util.*;

public final class FinderAvg {

    private FinderAvg() {
    }

    public static <T extends Comparable<? super T>> T avg(Collection<? extends T> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("collection is null");
        }
        if (collection.size() == 0) {
            throw new IllegalArgumentException("collection is empty");
        }
        Comparator<? super T> comparator = new Comparator<T>() {
            @Override
            public int compare(T oneElement, T twoElement) {
                return oneElement.compareTo(twoElement);
            }
        };

        Collections.sort((List) collection, comparator);

        return (T) ((List) collection).get(collection.size() / 2);
    }
}
