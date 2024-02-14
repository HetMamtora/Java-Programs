package sumofnumbers;
import java.util.*;

public class SumofNumbers {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        int i,n;
        int sum=0;
        System.out.println("Enter last Number to get SUM: ");
        n=sc.nextInt();
        
        for(i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of "+n+" numbers: "+sum);
    }
    
}
