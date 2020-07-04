package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

public class Dealer {

    private boolean busting;
    Hand hand;

    public Dealer(Hand hand){
        this.hand = hand;
    }

    public void setBusting(boolean busting) {
        this.busting = busting;
    }

    public boolean getBusting(){
        return busting;
    }
}
