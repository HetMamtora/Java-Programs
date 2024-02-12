package checkgrades;
import java.util.Scanner;

public class CheckGrades {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        int sum, s1,s2,s3;
        float avg;
        
        System.out.println("Enter marks for SUBJECT-1:");
        s1=sc.nextInt();
        System.out.println("Enter marks for SUBJECT-2:");
        s2=sc.nextInt();
        System.out.println("Enter marks for SUBJECT-3:");
        s3=sc.nextInt();
        
        sum=s1+s2+s3;
        avg=sum/3;
        
        System.out.println("Your percentage is: "+avg);
        
        if(avg>=70 && avg<=100)
        {
            System.out.println("Grade: A");
        }
        else if(avg>=60 && avg<70)
        {
            System.out.println("Grade: B");
        }
        else if(avg>=50 && avg<60)
        {
            System.out.println("Grade: C");
        }
        else if(avg>=40 && avg<50)
        {
            System.out.println("Grade: D");
        }
        else if(avg>100)
        {
            System.out.println("Score out of bound.");
        }
        else
        {
            System.out.println("Better Luck Next Time YOU HAVE FAILED !");
        }
        
    }
    
}
