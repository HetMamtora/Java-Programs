package tryresourcedemo;
import java.io.*;
import java.util.*;

public class TryResourceDemo {

    static void Divide() throws Exception
    {
        try(FileInputStream fi=new FileInputStream("D:\\Projects\\Java-Programs\\test.txt.txt");Scanner sc=new Scanner(fi) )
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/b);
            
            fi.close();
        }
    }
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        try
        {
            Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
