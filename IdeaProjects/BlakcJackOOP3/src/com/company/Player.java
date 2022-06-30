package com.company;

public class Player {

    public int playerPoints = 0;
    public boolean playerStatus = true;

    public Player(boolean playerStatus) {
        this.playerStatus = playerStatus;
    }

    Hand hand = new Hand();

    public Player() {
        Hand hand = new Hand();
    }
    public int getSum() {
        return hand.calculateSum();
    }

    public void takeCard(Card card) {
        hand.takeCard(card);
    }

//    public String getHandString() {
//        String str = "Cards:" + hand.toString();
//
//        return str;
//    }

//    public void clearHand() {
//        hand.clearHand();
//    }

    public void loss(){
        this.playerStatus = false;
    }
    public void win(){
        this.playerStatus = true;
    }
}
