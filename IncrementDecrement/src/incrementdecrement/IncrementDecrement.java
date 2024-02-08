package incrementdecrement;

public class IncrementDecrement {

    public static void main(String[] args) {
        
        int x=5;
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);
        
        int x1=5,y1;
        y1=x1++;
        System.out.println(x1+" "+y1);
        y1=++x1;
        System.out.println(x1+" "+y1);
        
        int x2=5,y2=4,z2;
        z2=2*x2++ + 3 * ++y2;
        System.out.println(z2);
        
        float a=3.5f;
        a++;
        System.out.println(a);
        
        char a1='A';
        a1++;
        System.out.println(a1);
        
        
    }
    
}
