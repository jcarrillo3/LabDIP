/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

import javax.swing.JOptionPane;

/**
 * An implementation sub-class of an Employee. These are low-level classes in
 * the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author Juan Carrillo
 */
public class HourlyEmployee implements Employee {
    private double hourlyRate;
    private double totalHrsForYear;
    private double annualBonus;

    public HourlyEmployee(double hourlyRate, double totalHrsForYear, double annualBonus) {
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
        this.setAnnualBonus(annualBonus);
    }   

    @Override
    public double getAnnualWages() {
        return hourlyRate * totalHrsForYear + this.getAnnualBonus();
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
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
