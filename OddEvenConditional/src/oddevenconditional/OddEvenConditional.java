package oddevenconditional;
import java.util.Scanner;

public class OddEvenConditional {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //TO CHECK IF GIVEN NUMBER IS ODD OR EVEN
        
        Scanner sc=new Scanner(System.in);
        
        int a,n;
        System.out.println("Enter value for A: ");
        a=sc.nextInt();
        n=a%2;
        
        if(n==0)
        {
            System.out.println("Number is EVEN");
        }
        else
        {
            System.out.println("Number is ODD");
        }
    }
}