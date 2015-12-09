package com.epam.javauniversity.hw7;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class testFinderMean {

    @Test
    public void testFinderMeanInteger() {
        ArrayList<Integer> collection = new ArrayList<>();
        collection.add(2);
        collection.add(4);
        collection.add(1);
        collection.add(9);
        collection.add(7);
        collection.add(5);

        assertEquals(FinderMean.avg(collection), new Integer(5));
    }

    @Test
    public void testFinderMeanString() {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("Nikola");
        collection.add("John");
        collection.add("Bob");
        collection.add("Alex");
        collection.add("Selena");
        collection.add("Sergio");
        collection.add("Michael");

        assertEquals(FinderMean.avg(collection), "Michael");
    }
}