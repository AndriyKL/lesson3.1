package com.company;

import java.util.Scanner;

public class GameProcess {

    Scanner playerNum = new Scanner(System.in);
    Deck deck = new Deck();
    Dealer dealer = new Dealer();
    public GameProcess() {
        System.out.println("How many players in game? (1-9)");
        int playerCount = Integer.parseInt(playerNum.nextLine());
        Player[] players = new Player[playerCount];
        System.out.println(players);
        giveFirstCards(players);

    }

    public void giveFirstCards(Player[] players){
        for (int i = 0; i < 2; i++) {
            for (int j =0; j < players.length; j++) {

                players[i].addCard(deck.ChooseAndRemoveCard());

            }

            dealer.addCard(deck.ChooseAndRemoveCard());
        }
    }
}
