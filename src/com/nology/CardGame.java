package com.nology;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CardGame {
    public ArrayList<Card> deckOfcards = new ArrayList<Card>();
    public String name;


    public CardGame(ArrayList<Card> deckOfcards, String name) {
        this.deckOfcards = deckOfcards;
        this.name = name;
    }

    public CardGame() {

    }

    public ArrayList<Card> getDeckOfcards() {
        return deckOfcards;
    }

    public void getcards() {

        String[] symbol = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        for (int i = 0; i < 13; i++) {
            deckOfcards.add(new Card("\u2660",symbol[i],i+2));
            deckOfcards.add(new Card("\u2665",symbol[i],i+2));
            deckOfcards.add(new Card("\u2663",symbol[i],i+2));
            deckOfcards.add(new Card("\u2666",symbol[i],i+2));
        }
    }


    public Card dealCard(ArrayList<Card> deckOfcards ) {

        Card dealtCard = deckOfcards.get(0);
        deckOfcards.remove(0);
        return dealtCard;
    }

    public ArrayList<Card> sortDeckInNumberOrder() {
        ArrayList<Card> collect = (ArrayList<Card>) deckOfcards.stream()
                .sorted(Comparator.comparing(Card::getValue)).collect(Collectors.toList());

        collect.forEach(System.out::println);


        return collect;
    }

    public ArrayList<Card> sortDeckBySuit() {

         Comparator <Card> sorted = Comparator.comparing(Card::getSuit).
                 thenComparing(Card::getValue).
                 thenComparing(Card::getSymbol);

        Collections.sort(deckOfcards, sorted);

        deckOfcards.forEach(System.out::println);

        return deckOfcards;
    }


    public  ArrayList<Card> shuffle(ArrayList<Card> deckOfcards) {
        // create temporary storage while shuffling
        ArrayList<Card> temp = new ArrayList<Card>();

        while(!deckOfcards.isEmpty()) {
            // randomiser
            int location =(int)(Math.random()* deckOfcards.size());
            // add card to temp
            temp.add(deckOfcards.get(location));
            // remove card from deck
            deckOfcards.remove(location);
        }
        // restore data in deck
        deckOfcards=temp;
//        deckOfcards.forEach(System.out::println);
        return deckOfcards;
    }



}
