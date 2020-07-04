package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {

    private List<Card> cards;
    private int cardsUsed;
    private int numberOfCards;

    public CardDeck() {
        cards = new ArrayList<>(getNumberOfCards((int) (Math.random() * 3)));

        for (Suit suits : Suit.values() ) {
            for ( CardValue cardValue: CardValue.values()) {
                cards.add(new Card(cardValue, suits));
                System.out.println(cards);
            }

        }

    }


    public int getNumberOfCards(int decks) {
        return (52 * decks);
    }


//    public void shuffle() {
//        //try looping over every card in deck, and then select random card to swap with
//        for (int i = cards.length - 1; i > 0; i--) {
//            int index = (int) (52 * Math.random());
//            Card tmp = cards[i];
//            cards[i] = cards[index];
//            cards[index] = tmp;
//        }
//        cardsUsed = 0;
//    }

//    public Card dealCard() {
//		/*involve dealing the "top" card from deck, keep track of cardsUsed
//		and incrememnt it everytime you deal a card, and make it so 'top'
//		of deck can be called with deck[cardsUsed]
//		*/
//        Card card = cards[cardsUsed];
//        cardsUsed++;
//        return card;
//
//    }







}
