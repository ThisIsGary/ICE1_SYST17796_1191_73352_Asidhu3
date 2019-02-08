/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author
 *
 * Elizabeth Smikle ID: 991515967 ICE1
 *
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 12) + 1);

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);

            magicHand[i] = c;
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit());
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        Card user = new Card();
        int userValue = 0;
        int userSuit = 0;
        
        while (userValue < 1 || userValue > 13) {
            System.out.println("Please choose a card value between 1-13");
            userValue = in.nextInt(); in.nextLine();
        }
        user.setValue(userValue);
        while (userSuit < 1 || userSuit > 4) {
            System.out.println("Please choose a card suit Spades = 1, Hearts = 2, Diamonds = 3, Clubs = 4");
            userSuit = in.nextInt();
            if (userSuit == 1) {
                user.setSuit("Spades");
            } else if (userSuit == 2){
                user.setSuit("Hearts");
            } else if (userSuit == 3){
                user.setSuit("Diamonds");
            } else if (userSuit == 4){
                user.setSuit("Clubs");
            } else {
                System.out.println("Not valid suit");
            }
        }
        
        for(int i = 0; i < magicHand.length; i++) {
            if(magicHand[i] == user){
                System.out.println("There is a match!");
            } else {
                System.out.println("No match");
            }
        }
        //Then report the result here
        
        Card luckyCard = new Card();
        luckyCard.setValue(10);
        luckyCard.setSuit("Spades");
    }

}
