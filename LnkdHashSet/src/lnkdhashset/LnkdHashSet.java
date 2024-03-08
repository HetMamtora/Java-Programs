package lnkdhashset;
import java.util.*;
public class LnkdHashSet {

    public static void main(String[] args) {
        // TODO code application logic here
        
        HashSet<String> lhs=new HashSet<>(10);
        
        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");
        lhs.add("B");
        
        Iterator<String> itr=lhs.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        Hashtable ht=new Hashtable(10);
    }
    
}
