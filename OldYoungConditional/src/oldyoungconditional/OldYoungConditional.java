package oldyoungconditional;
import java.util.Scanner;

public class OldYoungConditional {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        int n;
        System.out.println("Enter your Age: ");
        n=sc.nextInt();
        
        if(n>=18 && n<=59)
        {
            System.out.println("Your are Young.");
        }
        else if(n>=60 && n<=100)
        {
            System.out.println("You are Senior Citizen.");
        }
        else if(n>0 && n<=17)
        {
            System.out.println("You are Minor");
        }
        else
        {
            System.out.println("Age out of Bound.");
        }
    }
    
}
