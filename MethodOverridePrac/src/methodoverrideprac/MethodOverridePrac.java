package methodoverrideprac;

class Super
{
    public void display()
    {
        System.out.println("Super Class display.");
    }
}
class Sub extends Super
{
    @Override
    public void display()
    {
        System.out.println("Sub Class display.");
    }
}


public class MethodOverridePrac {

    public static void main(String[] args) {
        // TODO code application logic here
        Super sup=new Super();
        sup.display();
        
        Sub s=new Sub();
        s.display();
    }
}
