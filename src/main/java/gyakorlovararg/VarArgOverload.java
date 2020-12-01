package gyakorlovararg;

class VarArgOverload {

    private void test(int ... args){
        int sum = 0;
        for (int i: args) {
            sum += i;
        }
        System.out.println("sum = " + sum);

    }

    private void test(boolean p, String ... args){
        boolean negate = !p;
        System.out.println("negate = " + negate);
        System.out.println("args.length = "+ args.length);

    }

    public static void main( String[] args ) {
        VarArgOverload obj = new VarArgOverload();
        obj.test(1, 2, 3);
        obj.test(true, "hello", "world");

    }
}