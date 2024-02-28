package annotationseg;

class A
{
    public void display()
    {
        
    }
}

class B extends A
{
    @Override
    public void display()
    {
        
    }
    @Deprecated
    public void show()
    {
        
    }
    
}


public class AnnotationsEg {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        @SuppressWarnings("deprecation")

        B b=new B();
  
        b.show();
    }
    
}
