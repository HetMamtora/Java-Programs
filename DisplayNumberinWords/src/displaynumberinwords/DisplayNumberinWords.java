package displaynumberinwords;
import java.util.*;

public class DisplayNumberinWords {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int n,r,i;
        System.out.println("Enter Number: ");
        n=sc.nextInt();
        
        String str="";
        
        while(n>0)
        {
            r=n%10;
            n=n/10;
            str=str+r;
        }
        System.out.println(str);
        
        char c;
        for(i=str.length()-1;i>=0;i--)
        {
            c=str.charAt(i);
            switch(c)
            {
                case '0': System.out.print("Zero ");
                         break;
                case '1': System.out.print("One ");
                         break;
                case '2': System.out.print("Two ");
                         break;
                case '3': System.out.print("Three ");
                         break;
                case '4': System.out.print("Four ");
                         break;
                case '5': System.out.print("Five ");
                         break;
                case '6': System.out.print("Six ");
                         break;
                case '7': System.out.print("Seven ");
                         break;
                case '8': System.out.print("Eight ");
                         break;
                case '9': System.out.print("Nine ");
                         break;
                default: System.out.println("Invalid Number");
                         break;
            }
        }
        
        
    }
    
}
