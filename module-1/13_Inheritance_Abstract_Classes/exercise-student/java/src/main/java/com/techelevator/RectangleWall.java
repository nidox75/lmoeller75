package com.techelevator;

public class RectangleWall extends Wall {



    public int getArea() {
       return length * height;

    }
    private int length;
    private int height;

    public RectangleWall(String name, String color, int length, int height){
        super(name, color);
        this.length = length;
        this.height = height;


    }
    public int getLength(){
        return length;
    }
    public int getHeight(){
        return height;
    }

    public String toString() {
        String resultMessage;
         resultMessage = getName() +" (" + getLength() + "x" + getHeight() + ") rectangle";

        return resultMessage;


    }




}
