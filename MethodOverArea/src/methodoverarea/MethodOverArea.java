package methodoverarea;
import java.util.*;

public class MethodOverArea
{
    static double area(double length, double breadth)
    {
        return length*breadth;
    }
    static double area(double radius)
    {
        return Math.PI*radius*radius;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Area of RECTANGLE::");
        int n1,n2;
        System.out.println("Enter Length & Breadth:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Area: "+area(n1,n2));
        
        System.out.println("\nArea of CIRCLE::");
        int n3;
        System.out.println("Enter Radius:");
        n3=sc.nextInt();
        System.out.println("Area: "+area(n3));
    }
    
}
