package rotatingarray;

public class RotatingArray {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int A[]={5,9,6,10,12,7,3,5,4,2};
        int i, temp;
        temp=A[0];
        
        for(int x:A)
        {
            System.out.print(x+",");
        }
        System.out.println("");
        
        for(i=1; i<A.length; i++)
        {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        
        for(int x:A)
        {
            System.out.print(x+",");
        }
        System.out.println("");
    }
    
}
