package com.company;
import java.util.*;

public class Player {
    List<Card> playerCards = new ArrayList<>();

    int playerPoints = 0;

    public void addCard(Card card) {
        this.playerCards.add(card);
    }

}
