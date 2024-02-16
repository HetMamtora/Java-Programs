package findsecondmax;

public class FindSecondMax {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int i, max1, max2;
        int A[]={3,9,7,8,12,6,15,5,4,10};
        
        max1=max2=A[0];
        
        for(i=0; i<A.length; i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }
        }
        System.out.println("Second Max is: "+max2);
    }
    
}
