package arraycomparatordemo;
import java.util.*;

class My implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        if(i1<i2)
            return 1;
        if(i1>i2)
            return -1;
        return 0;
    }
}

public class ArrayComparatorDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //int a[]={2,4,6,8,1,3,5,7}; // FOR ARRAYS
        //int b[]={2,4,6,8,1,3,5,7};
        
        Integer a[]={2,4,6,8,1,3,5,7}; //FOR COMPARATORS
        
        //System.out.println(Arrays.compare(a, b)); //DIFFERENT METHODS IN IT
        
        //Arrays.sort(a); //FOR ARRAYS
        Arrays.sort(a, new My()); //FOR COMPARATORS
        
       for(Integer x:a) 
            System.out.println(x);
    }
    
}
