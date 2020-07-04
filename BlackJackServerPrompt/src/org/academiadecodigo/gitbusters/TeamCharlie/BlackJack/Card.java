package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

public class Card {

    private CardValue cardValue;
    private Suit cardSuit;

    private int points;


    public Card(CardValue cardValue, Suit cardSuit) {
        this.cardValue = cardValue;
        this.cardSuit = cardSuit;
        points = cardValue.getCardValue();

    }

    public CardValue getCardValue() {
        return cardValue;
    }

    public int getPoints() {
        return points;

    }


    @Override
    public String toString() {
        return "[ " + cardValue + " " + cardSuit + " ]";
    }
}
