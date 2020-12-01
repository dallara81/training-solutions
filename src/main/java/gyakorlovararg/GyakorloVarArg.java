package gyakorlovararg;
// Nézzük, mire jó ez a VarArg-sztori!
// A kikommentált rész a VarArg nélküli megoldás, az érthetőség kedvéért

public class GyakorloVarArg {

    public int sumNumber(int ... args){
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }

    public static void main( String[] args ) {
        GyakorloVarArg ex = new GyakorloVarArg();

        int sum2 = ex.sumNumber(2, 4);
        System.out.println("sum2 = " + sum2);

        int sum3 = ex.sumNumber(1, 3, 5);
        System.out.println("sum3 = " + sum3);

        int sum4 = ex.sumNumber(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4);


// VarArg nélküli megoldás

        //public int sumNumber(int a, int b){
        //    return a+b;
        //}

        //public int sumNumber(int a, int b, int c){
        //    return a+b+c;
        //}

        //public static void main( String[] args ) {
        //    NincsVararg obj = new NincsVararg();
        //    System.out.println(obj.sumNumber(1, 2));
        //    System.out.println(obj.sumNumber(1, 2, 3));
        //}
    }
}

