package widenarrowdemo;

public class WideNarrowDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        byte b=10;
        short s=10;
        int i=10;
        long l=10;
        float f=10;
        double d=10;
        char c=10;
        boolean bl=true;
        
        // NOT TO RUN JUST CHECK DATA TYPE COMPATEBILITY FOR WIDENING
        s=b;
        i=b;
        l=b;
        f=b;
        l=b;
        
        i=s;
        l=s;
        f=s;
        d=s;
    }
    
}
