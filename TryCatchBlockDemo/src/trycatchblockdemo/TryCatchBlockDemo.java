package trycatchblockdemo;
import java.util.*;

public class TryCatchBlockDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int a,b,c;
        System.out.println("Enter 2 values for A & B: ");
        a=sc.nextInt();
        b=sc.nextInt();
        
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denoiminator should not be 0, change input.");
            System.out.println(e);
        }
        
        System.out.println("Bye");
    }
    
}
