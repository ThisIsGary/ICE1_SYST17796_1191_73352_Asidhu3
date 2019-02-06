/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Vladyslav Banasko 
991528801
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have a value (note that Ace =
 * 1, Jack -11, Queen =12, King = 13) A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers. This code is to be used in ICE1.
 * When you create your own branch, add your name as a modifier.
 *
 * @author
 */
public class Card {

    private String suit; //clubs, spades, diamonds, hearts
    private int value;//1-13

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" + "suit=" + suit + ", value=" + value + '}';
    }

    public boolean equals(Card card) {
        boolean b = false;
        if (this.suit.equals(card.suit) && (this.value == card.value)) {
            b = true;
        } else {
            b = false;
        } 
        return b;
    }
    //To change body of generated methods, choose Tools | Templates.

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

}
