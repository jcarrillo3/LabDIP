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
public class ConsoleOutput implements Output{

    @Override
    public void outputLn(String ln) {
        System.out.println(ln);
    }
    
}
