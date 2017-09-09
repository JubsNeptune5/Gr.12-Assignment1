/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author hunterlaverty
 */
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initalize a scanner 
        Scanner Input = new Scanner(System.in);

        //cretae string
        String word = new String();

        //create array for the sentance
        String[] sentence = new String[1000];

        //create counter for the number of letters 
        int count = 0;
        System.out.println(" Enter a sentence typing enter after each word");

        //Go through each spot int he array
        for (int i = 0; i < sentence.length; i++) {
            //Input a word
            sentence[i] = Input.nextLine();
            //Change to lower case
            sentence[i] = sentence[i].toLowerCase();
            //when the word reads exit, the program reads out the count of letters
            if (sentence[i].equals("exit")) {
                System.out.println("You said " + count + " letters before you typed exit");
            break;
            }
            //Add the number of letter of the word that wasnt exit to the other count
            count = count + sentence[i].length();
        }
    }

}
