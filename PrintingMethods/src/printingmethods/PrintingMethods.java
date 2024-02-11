
package printingmethods;

public class PrintingMethods {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //PRINT & PRINTF
        int a=10;
        float b=12.55f;
        char c='A';
        String str="Hello";
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(str);
        
        int x=10,y=20;
        System.out.println(x+y);
        System.out.println("Number is "+y);
        System.out.println(x+y+" Sum");
        System.out.println("Sum "+ x+y);
        System.out.println("Sum "+ (x+y));
        System.out.println("Sum of "+x+" and "+y+" is "+(x+y));
        
        //PRINTF & FORMAT
        int x1=10;
        float y1=12.56f;
        char z='A';
        //%d for int, %f for float, %c for char
        System.out.printf("Hello %d, %f, %c World !\n",x1,y1,z);
        
        //WIDTH & PRECESSION
        int n=10;
        System.out.printf("%05d \n",n);
    }
    
}
