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
 * @author 
 */
public class CardTrick {
  
    public static void main(String[] args)
    {
        LuckyCard[] magicHand = new LuckyCard[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            LuckyCard c = new LuckyCard(); 
            Scanner one = new Scanner(System.in);
             System.out.println("Enter card number and suits: ");
                int num  = one.nextInt();
                String suits = one.next();
             c.setValue(num);
               String suit = c.getSuit();
         c.setSuit(suit);
           
               
         
         
        
        
            System.out.println("card's number= "+c.getValue()+ " "+"card's suit is : " +c.getSuit());  
        
    magicHand[i] = c;

            }
        
    

    
        System.out.println("Enter a card to be searched  :");
        Scanner two = new Scanner(System.in);
        LuckyCard[] b = new  LuckyCard[1];
        int num1 = two.nextInt();
        String suits1 = two.next();
      b[i] = [num1 suits1];
         if(b==magicHand){
             System.out.println("cards exists in the magicHands");
             
         }
         else System.out.println("card doesnot exist in the magichand cards");
        
    }
}

