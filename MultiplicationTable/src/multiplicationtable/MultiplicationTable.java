package multiplicationtable;
import java.util.*;

public class MultiplicationTable {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int i,n;
        System.out.println("Enter a Number: ");
        n=sc.nextInt();
        
        for(i=1;i<=10;i++)
        {
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
    
}
