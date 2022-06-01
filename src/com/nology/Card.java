package com.nology;

public class Card {

    public String suit;
    public String symbol;
    public  int value;

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;

    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", symbol='" + symbol + '\'' +
                ", value=" + value +
                '}';
    }
}
