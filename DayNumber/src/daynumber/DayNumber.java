package daynumber;
import java.util.*;

public class DayNumber {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        int day;
        System.out.println("Enter Day Number: ");
        day=sc.nextInt();
        
        if(day==1)
        {
            System.out.println("SUNDAY");
        }
        else if(day==2)
        {
            System.out.println("MONDAY");
        }
        else if(day==3)
        {
            System.out.println("TUESDAY");
        }
        else if(day==4)
        {
            System.out.println("WEDNESDAY");
        }
        else if(day==5)
        {
            System.out.println("THURSDAY");
        }
        else if(day==6)
        {
            System.out.println("FRIDAY");
        }
        else if(day==7)
        {
            System.out.println("SATURDAY");
        }
        else
        {
            System.out.println("Day number out of bound.");
        }
    }
    
}
