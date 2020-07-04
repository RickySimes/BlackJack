package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.util.ArrayList;

public class Game {
    private Dealer dealer;
    private ArrayList<Player> players;
    public Game(Dealer dealer){
        this.dealer = dealer;
    }

    public void start(Prompt prompt){
        String[] menuOptions = {};
        MenuInputScanner menuInputScanner = new MenuInputScanner(menuOptions);
    }
    public void addPlayer(Player player){
        players.add(player);
    }
}
