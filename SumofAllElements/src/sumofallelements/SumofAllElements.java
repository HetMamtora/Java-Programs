package sumofallelements;

public class SumofAllElements {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int i,sum=0;
        
        for(i=0;i<A.length;i++)
        {
            sum=sum+A[i];
        }
        System.out.println("Sum is: "+sum);
    }
    
}
