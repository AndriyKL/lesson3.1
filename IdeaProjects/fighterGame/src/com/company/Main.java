package com.company;

public class Main {

    public static void main(String[] args) {

        Mage character1 = new Mage();

        Hunter character2 = new Hunter();

        int i = 1;
        while(character1.gethPoints() > 0 && character2.gethPoints() > 0) {
            System.out.println("Round: " + i);
            character2.sethPoints(character2.gethPoints() - character1.attack());

            if(character2.gethPoints() <= 0) {
                System.out.println("Player 1 wins the game");
                break;
            } else {
                System.out.println(character2);
            }

            character1.sethPoints(character1.gethPoints() - character2.attack());

            if(character1.gethPoints() <= 0) {
                System.out.println("Player 2 wins the game");
                break;
            } else {
                System.out.println(character1);
            }
            i++;
        }

    }
}
