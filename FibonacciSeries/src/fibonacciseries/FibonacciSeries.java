package fibonacciseries;
import java.util.*;

public class FibonacciSeries {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Program to print Fibonacci Series");
        
        int a=0,b=1,c,n,i;
        System.out.println("Enter number of terms N: ");
        n=sc.nextInt();
        
        System.out.print(a+", "+b+", ");
        for(i=0; i<n-2; i++)
        {
            c=a+b;
            System.out.print(c+", ");
            a=b;
            b=c;
        }
    }
    
}
