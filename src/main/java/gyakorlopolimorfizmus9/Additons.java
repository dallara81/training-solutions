package gyakorlopolimorfizmus9;

class Additions
{
    public void addition(int a, int b)
    {
        System.out.println("Method of Parent(Additions) class and Addition of two numbers = "+ (a+b));
    }
}
class ExampleOfDynamicPolymorpism extends Additions
{
    // Override the method of parent class (Additions)
    public void addition(int a, int b)
    {
        System.out.println("Method of child(ExampleOfDynamicPolymorpism) class and Addition of two numbers = "+ (a+b));
    }

    public static void main(String arg[])
    {
        Additions addNumbers = new Additions();
        addNumbers.addition(64,192);
    }
}