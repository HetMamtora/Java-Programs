package leapyear;
import java.util.*;

public class LeapYear {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        int year;
        System.out.println("Enter Year: ");
        year=sc.nextInt();
        
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("It is a Leap Year.");
                }
                else
                {
                    System.out.println("Not a Leap Year.");
                }
            
            }
            else
            {
                System.out.println("It is a Leap Year.");
            }
            
        }
        else
        {
            System.out.println("Not a Leap Year.");
        }
    }
    
}
