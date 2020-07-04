package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

import org.academiadecodigo.gitbusters.TeamCharlie.BlackJack.Card;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<>();
    }

    public void addCard(Card c) {
        hand.add(c);
    }


    public int getHandPoints() {

        int result = 0;

        for (Card cards : hand) {

            result += cards.getPoints();
        }

        return result;
    }

    public String getHand() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Card card : hand) {
            stringBuilder.append(card);
        }
        return stringBuilder.toString();
    }

    public void clear() {
        hand.clear();
    }

    @Override
    public String toString() {
        return getHand();
    }
}
