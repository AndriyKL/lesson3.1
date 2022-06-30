package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Player {

    HashMap <String, Integer> cardsValue = new HashMap<>();
    boolean playerStatus = true;

    int playerPoints = 0;
    static int count = 0;

    List<Card> playerCards = new ArrayList<>();

    void getACard(Card card) {
        this.playerCards.add(card);
        count++;
        getHandValue();
    }

    public int getHandValue() {
        int sum = 0;
        for(Card card : this.playerCards) {
            sum += card.getValue();
        }
        return sum;
    }

    public int getVaue() {

        return 0;
    }

}
