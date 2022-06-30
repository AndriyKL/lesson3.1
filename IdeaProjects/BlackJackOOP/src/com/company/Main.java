package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap <String, Integer> cardsValue = new HashMap<>();
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

        Deck deck = new Deck(1);
        Card card;
        card = new Card();

        System.out.println("\n"+card);
//
        Dealer dealer = new Dealer();
        dealer.getACard(card);
    }
}
