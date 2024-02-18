package checkgcdno;
import java.util.*;

public class CheckGCDno
{
    static int gcd(int m, int n)
    {
        while(m!=n)
        {
            if(m>n)
                m=m-n;
            else
                n=n-m;
        }
        return m;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        System.out.println("GCD Program::");
        
        int a,b;
        System.out.println("Enter 2 values for A and B: ");
        a=sc.nextInt();
        b=sc.nextInt();
        
        System.out.println("GCD is: "+gcd(a,b));
        
        
    }
    
}
