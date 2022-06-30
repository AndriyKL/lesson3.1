package com.company;

import java.util.*;



//// creating a My HashTable Dictionary
//        Hashtable<String, String> my_dict = new Hashtable<String, String>();
//
//        // Using a few dictionary Class methods
//        // using put method
//        my_dict.put("10", "Banana");
//
//        // using get() method
//        System.out.println("Value at key = 10 : " + my_dict.get("10"));
//
//
//        // using isEmpty() method
//        System.out.println("Is my dictionary empty? : " + my_dict.isEmpty() + "\n");
//
//        // using remove() method
//        // remove value at key 10
//        my_dict.remove("10");
//        System.out.println("Checking if the removed value exists: " + my_dict.get("10"));
//        System.out.println("Size of my_dict : " + my_dict.size());

public class Main {

    public static void main(String[] args) {

        Hashtable<String, Integer> cardsValue = new Hashtable<String, Integer>();
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

        String[] deck = {"2","2","2","2","3","3","3","3","4","4","4","4","5","5","5","5","6","6","6","6","7","7","7","7","8","8","8","8","9","9","9","9","10","10","10","10","J","J","J","J","Q","Q","Q","Q","K","K","K","K","A","A","A","A",};

        String[] cardsDealer = {"0","0","0","0","0","0","0","0","0"};
        String[] cardsPlayer = {"0","0","0","0","0","0","0","0","0"};

        int playerAces = 0;
        int dealerAces = 0;

        int playerWins = 0;
        int dealerWins = 0;

        boolean playerStatus = true;
        boolean dealerStatus = true;
        String cardA;
        String cardB;
        String cardC;
        List<String> list = new ArrayList<>(Arrays.asList(deck));

        int[] playersWins = new int[8];
        int[] playersPoints = new int[8];
//        // CHOOSING CARDS FOR DEALER
//
        cardA = getRandom(deck);
        list.remove(cardA);
        deck = list.toArray(new String[list.size()]);
        System.out.println(cardA);
        cardsDealer[0] = cardA;

        cardB = getRandom(deck);
        list.remove(cardB);
        deck = list.toArray(new String[list.size()]);
        System.out.println(cardB);
        cardsDealer[1] = cardB;

        if(cardA == "A") {
            dealerAces++;
        }
        if(cardB == "A") {
            dealerAces++;
        }

        System.out.println("Dealer`s cards:"+ cardA + ", " + cardB);
        int dealerSum = cardsValue.get(cardA) + cardsValue.get(cardB);
        System.out.println("Dealer`s points:"+ dealerSum);

        // CHOOSING CARDS FOR PLAYER


            cardA = getRandom(deck);
            list.remove(cardA);
            deck = list.toArray(new String[list.size()]);
            System.out.println(cardA);;
            cardsPlayer[0] = cardA;

            cardB = getRandom(deck);
            list.remove(cardB);
            deck = list.toArray(new String[list.size()]);
            System.out.println(cardB);
            cardsPlayer[1] = cardB;

            if(cardA == "A") {
                playerAces++;
            }
            if(cardB == "A") {
                playerAces++;
            }

            System.out.println("Player`s cards:"+ cardA + ", " + cardB);
            int playerSum = cardsValue.get(cardA) + cardsValue.get(cardB);
            System.out.println("Player`s points:"+ playerSum);


        // ASKING PLAYER FOR ACTION

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < deck.length; i++) {

                if(playerSum > 21) {
                    System.out.println("Player eliminated");
                    playerStatus = false;
                    break;
                }

            System.out.println("What`s your next action? (draw/stand)");
            String action = scanner.nextLine();
            System.out.println(action);

            //STAND
            if (action.equals("stand")) {
                break;

            //DRAW
            } else if(action.equals("draw")) {

                playerSum = playerSum - 10*playerAces;
                playerAces = 0;

                cardC = getRandom(deck);
                list.remove(cardC);
                deck = list.toArray(new String[list.size()]);
                System.out.println(cardC);

                if(cardC == "A") {
                    playerSum = playerSum - 10;
                }

                System.out.println("Player`s cards: ");
                for(int j = 0; j < cardsPlayer.length; j++){
                    if(Objects.equals(cardsPlayer[j], "0")){
                        cardsPlayer[j] = cardC;
                        System.out.println(cardsPlayer[j]);
                        break;
                    }
                        System.out.print(cardsPlayer[j]+ ", ");
                }

                playerSum = playerSum + cardsValue.get(cardC);
                System.out.println("Player`s points:"+ playerSum);

            } else {
                System.out.println("You chose the wrong command. Try again");
            }

        }



        if(!playerStatus){
            System.out.println("Dealer is the winner!");
        } else {
            for(int i = 0; dealerSum < 16; i++){

                dealerSum = dealerSum - 10*dealerAces;
                dealerAces = 0;

                    cardC = getRandom(deck);
                list.remove(cardC);
                deck = list.toArray(new String[list.size()]);
                System.out.println(cardC);
                if(cardC == "A") {
                    dealerSum = dealerSum - 10;
                }

                System.out.println("Dealer`s cards: ");
                for (int j = 0; j < cardsDealer.length; j++) {
                    if (Objects.equals(cardsDealer[j], "0")) {
                        cardsDealer[j] = cardC;
                        System.out.println(cardsDealer[j]);
                        break;
                    }
                    System.out.print(cardsDealer[j] + ", ");
                }

                dealerSum = dealerSum + cardsValue.get(cardC);
                System.out.println("Dealer`s points:" + dealerSum);
            }
            if(dealerSum > 21){
                dealerStatus = false;
                System.out.println("player is a winner!");
            } else {
                if(dealerSum > playerSum){
                    playerStatus = false;
                    System.out.println("Dealer is a winner");
                } else if(dealerSum < playerSum){
                    dealerStatus = false;
                    System.out.println("Player is a winner");
                } else {
                    System.out.println("Draw!");
                }
            }
        }


    }
    public static String getRandom(String[] array) {
        int cardRandom = new Random().nextInt(array.length);
        return array[cardRandom];

    }
}
