package com.company;

import java.util.Random;

public class Deck {

    int count = 0;
    Card[] deck = new Card[52];
    public Deck(int numDecks){
        Card[] deck = new Card[52*numDecks];

        for(int j = 0; j < numDecks; j++){
            for(int i = 2; i < 15; i++){
                deck[count] = new Card( 'H',  i);
                System.out.println(deck[count]);

                count++;
            }
            for(int i = 2; i < 15; i++){
                deck[count] = new Card( 'D',  i);
                System.out.println(deck[count]);

                count++;
            }
            for(int i = 2; i < 15; i++){
                deck[count] = new Card( 'S',  i);
                System.out.println(deck[count]);

                count++;
            }
            for(int i = 2; i < 15; i++){
                deck[count] = new Card( 'C',  i);
                System.out.println(deck[count]);

                count++;
            }
        }
    }

    public Card randomCard() {
        Random randomCard = new Random();
        int cardIndex = randomCard.nextInt(deck.length);
        return deck[cardIndex];
    }
}
