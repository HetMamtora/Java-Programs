package methodovervalidate;
import java.util.*;

public class MethodOverValidate
{
    static boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }    
    
    static boolean validate(int age)
    {
        return age>=3 && age<=15;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Validate NAME:: ");
        String str;
        System.out.println("Enter Name: ");
        str=sc.nextLine();
        System.out.println("Validation: "+validate(str));
        
        System.out.println("\nValidate AGE:: ");
        int a;
        System.out.println("Enter age: ");
        a=sc.nextInt();
        System.out.println("Validation: "+validate(a));
        
    } 
}