package hashsetdemo;
import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Integer> hs=new HashSet<>(20,0.75f);
        
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        
        System.out.println(hs);
        
        //TREE SET DEMO
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));
        //Collecion<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));  ONLY THOSE METHODS THAT ARE IN COLLECTION
        //Sorted<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));     ONLY THOSE METHODS THAT ARE IN SORTED
        
        ts.add(25);
        
        //ts.ceiling(55);
        
        System.out.println(ts);
    }
    
}
