/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class PassTheTuringTest {
    public static void main(String[] args) {
        String userName, userColor, userFruit, userNumber;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Hello there!\n" +
                            "What's your name?");
        
        userName = scanner.nextLine();
        
        System.out.println("\nHi, " + userName + "! I'm Alice\n" + 
                            "What's your favorite color?");
        
        userColor = scanner.nextLine();
        
        System.out.println("\nHuh,  " + userColor + "?" + " Mine's is Electric Lime\n");
        System.out.println("I really like limes. They're my favorite fruit, too.\n" +
                            "What's YOUR favorite fruit," + userName + "?");
        
        userFruit = scanner.nextLine();
        
        System.out.println("\nReally? " + userFruit + " That's wild!\n" +
                            "Speaking of favorites, what's your favorite number?");
        
        userNumber = scanner.nextLine();
        
        System.out.println("\n" + userNumber + " is a cool number. Mine's -7.\n" +
                            "Did you know 42 * -7 is -294? That's a cool number too!\n\n" + 
                            "Well, thanks for talking to me," + userName + "!");
        
    }
            
}
