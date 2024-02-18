package recursionprac;

public class RecursionPrac
{
    static void fun(int n)
    {
        if(n>0)
        {
            fun(n-1);

            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        fun(3);
    }
    
}
