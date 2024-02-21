package inheritanceprac;

class Circle
{
    public double radius;
    
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}

class Cylinder extends Circle
{
    public double height;
    public double volume()
    {
        return area()*height;
    }
    
}        
        
public class InheritancePrac {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Cylinder c=new Cylinder();
        
        c.radius=7;
        c.height=10;
        
        System.out.println("Volume of Cylinder: "+c.volume());
        System.out.println("Volume of Area: "+c.area());
    }
    
}
