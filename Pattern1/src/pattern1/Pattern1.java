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
        int i1,j1;
        for(i1=1;i1<=5;i1++)
        {
            for(j1=1;j1<=5;j1++)
            {
                System.out.print(i1+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\nPattern-3: ");
        int i2,j2;
        for(i2=1;i2<=5;i2++)
        {
            for(j2=1;j2<=5;j2++)
            {
                System.out.print(i2+j2+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\nPattern-3: ");
        int i3,j3,count=0;
        for(i3=1;i3<=5;i3++)
        {
            for(j3=1;j3<=5;j3++)
            {
                count++;
                System.out.format("%02d ",count);
            }
            System.out.println("");
        }
    }
    
}
