package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

public class CardDeck {

    private Card[] deck;
    private int cardsUsed;
///MAIN ESTÀ AQUI SÒ PARA TESTE
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
       cardDeck.shuffle();
        for(Card card: cardDeck.getDeck()){
            System.out.println(card);
            //System.out.println("value: " + card.getValue());
        }
    }


    public CardDeck() {
        deck = new Card[52];
        int cardsUsed = 0;
        int cardCount = 0;

        //for loops to create all 52 cards and load them into 52 slots in deck array
        for(int suit = 0; suit <= 3; suit++) {
            for(int value = 1; value <= 13; value++) {
                deck[cardCount] = new Card(value,suit);
                cardCount++;
            }
        }
    }

    public void shuffle() {
        //try looping over every card in deck, and then select random card to swap with
        for(int i = deck.length-1; i > 0; i--) {
            int index = (int)(52*Math.random());
            Card tmp = deck[i];
            deck[i] = deck[index];
            deck[index] = tmp;
        }
        cardsUsed = 0;
    }

    public Card dealCard() {
		/*involve dealing the "top" card from deck, keep track of cardsUsed
		and incrememnt it everytime you deal a card, and make it so 'top'
		of deck can be called with deck[cardsUsed]
		*/
        Card card = deck[cardsUsed];
        cardsUsed++;
        return card;

    }

    public int cardsLeft() {
        return deck.length - cardsUsed;
    }


    public Card[] getDeck() {
        return deck;
    }


}
