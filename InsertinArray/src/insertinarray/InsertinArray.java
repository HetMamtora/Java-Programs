package insertinarray;

public class InsertinArray {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int A[]=new int[10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
        
        int i,n=6;
        
        for(i=0; i<n; i++)
        {
            System.out.print(A[i]+",");
        }
        System.out.println("");
        
        int x=20;
        int index=2;
        
        for(i=n; i>index; i--)
        {
            A[i]=A[i-1];
        }
        A[index]=x;
        
        for(i=0; i<n; i++)
        {
            System.out.print(A[i]+",");
        }
        System.out.println("");
    }
    
}
