/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 * program to ask and then tell the user their name
 * @author laveh2107
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initalize the scanner
        Scanner Input = new Scanner(System.in);
        
        //Ask the user for thier name
        System.out.println("Hello, User. What may I call you?");
        
        //Store name of user as a string
        String name = Input.nextLine();
        
        //Print out greeting for the user
        System.out.println("Hello, "+ name + "!");
    }
}
