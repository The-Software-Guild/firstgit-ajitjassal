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
public class AllTheTrivia {
    public static void main(String[] args) {
        String answer1, answer2, answer3, answer4;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What unit is equivalent to 1,024 Gigabytes?");
        
        answer1 = scanner.nextLine();
        
        System.out.println("Which planet is the only one that rotates clockwise in our Solar System?");
        
        answer2 = scanner.nextLine();
        
        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet?");
        
        answer3 = scanner.nextLine();
        
        System.out.println("What is the most abundant element in the earth's atmosphere?");
        
        answer4 = scanner.nextLine();
        
        System.out.println("\nWow, 1,024 Gigabytes is a " + answer3 + "!\n" +
                           "I didn't know that the largest ever volcano was discovered on " + answer1 + "!\n" +
                           "That's amazing that " + answer2 + " is the most abundant element in the atmosphere...\n" +
                            answer4 + " is the only planet that rotates clockwise, neat!");
 
    }
    
}
