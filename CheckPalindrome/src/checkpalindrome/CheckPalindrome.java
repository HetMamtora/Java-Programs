package checkpalindrome;
import java.util.*;

public class CheckPalindrome {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int n,r,rev=0,m;
        System.out.println("Enter a Number: ");
        n=sc.nextInt();
        m=n;
        
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Number: "+m);
        if(rev==m)
            System.out.println("Number is Palindrome.");
        else
            System.out.println("Number is not Palindrome.");
    }
    
}
