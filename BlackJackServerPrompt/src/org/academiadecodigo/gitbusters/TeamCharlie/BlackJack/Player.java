package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

import org.academiadecodigo.gitbusters.TeamCharlie.BlackJack.Hand;

import java.io.IOException;
import java.net.Socket;

public class Player {

    private boolean busting;
    private Hand hand;
    private String name;
    private Socket clientSocket;

    public Player(String name,Socket clientSocket){
        //this.hand = hand;
        this.name = name;
        this.clientSocket = clientSocket;
        hand = new Hand();
    }

    public void setBusting(boolean busting) {
        this.busting = busting;
    }

    public boolean getBusting(){
        return busting;
    }

    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public void closeClientSocket() throws IOException {
        clientSocket.close();
    }

    @Override
    public String toString() {
        return name;
    }
}
