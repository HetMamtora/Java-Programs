package treehashmapdemo;
import java.util.*;
import java.util.Map.*;

public class TreeHashMapDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        
        //HashMap<Integer,String> tm=new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        
        tm.put(4,"E");
        tm.put(5,"F");
        
        Entry<Integer,String> e=tm.firstEntry();
        System.out.println(e.getKey()+" "+e.getValue());
        
        System.out.println(tm.ceilingEntry(5).getValue());
        tm.get(3);
        System.out.println(tm);
    }
    
}
