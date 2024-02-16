package arrayoperations;

public class ArrayOperations {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int A[]={8,6,10,9,2,15,7,13,14,11};
        int B[]=new int[10];
        int C[]=new int[10];
        int D[]=new int[10];
        int i,j;        

        //COPY ARRY A TO B
        for(i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        
        System.out.print("Copying Array: ");
        for(int x:B)
        {
            System.out.print(x+",");
        }
        
        //COPY ARRAY A TO B IN REVERSE
        for(i=A.length-1,j=0;i>=0;i--,j++)
        {
            C[j]=A[i];
        }
        
        System.out.print("\nCopying Array in Reverse: ");
        for(int x:C)
        {
            System.out.print(x+",");
        }
        
        //INCREASE SIZE OF ARRAY
        int A1[]={8,6,10,9,2};
        
        System.out.println("\nLength of A1: "+A1.length);
        
        for(i=0;i<A1.length;i++)
        {
            D[i]=A1[i];
        }
        A1=D;
        
        System.out.println("Length of A1: "+A1.length);
    }
    
}
