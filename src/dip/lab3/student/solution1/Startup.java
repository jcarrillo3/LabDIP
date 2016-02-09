/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Juan
 */
public class Startup {
    public static void main(String[] args) {
        
        Input input = new KeyboardInput();
        Output output = new ConsoleOutput();
        Copier copier = new Copier(input, output);
        
        copier.setLn(input);
        copier.getLn();
        
        
    }
}
