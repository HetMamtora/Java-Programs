package patterns3;

public class Patterns3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Pattern-1: ");
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i<=j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
        
        System.out.println("\nPattern-2: ");
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i+j>5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
        
        System.out.println("\nPattern-3: ");
        int k;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i+j>5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
    
}
