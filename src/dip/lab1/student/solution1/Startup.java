/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;
import java.text.NumberFormat;


/**
 *
 * @author Juan Carrillo
 */
public class Startup {
    public static void main(String[] args) {
        /*
         * We'll just use this class for testing our ccde.
         * We'll provide input and get some output...
         */

        //Low-level modules
        //I tested the validation of my set bonus method by putting an invalid
        //number. The program still runs but they get an error message box and 
        //it doesnt affect the other variables.
        HourlyEmployee emp1 = new HourlyEmployee(20.00, 2080, 100);
        SalariedEmployee emp2 = new SalariedEmployee(45000, 1250);
        SalariedEmployee emp3 = new SalariedEmployee(90000,0);

        // High-level module
        HRService hr = new HRService();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Test input/output..
        Employee[] employees = {emp1, emp2, emp3};
        
        for (Employee emp: employees){
            System.out.println(hr.getAnnualCompensationForEmployee(emp));
        }
        
    }
}
