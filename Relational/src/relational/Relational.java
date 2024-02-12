package relational;

public class Relational {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int a=5,b=10,c=15;
        System.out.println(a<b);
        
        //NORMAL CONDITIONAL
        int n=5;
        if(n>=0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
        
        //MAX OF 3
        if(a>b && a>c)
        {
            System.out.println(a);
        }
        else if(b>c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
    
}
