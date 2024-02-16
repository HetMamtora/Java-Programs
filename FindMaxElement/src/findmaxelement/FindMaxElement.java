package findmaxelement;

public class FindMaxElement {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int max,i;
        int A[]={3,9,7,8,12,6,15,5,4,10};
        max=A[0];
        
        for(i=0; i<A.length; i++)
        {
            if(A[i]>max)
                max=A[i];
        }
        System.out.println("Max is: "+max);
    }
}
