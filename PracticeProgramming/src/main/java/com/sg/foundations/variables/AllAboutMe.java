/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author User
 */
public class AllAboutMe {
    public static void main(String[] args) {
        
        // List of variables for "All About Me"
        String name, favFood, livingPlace;
        int petCount;
        boolean whistle;
        
        // initialization
        name = "Ada Lovelace";
        favFood = "hot buttered gnocchi";
        livingPlace = "pineapple";
        petCount = 5;
        whistle = true;
        
        //printing on the console
        System.out.println("My name is " + name + ".");
        System.out.println("My favorite food is " + favFood +".");
        System.out.println("I have " + petCount + " pets.");
        System.out.println("I live in a " + livingPlace + " under the sea, and I love it here.");
        System.out.println("It is " + whistle + " I know how to whistle.");
    }
}
