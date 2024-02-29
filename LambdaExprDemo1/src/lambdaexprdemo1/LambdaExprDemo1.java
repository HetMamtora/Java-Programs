package lambdaexprdemo1;

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

public class LambdaExprDemo1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //MyLambda m=new My();
        //THIS IS ANONYMOUS METHOD WHICH IS LAMBDA EXPRESSION
        MyLambda m=()->{ System.out.println("Hello World"); };
        m.display();
        
    }
    
}
