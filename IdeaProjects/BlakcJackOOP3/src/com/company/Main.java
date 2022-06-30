package com.company;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck(1);
        Player[] players = new Player[2];

        for(int i = 0; i < players.length; i++){
            for(int j = 0; j < 2; j++){
                players[i].takeCard(deck.randomCard());
            }
        }

    }
}
