package factorialofnumber;
import java.util.*;

public class FactorialofNumber {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        int i,n;
        System.out.println("Enter a Number: ");
        n=sc.nextInt();
        
        long fact=1;
        
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        
        System.out.println("Factorial: "+fact);
    }
    
}
