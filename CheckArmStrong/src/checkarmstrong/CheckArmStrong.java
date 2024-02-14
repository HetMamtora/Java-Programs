package checkarmstrong;
import java.util.*;

public class CheckArmStrong {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int n,m,r,sum=0;
        System.out.println("Enter a Number: ");
        n=sc.nextInt();
        m=n;
        
        while(n>0)
        {
            r=n%10;
            n=n/10;
            
            sum=sum+r*r*r;
        } 
        if(sum==m)
            System.out.println("It's an Armstrong Number.");
        else
            System.out.println("It's not an Armstrong Number.");
        
    }
    
}