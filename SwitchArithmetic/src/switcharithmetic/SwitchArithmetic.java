package switcharithmetic;
import java.util.*;

public class SwitchArithmetic {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        int n1,n2,result;
        String option;
        System.out.println("Enter Number 1: ");
        n1=sc.nextInt();
        System.out.println("Enter Number 2: ");
        n2=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter your choice in Worlds:");
        System.out.println("Options: ADD, SUB, MUL, DIV");
        option=sc.nextLine();
        option=option.toUpperCase();
        
        switch(option)
        {
            case "ADD": result=n1+n2;
                        System.out.println("ADD: "+result);
                        break;
            case "SUB": result=n1-n2;
                        System.out.println("SUB: "+result);
                        break;
            case "MUL": result=n1*n2;
                        System.out.println("MUL: "+result);
                        break;
            case "DIV": result=n1/n2;
                        System.out.println("DIV: "+result);
                        break;
            default: System.out.println("Invalid Option");
                     break;
        }
    }
    
}
