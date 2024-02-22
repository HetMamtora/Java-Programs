package constructorclasseseg;

class Rectangle
{
    int length;
    int breadth;
    
    Rectangle()
    {
        length=breadth=1;
    }
    Rectangle(int l, int b)
    {
        length=l;
        breadth=b;
    }
}

class Cuboid extends Rectangle
{
    int height;
    Cuboid()
    {
        height=1;
    }
    Cuboid(int h)
    {
        height=h;
    }
    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    int volume()
    {
        return length*breadth*height;
    }
}

public class ConstructorClassesEg {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuboid c=new Cuboid(5,3,10);
        System.out.println(c.volume());
    }
    
}
