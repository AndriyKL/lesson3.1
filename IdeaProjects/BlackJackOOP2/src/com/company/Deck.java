package com.company;

import java.util.*;

public class Deck {

    Card[] startingDeck = new Card[52];
    int count = 0;

    public Deck(){
        for(int i = 2; i < 15; i++){
            startingDeck[count] = new Card( 'H',  i);
            System.out.println(startingDeck[count]);

            count++;
        }
        for(int i = 2; i < 15; i++){
            startingDeck[count] = new Card( 'D',  i);
            System.out.println(startingDeck[count]);

            count++;
        }
        for(int i = 2; i < 15; i++){
            startingDeck[count] = new Card( 'S',  i);
            System.out.println(startingDeck[count]);

            count++;
        }
        for(int i = 2; i < 15; i++){
            startingDeck[count] = new Card( 'C',  i);
            System.out.println(startingDeck[count]);

            count++;
        }
    }

    public Card ChooseAndRemoveCard() {
        int index = new Random().nextInt(startingDeck.length);
        Card chosenCard = startingDeck[index];
//        startingDeck.remove(index);
//        startingDeck.remove(index);
        System.out.println(chosenCard);
        return chosenCard;
    }

}
