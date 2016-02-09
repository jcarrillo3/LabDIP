package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author Juan Carrillo
 */
public class FoodServiceTipCalculator extends TipCalculator{
    private double bill;
    private String billEntryErr;
    
    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(this.getServiceQuality()) {
            case GOOD:
                tip = bill * this.getGoodRate();
                break;
            case FAIR:
                tip = bill * this.getFairRate();
                break;
            case POOR:
                tip = bill * this.getPoorRate();
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < this.getMinBill()) {
            throw new IllegalArgumentException(this.getBillEntryErr());
        }
        bill = billAmt;
    }

    @Override
    public void setBillEntryErr() {
        this.billEntryErr = "Error: bill must be greater than or equal to " + this.getMinBill();
    }

}
