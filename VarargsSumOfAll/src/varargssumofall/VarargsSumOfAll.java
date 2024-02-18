package varargssumofall;

public class VarargsSumOfAll
{
    static int sum(int ...A)
    {
        int s=0;
        for(int i=0;i<A.length;i++)
            s+=A[i];
        
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int N[]={1,2,3,4,5};
        System.out.println("Sum is: "+sum(N));
    }
    
}
