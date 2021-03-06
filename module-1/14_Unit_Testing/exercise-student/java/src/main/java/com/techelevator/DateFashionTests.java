package com.techelevator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DateFashionTests {







    @Test
    public void Get_A_Table() {
        //Arrange
        DateFashion fashion = new DateFashion();
        int meTestValues = 9 ;
        int dateTestValues = 10;
        //Act
        int actual = fashion.getATable(meTestValues, dateTestValues);

        //Arrange
        Assert.assertEquals(2,actual);

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
