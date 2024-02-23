package innerclasslocalstatic;

//LOCAL INNER CLASS
/*class Outer
{
    public void display()
    {
        class Inner
        {
            public void show()
            {
                System.out.println("Hello");
            }
        }
        Inner i=new Inner();
        i.show();
    }
}*/

//ANONYMOUS INNER CLASS
/*abstract class My
{
    abstract public void show();
}
class Outer
{
    public void display()
    {
        My m=new My(){
            public void show()
            {
                System.out.println("Hello");
            }        
        };
        m.show();
    }
}*/

//STATIC INNER CLASS
class Outer
{
    int x=10;
    static int y=20;
    
    static class My
    {
        public void show()
        {
            System.out.println(y);
        }
    }
}

public class InnerClassLocalStatic {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //FOR LOCAL AND ANONYMOUS
        /*Outer o=new Outer();
        o.display();*/
        
        //FOR STATIC
        Outer.My m=new Outer.My();
        m.show();
    }
    
}
