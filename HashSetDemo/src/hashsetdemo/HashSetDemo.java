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
    }
    
}
