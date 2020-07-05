package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

public class Dealer {

    private CardDeck cardDeck;
    private boolean busting;
    private Hand hand;

    public Dealer(CardDeck cardDeck) {
        this.hand = new Hand();
        this.cardDeck = cardDeck;
        //dar carta ao dealer
        hitCard(this.hand);
    }

    public void dealCards(Hand hand) {
        hand.addCard(cardDeck.dealCard());
        hand.addCard(cardDeck.dealCard());
    }

    public void dealerPlay(){
        while (hand.getHandPoints() < 17){
            hitCard(hand);
            if (hand.getHandPoints() > 21){
                setBusting(true);
            }
        }
    }


    public Hand getHand() {
        return hand;
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
