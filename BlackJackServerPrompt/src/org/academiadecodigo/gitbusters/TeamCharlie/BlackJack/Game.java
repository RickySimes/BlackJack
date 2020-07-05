package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;

public class Game {
    private Dealer dealer;
    private ArrayList<Player> players;


    public Game(Dealer dealer) {
        this.dealer = dealer;
        players = new ArrayList<>();

    }


    public void start(Prompt prompt, Player player1, PrintStream printStream) {


        for (Player player : players) {

            if (player.getHand().getStartHand().size() >= 2) {
                continue;
            }

            dealer.dealCards(player.getHand());

            printStream.println(player1.getHand());
        }


        while (!player1.isStay()) {


            String[] menuOptions = {"Hit", "Stay.", "View all players hands", "Quit Game"};
            MenuInputScanner menuInputScanner = new MenuInputScanner(menuOptions);
            menuInputScanner.setMessage("Choose what you wanna do.");
            int menuOption = prompt.getUserInput(menuInputScanner);

            switch (menuOption) {
                case 1:
                    dealer.hitCard(player1.getHand());
                    //Ascii Hand
                    printStream.println("\n               __             \n         _..-\'\'--\'----_.      \n       ,\'\'.-\'\'| .---/ _`-._   \n     ,\' \\ \\  ;| | ,/ / `-._`-.\n   ,\' ,\',\\ \\( | |// /,-._  / /\n   ;.`. `,\\ \\`| |/ / |   )/ / \n  / /`_`.\\_\\ \\| /_.-.\'-\'\'/ /  \n / /_|_:.`. \\ |;\'`..\')  / /   \n `-._`-._`.`.;`.\\  ,\'  / /    \n     `-._`.`/    ,\'-._/ /     \n       : `-/     \\`-.._/      \n       |  :      ;._ (        \n       :  |      \\  ` \\       \n        \\         \\   |       \n         :        :   ;       \n         |           /        \n         ;         ,\'         \n        /         /           \n       /         /            \n                /             \n");
                    printStream.println(player1.getHand());
                    break;

                case 2:
                    player1.setStay(true);
                    break;

                case 3:
                    //Show dealer Hand
                    printStream.println("DEALER ---> " + dealer.getHand() + "\n");
                    for (Player players : players) {
                        if (players == player1) {
                            //Show my Hand
                            printStream.println("My Hand ---> " + players.getHand() + "\n");
                            continue;
                        }
                        printStream.println(players.getName() + " ---> " + players.getHand() + "\n");
                    }
                    break;
                    
                case 4:
                    players.remove(player1);
                    try {
                        player1.closeClientSocket();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

            }
        }

    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
