package copyfileeg;
import java.io.*;

public class CopyFileEg {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        FileInputStream fis1=new FileInputStream("Source1.txt");
        FileInputStream fis2=new FileInputStream("Source2.txt");
        
        //FileOutputStream fos=new FileOutputStream("Source2.txt");
        FileOutputStream fos=new FileOutputStream("Destination.txt");
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        
        
        int b;
        //while((b=fis.read())!=-1)
        while((b=sis.read())!=-1)
        {
            /*if(b>=65 && b<=90)
                fos.write(b+32);
            else*/
                fos.write(b);
        }
        
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
    }
    
}
