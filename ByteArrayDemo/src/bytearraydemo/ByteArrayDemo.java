package bytearraydemo;
import java.io.*;

public class ByteArrayDemo {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        //BYTE ARRAY INPUT-OUTPUT
        byte b[]={'a','b','c','d','e','f','g','h','i','j'};
        
        /*ByteArrayInputStream bis=new ByteArrayInputStream(b);
        String str=new String(bis.readAllBytes());
        System.out.println(str);
        System.out.println(bis.markSupported());
        bis.close();*/
        
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        byte b1[]=bos.toByteArray();
        
        
        /*for(byte x:b1)
            System.out.println((char)x);*/
        
        
        //CHAR ARRAY READER
        char c[]={'a','b','c','d','e','f','g','h','i','j'};
        CharArrayReader cr=new CharArrayReader(c);
        
        int x;
        
        while((x=cr.read())!=-1)
        {
            System.out.print((char)x);
        }
        cr.close();
    }
}