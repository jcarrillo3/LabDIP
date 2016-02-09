/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author Juan Carrillo
 */
public class HRService {
    
    private Employee emp;

    public double getAnnualCompensationForEmployee(Employee emp){
        this.emp = emp;
        return emp.getAnnualWages();
    }
            
}

