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
public class Copier {
    private String ln;
    private Input input;
    private Output output;

    public Copier(Input input, Output output) {
        this.input = input;
        this.output = output;
    }
    
    public void getLn(Input input){
        this.ln = input.inputLn();
    }
    public void setLn(){
        output.outputLn(ln);
    }
}
