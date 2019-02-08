/*
 * Name: Huy Ta
 * Student numer: 991537874.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;



import java.util.Arrays;
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
        Card[] magicHand = new Card[7];
        
        int magicHandNum []=new int[7]; 
        String magicHandDeck []=new String[7]; 
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            Random rand1=new Random();
            int random1=rand1.nextInt(13)+1; 
            c.setValue(random1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            Random rand2=new Random();
            int random2=rand2.nextInt(4); 
            c.setSuit(c.SUITS[random2]);
            
            //magicHand[i]=new Card(); 
            magicHandNum[i]=c.getValue();
            magicHandDeck[i]=c.getSuit();
            
           
        }
        //These codes in  3 lines below are for testing the magic hand deck 
        //These will ptin out numbers and decks of 7 random cards, please ignore the output of these codes
        for(int i=0; i<magicHandNum.length;i++){
        System.out.println(magicHandNum[i] + "\t");
        System.out.println( magicHandDeck[i] + "\t");
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner k=new Scanner(System.in); 
        System.out.println("\n Please input your card's suit: "); 
            String userDeck=k.next();
        System.out.println("Please input your card's number: "); 
            int userNum=k.nextInt();
         while (userNum<1 || userNum>13){
               System.out.println("Have to be between 1 and 13, Please input again: ");
            userNum=k.nextInt();
         }
        // and search magicHand here
        //Then report the result here
        int sub=0;
        int check=0;
        int index=0; 
        
        while(sub<magicHandNum.length)
        {
            if(magicHandNum[sub]==userNum & magicHandDeck[sub].equalsIgnoreCase(userDeck) )
            {check=1; 
             index= sub+1;
             break;
            }   
            else
            {check=0;}
            sub++;
           
        }
        if (check ==1)
                System.out.println("Found the card! It's at " + index);
        else if(check==0)
            System.out.println("Not Found!");
        
     Card luckyCard= new Card(); 
     luckyCard.setValue(10);
     luckyCard.setSuit("Diamonds");
        //check - this is a new branch//
    }
    
}
