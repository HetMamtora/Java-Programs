package pattern1;

public class Pattern1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("Pattern-1: ");
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\nPattern-2: ");
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\nPattern-3: ");
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                System.out.print(i+j+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\nPattern-4: ");
        int count=0;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                count++;
                System.out.format("%02d ",count);
            }
            System.out.println("");
        }
    }
    
}
