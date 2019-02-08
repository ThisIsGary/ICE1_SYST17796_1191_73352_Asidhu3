/*
 * Rimpaldeep Kaur Dhillon
 * 991528804
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author 
 */

import java.util.Scanner;
public class CardTrick {
    static int no;
    static int a;
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        int cardno[]=new int[7];
        String suit[]=new String[7];
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            no=(int)(Math.random()*13+1);
            c.setValue(no);
            cardno[i]=c.getValue();
            a=(int)Math.random()*3;
            c.setSuit(Card.SUITS[a]);
            suit[i]=c.getSuit();
            System.out.println("Card number is :"+cardno[i]+" and suit is"+suit[i]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Scanner k=new Scanner(System.in);
        System.out.println("Enter card value");
        int value=k.nextInt();
        System.out.println("Enter suit");
        String Suit=k.nextLine();
        
        for(int i=0;i<cardno.length;i++){
            if(value==cardno[i])
                System.out.println("Card no  found in magichand");
            else
                System.out.println("Card no not found ");
        }
         
        for(int i=0;i<suit.length;i++){
            if(Suit.equals(suit[i]))
                System.out.println("Suit found");
            else
                System.out.println("Suit not found");
        }
       
        
        
    }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    

