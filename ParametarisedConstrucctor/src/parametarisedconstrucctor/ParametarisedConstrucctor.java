package parametarisedconstrucctor;

class Parent
{
    Parent()
    {
        System.out.println("Non-Param of Parent.");
    }
    Parent(int x)
    {
        System.out.println("Param of Parent: "+x);
    }
}
class Child extends Parent
{
    Child()
    {
        System.out.println("Non-Param of Child.");
    }
    Child(int y)
    {
        System.out.println("Param of Child.");
    }
    Child(int x, int y)
    {
        super(x);
        System.out.println("2 param of child: "+y);
    }
}

public class ParametarisedConstrucctor {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //NO PARAMETER
        Child c=new Child();
        
        //PARAMETER
        Child c1=new Child(20);
        
        //SUPER CLASS CONSTRUCTOR
        System.out.println("");
        Child c2=new Child(10,20);
        
    }
    
}
