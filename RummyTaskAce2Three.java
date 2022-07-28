/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rummytaskace2threekanaka1;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author punithagarwal
 */
public class RummyTaskAce2Three {
    public static void main(String[] args){
        ArrayList<String> purelife1 = new ArrayList<String>(); //Declaring the Arraylist containing the cards forming the pure life.
        ArrayList<String> purelife2 = new ArrayList<String>(); //
        ArrayList<Card> game_deck = new ArrayList<>();
        ArrayList<Card> userDeck = new ArrayList<>();
        String[] suits = new String[]{"Spade", "Heart","Diamond","Club"};
        int temp1=0;
        String[] user_cards1 = new String[]{"Spade,1","Spade,2","Club,4", "Heart,4", "Heart,5", "Spade,6","Spade,7","Diamond,8","Diamond,10","Heart,1","Spade,8","Heart,12","Club,13","Spade,14", "Club,15", "Spade,15"}; //Arraylist containing the cards "First Case(Usual)"
        String[] user_cards2 = new String[]{"1,Spade","2,Spade","3,Spade", "3,Club", "5,Heart", "6Spade","7Spade","8Diamond","10,Diamond","1,Heart","10,Club","12,Club","13,Heart","CJ, Spade","PJ,Club", "PJ,Spade"};//ArrayList containing the cards "Second Case(Case containing the cards "A","2","3")
        String[] user_cards3 = new String[]{"1,Spade","2,Heart", "3,Spade", "3,Club", "4,Spade", "5,Spade","6,Spade","7,Spade","9,Heart","10,Club","11, Club", "12,Spade", "13,Spade", "CJ, Spade","PJ,Club", "PJ,Spade"};//ArrayList containing the cards"Third Case(Case containing the cards "Q", "K", "A")
        purelife1 = FirstUserCase.PureLife(user_cards1); //Calling the method for getting the pure life(if present) for the user_cards1. 


        
        HashSet<String> userSet1 = new HashSet<>();
        ArrayList<String> userCards1 = new ArrayList<String>();
        for(String cards:user_cards1){
            userCards1.add(cards);
        }

        
        
        
        
        
        ThirdUserCase.PseudoPureLife(userCards1);
        ThirdUserCase.PureLife(user_cards1);
        ThirdUserCase.Set1(userCards1);
        ThirdUserCase.Set2(user_cards1);
        System.out.println("1234567");
        
        System.out.println(userSet1);
        
         

        
        
        
        
    }
    
    
    

        
        

}

