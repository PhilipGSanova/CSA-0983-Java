/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_character;

import java.io.IOException;

/**
 *
 * @author hp
 */
public class Input_Character {

    /**
     * @param args the command line arguments
     */
    public static void main (String args []){
        System.out.println("Please enter some text: ");
        String userInput = readEntry();
        
        if (userInput != null){
            System.out.println("You entered: "+ userInput);
        }else {
            System.out.println("An error occured while reading input");
        }
    }
    public static String readEntry() {
        try{
            int c;
            StringBuffer buffer = new StringBuffer();
            c = System.in.read();
            while (c != '\n' && c != -1){
                buffer.append((char)c);
                c = System.in.read();
            }
            return buffer.toString().trim();
        }
        catch (IOException e){
            return null;
        }
    }
}
