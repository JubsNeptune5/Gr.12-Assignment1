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

        String[] sentence = new String[1000];

        int count = 0;
        System.out.println(" Enter a sentence typing enter after each word");

        for (int i = 0; i < sentence.length; i++) {
            sentence[i] = Input.nextLine();
            sentence[i] = sentence[i].toLowerCase();
            if (sentence[i].equals("exit")) {
                System.out.println("You said " + count + " letters before you typed exit");
            }
            count = count + sentence[i].length();
        }
    }

}
