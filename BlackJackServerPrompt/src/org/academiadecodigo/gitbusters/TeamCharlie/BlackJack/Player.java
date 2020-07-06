package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

import org.academiadecodigo.gitbusters.TeamCharlie.BlackJack.Hand;

import java.io.IOException;
import java.net.Socket;

public class Player {

    private boolean busting;
    private Hand hand;
    private String name;
    private Socket clientSocket;
    private boolean stay;
    private boolean asplayed;

    public Player(String name,Socket clientSocket){
        this.name = name;
        this.clientSocket = clientSocket;
        hand = new Hand();
    }

    public Socket getClientSocket() {
        return clientSocket;
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

    public boolean isStay() {
        return stay;
    }

    public void setStay(boolean stay) {
        this.stay = stay;
    }

    public void closeClientSocket() throws IOException {
        clientSocket.close();
    }

    public void setAsplayed(boolean asplayed) {
        this.asplayed = asplayed;
    }

    public boolean getPlayed(){
        return asplayed;
    }

    @Override
    public String toString() {
        return name;
    }
}
