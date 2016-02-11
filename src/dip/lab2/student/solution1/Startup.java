/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;
// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;
/**
 *
 * @author Juan
 */
public class Startup {
    public static void main(String[] args) {
        TipService service = new TipService();
        TipCalculator[] tipCalc = {
            new BaggageServiceTipCalculator(ServiceQuality.FAIR, 5),
            new FoodServiceTipCalculator(ServiceQuality.GOOD, 20.00)
        };
        
        for (TipCalculator c : tipCalc){
            System.out.println(service.getTip(c));
        }
    }
}
