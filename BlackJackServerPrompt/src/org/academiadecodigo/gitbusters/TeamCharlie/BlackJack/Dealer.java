package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

public class Dealer {

    private CardDeck cardDeck;
    private boolean busting;
    private Hand hand;

    public Dealer(CardDeck cardDeck) {
        this.hand = new Hand();
        this.cardDeck = cardDeck;

    }

    public void dealCards(Hand hand) {
        hand.addCard(cardDeck.dealCard());
        hand.addCard(cardDeck.dealCard());
    }

    public void hitCard(Hand hand) {
        hand.addCard(cardDeck.dealCard());
    }

    public void setBusting(boolean busting) {
        this.busting = busting;
    }

    public boolean getBusting() {
        return busting;
    }
}