package com.techelevator;


/*
 * Given a string, return a new string made of every other char starting with
 * the first, so "Hello" yields "Hlo". GetBits("Hello") → "Hlo" GetBits("Hi")
 * → "H" GetBits("Heeololeo") → "Hello"
 */

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTests {
    @Test
    public void String_To_Test_The_String() {

        StringBits stringBits = new StringBits();
         String testValues = "txexsxtx";

         String actual = stringBits.getBits(testValues);



        Assert.assertEquals("test",actual);
    }
    @Test
    public void String_To_Make_The_Red_Go_Away() {



        StringBits stringBits = new StringBits();
        String testValues = " ";

        String actual = stringBits.getBits(testValues);


        Assert.assertEquals(" " , actual);
    }
}
