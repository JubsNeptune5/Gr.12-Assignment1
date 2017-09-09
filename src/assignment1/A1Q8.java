/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 * Financial information to the user
 * @author hunterlaverty
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initalize a scanner 
        Scanner Input = new Scanner(System.in);
        
        //Ask the user for the inital amount, and interesst of the account
        System.out.println("Please enter your inital amount in your account");
        double inAmount = Input.nextDouble();
        
        System.out.println("Please enter your interest rate");
        double interest = Input.nextDouble();
        
        //create variable of the total balance
        double balance = inAmount;
        //create int for number of years
        int years = 0;
        // do maht to fidn outwhat year it will double
        while(balance <= inAmount*2){
            balance = (1+interest)*balance;
            years++;
        }
        System.out.println("It takes "+years+" years to double your money");
        //reset balance variable
         balance = inAmount;
        //do the math to find the increase of each year
        while(balance<=1000000){
            balance = (1+interest)*balance;
            years++;
        }
        System.out.println("It takes "+years+" years to break 6 million");

    }
    
}
