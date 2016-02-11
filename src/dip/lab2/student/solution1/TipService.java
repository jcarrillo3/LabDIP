/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Juan
 */
public class TipService {
    private TipCalculator calc;
    
    public double getTip(TipCalculator calc){
        return calc.getTip();
    }
}
