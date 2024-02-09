package bitwisedemo;

public class BitwiseDemo {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int x=0b1010;
        int y=0b0110;
        int z,z1,z2,z3;
        z=x&y;
        z1=x|y;
        z2=x^y;
        System.out.println(z);
        System.out.println(z1);
        System.out.println(z2);
        
        int x1=0b1000;
        int x2=-0b1010;
        int y1,y2,y3;
        y1=x1<<2;
        y2=x1>>1;
        y3=x>>>1;
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
    }
    
}
