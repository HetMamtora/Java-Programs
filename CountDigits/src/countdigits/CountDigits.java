package countdigits;
import java.util.*;

public class CountDigits {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        int n,count=0;
        System.out.println("Enter a Number: ");
        n=sc.nextInt();
        
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("Digits: "+count);
    }
    
}
