package com.techelevator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DateFashionTests {







    @Test
    public void Negative_Array_Returns_False() {
        //Arrange
        DateFashion fashion = new DateFashion();
        int[] testValues = {11, 10};

        //Act
        int actual = fashion.getATable(11, 10);

        //Arrange
        Assert.assertTrue(actual);

    }
    @Test
    public void _Array_Returns_False() {
        //Arrange
        Lucky13 lucky13 = new Lucky13();
        int[] testValues = {-1, -3};

        //Act
        boolean actual = lucky13.getLucky(testValues);

        //Arrange
        Assert.assertTrue(actual);

    }
}
