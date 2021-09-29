package com.techelevator;
/* Instance Variable. Each new Card gets its own suit, ranl, and faceup*/
public class Card {
    private String suit;
    private String rank;
    private boolean faceUp;

    public Card(String suit, String rank, boolean faceUp) {
        this.suit = suit;
        this.rank = rank;
        this.faceUp = faceUp;
    }

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
// getters and Setters
    
    public String getSuit() {
        return this.suit;
    }

    public String getRank() {
        return this.rank;
    }

    public boolean isFaceUp() {
        return this.faceUp;
    }

    public void setFaceUp(boolean faceUp) {
        this.faceUp = faceUp;
    }

    public String toString() {
        if (this.faceUp) {
            return this.rank + " of " + this.suit;
        } else {
            return "##";
        }
    }

}
