package twodarrayprac;

public class TwoDArrayPrac {
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int A[][]=new int[5][5];
        int B[][]={{1,2,3},{2,4,6},{1,3,5}};
       /*int C[][];
        C=new int[5][5];
        int []D[]=new int[5][5];
        int []E,F[]; //HERE E is single dimension and F is 2 dimensional*/
        
        int i,j;
        
        for(i=0;i<B.length;i++)
        {
            for(j=0;j<B[0].length;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
        
        //JAGGED ARRAY
        System.out.println("\nJAGGED ARRAY");
        int A1[][];
        A1=new int[3][];
        
        A1[0]=new int[5];
        A1[1]=new int[3];
        A1[2]=new int[8];
        
        for (i=0; i<A1.length;i++)
        {
            for(j=0;j<A1[i].length;j++)
            {
                System.out.print(A1[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
