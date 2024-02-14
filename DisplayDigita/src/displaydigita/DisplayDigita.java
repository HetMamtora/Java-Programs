package displaydigita;
import java.util.*;

public class DisplayDigita {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        int r,n;
        System.out.println("Enter a Number: ");
        n=sc.nextInt();
        
        while(n>0)
        {
            r=n%10;
            n=n/10;
            System.out.println(r+" ");
        }
    }
    
}
