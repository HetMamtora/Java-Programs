package patterns2;

public class Patterns2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Pattern-1: ");
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\nPattern-2: ");
        int count=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                count++;
                System.out.print(count+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\nPattern-3: ");
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        
    }
    
}
