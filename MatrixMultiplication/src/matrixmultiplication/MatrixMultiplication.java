package matrixmultiplication;

public class MatrixMultiplication {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,5,2},{6,8,4},{3,9,7}};
        int C[][]=new int[3][3];
        
        int i,j,k;
        
        for(i=0;i<A.length;i++)
        {
            for(j=0;j<A[0].length;j++)
            {
                C[i][j]=0;
                for(k=0;k<3;k++)
                {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        
        System.out.println("MULTIPLICATION IS: ");
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
    
}
