package com.epam.javauniversity.hw7;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestFilter {

    @Test
    public void testFilterLengthStringLessFive() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("ab");
        list.add("abcdi");

        ArrayList<String> resList = new ArrayList<>();
        resList.add("a");
        resList.add("ab");

        assertEquals(Filter.filter(list, new Predicate<String>() {
            @Override
            public <U extends String> boolean apply(U value) {
                return value.length() < 5;
            }
        }), resList);

    }

    @Test
    public void testFilterIntegerDiffThree() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(3);

        ArrayList<Integer> resList = new ArrayList<>();
        resList.add(9);
        resList.add(3);

        assertEquals(Filter.filter(list, new Predicate<Integer>() {
            @Override
            public <U extends Integer> boolean apply(U value) {
                return value.intValue() % 3 == 0;
            }
        }), resList);
    }
}