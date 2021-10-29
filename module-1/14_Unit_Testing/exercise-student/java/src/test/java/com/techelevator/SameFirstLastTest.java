package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

    @Test
    public void Same_Last() {
        SameFirstLast sl = new SameFirstLast();

            boolean actual = sl.isItTheSame(new int[]{ 1, 2, 3, 1});


        Assert.assertEquals("Returns first and last", true, actual);
    }
    @Test
    public void Not_Same_Last() {
        SameFirstLast sl = new SameFirstLast();

        boolean actual = sl.isItTheSame(new int[]{ 1, 2, 3, 4});


        Assert.assertEquals("Returns Null and false", false, actual);
    }
    @Test
    public void Negative_Integer_Not_Same_Last() {
        SameFirstLast sl = new SameFirstLast();

        boolean actual = sl.isItTheSame(new int[]{ -1, 2, 3, 1});


        Assert.assertEquals("Returns false one int is negative", false, actual);
    }
    @Test
    public void Zero_First_And_Last() {
        SameFirstLast sl = new SameFirstLast();

        boolean actual = sl.isItTheSame(new int[]{ 0, 2, 3, 0});


        Assert.assertEquals("Returns first and last as zero", true, actual);
    }
}