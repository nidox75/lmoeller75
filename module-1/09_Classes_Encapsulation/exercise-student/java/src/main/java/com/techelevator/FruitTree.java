package com.techelevator;

public class FruitTree {
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;

    }

    public boolean pickFruit(int amountToRemove) {
        if(piecesOfFruitLeft >= amountToRemove) {
            piecesOfFruitLeft -= amountToRemove;
            return true;
        }else {
            return false;
        }
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }
}
