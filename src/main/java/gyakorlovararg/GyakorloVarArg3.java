package gyakorlovararg;

class GyakorloVarArg3{

    static void display(int num, String... values){
        System.out.println("number is "+num);
        for(String s:values){
            System.out.println(s);

        }
    }

    public static void main(String args[]){

        display(200,"hello");
        display(2000,"my","name","is","varargs");

    }
}