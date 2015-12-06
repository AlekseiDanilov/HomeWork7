package com.epam.javauniversity.hw7;

import java.util.ArrayList;
import java.util.Comparator;

public final class FinderMean {
    {
    }

    public FinderMean() {
    }

    public static <T extends Comparable<T>> T mean(ArrayList<T> collection) {
        if (collection == null) {
            throw new NullPointerException();
        }
        if (collection.size() == 0) {
            throw new IndexOutOfBoundsException();
        }
        collection.sort(new Comparator<T>() {
            @Override
            public int compare(T oneElement, T twoElement) {
                return oneElement.compareTo(twoElement);
            }
        });
        return collection.get(collection.size() / 2);
    }
}
