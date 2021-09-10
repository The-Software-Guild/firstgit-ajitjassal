/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

import java.text.DecimalFormat;

public class MenuOfChampions {
    public static void main(String[] args) {
        
        //initiale the required variables
        String food1 = "Slice of Big Rico Pizza", food2 = "Invisible Strawberry Pie";
        String food3 = "Denver Omelet";
        
        double cost1 = 500.00, cost2 = 2.00, cost3 = 1.50; 
        
        
        // desired output
        System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.\n");
        System.out.println("\t\tWELCOME TO RESTAURANT NIGHT VALE!");
        System.out.println("\t\tToday's Menu Is...\n"); 
        System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.\n");    
        System.out.println("\t\t$ " + String.format("%.2f", cost1) + " *** " + food1);
        System.out.println("\t\t$ " + String.format("%.2f", cost2) + " ***** " + food2);
        System.out.println("\t\t$ " + String.format("%.2f", cost3) + " ***** " + food3);

    }
}
