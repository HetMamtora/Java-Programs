package propertydemo;
import java.util.*;
import java.io.*;

public class PropertyDemo {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        Properties p=new Properties();
        
        p.setProperty("Brand", "ASUS-ROG");
        p.setProperty("Processor", "i5-10th Gen");
        p.setProperty("OS", "Windows-11");
        p.setProperty("Model", "ROG-Strix");
        
        
        p.storeToXML(new FileOutputStream("MyData.xml"), "Laptop");
        
        
        p.load(new FileInputStream("MyData.txt"));
        
        System.out.println(p);
    }
    
}
