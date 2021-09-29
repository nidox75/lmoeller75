package com.techelevator;

public class DealerApp {
    public static void main(String[] args) {
        Card card = new Card( "Spades", "Ace", true);

       // System.out.println(card.getRank() + " of " + card.getSuit());
        System.out.println(card.toString());
        card.setFaceUp(false);
        System.out.println(card.toString());

        System.out.println();
        System.out.println();
        System.out.println();


        Deck deck = new Deck();
        deck.shuffle();
        for (Card deckCard : deck.getCards()) {
            deckCard.setFaceUp(true);
            System.out.println(deckCard.toString());
        }
    }
}
