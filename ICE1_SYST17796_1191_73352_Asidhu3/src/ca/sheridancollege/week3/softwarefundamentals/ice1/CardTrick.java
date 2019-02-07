/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Vladyslav Banasko 
991528801
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

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
        
        Card luckyCard = new Card();
        luckyCard.setSuit("Clubs");
        luckyCard.setValue(5);
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {

            Card c = new Card();
            c.setValue((int) ((Math.random() * 12) + 1));
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your suit :Hearts,Diamonds,Spades, Clubs ");
        String cardSuit = sc.nextLine();
        System.out.println("Input your card , note that Ace = 1, Jack -11, Queen =12, King = 13");
        int cardNum = sc.nextInt();

        Card userCard = new Card();
        userCard.setSuit(cardSuit);
        userCard.setValue(cardNum);

        for (Card card : magicHand) {
            System.out.println(card.toString());
        }

        for (int i = 0; i < magicHand.length; i++) {
            if (userCard.equals(magicHand[i])) {
                System.out.println("equals");
                break;
            } else {
                System.out.println("not equal");
                break;
            }

            //insert code to ask the user for Card value and suit, create their card
            // and search magicHand here
            //Then report the result here
        }

    }
}
