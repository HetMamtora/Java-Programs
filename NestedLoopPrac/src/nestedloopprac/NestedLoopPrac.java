package nestedloopprac;

public class NestedLoopPrac {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int i,j;
        
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                System.out.print("("+i+","+j+")");
            }
            System.out.println("");
        }
    }
    
}
