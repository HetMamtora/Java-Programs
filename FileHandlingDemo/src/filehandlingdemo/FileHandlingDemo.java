package filehandlingdemo;
import java.io.*;

public class FileHandlingDemo {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        File f=new File("D:/Projects/Java-Programs");
        System.out.println(f.isDirectory());
        /*String list[]=f.list();
        for(String x:list)
        {
            System.out.println(x);;
        }*/
        File list[]=f.listFiles();
        for(File x:list)
        {
            System.out.println(x.getName());
            System.out.println(x.getPath());
        }
    }
    
}
