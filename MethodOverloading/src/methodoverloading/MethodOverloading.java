package methodoverloading;
import java.util.*;

public class MethodOverloading
{
    static int max(int x,int y)
    {
        return x>y?x:y;
    }
    
    static float max(float x, float y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    
    static int max(int x, int y, int z)
    {
        return x>y&&x>z?x:(y>z?y:z);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("|:| METHOD OVERLOADING |:|\n");
        
        //METHOD-1
        System.out.println("Max of 2 [INT]::");
        int n1,n2;
        System.out.println("Enter value for N1 & N2: ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Max: "+max(n1,n2));
        
        //METHOD-2
        System.out.println("\nMax of 2 FLOAT::");
        float n3,n4;
        System.out.println("Enter value for N3 & N4: ");
        n3=sc.nextFloat();
        n4=sc.nextFloat();
        System.out.println("Max: "+max(n3,n4));
        
        //METHOD-3
        System.out.println("\nMax of 3 INT::");
        int n5,n6,n7;
        System.out.println("Enter value for N5, N6 & N7: ");
        n5=sc.nextInt();
        n6=sc.nextInt();
        n7=sc.nextInt();
        System.out.println("Max: "+max(n5,n6,n7));
    }
}