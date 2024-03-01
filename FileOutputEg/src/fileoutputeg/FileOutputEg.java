package fileoutputeg;
import java.io.*;

public class FileOutputEg {

    public static void main(String[] args) {
        // TODO code application logic here
        
        try
        {
            FileOutputStream fos=new FileOutputStream("D:/Projects/Java-Programs/test.txt");
            String str="Learn Java Programming";
            
            byte b[]=str.getBytes();
            for(byte x:b)
                fos.write(x);
            fos.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
        
    }
    
}
