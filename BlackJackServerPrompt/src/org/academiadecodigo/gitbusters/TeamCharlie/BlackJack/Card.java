package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

public class Card {

    private CardValue cardValue;
    private Suit cardSuit;

    private int points;

    public Card(CardValue cardValue, Suit cardSuit) {
        this.cardValue = cardValue;
        this.cardSuit = cardSuit;

    }

    public int getPoints(CardValue cardValue) {
        points = cardValue.getCardValue();
        return points;
    }

    @Override
    public String toString() {
        return "[ " + cardValue +  cardSuit + " ]";
    }
}
