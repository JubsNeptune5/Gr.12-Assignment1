/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *find the average number of letters per word in a sentence
 * @author hunterlaverty
 */
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initalize a scanner 
        Scanner Input = new Scanner(System.in);
        
        //Create an array
        String[] sentence = new String[10];
        
        //Ask for 10 words in sentance
        System.out.println("Please type in your sentence pressing enter after each word");
        System.out.println("NOTE: pressing space will make the average innacurate");
        for (int i = 0; i < sentence.length; i++) {
            sentence[i] = Input.nextLine();
        }
        //Create integer to keep track of the number of letters
        int letters = 0;
        //Find the length of all the words combined
        for (int i = 0; i < sentence.length; i++) {
            letters = letters + sentence[i].length();
        }
        //divid the tootal numebr of letters by 10
        double avg = letters/10;
        
        System.out.println("The average number of letters per word is "+avg);
    }
    
}
