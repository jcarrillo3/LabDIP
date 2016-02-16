/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class KeyboardInput implements MessageInput {
    Scanner keyboard = new Scanner(System.in);
    
    @Override
    public String inputLn() {
        String line;
        System.out.print("Enter text: ");
        line = keyboard.nextLine();
        return line;
    }
    
}
