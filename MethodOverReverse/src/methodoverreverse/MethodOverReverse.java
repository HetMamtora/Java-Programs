package methodoverreverse;
import java.util.*;

public class MethodOverReverse
{
    static int reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    
    static int [] reverse(int A[])
    {
        int B[]=new int[A.length];
        
        for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];
        
        return B;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Reverse a NUMBER::");
        int a;
        System.out.println("Enter value of A:");
        a=sc.nextInt();
        System.out.println("Reverse No.: "+reverse(a));
        
        System.out.println("\nReverse an ARRAY::");
        int N[]={1,2,3,4,5};
        System.out.println("Reverse Array: "+reverse(N).toString());
    }
    
}
