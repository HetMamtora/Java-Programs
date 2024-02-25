package trycatchnesteddemo;

public class TryCatchNestedDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int A[]={30,20,10,40,0};
        int c;
        try{
            c=A[0]/A[1];
            System.out.println("Division is: "+c);
            
            try{
                System.out.println(A[5]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        
        System.out.println("Bye");
        
    }
}