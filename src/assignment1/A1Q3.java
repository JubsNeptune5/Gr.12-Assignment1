/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *A program to see how many tickets a prom committee will need to sell to make a profit
 * @author laveh2107
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initalize a scanner 
        Scanner Input = new Scanner(System.in);
        
        //ask the user the cost of the prom
        //Then create doubles to store the infomation
        //DJ info
        System.out.println("How much does the DJ cost?");
        double dj = Input.nextDouble();
        
        //Food info
        System.out.println("How much does the food cost?");
        double food = Input.nextDouble();
        
        //Hall info
        System.out.println("How much does the hall cost?");
        double hall = Input.nextDouble();
        
        //Decorations info
        System.out.println("How much does the Decorations cost");
        double decor = Input.nextDouble();
        
        //Staff info
        System.out.println("How much does the Wait staff cost");
        double staff = Input.nextDouble();
        
        //Miscellanious
        System.out.println("how much is being spent on msicellaneous expences");
        double misc = Input.nextDouble();
        
        //Add up all the costs for the total cost
        double total = dj+food+hall+decor+staff+misc;
        
        //Divid the total by the cost of the tickets to find the number of tickets needed to be sold
        double ticket = total/35;
        
        //Round the tickets
        ticket = Math.ceil(ticket);
        //Let the user know their infomation
        System.out.println("The total is: " + total);
        System.out.println("The numebr of tickets needed to be sold to break even is: "+ ticket);
        
        
    }
}
