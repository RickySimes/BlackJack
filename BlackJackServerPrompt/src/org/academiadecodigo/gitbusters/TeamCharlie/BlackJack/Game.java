package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Game {
    private Dealer dealer;
    private ArrayList<Player> players;
    private boolean isRunning;


    public Game(Dealer dealer) {
        this.dealer = dealer;
        players = new ArrayList<>();

    }

    public void gameMenu(Prompt prompt, Player player1, PrintStream printStream) {

        String[] menuOptions = {"Hit.", "Stay.", "View all players hands.", "Quit Game."};
        MenuInputScanner menuInputScanner = new MenuInputScanner(menuOptions);
        menuInputScanner.setMessage("Choose what you wanna do.");
        int menuOption = prompt.getUserInput(menuInputScanner);

        switch (menuOption) {
            case 1:
                dealer.hitCard(player1.getHand());
                //Ascii Hand
                printStream.println(player1.getHand());

                break;

            case 2:
                player1.setStay(true);
                dealer.dealerPlay();
                checkResult(player1, printStream);
                playAgain(prompt, player1, printStream);
                break;

            case 3:
                //Show dealer Hand
                printStream.println("DEALER ---> " + dealer.getHand() + "\n");
                for (Player players : players) {
                    if (players == player1) {
                        //Show my Hand
                        printStream.println("Your Hand ---> " + players.getHand() + "\n");
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

    public void playAgain(Prompt prompt, Player player1, PrintStream printStream) {

        String[] menuOptions = {"Play again.", "Quit Game."};
        MenuInputScanner menuInputScanner = new MenuInputScanner(menuOptions);
        menuInputScanner.setMessage("Choose what you wanna do.");
        int menuOption = prompt.getUserInput(menuInputScanner);

        switch (menuOption) {
            case 1:
                for (Player player : players) {
                    player.getHand().clear();
                }
                dealer.getHand().clear();
                dealer.hitCard(dealer.getHand());
                start(prompt, player1, printStream);
                break;
            case 2:
                try {
                    player1.closeClientSocket();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                players.remove(player1);
                break;

        }
    }


    public void start(Prompt prompt, Player player1, PrintStream printStream) {

        for (Player player : players) {

            if (player.getHand().getStartHand().size() >= 2) {
                continue;
            }

            dealer.dealCards(player.getHand());


            printStream.println(player1.getHand());
        }

        isRunning = true;


        while (!player1.isStay() || !player1.getBusting()) {


            if (player1.getHand().getHandPoints() > 21) {
                player1.setBusting(true);
                printStream.println("explosão em ascii");
                playAgain(prompt, player1, printStream);
                break;
            }

            if (player1.getHand().getHandPoints() == 21 && player1.getHand().getStartHand().size() == 2) {
                printStream.println("YOU GOT BLACK JACK");
                player1.setStay(true);
                break;
            }

            if (player1.getHand().getHandPoints() == 21) {
                printStream.println("YOU GOT MAX POINTS");
                player1.setStay(true);
                break;
            }

            checkPlayers();
            gameMenu(prompt, player1, printStream);

        }
        checkResult(player1, printStream);


        playAgain(prompt, player1, printStream);


    }
    public void checkResult( Player player1,PrintStream printStream ){
        int counter = 0;

        for (Player player : players) {
            if (player.isStay() || player.getBusting()) {
                counter++;

            }
        }

        if (counter == players.size()) {
            dealer.dealerPlay();
        }

        if (dealer.getBusting()) {
            for (Player player : players) {
                if (player.getBusting()) {
                    continue;
                }
                printStream.println("Dealer's Hand: \n" + dealer.getHand() + "\n Your Hand: \n" + player1.getHand() + "Dealer Busted, YOU WIN! \n");
            }

        } else if (dealer.getHand().getHandPoints() < player1.getHand().getHandPoints() && !player1.getBusting()) {
            printStream.println("Dealer's Hand: \n" + dealer.getHand() + "\n Your Hand: \n" + player1.getHand() + "YOU WIN \n");

        } else if (dealer.getHand().getHandPoints() > player1.getHand().getHandPoints() && !player1.getBusting()) {
            printStream.println("Dealer's Hand: \n" + dealer.getHand() + "\n Your Hand: \n" + player1.getHand() + "YOU LOST \n");

        } else if (dealer.getHand().getHandPoints() == player1.getHand().getHandPoints()) {
            printStream.println("Dealer's Hand: \n" + dealer.getHand() + "\n Your Hand: \n" + player1.getHand() + "IT'S A TIE \n");
        }
    }

    public void checkPlayers(){
        if (players.size() == 0){
            isRunning = false;
        }
    }


    public boolean isRunning() {
        return isRunning;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

}



