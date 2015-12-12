package com.epam.javauniversity.hw7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

import static org.junit.Assert.*;

public class TestFinderAvg {

    @Test
    public void testFinderAvgInteger() {
        ArrayList<Integer> collection = new ArrayList<>();
        collection.add(2);
        collection.add(4);
        collection.add(1);
        collection.add(9);
        collection.add(7);
        collection.add(5);

        assertEquals(FinderAvg.avg(collection), new Integer(5));
    }

    @Test
    public void testFinderAvgString() {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("Nikola");
        collection.add("John");
        collection.add("Bob");
        collection.add("Alex");
        collection.add("Selena");
        collection.add("Sergio");
        collection.add("Michael");

        assertEquals(FinderAvg.avg(collection), "Michael");
    }
}