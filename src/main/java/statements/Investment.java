package statements;

public class Investment {

    // Változók megadása:
    // - cost (double)
    private double cost = 0.3;

    // - fund (int)
    private int fund;

    // - intrestRate (int)
    private int interestRate;

    // - active (boolean)
    private boolean active = true;

    // Core:
    // - investment
    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }

    // - getFund
    public int getFund() {
        return fund;
    }

    // - getYield
    public double getYield(int days) {
        return fund * interestRate * days / (100.0 * 365);
    }
    // - close
    public double close(int days) {
        double totalAmount = (getFund() + getYield(days)) * (1 - cost / 100);
        double payout = active ? totalAmount : 0;
        active = false;
        return payout;
    }

}
