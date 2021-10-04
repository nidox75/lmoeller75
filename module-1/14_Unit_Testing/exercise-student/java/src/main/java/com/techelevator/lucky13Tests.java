package com.techelevator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/*
 * Given an array of ints, return true if the array contains no 1's and no 3's.
 * GetLucky([0, 2, 4]) → true GetLucky([1, 2, 3]) → false GetLucky([1, 2,
 * 4]) → false
 */
public class lucky13Tests {
   @Test
    public void array_with_no_ones_or_threes_returns_true() {
       //Arrange
       Lucky13 lucky13 = new Lucky13();
       int[] testValues = { 0, 2, 4};

       //Act
       boolean actual = lucky13.getLucky(testValues);

       //Arrange
      Assert.assertTrue(actual);


   }
   @Test
   public void array_with_no_ones_or_threes_returns_true() {
      //Arrange
      Lucky13 lucky13 = new Lucky13();
      int[] testValues = null;

      //Act
      boolean actual = lucky13.getLucky(testValues);

      //Arrange
      Assert.assertTrue(actual);

}