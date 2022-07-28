/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rummytaskace2threekanaka1;

import java.util.ArrayList;

/**
 *
 * @author punithagarwal
 */
public class User {
//    ArrayList<Card> individualUserCards = new ArrayList<Card>();
    private final ArrayList<Card> individualUsercards;
    public User(ArrayList<Card> individualUserCards){
        this.individualUsercards = individualUserCards;
    }

    User() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public ArrayList<Card> getUserCards(){
        return this.individualUsercards;
        
        
    }
}
