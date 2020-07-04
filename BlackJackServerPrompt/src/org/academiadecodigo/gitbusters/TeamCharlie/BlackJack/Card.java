package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

public class Card {

    private int value;
    private int suit;

    private String asciiArt;
    private int Points;

    public Card(int val, int s) {
        value = val;
        suit = s;
    }

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

    public String getValueAsString() {
        if (value == 1) {
            return "Ace";
        }
        else if(value == 2) {
            return "2";
        }
        else if(value == 3) {
            return "3";
        }
        else if(value == 4) {
            return "4";
        }
        else if(value == 5) {
            return "5";
        }
        else if(value == 6) {
            return "6";
        }
        else if(value == 7) {
            return "7";
        }
        else if(value == 8) {
            return "8";
        }
        else if(value == 9) {
            return "9";
        }
        else if(value == 10) {
            return "10";
        }
        else if(value == 11) {
            value =10;
            return "Jack";
        }
        else if(value == 12) {
            value =10;
            return "Queen";
        }
        else if(value == 13) {
            value =10;
            return "King";
        }
        else {
            return "";
        }
    }

    public String getSuitAsString() {
        if(suit == 0) {
            return "Spades";
        }
        else if(suit == 1) {
            return "Hearts";
        }
        else if(suit == 2) {
            return "Diamonds";
        }
        else if(suit == 3) {
            return "Clubs";
        }
        else {
            return "";
        }
    }

    public String toString() {
        return getValueAsString() + getSuitAsString();
    }

}
