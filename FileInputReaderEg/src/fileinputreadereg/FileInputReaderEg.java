package fileinputreadereg;
import java.io.*;

public class FileInputReaderEg {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        //try(FileInputStream fis=new FileInputStream("D:/Projects/Java-Programs/test.txt"))
        try(FileReader fr=new FileReader("D:/Projects/Java-Programs/test.txt"))
        {
            /*byte b[]=new byte[fis.available()];
            fis.read(b);
            
            String str=new String(b);
            System.out.println(str);*/
            
            /*int x;
            do{
                x=fis.read();
                if(x!=-1)
                    System.out.print((char)x);
            }while(x!=-1);*/
            
            int x;
            while((x=fr.read())!=-1)
            {
                System.out.print((char)x);
            }
            
            
        }
    }
    
}
