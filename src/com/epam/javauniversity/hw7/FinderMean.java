package com.epam.javauniversity.hw7;

import java.util.ArrayList;
import java.util.Comparator;

public final class FinderMean {

    private FinderMean() {
    }

    public static <T extends Comparable<? super T>> T avg(ArrayList<? extends T> collection) {
        if (collection == null) {
            throw new NullPointerException("collection is null");
        }
        if (collection.size() == 0) {
            throw new IndexOutOfBoundsException("collection is empty");
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
