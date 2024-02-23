package abstractclassshape;

abstract class Shape
{
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape
{
    double radius;
    @Override
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    @Override
    public double area()
    {
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape
{
    double length;
    double breadth;
    @Override
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    @Override
    public double area()
    {
        return length*breadth;
    }
}

public class AbstractClassShape {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=5;
        
        //DYNAMIC METHOD DISPATCH
        Shape s=r;
        System.out.println(s.area());
    }
    
}
