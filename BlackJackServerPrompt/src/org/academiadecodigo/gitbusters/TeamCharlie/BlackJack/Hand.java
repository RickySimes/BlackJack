package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;

    //added Stay property
    private boolean stay;
    //
    private boolean haveAce = false;
    private String aceMsg = "";

    public Hand() {
        hand = new ArrayList<>();
    }

    public void addCard(Card c) {
        //if(!stay) {
            hand.add(c);
        //}
    }

    public int getAceValue() {
        int numCards = hand.size();
        int val = 0;

        for(int i = 0; i < numCards; i++) {
            Card card = hand.get(i);
            int cardVal = card.getPoints();

            if(cardVal == 1) {
                haveAce = true;
                aceMsg = "Ace is 1";
            }
            val  += cardVal;

        }

        if(haveAce && (val + 10 <= 21)) {
            val += 10;
            aceMsg = "Ace is 11";
        }

        return val;
    }

    public int getHandPoints() {

        int result = 0;

        for (Card cards : hand) {

            result += cards.getPoints();
        }

        return result;
    }

    public ArrayList<Card> getStartHand(){
        return hand;
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

    public void setStay(boolean stay) {
        this.stay = stay;
    }

    public Card getFirstCard(){
        return hand.get(0);
    }

    @Override
    public String toString() {
        //Add Total Points
        return "\n" + getHand() + "   Total :" + getAceValue() + "\n";
    }
}
