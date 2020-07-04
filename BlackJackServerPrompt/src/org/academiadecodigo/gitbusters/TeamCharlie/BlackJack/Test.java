package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;


import java.util.Arrays;

public class Test {

    public static void main(String[] args) {


        //System.out.println(Arrays.toString(cv));

      CardDeck cd = new CardDeck();
        System.out.println(cd.dealCard());
        System.out.println(cd.getNumberOfCards());
        for (Card card: cd.getCards()) {
            System.out.println(card);
        }



    }
}
