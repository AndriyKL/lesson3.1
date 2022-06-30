package com.company;

import java.util.*;

public class Card extends Deck {


    HashMap <String, Integer> cardsValue = new HashMap<>();
    List<String> list = new ArrayList<>(Arrays.asList(refreshedDeck));
    String card;

    public Card() {
        card = getRandom(refreshedDeck);

        list.remove(card);
        refreshedDeck = list.toArray(new String[list.size()]);


        for(int i = 0; i < refreshedDeck.length; i++) {
            System.out.print(refreshedDeck[i] + ", ");
        }
    }

    public String toString() {
        return card;
    }

    public static String getRandom(String[] array) {
        int cardRandom = new Random().nextInt(array.length);
        return array[cardRandom];

    }



    public int getValue() {
        cardsValue.put("0", 0);
        cardsValue.put("2", 2);
        cardsValue.put("3", 3);
        cardsValue.put("4", 4);
        cardsValue.put("5", 5);
        cardsValue.put("6", 6);
        cardsValue.put("7", 7);
        cardsValue.put("8", 8);
        cardsValue.put("9", 9);
        cardsValue.put("10", 10);
        cardsValue.put("J", 10);
        cardsValue.put("Q", 10);
        cardsValue.put("K", 10);
        cardsValue.put("A", 11);
        return 0;
    }
}


