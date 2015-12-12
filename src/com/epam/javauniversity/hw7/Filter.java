package com.epam.javauniversity.hw7;

import java.util.ArrayList;

public final class Filter {

    private Filter() {
    }

    public static <T> ArrayList<T> filter(ArrayList<T> elements, Predicate<T> predicate) {
        if (elements == null) {
            throw new IllegalArgumentException("elements is null");
        }
        if (predicate == null) {
            throw new IllegalArgumentException("predicate is null");
        }
        ArrayList<T> result = new ArrayList<>();
        for (T element : elements) {
            if (predicate.apply(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
