package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {

    private List<Card> cards;
    private int cardsUsed;
    private static final int numberOfCards = 52;
    private int decks;


    public CardDeck() {

        decks = ((int) Math.ceil(Math.random() * 5));

        cards = new ArrayList<>();

        for (int i = 0; i <decks; i++) {

            for (Suit suits : Suit.values()) {
                for (CardValue cardValue : CardValue.values()) {
                    cards.add(new Card(cardValue, suits));
                }
            }

        }
       shuffle();
    }

    public int getDecks() {
        return decks;
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getNumberOfCards() {
        return cards.size();
    }


    public void shuffle() {
        //try looping over every card in deck, and then select random card to swap with
        Collections.shuffle(cards);
    }

    public Card dealCard() {
		/*involve dealing the "top" card from deck, keep track of cardsUsed
		and incrememnt it everytime you deal a card, and make it so 'top'
		of deck can be called with deck[cardsUsed]
		*/
        Card card = cards.get(0);
        cards.remove(0);
        return card;

    }


}
