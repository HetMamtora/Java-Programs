package constructorsprac;

class Rectangle
{
    private double length;
    private double breadth;
    
    public Rectangle()
    {
        length=1;
        breadth=1;
        
    }
    
    //PARAMETARISED CONSTRUCTOR
    public Rectangle(double l, double b)
    {
        length=l;
        breadth=b;
    }
    
    public Rectangle(double s)
    {
        length=breadth=s;
    }
}
        
public class ConstructorsPrac {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangle r=new Rectangle(10,5);
        System.out.println("Area: "+r.area());
    }
    
}
