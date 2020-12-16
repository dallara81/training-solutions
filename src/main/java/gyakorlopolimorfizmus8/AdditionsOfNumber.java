package gyakorlopolimorfizmus8;


class AdditionsOfNumber
        {
public void addition(int a, int b)
        {
        System.out.println("Addition of two numbers = "+ (a+b));
        }
public void addition(int a, int b, int c)
        {
        System.out.println("Addition of three numbers = "+ (a+b+c));
        }
        }
class ExampleOfStaticPolymorpism
{
    public static void main(String arg[])
    {
        AdditionsOfNumber addNumbers = new AdditionsOfNumber();
        // calling the method have two parameters
        addNumbers.addition(8,12);
        // calling the method have three parameters
        addNumbers.addition(7, 9, 6);
    }
}
