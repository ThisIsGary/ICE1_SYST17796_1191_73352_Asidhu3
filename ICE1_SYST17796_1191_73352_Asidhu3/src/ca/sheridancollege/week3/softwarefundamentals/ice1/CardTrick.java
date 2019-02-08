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
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        boolean match = false;
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)Math.ceil(Math.random()*13));
            c.setSuit(Card.SUITS[(int)Math.floor(Math.random()*4)]);
            magicHand[i]=c;
        }
        
        for (int i=0; i<magicHand.length; i++)
        {
            System.out.println(magicHand[i].getValue()+" of "+magicHand[i].getSuit());
        }
        
        
        System.out.println("pick a card! Any card!");
        String pg = input.nextLine();
        String player = pg.replaceAll("\\s","");
        String playerGuess[]= player.split("of");
        
        for (int i=0; i<magicHand.length; i++)
        {
            switch(magicHand[i].getValue()){
                case 1:
                    if (playerGuess[0].toLowerCase().equals("ace")&&playerGuess[1].toLowerCase().equals(magicHand[i].getSuit())){
                        match= true;
                        System.out.println(pg+" is correct!");
                    }
                    break;
                case 2:
                    if (playerGuess[0].toLowerCase().equals("two")&&playerGuess[1].toLowerCase().equals(magicHand[i].getSuit())){
                        match= true;
                        System.out.println(pg+" is correct!");
                    }
                    break;
                case 3:
                    if (playerGuess[0].toLowerCase().equals("three")&&playerGuess[1].toLowerCase().equals(magicHand[i].getSuit())){
                        match= true;
                        System.out.println(pg+" is correct!");
                    }
                    break;
                case 4:
                    if (playerGuess[0].toLowerCase().equals("four")&&playerGuess[1].toLowerCase().equals(magicHand[i].getSuit())){
                        match= true;
                        System.out.println(pg+" is correct!");
                    }
                    break;
                case 5:
                    if (playerGuess[0].toLowerCase().equals("five")&&playerGuess[1].toLowerCase().equals(magicHand[i].getSuit())){
                        match= true;
                        System.out.println(pg+" is correct!");
                    }
                    break;
                case 6:
                    if (playerGuess[0].toLowerCase().equals("six")&&playerGuess[1].toLowerCase().equals(magicHand[i].getSuit())){
                        match= true;
                        System.out.println(pg+" is correct!");
                    }
                    break;
                case 7:
                    if (playerGuess[0].toLowerCase().equals("seven")&&playerGuess[1].toLowerCase().equals(magicHand[i].getSuit())){
                        match= true;
                        System.out.println(pg+" is correct!");
                    }
                    break;
                case 8:
                    if (playerGuess[0].toLowerCase().equals("eight")&&playerGuess[1].toLowerCase().equals(magicHand[i].getSuit())){
                        match= true;
                        System.out.println(pg+" is correct!");
                    }
                    break;
                case 9:
                    if (playerGuess[0].toLowerCase().equals("nine")&&playerGuess[1].toLowerCase().equals(magicHand[i].getSuit())){
                        match= true;
                        System.out.println(pg+" is correct!");
                    }
                    break;
                case 10:
                    if (playerGuess[0].toLowerCase().equals("ten")&&playerGuess[1].toLowerCase().equals(magicHand[i].getSuit())){
                        match= true;
                        System.out.println(pg+" is correct!");
                    }
                    break;
                case 11:
                    if (playerGuess[0].toLowerCase().equals("jack")&&playerGuess[1].toLowerCase().equals(magicHand[i].getSuit())){
                        match= true;
                        System.out.println(pg+" is correct!");
                    }
                    break;
                case 12:
                    if (playerGuess[0].toLowerCase().equals("queen")&&playerGuess[1].toLowerCase().equals(magicHand[i].getSuit())){
                        match= true;
                        System.out.println(pg+" is correct!");
                    }
                    break;
                case 13:
                    if (playerGuess[0].toLowerCase().equals("king")&&playerGuess[1].toLowerCase().equals(magicHand[i].getSuit())){
                        match= true;
                        System.out.println(pg+" is correct!");
                    }
                    break;
                default:
                    System.out.println("ERROR: that is not a valid card selection!");
                    break;
        }
        }
        if(match==true){
            System.out.println("You win!");
        }
        else{
            System.out.println("sorry, "+pg+" was not one of the cards. you lose.");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
