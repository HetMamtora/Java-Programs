package reversenumber;
import java.util.*;

public class ReverseNumber {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int n,r,rev=0;
        System.out.println("Enter a Number: ");
        n=sc.nextInt();
        
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        
        System.out.println("Reverse is: "+rev);
    }  
}