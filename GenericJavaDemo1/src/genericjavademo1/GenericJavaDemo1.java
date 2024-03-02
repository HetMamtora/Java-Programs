package genericjavademo1;

public class GenericJavaDemo1<T> {
    
    T data[]=(T[]) new Object[3]; // GENERIC DECLARATION

    public static void main(String[] args) {
        // TODO code application logic here
        
        //1 - CLASS OBJECT
        /*Object obj=new String("Hello");
        obj=new Integer(10); //CLASS CAST EXCEPTION

        //String str=obj; //NOT ALLOWED
        String str=(String)obj;*/
        
        //2 - ARRAY OF OBJECT
        /*Object obj[]=new Object[3];
        
        obj[0]="hi";
        obj[1]="bye";
        obj[2]=new Integer(10);
        
        String str;
        
        for(int i=0; i<3; i++)
        {
            str=(String)obj[i];
            System.out.println(str);
        }*/
        
        //3 - TO OBTAIN GENERALISATION
        GenericJavaDemo1<String> gd=new GenericJavaDemo1();
        
        gd.data[0]="hi";
        gd.data[1]="bye";
        //gd.data[2]=new Integer(10);
        
        String str=gd.data[0];
        
    }
    
}
