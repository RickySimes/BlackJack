package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

public class Dealer {

    private CardDeck cardDeck;
    private boolean busting;
    private Hand hand;
    private boolean asplayed;


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

    public void setAsplayed(boolean asplayed) {
        this.asplayed = asplayed;
    }

    public boolean getPlayed(){
        return asplayed;
    }
    public void clear() {
        hand.clear();
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
