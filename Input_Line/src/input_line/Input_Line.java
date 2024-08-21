/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author hp
 */
public class Input_Line {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter some text: ");
        String userInput = readLine();
        
        if (userInput != null) {
            System.out.println("You entered: " + userInput);
        } else {
            System.out.println("An error occurred while reading input.");
        }
    }

    private static String readLine() {
        String line = "";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
        try {
            line = in.readLine();
        } catch (IOException e) {
            System.err.println(e);
        }
        return line;
    }
}
