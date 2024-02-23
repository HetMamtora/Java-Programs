package abstractclassprac;

abstract class Super //declare with ABSTRACT To understand
{
    public Super()
    {
        System.out.println("Super Constructor.");
    }
    public void method1()
    {
        System.out.println("Method-1 of Super");
    }
    abstract public void method2(); //check error or add abstract
}

class Sub extends Super
{
    @Override
    public void method2()
    {
        System.out.println("Method-2 of Sub");  //OVERDIDING FOR ABSTRACT
    }
}

public class AbstractClassPrac {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Super s=new Super();
        //Super s;
        Super s=new Sub();
        s.method1();
        s.method2();
    }
    
}
