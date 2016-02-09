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
public abstract class TipCalculator {
    private static final double MIN_BILL = 0.00;
    private static String BILL_ENTRY_ERR;
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;
    
    private ServiceQuality serviceQuality;
    
    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }
    public abstract void setBillEntryErr();
    
    public abstract double getTip();
    
    public final double getGoodRate(){
        return GOOD_RATE;
    }
    public final double getFairRate(){
        return FAIR_RATE;
    }
    public final double getPoorRate(){
        return POOR_RATE;
    }
    public final double getMinBill(){
        return MIN_BILL;
    }
    public final String getBillEntryErr(){
        return BILL_ENTRY_ERR;
    }
    
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
    
    
}
