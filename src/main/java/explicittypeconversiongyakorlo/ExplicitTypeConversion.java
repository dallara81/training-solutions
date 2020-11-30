package explicittypeconversiongyakorlo;

public class ExplicitTypeConversion {

    public static void main(String[] args)

    {
        double doubleVariable = 126.58;
        // LongVariable
        long longVariable = (long)doubleVariable;

        // IntVariable
        int intVariable = (int)longVariable;

        // Kiíratás
        System.out.println("Double value "+doubleVariable);
        System.out.println("Long value "+longVariable);
        System.out.println("Int value "+intVariable);

    }
}