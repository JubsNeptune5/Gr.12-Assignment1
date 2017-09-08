/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *Count from 100-50 backwards to the given number
 * @author laveh2107
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initalize a scanner 
        Scanner Input = new Scanner(System.in);

        //Ask for a number to use
        System.out.println("Please enter a number between 100-50");
        int number = Input.nextInt();
        //Create counter to start the count at 100
        int counter = 100;
        //Ask if the number provided was in range
        if (number <= 100 && number >= 50) {
            //Count down by 5 from 100 until the count never goes below the number given
            while (counter >= number) {
                System.out.println(counter);
                counter = counter - 5;
            }
        }
        if (number > 100 || number < 50) {
            System.out.println("Not in range of numbers");
        }
    }
}
