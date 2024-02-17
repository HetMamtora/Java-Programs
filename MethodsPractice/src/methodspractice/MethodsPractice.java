package methodspractice;

public class MethodsPractice
{
    static int max(int x,int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    
    static void inc(int i)
    {
        i++;
        System.out.println(i);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        int a=15,b=10;
        System.out.println(max(a,b));

        MethodsPractice mp=new MethodsPractice();
        System.out.println(mp.max(a,b));
        
        inc(a);
        System.out.println(a);
    }
    
}
