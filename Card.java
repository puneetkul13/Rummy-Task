/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rummytaskace2threekanaka1;

/**
 *
 * @author punithagarwal
 */
public class Card {
    String suit; //Declaring the suit value of the card(""Spade", "Heart", ""Club", "Diamond")
    int value; //Declaring the value of the card("A","2","3")
    boolean isUsed;//If a particular card is assigned to the user or not
    public Card(){
        
    }
    public Card(String suit, int value){
        this.suit=suit;
        this.value= value;
    } //Declaring the constructor of the particular card.
    public String getSuit(){
        return this.suit; //For getting the suit of the card object
    }
    public int getValue(){
        return this.value;//For getting the value of the card object
    }
}
