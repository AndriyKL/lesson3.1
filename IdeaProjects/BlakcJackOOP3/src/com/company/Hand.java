package com.company;

public class Hand {

    private Card[] playerHand = new Card[12];
    int numCards = 0;

    public void takeCard(Card card) {
        playerHand[numCards] = card;
        numCards++;
    }

    public int calculateSum(){
            int sum = 0;
            for(int i = 0; i < numCards; i++){
            sum = sum +  playerHand[i].getValue();
            }
        return sum;
    }

    public void clearHand() {
        numCards = 0;
    }


}
