package com.company;

import java.util.*;




//// creating My HashTable Dictionary
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
        cardsValue.put("T", 10);
        cardsValue.put("J", 10);
        cardsValue.put("Q", 10);
        cardsValue.put("K", 10);
        cardsValue.put("A", 11);

        String[] deck = {"2","2","2","2","3","3","3","3","4","4","4","4","5","5","5","5","6","6","6","6","7","7","7","7","8","8","8","8","9","9","9","9","T","T","T","T","J","J","J","J","Q","Q","Q","Q","K","K","K","K","A","A","A","A",};

        String[] cardsDealer = {"0","0","0","0","0","0","0","0","0"};
        String[] playersCards = {"","","","","","","","",""};

        int dealerAces = 0;

        String cardA;
        String cardB;
        String cardC;

        List<String> list = new ArrayList<>(Arrays.asList(deck));


        //*************************************************

        Scanner players = new Scanner(System.in);
        int numPlayers;

        System.out.println("How many players in game? (1-9)");
        numPlayers = Integer.parseInt(players.nextLine());

        if(numPlayers >=1 && numPlayers <= 9){
            System.out.println("So, " + numPlayers +" players are playing...");

            //************GENERAL VARIABLES *******************

            int[] playersWins = new int[numPlayers];
            int[] playersPoints = new int[numPlayers];
            int[] playersAces = new int[numPlayers];
                /*
                If player`s status = 0 it means he`s still in the game
                If it = 1 - player got too much points or he has less than a dealer
                The ones who got to the end with 0 are the winners of the round
                 */
            int[] playersStatus = new int[numPlayers];



            //************************STARTING ROUND**************************
            for(int k = 1; k < 10; k++) {

                System.out.println("ROUND " + k);

                //*************CLEANING VARIABLES AFTER PREVIOUS ROUND*************
                for(int i = 0; i<numPlayers; i++){
                    deck = new String[]{"2", "2", "2", "2", "3", "3", "3", "3", "4", "4", "4", "4", "5", "5", "5", "5", "6", "6", "6", "6", "7", "7", "7", "7", "8", "8", "8", "8", "9", "9", "9", "9", "T", "T", "T", "T", "J", "J", "J", "J", "Q", "Q", "Q", "Q", "K", "K", "K", "K", "A", "A", "A", "A",};
                    cardsDealer = new String[]{"0", "0", "0", "0", "0", "0", "0", "0", "0"};
                    playersCards = new String[]{"", "", "", "", "", "", "", "", ""};
                    dealerAces = 0;
                    playersPoints[i] = 0;
                    playersAces[i] = 0;
                    playersStatus[i] = 0;
                }


                // *************CHOOSING CARDS FOR DEALER********************

                cardA = getRandom(deck);
                list.remove(cardA);
                deck = list.toArray(new String[list.size()]);
                System.out.println(cardA);
                cardsDealer[0] = cardA;
                if (cardA == "A") {
                    dealerAces++;
                }

                cardB = getRandom(deck);
                list.remove(cardB);
                deck = list.toArray(new String[list.size()]);
                System.out.println(cardB);
                cardsDealer[1] = cardB;
                if (cardB == "A") {
                    dealerAces++;
                }

                System.out.println("Dealer`s cards:" + cardA + ", " + cardB);
                int dealerSum = cardsValue.get(cardA) + cardsValue.get(cardB);
                System.out.println("Dealer`s points:" + dealerSum);

                // ************************CHOOSING CARDS FOR PLAYERS**************************


                for (int i = 0; i < numPlayers; i++) {

                    cardA = getRandom(deck);
                    list.remove(cardA);
                    deck = list.toArray(new String[list.size()]);
                    System.out.println(cardA);
                    ;
                    playersCards[i] = playersCards[i] + cardA;
                    if (cardA == "A") {
                        playersAces[i]++;
                    }

                    cardB = getRandom(deck);
                    list.remove(cardB);
                    deck = list.toArray(new String[list.size()]);
                    System.out.println(cardB);
                    if (cardB == "A") {
                        playersAces[i]++;
                    }

                    playersCards[i] = playersCards[i] + cardB;

                    System.out.print("Player" + (i + 1) + " cards: ");

                    for (int j = 0; j < playersCards[i].length(); j++) {

                        String card = String.valueOf(getCharFromString(playersCards[i], j));


                        System.out.print(card + " ");
                    }

                    System.out.println("");
                    playersPoints[i] = cardsValue.get(cardA) + cardsValue.get(cardB);
                    System.out.println("Player`s points: " + playersPoints[i]);
                }

                // *******************ASKING PLAYER FOR ACTION*********************

                Scanner scanner = new Scanner(System.in);

                for (int i = 0; i < numPlayers; i++) {
                    for (int j = 0; j < deck.length; j++) {

                        if (playersPoints[i] > 21) {
                            System.out.println("Player" + (i + 1) + " eliminated");
                            playersStatus[i] = 1;
                            break;
                        }

                        System.out.println("What`s your next action, player " + (i + 1) + "? (draw/stand)");
                        String action = scanner.nextLine();
                        System.out.println(action);

                        //***********************STAND********************

                        if (action.equals("stand")) {
                            break;

                            //***********************DRAW**********************

                        } else if (action.equals("draw")) {

                            cardC = getRandom(deck);
                            list.remove(cardC);
                            deck = list.toArray(new String[list.size()]);
                            System.out.println(cardC);
                            if (cardC == "A") {
                                playersAces[i]++;
                            }
                            playersCards[i] = playersCards[i] + cardC;

                            System.out.println("Player" + (i + 1) + "`s cards: ");

                            for (int q = 0; q < playersCards[i].length(); q++) {
                                String card = String.valueOf(getCharFromString(playersCards[i], q));
                                System.out.print(card + " ");
                            }

                            playersPoints[i] = playersPoints[i] + cardsValue.get(cardC);
                            playersPoints[i] = playersPoints[i] - 10 * playersAces[i];
                            playersAces[i] = 0;
                            System.out.println("");
                            System.out.println("Player" + (i + 1) + "`s points:" + playersPoints[i]);

                            //****************WRONG COMMAND*************************
                        } else {
                            System.out.println("You chose the wrong command. Try again");
                        }
                    }
                }


                //****************GAME ENDING*************************

                if (dealerSum < 16) {
                    for (int i = 0; dealerSum < 16; i++) {

                        cardC = getRandom(deck);
                        list.remove(cardC);
                        deck = list.toArray(new String[list.size()]);
                        System.out.println(cardC);
                        if (cardC == "A") {
                            dealerAces++;
                        }
                        dealerSum = dealerSum - 10 * dealerAces;
                        dealerAces = 0;

                        System.out.println("Dealer`s cards: ");
                        for (int j = 0; j < cardsDealer.length; j++) {
                            if (Objects.equals(cardsDealer[j], "0")) {
                                cardsDealer[j] = cardC;
                                System.out.println(cardsDealer[j]);
                                break;
                            }
                            System.out.print(cardsDealer[j] + " ");
                        }

                        dealerSum = dealerSum + cardsValue.get(cardC);
                        System.out.println("Dealer`s points:" + dealerSum);
                    }
                }

                if (dealerSum > 21) {
                    for (int i = 0; i < numPlayers; i++) {
                        if (playersStatus[i] != 1) {
                            playersWins[i]++;
                            System.out.println("Player" + (i + 1) + " is a winner!");
                        }
                    }
                } else {
                    for (int i = 0; i < numPlayers; i++) {
                        if (playersStatus[i] != 1 && playersPoints[i] > dealerSum) {
                            playersWins[i]++;
                            System.out.println("");
                            System.out.println("Player" + (i + 1) + " is a winner!");
                        }
                    }
                }
                System.out.println("");
            }

            System.out.println("Player`s total wins:");
            for (int i = 0; i < numPlayers; i++) {
                System.out.println("Player" + (i + 1) + ": " + playersWins[i]);
            }
        } else {
            System.out.println("You chose the wrong number of players, try again.");
        }
    }

    public static char getCharFromString(String str, int index)
    {
        return str.charAt(index);
        /*
                String card = String.valueOf(getCharFromString("legend", 3));
                System.out.println(card);
        */
    }

    public static String getRandom(String[] array) {
        int cardRandom = new Random().nextInt(array.length);
        return array[cardRandom];

    }
}
