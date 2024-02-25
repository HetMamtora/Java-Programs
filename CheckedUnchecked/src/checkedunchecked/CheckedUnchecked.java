package checkedunchecked;
import java.io.*;

//USER DEFINED EXCEPTION CLASS

class LowBalanceException extends Exception
{
    public String toString()
    {
            return "balance should not be less than 5000." ;
    }
}

public class CheckedUnchecked {

    
    static void fun1()
    {
        
        //USER DEFINED EXCEPTION
        try
        {
            throw new LowBalanceException();
        }
        catch(LowBalanceException e)
        {
            System.out.println(e);
        }
        
        
        //CHECKED EXCEPTION
       // FileInputStream fi=new FileInputStream("My.txt");
        

        /*//UNCHECKED EXCEPTION
        try{
            System.out.println(10/0);
        }
        //EXCEPTION CLASS
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }*/
    }
    static void fun2()
    {
        fun1();
    }
    static void fun3()
    {
        fun2();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        fun3();
    }
}