package thowthrowsdemo;

class NegativeDimensionException extends Exception
{
    public String toString()
    {
        return "Dimensions cannot be negative.";
    }
}

public class ThowThrowsDemo {

    static int area(int l, int b) throws NegativeDimensionException
    {
        if(l<0||b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    static void method1() throws NegativeDimensionException
    {
        System.out.println("Ares ia: "+area(-10,5));
    }
    
    public static void main(String[] args) throws NegativeDimensionException{
        // TODO code application logic here
        
        try{
            method1();
        }
        catch(NegativeDimensionException e)
        {
         System.out.println(e);
        }
        
    }
    
}
