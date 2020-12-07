package staticattrmeth;
// Statikus attribútumok és metódusok

import java.math.BigDecimal;

public class BankTransaction {

    final static long MIN_LIMIT = 1L;
    final static long MAX_LIMIT = 10000000L;
    private static long currentMinValue;
    private static long currentMaxValue;
    private static long sumOfTrxs;
    private static long numberOfTrxs;

    private long trxValue;

    public static void initTheDay(){

        currentMaxValue = MIN_LIMIT;
        currentMinValue = MAX_LIMIT;
        sumOfTrxs = 0L;
        numberOfTrxs = 0L;

    }
    public static BigDecimal averageOfTransaction(){

        return (numberOfTrxs == 0) ? new BigDecimal(0L) : new BigDecimal(sumOfTrxs / numberOfTrxs);

    }

    public static long getCurrentMinValue() {

        return numberOfTrxs == 0 ? 0L : currentMinValue ;

    }

    public static long getCurrentMaxValue() {

        return numberOfTrxs == 0 ? 0L : currentMaxValue;

    }

    public static BigDecimal getSumOfTrxs() {

        return new BigDecimal(sumOfTrxs);

    }

    public BankTransaction(long trxValue){

        if (trxValue < MIN_LIMIT || trxValue > MAX_LIMIT) {

            throw new IllegalArgumentException("A megengedett tartományon kívüli érték!");

        }

        this.trxValue = trxValue;
        sumOfTrxs += trxValue;
        numberOfTrxs++;
        if (trxValue < currentMinValue){

            currentMinValue = trxValue;

        }

        if (trxValue > currentMaxValue){

            currentMaxValue = trxValue;

        }
    }

    public long getTrxValue() {
        return trxValue;

    }
}