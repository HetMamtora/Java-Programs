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
        int i1,j1,count=0;
        for(i1=1;i1<=5;i1++)
        {
            for(j1=1;j1<=i1;j1++)
            {
                count++;
                System.out.print(count+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\nPattern-3: ");
        int i2,j2;
        for(i2=1;i2<=5;i2++)
        {
            for(j2=1;j2<=5-i2+1;j2++)
            {
                System.out.print(j2+" ");
            }
            System.out.println("");
        }
        
    }
    
}
