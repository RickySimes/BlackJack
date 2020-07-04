package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

import org.academiadecodigo.gitbusters.TeamCharlie.BlackJack.Hand;

public class Player {

    private boolean busting;
    Hand hand;
    String name;




    public Player(Hand hand, String name){
        this.hand = hand;
        this.name = name;
    }

    public void setBusting(boolean busting) {
        this.busting = busting;
    }

    public boolean getBusting(){
        return busting;
    }



}
