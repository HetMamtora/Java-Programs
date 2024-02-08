package arithmetic;

public class Arithmetic
{
    public static void main(String[] args)
    {
        //INTEGER DATA TYPE
        int a=14, b=5;
        int c=a/b;
        int r=a%b;
        //type cast
        float c1=(float)a/b;
        float r1=(float)a%b;
        
        System.out.println("C: "+c);
        System.out.println("R: "+r);
        System.out.println("C1: "+c1);
        System.out.println("R1: "+r1);
        
        //FLOAT DATA TYPE
        float a1=14.3f, b1=3.2f;
        float r2=a1%b1;
        
        System.out.println("R2: "+r2);
        
        //EXPRESSIONS
        byte a2=10;
        short b2=15;
        int c2=a2+b2;
        
        float a3=12.5f;
        long b3=123l;
        float c3=a3+b3;
        
        char a4=40;
        int b4=30;
        int c4=a4-b4;
        
        System.out.println("C2: "+c2);
        System.out.println("C3: "+c3);
        System.out.println("C4: "+c4);
    }
    
}
