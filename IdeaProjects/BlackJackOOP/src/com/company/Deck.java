package com.company;

import java.util.HashMap;
import java.util.Hashtable;

public class Deck {

    String[] deck1 = {"2","2","2","2","3","3","3","3","4","4","4","4","5","5","5","5","6","6","6","6","7","7","7","7","8","8","8","8","9","9","9","9","10","10","10","10","J","J","J","J","Q","Q","Q","Q","K","K","K","K","A","A","A","A"};
    int count = 0;
    static String[] refreshedDeck;

    public Deck(int numDeck) {

        String[] deck = new String[deck1.length*numDeck]; //deck XY


        for(int i = 1; i <= numDeck; i++){ //Y
            for(int j = 0; j < deck1.length; j++){ //X
                deck[count] = deck1[j];
                count++;
            }
        }

        refreshedDeck = deck;
    }

    public Deck() {

    }

    public void createDeck() {


    }
}
