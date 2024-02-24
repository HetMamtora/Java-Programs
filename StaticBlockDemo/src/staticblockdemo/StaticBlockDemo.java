package staticblockdemo;

class Test
{
    static
    {
        System.out.println("Block-1");
    }
    
    static
    {
        System.out.println("Block-2");
    }
}

public class StaticBlockDemo
{
    public static void main(String[] args) {
        // TODO code application logic here
        Test t=new Test();
        System.out.println("Main Method");
    }
}