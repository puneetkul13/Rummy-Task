/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rummytaskace2threekanaka1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 *
 * @author punithagarwal
 */
public class SecondUserCase {
    
    public static ArrayList<String> PureLife(String[] userCards){
    ArrayList<String> pureLifeArray = new ArrayList<>();
    
    int count0=0;
    Arrays.sort(userCards);
    String suit1="";
    String suit2="";
    String suit3="";
    String suit4="";
    ArrayList<Integer> value_card_club = new ArrayList<>();
    ArrayList<Integer> value_card_diamond = new ArrayList<>();
    ArrayList<Integer> value_card_heart = new ArrayList<>();
    ArrayList<Integer> value_card_spade =  new ArrayList<>();
    
  
    
    for(String card:userCards){
       
       String suit = card.split(",")[0];
       String value_string = card.split(",")[1];
       
       int value = Integer.parseInt(value_string);
       if(suit.equals("Club")){
           suit1 = "Club";
           value_card_club.add(value);
           
       }
       if(suit.equals("Diamond")){
           suit2 = "Diamond";
           value_card_diamond.add(value);
           
       }
       if(suit.equals("Heart")){
           suit3 = "Heart";
           value_card_heart.add(value);
       }
       if(suit.equals("Spade")){
           suit4 = "Spade";
           value_card_heart.add(value);
       }
    }
    Collections.sort(value_card_club);
    Collections.sort(value_card_diamond);
    Collections.sort(value_card_heart);
    Collections.sort(value_card_spade);
   
    int pure_life_value1=0;
    int pure_life_value2=0;
    boolean isPureLife = false;
    for(int value_club:value_card_club){
        
        if(value_club!= 15 && value_club!=14){
        if(value_club - pure_life_value1 == 1){

            
            count0=count0+1;
            
            pureLifeArray.add(0,"Club"+","+value_club);

            
            
            
        }
        pure_life_value1 = value_club;
        
               ;}
        
        
        
        
        
        
    }
    if(count0>=3){
        isPureLife = true;
    }
    else{
        System.out.println(pureLifeArray);
    }
    
    pure_life_value1=-1;
    count0=0;
   
    for(int value_spade:value_card_spade){
        
        if(value_spade!= 15 && value_spade!=14){


        
        
        if(value_spade - pure_life_value1 == 1){
            
            
            count0=count0+1;
            pureLifeArray.add("Spade"+","+value_spade);
            
            
            
            
        }
        
        
        
        pure_life_value1 = value_spade;
        
               ;}
        
        
        
        
        
    
        
    }

    if(count0>=3){
            isPureLife = true;
    }
    else{
        System.out.println(pureLifeArray);
    }
    
    
    count0=0;
    pure_life_value1=0;
    if(isPureLife == false){
    for(int value_heart:value_card_heart){
        
        if(value_heart!= 15 && value_heart!=14){
       
        if(value_heart - pure_life_value1 == 1){
            

            pureLifeArray.add("Heart"+","+value_heart);
            count0=count0+1;
            
           
            
            
            
        }
        
        pure_life_value1 = value_heart; 
        
               ;}
        
        
        
        
        
        
    }}
    
    
    if(count0>=3){
            isPureLife = true;
    }
    else{
        System.out.println(pureLifeArray);
    }
    
    pure_life_value1=0;
    count0=0;
    if(isPureLife==false){
    for(int value_diamond:value_card_diamond){
        
        if(value_diamond!= 15 && value_diamond!=14){
        if(value_diamond - pure_life_value1 == 1){

            
            count0=count0+1;
            pureLifeArray.add("Diamond"+","+value_diamond);
            
            
            
        }
        
        
               ;}
        
        pure_life_value1 = value_diamond; 
        
        
        
        
        
    }}
    
    if(count0>=3){
            isPureLife = true;
    }
    else{
        System.out.println(pureLifeArray);
        
    }
    
    
    System.out.println(count0);
    
    for(int value_spade:value_card_spade){
        value_spade = value_spade-1;
        
        
    }
    for(int value_heart:value_card_club){
        value_heart = value_heart-1;
        
        
    }
    for(int value_diamond:value_card_diamond){
        value_diamond = value_diamond-1;
        
        
    }
    int temp1=pureLifeArray.size()-1;
    String card1 = pureLifeArray.get(temp1);
    String[] firstCardArray = card1.split(",");
    String suitOfFirstCard = firstCardArray[0];
    String StringValueOfFirstCard= firstCardArray[1];
    
    int valueOfFirstCard = Integer.parseInt(StringValueOfFirstCard);
    ArrayList<String> first_user_case= new ArrayList<>();
    
    
    while(temp1 >=0){
        temp1 = temp1-1;
        
        card1 = pureLifeArray.get(temp1);

        String[] cardArray = card1.split(",");    
        String suit  = cardArray[0];
        String StringvalueOfCard = cardArray[1];
        int valueOfCard = Integer.parseInt(StringvalueOfCard);
        
        System.out.println(valueOfCard);
        System.out.println(valueOfFirstCard - valueOfCard);
        
        if(valueOfFirstCard-valueOfCard==1){
           first_user_case.add(card1);
           System.out.println(valueOfFirstCard - valueOfCard);
           System.out.println(first_user_case);
           valueOfFirstCard = valueOfCard;
           first_user_case.add(card1);
           }
        else if(valueOfFirstCard-valueOfCard>1 || valueOfFirstCard-valueOfCard<0){
            System.out.println(valueOfFirstCard - valueOfCard);
            break;
        }
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
//    first_user_case.remove(0);
//    HashSet<String> first_user_case1 = first_user_case.setOf(first_user_case);
    HashSet<String> first_user_case1 = new HashSet<String>(first_user_case);
    System.out.println(first_user_case1);
    System.out.println(userCards);
   
    return (null);
    
    
    
    
      
    
     
        
        
    }
    public ArrayList<String> PseudoPureLife(ArrayList<String> userCards){
        for(String card:userCards){
        Collections.sort(userCards);
        String first_card  = userCards.get(userCards.size()-1);
        String[] card1 = first_card.split(",");
        String stringValueOfCard1 = card1[0];
        String suitValueOfCard1 = card1[0];
        int valueOfCard1 = Integer.parseInt(stringValueOfCard1);
        ArrayList<String> user_cards = new ArrayList<>();

        for(int i=userCards.size()-2;i>=0;i--){
            String second_card = userCards.get(i);
            String[] card2 = first_card.split(",");
            String stringValueOfCard = card2[0];
            String suitValueOfCard = card2[1];
            int valueOfCard = Integer.parseInt(stringValueOfCard);
            
            
            if(valueOfCard1-valueOfCard==1){
                user_cards.add(second_card);
                System.out.println(valueOfCard1 - valueOfCard);
                valueOfCard1 = valueOfCard;
                user_cards.add(second_card);
                
           }
            else if((valueOfCard1-valueOfCard>1) || (valueOfCard1-valueOfCard<=0)){
                int valueOfFirstCard = valueOfCard;
                break;
                
           }
               
               
            
            
            
        }
        
            
            
            
            
        }
        return(new ArrayList<String>());
        
    }
    public ArrayList<String> Set1(ArrayList<String> userCards){
        ArrayList<Integer> valuesOfSetInCard = new ArrayList<>();
        String suit1 = null;
        ArrayList<String> StringArrayOfCards = new ArrayList<>();
        for(String card:userCards){
            String[] cardArray  = card.split(",");
            String ValueofFirstCard = cardArray[0];
            String suitValueOfFirstCard = cardArray[1];
            String suit = suitValueOfFirstCard;
            int intValueOfFirstCard = Integer.parseInt(ValueofFirstCard);
            valuesOfSetInCard.add(0,intValueOfFirstCard);
            if(suit1.equals(suit)){
//                valuesOfSetInCard.add(0,intValueOfFirstCard);
                StringArrayOfCards.add(0, suitValueOfFirstCard);
            }
            else{
                suit1 = suit;
                
            }

            
            
            
            
            
            
        }
        System.out.println(valuesOfSetInCard+"......1");
        return (new ArrayList<String>());
        
    }
    public ArrayList<String> Set2(String[] UserCards){
        String suit1 = null;
        ArrayList<String> StringArrayOfCards = new ArrayList<>();
//        HashSet<Integer> valuesOfSetInCard = new HashSet()<>;
        for(String card:UserCards){
            String[] cardArray  = card.split(",");
            String ValueofFirstCard = cardArray[0];
            String suitValueOfFirstCard = cardArray[1];
            String suit = suitValueOfFirstCard;
            int intValueOfFirstCard = Integer.parseInt(ValueofFirstCard);
//            valuesOfSetInCard.add(0,intValueOfFirstCard);
            if(suit1.equals(suit)){
//                valuesOfSetInCard.add(0,intValueOfFirstCard);
                StringArrayOfCards.add(0, suitValueOfFirstCard);
            }
            else{
                suit1 = suit;
                
            }

            
            
            
            
            
            
        }
        return(new ArrayList<>());
        
        
        
    }
    
    
    
    

    
}
