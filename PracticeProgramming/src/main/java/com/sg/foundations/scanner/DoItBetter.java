/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;
/**
 *
 * @author Ajit
 */
public class DoItBetter {
    public static void main(String[] args) {
        //Ask the user how many miles they can run, the number of hot dogs they can eat, and the number of languages they know. 
        //Immediately after each question, brag that you can do more by multiplying their number by 2 and adding 1.
        
        Scanner myScanner = new Scanner(System.in);
        int userMiles, userHotDogs, userLanguages;
       
        System.out.println("How many miles can you run?");
        userMiles = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("Bravo!!! you can run " + userMiles + "?");
        System.out.println("Well ! That's nothing. I can run " + (userMiles * 2 + 1) + "!");
        
        System.out.println("How many hot dogs can you eat?");
        userHotDogs = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("Only " + userHotDogs + "?");
        System.out.println("You can't match my appetite. I can eat " + (userHotDogs * 2 + 1) + "!");
        
        System.out.println("How many languages do you know?");
        userLanguages = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("Oh Lord!! only " + userLanguages + "?");
        System.out.println("You need to learn alot. I know " + (userLanguages * 2 + 1) + "!");
        System.out.println("And one of them is French!");
    }
    
}
