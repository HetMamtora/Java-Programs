package searchelement;
import java.util.*;

public class SearchElement {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int key,i;
        int A[]={3,9,7,8,12,6,15,5,4,10};
        
        System.out.println("Enter element to Search:");
        key=sc.nextInt();
        
        for(i=0; i<=A.length; i++)
        {
            if(A[i]==key)
            {
                System.out.println("Element found at: "+i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");
    }
}
