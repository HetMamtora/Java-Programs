package linkedhashmap;
import java.util.*;

public class LinkedHashMap {

    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<Integer,String> hm=new HashMap<>();
        //LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5,.75f,true);
        //LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5,.75f,true); //PACKAGE NAME CONFLICT

        hm.put(5,"E");
        hm.put(1,"A");
        hm.put(4, "D");
        hm.put(2, "B");
        hm.put(3,"C");
        hm.put(6,"A");
        
        /*lhm.put(5,"E");
        lhm.put(1,"A");
        lhm.put(4,"D");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(6,"A");*/
        
        System.out.println(hm);
        /*String s=lhm.get(5);
        lhm.put(4,"K");
        lhm.get(1);
        System.out.println(lhm);*/
    }
    
}
