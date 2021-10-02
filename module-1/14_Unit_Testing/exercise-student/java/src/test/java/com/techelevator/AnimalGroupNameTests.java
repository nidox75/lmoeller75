package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests {

    @Test
    public void elephant_returns_herd() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        //Act
        String actual = animalGroupName.getHerd("elephant");
        //Assert
        Assert.assertEquals("Herd", actual);

    }

    @Test
    public void empty_string_returns_unknown() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        //Act
        String actual = animalGroupName.getHerd("");
        //Assert
        Assert.assertEquals("unknown", actual);

    }
    @Test
    public void uppercase_elephant_returns_herd() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        //Act
        String actual = animalGroupName.getHerd("ELEPHANT");
        //Assert
        Assert.assertEquals("Herd" , actual);

    }

    @Test
    public void null_returns_unknown() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        //Act
        String actual = animalGroupName.getHerd("null");
        //Assert
        Assert.assertEquals("unknown" , actual);

    }
    @Test
    public void giraffe_returns_Tower() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        //Act
        String actual = animalGroupName.getHerd("Giraffe");
        //Assert
        Assert.assertEquals("Tower" , actual);

    }
    @Test
    public void unicorn_returns_unknown() {
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        //Act
        String actual = animalGroupName.getHerd("Unicorn");
        //Assert
        Assert.assertEquals("unknown" , actual);

    }


}

