package com.nology;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Snap extends CardGame {

    private Scanner keyboard = new Scanner(System.in);
    private String winner;

    public Snap(ArrayList<Card> deckOfcards, String name, Scanner keyboard, String winner) {
        super(deckOfcards, name);
        this.keyboard = keyboard;
        this.winner = winner;
    }

    public Snap(Scanner keyboard, String winner) {
        this.keyboard = keyboard;
        this.winner = winner;
    }

    public Snap() {

    }

    public String getwinner() {
        return winner;
    }

    public void playGame(){

      // create two decks
        getcards();
        ArrayList<Card> deck1 = new ArrayList<>(getDeckOfcards());
      //  ArrayList<Card> deck2 = new ArrayList<>(getDeckOfcards());
     // shuffle through them
        ArrayList<Card> ShuffledDeck1 =new ArrayList<>(shuffle(deck1));
     //   ArrayList<Card> ShuffledDeck2 = shuffle(deck2);

    // if press enter: pick a card from Deck 1;

        RunSnap(ShuffledDeck1);
    }


    public void RunSnap (ArrayList<Card> ShuffledDeck1){

        System.out.println("Press the enter key");
        String InputString = keyboard.nextLine();

        while(InputString!=null) {
            System.out.println(InputString);

            if (InputString.isEmpty()) {
                System.out.println("Your have picked a Card");
                String First = dealCard(ShuffledDeck1).getSymbol();
                System.out.println(First);
                System.out.println(" ");
                System.out.println("Press the enter key");
                System.out.println("Your have picked a Card");
                String Second = dealCard(ShuffledDeck1).getSymbol();
                System.out.println(Second);
                System.out.println(" ");

               if(First.equals(Second)) {
                   System.out.println("You win");
                   keyboard.close();
               } else {
                   RunSnap(ShuffledDeck1);
               }
            }
            if (keyboard.hasNextLine()) {
                InputString = keyboard.nextLine();
            } else {
                InputString = null;
            }
        }

    }

}
