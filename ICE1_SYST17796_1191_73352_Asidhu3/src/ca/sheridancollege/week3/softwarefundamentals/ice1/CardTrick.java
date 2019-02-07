/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Brandon McCulloch 991529206
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int selectedCard;
        int selectedSuit;
        int matchCount = 0;

        Card[] magicHand = new Card[7];

        // Create the luckyCard object
        Card luckyCard = new Card();
        luckyCard.setSuit(Card.SUITS[0]);
        luckyCard.setValue(11);

        // Print the lucky card value and suit
        System.out.println("The lucky card is: " + luckyCard.getValue() + " of " + luckyCard.getSuit());
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(randomNumber(13));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[randomNumber(4) - 1]);
            //add the card to the magicHand array
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Please enter a card value [Ace = 1, Jack = 11, Queen = 12, King = 13]: ");
        selectedCard = input.nextInt();
        System.out.println("Please select a suit: ");
        System.out.println("[0] Hearts");
        System.out.println("[1] Diamonds");
        System.out.println("[2] Spades");
        System.out.println("[3] Clubs");
        selectedSuit = input.nextInt();

        // and search magicHand here
        for(Card card:magicHand) {
            if(card.getSuit().equals(Card.SUITS[selectedSuit]) && card.getValue() == selectedCard) {
                matchCount++;
            }
        }
        //Then report the result here
        if (matchCount > 0) {
            System.out.println("There was a match!");
        } else {
            System.out.println("No matches found.");
        }
    }

    /*
     * Generates a random integer with a maximum size dictated by the number parameter
     */
    private static int randomNumber(int number) {
        return (int)(Math.random() * number) + 1;
    }
    
}
