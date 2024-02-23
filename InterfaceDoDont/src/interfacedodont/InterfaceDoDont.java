package interfacedodont;

interface Test
{
    int X=10; //ONLY IDENTIFIERS ARE ALLOWED AND IN UPPER CASES
    //IDENTIFIERS ARE BY DEFAULT FINAL AND STATIC
    
    public abstract void method1(); //WE CANNOT MAKE THIS PRIVATE
    public abstract void method2();
    
    /*public void method3()
    {
        //CANNOT HAVE BODY AS THEY ARE ABSTRACT
    }*/
    
    default void method3()
    {
        //ONLY ALLOWED WITH STATIC and DEFAULT
        System.out.println("Method-3 of Test");
    }
}

interface Test2 extends Test //WHEN WE NEED ALL THINGS FROM TEST YES WE CAN ALSO EXTEND IT
{
    void method4();
}

class MyTest implements Test2
{
    @Override
    public void method1()
    {
        System.out.println("");
    }
    @Override
    public void method2()
    {
        System.out.println("");
    }
    @Override
    public void method4()
    {
        System.out.println("");
    }
    
}

public class InterfaceDoDont {

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(Test.X); //AS IT IS STATIC WE CAN ACCESS IT
        //Test.method3();
        
        MyTest m=new MyTest();
        m.method3();
    }
    
}
