/*
Name: Jack Hoang
Student ID: 991495093
Class: Software Fundamentals
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            int value = random.nextInt(13) + 1;
            int suit = random.nextInt(4);
            c.setValue(value);
            c.setSuit(Card.SUITS[suit]);
            magicHand[i] = c;
            System.out.println(magicHand[i].getValue() + ","
                    + magicHand[i].getSuit());
        }
        //c.setValue(insert call to random number generator here)
        //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])

        System.out.println();

        Scanner k = new Scanner(System.in);
        System.out.print("Enter a card value (between 1 and 13): ");
        int cValue = k.nextInt();

        if (cValue > 1 && cValue < 14) {
            System.out.println("Your value is: " + cValue);
        } else {
            while (cValue < 1 || cValue > 13) {
                System.out.print("Please enter a value (between 1 and 13): ");
                cValue = k.nextInt();
            }
        }

        System.out.println();

        Card c = new Card();

        System.out.print("Enter a suit (0 - Hearts; 1 - Diamonds; 2 - Spades;"
                + " 3 - Clubs): ");
        int cVSuit = k.nextInt();

        while (cVSuit < 0 || cVSuit > 3) {
            System.out.print("Enter a valid suite (0 - Hearts; 1 - Diamonds;"
                    + " 2 - Spades; 3 - Clubs): ");
            cVSuit = k.nextInt();
        }
        String cSuit = c.SUITS[cVSuit];
        System.out.println("Your suit is: " + cSuit);
        System.out.println();

        for (int i = 0; i < magicHand.length; i++) {
            if (cValue == magicHand[i].getValue()
                    && cSuit.equals(magicHand[i].getSuit())) {
                System.out.println("Matched");
            } else {
                System.out.println("Not Matched");
            }

        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
