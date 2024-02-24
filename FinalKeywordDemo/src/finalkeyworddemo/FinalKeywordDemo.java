package finalkeyworddemo;


//final class Test
//final classes cannot be inherited
class Test
{
    public final void show()
    {
        System.out.println("Hello");
    }
}

class Test1 extends Test
{
    //public void show(){}
    //SHOW IN TEST1 CANNOT OVERRIDE FROM TEST
}

public class FinalKeywordDemo {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //System.out.println(PI);
        
    }
    
}
