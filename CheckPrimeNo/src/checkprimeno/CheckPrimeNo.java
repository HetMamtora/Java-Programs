package checkprimeno;
import java.util.*;

public class CheckPrimeNo
{
    static boolean isPrime(int n)
    {
        int i;
        for (i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        System.out.println("CHECK PRIME NO::");
        int n;
        System.out.print("Enter value for N: ");
        n=sc.nextInt();
        System.out.println(isPrime(n));
    }
    
}
