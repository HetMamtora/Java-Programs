package objectclasseg;
import java.lang.*;


class MyObject
{
    public String toString()
    {
        return "My String";
    }
    public int hashCode()
    {
        return 100;
    }
    public boolean equals(Object o)
    {
        return this.hashCode()==o.hashCode();
    }
}

public class ObjectClassEg {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Object o1=new Object();
        Object o2=new Object();
        Object o3=o1;
        
        System.out.println(o1.toString());
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o1.hashCode());
        
        MyObject mo=new MyObject();
        MyObject mo1=new MyObject();
        //MyObject2 mo1=new MyObject1();
        System.out.println(mo);
        System.out.println(mo1);
        System.out.println(mo.equals(mo1));
        
        
        
    }
    
}
