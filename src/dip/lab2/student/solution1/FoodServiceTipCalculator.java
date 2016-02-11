package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author Juan Carrillo
 */
public class FoodServiceTipCalculator implements TipCalculator{
    private static double minBill = 0.00;
    private static String billEntryErr =
            "Error: bill must be greater than or equal to " + minBill;
    private static double goodRate = 0.20;
    private static double fairRate = 0.15;
    private static double poorRate = 0.10;
    private ServiceQuality serviceQuality;
    private double bill;
    
    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }
    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            throw new IllegalArgumentException(billEntryErr);
        }
        bill = billAmt;
    }

}
