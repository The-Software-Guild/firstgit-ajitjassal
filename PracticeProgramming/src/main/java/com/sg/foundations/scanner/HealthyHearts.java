/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Ajit
 */
public class HealthyHearts {
    public static void main(String[] args) {
        
        int userAge, userHeartRate;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your age?");
        userAge = Integer.parseInt(myScanner.nextLine());
        userHeartRate = 220 - userAge;
        
        System.out.println("Your maximum heart rate should be " + userHeartRate + " beats per minute.");
        System.out.println("Your target HR Zone is " + Math.round(userHeartRate * 0.5f) + " - " + Math.round(userHeartRate * .85f) + " beats per minute.");
    
    }
    
}
