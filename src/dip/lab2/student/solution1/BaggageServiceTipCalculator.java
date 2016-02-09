package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author Juan Carrillo
 */
public class BaggageServiceTipCalculator extends TipCalculator {
    private static final double MAX_BILL = 100.00;
    private String billEntryErr;
    private double baseTipPerBag;
    private int bagCount;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(this.getServiceQuality()) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + this.getGoodRate());
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + this.getFairRate());
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + this.getPoorRate());
                break;
        }

        return tip;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    @Override
    public void setBillEntryErr() {
        this.billEntryErr = "Error: bill must be between " + this.getMinBill() + " and "
            + MAX_BILL;
    }

}
