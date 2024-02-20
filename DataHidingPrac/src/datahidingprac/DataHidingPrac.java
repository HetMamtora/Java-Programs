package datahidingprac;

class Rectangle
{
    private double length;
    private double breadth;
    
    //GETTER METHOD
    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    
    //SETTER METHOD
    public void setLength(double l)
    {
        if(l>=0)
            length=l;
        else
            length=0;
    }
    public void setBreadth(double b)
    {
        if(b>=0)
            breadth=b;
        else
            breadth=0;
    }
    
    public double area()
    {
        return getLength()+getBreadth();
    }
    public double perimeter()
    {
        return 2*(length*breadth);
    }
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
}

public class DataHidingPrac {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangle r=new Rectangle();
       //r.length=10.5;
       //r.breadth=10.5;
       
        r.setLength(-10.5);
        r.setBreadth(10.5);
        
        System.out.println("Length: "+r.getLength());
        System.out.println("Breadth: "+r.getBreadth());
        System.out.println("Area: "+r.area());
        System.out.println("Perimeter: "+r.perimeter());
        System.out.println("Check Square: "+r.isSquare());
    }
    
}
