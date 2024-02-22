package dynamicdispatchprac;

class Super
{
    public void meth1()
    {
        System.out.println("Super Method-1");
    }
    public void meth2()
    {
        System.out.println("Super Method-2");
    }
}
class Sub extends Super
{
    @Override
    public void meth2()
    {
        System.out.println("Sub Method-2");
    }
    public void meth3()
    {
        System.out.println("Sub Method-3");
    }
}

public class DynamicDispatchPrac {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //1
        Super s=new Super();
        s.meth1();
        s.meth2();
        System.out.println("");
        
        //2
        Sub s1=new Sub();
        s1.meth1();
        s1.meth2();
        s1.meth3();
        System.out.println("");
        
        //3 DYNAMIC METHOD DISPATCH
        Super s2=new Sub();
        s2.meth1();
        s2.meth2();
    }
    
}
