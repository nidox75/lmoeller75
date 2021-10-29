package com.techelevator;

public class SquareWall extends RectangleWall {






    public SquareWall(String name, String color, int sideLength) {
       super(name, color,sideLength, sideLength);


    }
    public String toString() {
        String resultMessage;
        resultMessage = getName() + " (" + getLength() + "x" + getHeight() + ") square";
           return resultMessage;
    }


}
