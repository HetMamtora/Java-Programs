package lambdaexprdemo1;

//DEMO-1
/*@FunctionalInterface
interface MyLambda
{
    public void display();
}  DEMO-1 */

//DEMO-2 [PARAMETERS IN LAMBDA]
@FunctionalInterface
interface MyLambda
{
    //public void display(String str);
    public int add(int x,int y);
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
        
        
        /* DEMO - 1
        //MyLambda m=new My();
        //THIS IS ANONYMOUS METHOD WHICH IS LAMBDA EXPRESSION
        MyLambda m=()->{ System.out.println("Hello World"); };
        m.display(); */  //DEMO-1
        
        //DEMO-2
        /*MyLambda m=(s)->{ System.out.println(s); };
        m.display("Hello World");*/
        MyLambda m=(a,b)->{ return a+b; };
        System.out.println(m.add(20,30));
        
    }
    
}
