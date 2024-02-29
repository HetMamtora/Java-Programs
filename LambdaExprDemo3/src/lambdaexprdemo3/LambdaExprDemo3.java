package lambdaexprdemo3;

@FunctionalInterface
interface MyLambda
{
    public void display();
}

/*class My implements MyLambda
{
    public void display()
    {
        System.out.println("Hello World");
    }
}*/

public class LambdaExprDemo3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        MyLambda m=()->{System.out.println("Hello world");};
        
        /*//MyLambda m=new My();
        MyLambda m=//new MyLambda()
                ()->
        
            //public void display()
            {
                System.out.println("Hello World");
        
        };*/
        m.display();
    }
    
}
