/*
Name: Obada Alasali
Student ID: 991404478
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author
  */

public class CardTrick {

    public static void main(String[] args)
    {

     Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Random rnd = new Random();
        Card luckyCard = new Card(10,"Spades");
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(rnd.nextInt(13) + 1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rnd.nextInt(3) + 1]);
            int number = c.getValue();
            String suit = c.getSuit();

            magicHand[i] = new Card(number,suit);
           //  System.out.println(magicHand[i]); <-- print statement for testing purposes

        }

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("pick any card");
        System.out.println("Hearts, Diamonds, Spades, Clubs");
        String userSuit = input.nextLine();
        System.out.println("pick a value 1-13");
        int userValue = input.nextInt();
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++){
         if(magicHand[i].getSuit().equalsIgnoreCase(userSuit) && magicHand[i].getValue() == userValue){
          System.out.println(" You Guessed the Card right"); //Then report the result here
         break;
         }

         else if(i == magicHand.length - 1 && (!magicHand[i].getSuit().equalsIgnoreCase(userSuit) || magicHand[i].getValue() != userValue)){
          System.out.println("You Guessed wrong"); //Then report the result here
         }




        }
    }


}
