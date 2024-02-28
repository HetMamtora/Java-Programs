package wrapperclasseg;

public class WrapperClassEg {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer i=new Integer(10); //i=10
        Integer a=Integer.valueOf(10);
        Integer b=10;
        
        Byte c=15;
        Byte d=Byte.valueOf("15");
        byte bb=15;
        Byte e=Byte.valueOf(bb);
        
        Short f=Short.valueOf("123");
        
        Float g=12.3f;
        Float h=Float.valueOf("123.5");
 
        Double j=Double.valueOf(123.456);       
        Character k=Character.valueOf('A');
        Boolean l=Boolean.valueOf("true");
        
        //Float h=Float.valueOf("123.5");
        float x=h.floatValue(); //AUTO-UNBOXING TECHNIQUE
        float y=h;
        
        int m=10;
        Integer n=Integer.valueOf(m); //AUTO BOXING
        
    }
    
}
