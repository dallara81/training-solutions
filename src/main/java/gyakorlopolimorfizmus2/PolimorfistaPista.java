package gyakorlopolimorfizmus2;

public class PolimorfistaPista {

    public static void main(String[] args)

    {
        Shape shapes[] = new Shape[2];
        Circle c = new Circle(20);
        Rectangle r = new Rectangle(40, 25);
        shapes[0] = c;
        shapes[1] = r;
        for(Shape s : shapes)
            System.out.println(s.area());
        }
    }

    abstract class Shape {
        public abstract String area();
    }

    class Circle extends Shape {

        public Circle(double a) {

            radius = a;
        }

        public String area()
        {
            return "Kör > Terület > " + PI*radius*radius;
        }

        private double radius;
        private final double PI = 3.14;
    }

    class Rectangle extends Shape {

        Rectangle(double w, double h){
            width = w;
            height = h;
        }

        public String area()
        {
            return "Háromszög > Terület > " + width*height;
        }

        private double width;
        private double height;
}