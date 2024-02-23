package interfaceprac;

//DEFENITION OF INTERFACE TEST
interface Test
{
    void method1();
    void method2();
}

//class MyTest extends Test    NOT ALLOWED AS IT IS NOT CLASS
class MyTest implements Test
{
    public void method1()
    {
        System.out.println("Method-1 of class MyTest");
    }
    public void method2()
    {
        System.out.println("Method-2 of class MyTest");
    }
    public void method3()
    {
        System.out.println("Method-3 of class MyTest");
    }
}

public class InterfacePrac {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Test t=new Test(); //WE CANNOT CREATE OBJECT FOR INTERFACES
        
        Test t=new MyTest();
        t.method1();    //HERE WE ARE ACHIEVING RUN TIME POLYMORPHISM
        t.method2();      
    }
}