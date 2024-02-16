package arraypractice;

public class ArrayPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        int A[]=new int[10];
        int B[]={1,2,3,4,5};
        
        int C[];
        C=new int[10];
        
        B[2]=15;
        
        for(i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
        for(i=0;i<B.length;i++)
        {
            System.out.println(B[i]);
        }
        
        for(i=0;i<B.length;i++)
        {
            System.out.println(B[i]++);
        }
        for(int x:B)
        {
            System.out.println(x);
        }
    }
    
}
