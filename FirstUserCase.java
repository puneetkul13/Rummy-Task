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
public class FirstUserCase {
    public static HashSet<String> PureLife(String[] userCards){
    HashSet<String> first_user_case1=  new HashSet<>();//Declaring a method to find out the cards in the pure life1 for the first user case
    ArrayList<String> pureLifeArray = new ArrayList<>(); //Declaring the empty array list that will contain the cards that forms pure life.
    
    int count0=1;//setting the count for determining the the pureLife equal to 1.
    Arrays.sort(userCards);//Sorting the userCards in the ascending order
    String suit1=""; //declaring the suit1 of the card that can be present in the userCards.
    String suit2=""; //declaring the suit2 of the card that can be present in the userCards.
    String suit3="";//declaring the suit3 of the card that can be present in the userCards.
    String suit4="";//declaring the suit4 of the card that can be present in the userCards.
    ArrayList<Integer> value_card_club = new ArrayList<>(); //declaring the arraylist containing the value of the cards present in the userCards that have the suit club.
    ArrayList<Integer> value_card_diamond = new ArrayList<>();//declaring the arraylist containing the value of the cards present in the userCards in the that have the suit diamond.
    ArrayList<Integer> value_card_heart = new ArrayList<>();//declaring the arraylist containing the value of the cards present in the userCards that have the suit heart.
    ArrayList<Integer> value_card_spade =  new ArrayList<>();//declaring the arraylist containing the value of the cards present in the userCards that have the suit spade.
    
  
    
    for(String card:userCards){//Iterating over the user cards
       
       String suit = card.split(",")[0]; //Getiing the suit of the card by splitting the usercard present in the form in the string.
       String value_string = card.split(",")[1];//Getting the value of the same card by splitting the usercard in the form in the string.
       
       int value = Integer.parseInt(value_string);//Converting the string value of the card to the integer value.
       if(suit.equals("Club")){//Checking if the value of the suit is equal to the "Club"
           suit1 = "Club";//if the above condition is true, then setting the value of the suit1 equals to club.
           value_card_club.add(value);//Adding the value of the card in the the arraylist value_card_club
           //(Only if the condition is true)
           
       }
       if(suit.equals("Diamond")){//Checking if the value of the suit is equal to the "Diamond"
           suit2 = "Diamond";//if the above condition is true, then setting the value of the suit1 equals to Diamond.
           value_card_diamond.add(value);//Adding the value of the card in the the arraylist value_card_diamond.
           //(Only if the condition is true)
       }
       if(suit.equals("Heart")){//Checking if the value of the suit is equal to the "Heart"
           suit3 = "Heart";//if the above condition is true, then setting the value of the suit1 equals to "Heart".
           value_card_heart.add(value);//Adding the value of the card in the the arraylist value_card_heart.
            //(Only if the condition is true)
       }
       if(suit.equals("Spade")){//Checking if the value of the suit is equal to the "Spade"
           suit4 = "Spade";//if the above condition is true, then setting the value of the suit1 equals to "Spade".
           value_card_heart.add(value);//Adding the value of the card in the the arraylist value_card_spade.
           //(Only if the condition is true)
       }
    }
    Collections.sort(value_card_club);//Sorting the arraylist, value_card_club
    Collections.sort(value_card_diamond);//Soring the arraylist, value_card_diamond
    Collections.sort(value_card_heart);//Sorting the arraylist, value_card_heart
    Collections.sort(value_card_spade);//Sorting the arraylist, value_card_spade
   
    int pure_life_value1=0;//Setting the value of temporary variable pure_life_value1 equal to zero
    int pure_life_value2=0;
    boolean isPureLife = false; //counter to check if the pure life is forming for the cards in the userCards.
    for(int value_club:value_card_club){//Iterating over the cards present in the arraylist value_card_club.
        
        if(value_club!= 15 && value_club!=14){//If the card is not paper joker of club and the card is not cut joker of club.
        if(value_club - pure_life_value1 == 1){//If the difference between the value_club and pure_life_value1 is equal to 1.

            
            count0=count0+1;//then incrementing the value of the count0 by 1.
            
            pureLifeArray.add(0,"Club"+","+value_club);//Adding the value("Club,valueOfCard") to the pureLifeArray.

            
            
            
        }
        pure_life_value1 = value_club; //Reassigning the value of the pure_life_value1 as the value_club.
        
               ;}
        
        
        
        
        
        
    }
    if(count0>=3){
        isPureLife = true; //If the value of count0 is equal to or greater than 3, then setting the boolean value of isPureLife equal to true.
    }
    else{
        pureLifeArray = new ArrayList<>();//Otherwise pureLife is not there, thus setting the pureLifeArray to a new ArrayList.
        System.out.println(pureLifeArray);
    }
    
    pure_life_value1=-1;//Reassigning the value of pure_lie_value1
    count0=1;//Reassigning the value of the value of count0=1.
    if(isPureLife==false){//If the pureLife is still not formed
    for(int value_spade:value_card_spade){//Iterating over the cards present in the arraylist value_card_spade.
        
        if(value_spade!= 15 && value_spade!=14){//If the card is not paper joker of spade and the card is not cut joker of spade.


        
        
        if(value_spade - pure_life_value1 == 1){//If the difference between the value_spade and pure_life_value1 is equal to 1.
            
            
            count0=count0+1;//then incrementing the value of count0 by 1.
            pureLifeArray.add("Spade"+","+value_spade);//Adding the value("Spade, valueOfSpade") to the pureLifeArray.
            
            
            
            
        }
        
        
        
        pure_life_value1 = value_spade;  //Reassigning the value of the pure_life_value1 as the value_spade.
        
               ;}
        
        
        
        
        
    
        
    }

    if(count0>=3){
            isPureLife = true; //If the value of count0 is equal to or greater than 3, then setting the boolean value of isPureLife equal to true.
    }
    else{
        pureLifeArray = new ArrayList<>(); //Otherwise pureLife is not there, thus setting the pureLifeArray to a new ArrayList.
        System.out.println(pureLifeArray);
    }
    
    
    count0=1; //Reassigning the value of the value of count0=1
    pure_life_value1=0; //Reassigning the value of pure_life_value1
    if(isPureLife == false){ //If the pureLife is still not formed
    for(int value_heart:value_card_heart){ //Iterating over the cards present in the arraylist value_card_heart.
        
        if(value_heart!= 15 && value_heart!=14){//If the card is not paper joker of heart and the card is not cut joker of heart.
       
        if(value_heart - pure_life_value1 == 1){//If the difference between the value_heart and the pure_life_value1 is equal to 1.
            

            pureLifeArray.add("Heart"+","+value_heart); //Adding the value("Heart, valueOfHeart") to the pureLifeArray.
            count0=count0+1;//then incrementing the value of count0 by 1.
            
           
            
            
            
        }
        
        pure_life_value1 = value_heart; //Reassigning the value of the pure_life_value1 as the value_heart.
        
               ;}
        
        
        
        
        
        
    }}
    
    
    if(count0>=3){
            isPureLife = true; //If the value of count0 is equal to or greater than 3, then setting the boolean value of isPureLife equal to true.
    }
    else{
        pureLifeArray = new ArrayList<>(); //Otherwise pureLife is not there, thus setting the pureLifeArray to a new ArrayList.
        System.out.println(pureLifeArray); 
    }
    
    pure_life_value1=0;//Reassigning the value of pure_life_value1
    count0=1; //Reassigning the value of pure_life_value1
    if(isPureLife==false){//If the pureLife is still not formed
    for(int value_diamond:value_card_diamond){//Iterating over the cards present in the arraylist value_card_diamond.
        
        if(value_diamond!= 15 && value_diamond!=14){//If the card is not paper joker of heart and the card is not cut joker of diamond.
        if(value_diamond - pure_life_value1 == 1){//If the difference between the value_heart and the pure_life_value1 is equal to 1.

            
            count0=count0+1;//then incrementing the value of count0 by 1.
            pureLifeArray.add("Diamond"+","+value_diamond);//Adding the value("Diamond, valueOfDiamond") to the pureLifeArray.
            
            
            
        }
        
        
               ;}
        
        pure_life_value1 = value_diamond; //Reassigning the value of the pure_life_value1 as the value_diamond.
        
        
        
        
        
    }}
    
    if(count0>=3){
            isPureLife = true; //If the value of count0 is greater than or equal to 3, then setting the value of isPureLife equal to true.
    }
    else{
        pureLifeArray  = new ArrayList<>(); //Otherwise pureLife is not there, thus setting the pureLifeArray to a new ArrayList.
        System.out.println(pureLifeArray);  
        
    }
    
    
    System.out.println(count0);
    
    for(int value_spade:value_card_spade){
        value_spade = value_spade-1;//iterating over the value_card_spade and decrementing the value of each element by 1.
        
        
    }
    for(int value_heart:value_card_club){
        value_heart = value_heart-1;//iterating over the value_card_heart and decrementing the value of each element by 1.
        
        
    }
    for(int value_diamond:value_card_diamond){
        value_diamond = value_diamond-1;//iterating over the value_card_diamond and decrementing the value of each element by 1.
        
        
    }
    int temp1=pureLifeArray.size()-1;//initializing the variable temp1 and assigning it a value of (size of pureLifeArray - 1).
    String card1 = pureLifeArray.get(temp1);//getting the card at the index equal to temp1 in pureLifeArray.
    String[] firstCardArray = card1.split(",");//splitting the card by the ",".
    String suitOfFirstCard = firstCardArray[0];//getting the suit of the card from the 0th index of firstCardArray.
    String StringValueOfFirstCard= firstCardArray[1];//getting the value of the card from 1st index of firstCardArray.
    
    int valueOfFirstCard = Integer.parseInt(StringValueOfFirstCard);//Converting the string value of the card to Integer.
    ArrayList<String> first_user_case= new ArrayList<>();//Initializing the array first_user_case as ArrayList<>();
    
    
    while(temp1 >=0){
        temp1 = temp1-1; //decrementing the value of the temp1 by 1.
        
        card1 = pureLifeArray.get(temp1);//getting the card String in the form of("Suit"+","+"Value")located at an index of temp1.

        String[] cardArray = card1.split(",");//splitting the card string by ","
        String suit  = cardArray[0];//getting the suit of the card from the 0th index of the above cardArray
        String StringvalueOfCard = cardArray[1];//getting the suit of the card from the 1st index of the above cardArray
        int valueOfCard = Integer.parseInt(StringvalueOfCard);//Converting the string value of the card to the integer value of the card.
        
        System.out.println(valueOfCard);
        System.out.println(valueOfFirstCard - valueOfCard);
        
        if(valueOfFirstCard-valueOfCard==1){//only, If the difference between the value of first card and the value of the card is 1 
           first_user_case.add(card1);//inserting the card1 in the first_user_case
           System.out.println(valueOfFirstCard - valueOfCard);
           System.out.println(first_user_case);
           valueOfFirstCard = valueOfCard;//assigning the value of the valueOfFirstCard equal to the valueOfCurrentCard.
           first_user_case.add(card1);//adding the card1 to the first_user_case
           }
        else if(valueOfFirstCard-valueOfCard>1 || valueOfFirstCard-valueOfCard<0){//breaking the loop
            System.out.println(valueOfFirstCard - valueOfCard);
            break;
        }
    
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    first_user_case1 = new HashSet<String>(first_user_case); 
    System.out.println(first_user_case1);
    System.out.println(userCards);
//    return (first_user_case1);
   
   
    
    
    
    
      
    
     
        
        
    }   return (first_user_case1);//returning the first_user_case as pureLife array.
}
    public static ArrayList<String> PseudoPureLife(ArrayList<String> userCards){
        for(String card:userCards){
        Collections.sort(userCards);
        String first_card  = userCards.get(userCards.size()-1);
        String[] card1 = first_card.split(",");
        String stringValueOfCard1 = card1[1];
        String suitValueOfCard1 = card1[0];
        int valueOfCard1 = Integer.parseInt(stringValueOfCard1);
        ArrayList<String> user_cards = new ArrayList<>();

        for(int i=userCards.size()-2;i>=0;i--){
            String second_card = userCards.get(i);
            String[] card2 = first_card.split(",");
            String stringValueOfCard = card2[1];
            String suitValueOfCard = card2[0];
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
    public static ArrayList<String> Set1(ArrayList<String> userCards){
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
    public static ArrayList<String> Set2(String[] userCards){
        String suit1 = null;
        ArrayList<String> StringArrayOfCards = new ArrayList<>();
//        HashSet<Integer> valuesOfSetInCard = new HashSet()<>;
        for(String card:userCards){
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
//        System.out.println(valuesOfSet2InCard+"......1");
        return null;
        
        
    }
    
    
    
    
}
