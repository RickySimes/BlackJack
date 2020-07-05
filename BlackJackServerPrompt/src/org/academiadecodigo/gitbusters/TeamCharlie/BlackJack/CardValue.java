package org.academiadecodigo.gitbusters.TeamCharlie.BlackJack;

public enum CardValue {

    A(1),
    K(10),
    Q(10),
    J(10),
    T(10),
    NINE(9),
    EIGHT(8),
    SEVEN(7),
    SIX(6),
    FIVE(5),
    FOUR(4),
    THREE(3),
    TWO(2);

    private int value;

    private CardValue(int value){
        this.value = value;
    }

    public int getCardValue(){
        return value;
    }

}
