/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *Create a line of asterisks 
 * @author laveh2107
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initalize a scanner 
        Scanner Input = new Scanner(System.in);
        
        //Ask for a number between one and ten
        System.out.println("Please enter a number between 1 and 10");
        //Create integer to store number
        int number = Input.nextInt();
        //Cretae counter
        int i = 1;
        //initalize the array fopr teh numbers 1-10
        int[] as = new int[10];
        for (int j = 0; j < as.length; j++) {
            as[j] = i;
            i++;
        }
        //Print out one astreick per number in each line
        for (int j = 0; j < number; j++) {
            System.out.print("*");
        }
    }
}
