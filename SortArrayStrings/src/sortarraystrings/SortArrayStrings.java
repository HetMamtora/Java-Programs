package sortarraystrings;

public class SortArrayStrings {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String arr[]={"JavaScript","ReactJS","NodeJS","MongoDB","Java","Hostinger"};
        
        java.util.Arrays.sort(arr);
        
        for(String x:arr)
            System.out.println(x);
    }
    
}
