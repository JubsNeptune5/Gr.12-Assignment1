/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 * Find the product, square root of the product, and the square of the product
 * @author laveh2107
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initalize the input
        Scanner input = new Scanner(System.in);
        
        //Create an array
        double[] numbers = new double[3];
        
        //Create for loop to ask for three numbers simutaniously
        for (int i = 0; i <numbers.length; i++) {
            System.out.println("Please enter a number");
            numbers[i] = input.nextInt();
        }
        //Do the math for finding the product
        double product = numbers[0]*numbers[1]*numbers[2];
        
        //Do math to find the square root of the numbers
        double squRoot = Math.sqrt(product);
        
        //Do the math to find the square of the product
        double squr = Math.pow(product,2);
        
        //Tell the user the answers
        System.out.println("The product of all the numbers that you chosen is: "+product);
        System.out.println("The square root of the product is: "+squRoot);
        System.out.println("The product squared is: "+squr);
    }
}
