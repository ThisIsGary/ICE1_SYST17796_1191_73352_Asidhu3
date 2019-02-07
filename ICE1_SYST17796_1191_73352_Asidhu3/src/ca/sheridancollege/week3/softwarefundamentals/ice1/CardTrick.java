/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author anmol dang
 * student number =991515624
 */

public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Pic any card");
        int selectedcard = input.nextInt();
        
        System.out.println("Enter from 0-3");
           String suit = input.nextLine();
        
        String AlphaNumericString = "0123";
                                    
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int r =(int) Math.floor(Math.random()*13+1);
            c.setValue(r);
            //c.setValue(insert call to random number generator here)
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt((3-0)+1)+0]);
            magicHand[i]=c;
        }
        
        for(int i=0; i<magicHand.length; i++){
        
            if((magicHand[i].getValue()==selectedcard ) && (magicHand[i].getSuit()== suit)){
              System.out.println("not hand");
              break;
            }
            else {
            System.out.println("in hand");
            break;
            }
        
        
        }
  
       //LuckyCard fourSpade = new LuckyCard();
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}