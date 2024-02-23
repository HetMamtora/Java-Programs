package innerclassnested;

class Outer
{
    int x=10;
    Inner i=new Inner(); //I IS AVAILABLE FOR WHOLE CLASS
    class Inner
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    
    public void outerDisply()
    {
        //Inner i=new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}

public class InnerClassNested {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //1
        Outer o=new Outer();
        o.outerDisply();
        
        //2
        Outer.Inner oi=new Outer().new Inner();
        oi.innerDisplay();
    } 
}
