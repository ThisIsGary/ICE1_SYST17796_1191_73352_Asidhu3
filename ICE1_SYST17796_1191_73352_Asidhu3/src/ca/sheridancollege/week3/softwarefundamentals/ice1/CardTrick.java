/****
    @Modifier Name : Vishwa Patel
    @Student ID: 991516280
*/
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author 
 */
public class CardTrick 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Card Value:" );
        int i1 = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter suit:");
        String s1 = sc1.nextLine();
        int value, suit;
        Card[] magicHand = new Card[7];
        Card luckeyCard = new Card();
        int lcNum = 7;
        String lcSuit = "Hearts";
        
        Card c = new Card();
        int[] value1 = new int[7];
        String[] suit1 = new String[7];
        for (int i=0; i<magicHand.length; i++)
        {        
            //c.setValue(insert call to random number generator here)
            value= (int)(Math.random()*14);
            c.setValue(value);
            value1[i] = c.getValue();
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            suit = (int) (Math.random()*4);
            c.setSuit(Card.SUITS[suit]);
            suit1[i] = c.getSuit();   
        }
        int isValue = 0;
        for(int i = 0; i < value1.length;i++)
        {
            if(i1 == value1[i] )
            {
               isValue = 1;
               break;
            }
        }
        int isSuit = 0;
        for(int i = 0; i < suit1.length; i++)
        {
            if(s1.equals(suit1[i]) )
            {
                isSuit = 1;
                break;
            }
        }
        if(isValue == 1 && isSuit == 1)
        {
            System.out.println("You Win!!");
        }
        else
        {
            System.out.println("Try Again!!");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
       
  }
}
