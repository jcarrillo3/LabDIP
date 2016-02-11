/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

import javax.swing.JOptionPane;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author Juan Carrillo
 */
public class SalariedEmployee implements Employee {
    private double annualSalary;
    private double annualBonus;
    
    public SalariedEmployee( double annualSalary, double annualBonus) {
        this.annualSalary = annualSalary;
        this.setAnnualBonus(annualBonus);
    }

    @Override
    public double getAnnualWages() {
        return annualSalary + this.getAnnualBonus();
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
        public final double getAnnualBonus() {
        return annualBonus;
    }

    public final void setAnnualBonus(double annualBonus) {
        if (annualBonus < 0){
            JOptionPane.showMessageDialog(null, "Error: Invalid Entry");
        } else {
        this.annualBonus = annualBonus;
        }
    }

    
}
