package org.academiadecodigo.gitbusters.TeamCharlie.Server;

import org.academiadecodigo.gitbusters.TeamCharlie.BlackJack.CardDeck;
import org.academiadecodigo.gitbusters.TeamCharlie.BlackJack.Dealer;
import org.academiadecodigo.gitbusters.TeamCharlie.BlackJack.Game;

public class Main {
    public static void main(String[] args) {


        int port = ChatServer.DEFAULT_PORT;
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer(cd);


            Game game = new Game(dealer);
            ChatServer chatServer = new ChatServer(game);
            chatServer.start(port);


    }

}
