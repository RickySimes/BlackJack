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

    public void removeCard(Card c) {
        hand.remove(c);
    }

    public Card getCard(int position) {
        return (Card)hand.get(position);
    }

    public int getCardCount() {
        return hand.size();
    }

    public String getHand(){
        StringBuilder stringBuilder = new StringBuilder();

        for (Card card : hand){
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
