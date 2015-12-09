package com.epam.javauniversity.hw7;

import java.util.ArrayList;

public final class Filter {

    private Filter() {
    }

    public static <T> ArrayList<T> filter(ArrayList<T> list, Predicate predicate) {
        if (list == null) {
            throw new NullPointerException("list is null");
        }
        if (predicate == null) {
            throw new NullPointerException("predicate is null");
        }
        ArrayList<T> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (predicate.apply(list.get(i))) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
