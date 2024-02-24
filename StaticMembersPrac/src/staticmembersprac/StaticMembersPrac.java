package staticmembersprac;

// static class Test      STATIC IS ALLOWED IN INNER CLASSES ONLY
class Test
{
    static int x=10;
    int y=20;
    void show()
    {
        System.out.println(x+" "+y);
    }
    static void display()
    {
        System.out.println(x);
        //System.out.println(y); //NON STATIC NOT ALLOWED IN STATIC CLASS
    }
}

public class StaticMembersPrac {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Test t1=new Test();
        t1.show();
        t1.x=30;
        t1.y=50; //
        
        Test t2=new Test();
        t2.show();
                
    }
    
}
