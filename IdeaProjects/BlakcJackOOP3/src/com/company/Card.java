package com.company;

public class Card {

    private char suit = ' ';
    private int value = 0;
    String fullSuit;
    int gameValue;
    String gameCard;

    public Card(char suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        if(this.suit == 'H') {
            fullSuit = "Hearts";
        } else if(this.suit == 'D'){
            fullSuit = "Diamonds";
        } else if(this.suit == 'S'){
            fullSuit = "Spades";
        } else if(this.suit == 'C'){
            fullSuit = "Clubs";
        } else {
            fullSuit = "wrong card";
        }

        return fullSuit;
    }

    public String getGameCard() {

        if(this.value == 2){
            gameCard = "2";
        } else if(this.value == 3){
            gameCard = "3";
        } else if(this.value == 4){
            gameCard = "4";
        } else if(this.value == 5){
            gameCard = "5";
        } else if(this.value == 6){
            gameCard = "6";
        } else if(this.value == 7){
            gameCard = "7";
        } else if(this.value == 8){
            gameCard = "8";
        } else if(this.value == 9){
            gameCard = "9";
        } else if(this.value == 10){
            gameCard = "10";
        } else if(this.value == 11){
            gameCard = "J";
        } else if(this.value == 12){
            gameCard = "Q";
        } else if(this.value == 13){
            gameCard = "K";
        } else if(this.value == 14){
            gameCard = "A";
        }

        return gameCard;
    }

        public int getValue() {
            if(this.value == 11 ||this.value == 12 || this.value == 13 || this.value == 14){
                gameValue = 10;
            } else if( this.value == 15) {
                gameValue = 11;
            } else {
                gameValue = this.value;
            }
            return gameValue;
        }

    public String toString() {
        return getSuit() + " " + getGameCard();
    }
}
