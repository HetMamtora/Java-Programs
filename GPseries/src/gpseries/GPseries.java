package gpseries;
import java.util.*;

public class GPseries {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Program to print Arithmetic Progression Series");
        
        int a,r,n,i,term;
        System.out.println("Enter value for A: ");
        a=sc.nextInt();
        System.out.println("Enter value for R: ");
        r=sc.nextInt();
        System.out.println("Enter value for N: ");
        n=sc.nextInt();
        
        term=a;
        
        for(i=0;i<n;i++)
        {
            System.out.print(term+", ");
            term=term*r;
        }
    }
    
}
