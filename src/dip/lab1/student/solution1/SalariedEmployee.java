/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author Juan Carrillo
 */
public class SalariedEmployee extends Employee {
    private double annualSalary;
    
    /** default constructor. Is this the best way to go? */
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

    
}
