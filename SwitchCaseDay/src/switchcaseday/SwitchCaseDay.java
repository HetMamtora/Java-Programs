package switchcaseday;
import java.util.*;

public class SwitchCaseDay {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        int day;
        System.out.println("Enter Day No: ");
        day=sc.nextInt();
        
        switch(day)
        {
            case 1: System.out.println("Sunday");
                    break;
            case 2: System.out.println("Monday");
                    break;
            case 3: System.out.println("Tuesday");
                    break;
            case 4: System.out.println("Wednesday");
                    break;
            case 5: System.out.println("Thursday");
                    break;
            case 6: System.out.println("Friday");
                    break;
            case 7: System.out.println("Saturday");
                    break;
            default: System.out.println("Invalid Day Number.");
                     break;
        }
        
        
    }
    
}
