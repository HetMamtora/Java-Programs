package finallyblockdemo;

public class FinallyBlockDemo {

    static void method1() throws Exception
    {
        try{
            throw new Exception();
        }
        finally{
            System.out.println("Final Message");
        }
    }
   
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        
        method1();
        
        /* METHOD-1
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("Final Message.");
        }*/
    }
    
}
