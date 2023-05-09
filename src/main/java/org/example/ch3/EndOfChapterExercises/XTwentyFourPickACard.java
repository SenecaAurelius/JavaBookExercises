package org.example.ch3.EndOfChapterExercises;

public class XTwentyFourPickACard {
    public static void main(String[] args) {


        for(int i = 0; i < 100; i++){
            int cardNumber = (int) (Math.random() * 13);
            int cardSuit = (int) (Math.random() * 4);
            System.out.println(cardNumber);
            System.out.println(cardSuit);
            String strCardNumber = "";
            String strSuit = "";

            switch(cardNumber){
                case 0: strCardNumber = "Ace"; break;
                case 1: strCardNumber = "2"; break;
                case 2: strCardNumber = "3"; break;
                case 3: strCardNumber = "4"; break;
                case 4: strCardNumber = "5"; break;
                case 5: strCardNumber = "6"; break;
                case 6: strCardNumber = "7"; break;
                case 7: strCardNumber = "8"; break;
                case 8: strCardNumber = "9"; break;
                case 9: strCardNumber = "10"; break;
                case 10: strCardNumber = "Jack"; break;
                case 11: strCardNumber = "Queen"; break;
                case 12: strCardNumber = "King"; break;
            }

            switch(cardSuit){
                case 0: strSuit = "Clubs"; break;
                case 1: strSuit = "Diamonds"; break;
                case 2: strSuit = "Hearts"; break;
                case 3: strSuit = "Spades"; break;
            }

            System.out.println("The card you picked is the " + strCardNumber + " of " + strSuit);
        }


        //(Game: pick a card) Write a program that simulates picking a card from a deck
        //of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
        //Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
        //Here is a sample run of the program: The card you picked is Jack of Hearts
    }
}
