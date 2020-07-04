package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

public class BlackjackHand extends Hand {

    public BlackjackHand() {
        super();
    }

    public int getBlackjackValue() {
        int numCards = getCardCount();
        int val = 0;
        boolean haveAce = false;

        for(int i = 0; i < numCards; i++) {
            Card card = getCard(i);
            int cardVal = card.getValue();
            if(cardVal > 10) {
                cardVal = 10;
            }
            else if(cardVal == 1) {
                haveAce = true;
            }
            val = val + cardVal;
        }

        if(haveAce && (val + 10 <= 21)) {
            val = val + 10;
        }

        return val;
    }
}
