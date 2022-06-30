package com.company;

public class Card {

    private char suit = ' ';
    private int value = 0;
    String suitValue;
    int numValue;
    public Card(char suit, int value) {
        this.value = value;
        this.suit = suit;
    }

    public String toString() {
        return getSuitValue() + " " + this.value;
    }

    public String getSuitValue() {
        if(this.suit == 'H') {
            suitValue = "Hearts";
        } else if(this.suit == 'D'){
            suitValue = "Diamonds";
        } else if(this.suit == 'S'){
            suitValue = "Spades";
        } else if(this.suit == 'C'){
            suitValue = "Clubs";
        } else {
            suitValue = "wrong card";
        }
        return suitValue;
    }

    public int getNumValue() {
        if(this.value == 11 ||this.value == 12 || this.value == 13 || this.value == 14){
            numValue = 10;
        } else if( this.value == 15) {
            numValue = 11;
        } else {
            numValue = this.value;
        }
        return numValue;
    }



}
