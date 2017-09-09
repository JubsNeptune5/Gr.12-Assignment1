/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 * Determine when the population will exceed 10 billion
 *
 * @author laveh2107
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //counters
        //6 because 6 billion is to large to store in a double
        double pop = 6;
        //integer to keep track of the years between 6 bil. and 10 bil.
        int years = 1999;

        //Do the math when the popualtion is less than 10 
        while (pop <= 10) {
            //Multiple the population by the percent it increases
            pop = pop * 1.014;
            years++;
        }
        System.out.println("The year the population exceeds 10 billion is: " + years);
    }
}
