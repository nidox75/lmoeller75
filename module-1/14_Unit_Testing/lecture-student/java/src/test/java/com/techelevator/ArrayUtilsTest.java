package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsTest {

    @Test
    public void Max_Returns_Correct_Value_For_3_Integers() {
        //Arrange
        int[] testArray = { 1, 2, 3 };

        //Act
        int actual = ArrayUtils.max(testArray);

        //Assert
        Assert.assertEquals( "max didn't return expected value" , 3, actual);
    }
    @Test
    public void max_returns_correct_value_for_3_negative_integers() {
        //Arrange
        int[] testArray = { -1, -2, -3 };

        //Act
        int actual = ArrayUtils.max(testArray);

        //Assert
        Assert.assertEquals( "max didn't return expected value" , 0, actual);
    }
}