package typeofwebsite;
import java.util.*;

public class TypeofWebsite {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        String url;
        System.out.println("Enter the URL: ");
        url=sc.nextLine();
        
        String protocol=url.substring(0,url.indexOf(":"));
        if(protocol.equals("http"))
        {
            System.out.println("HyperText Transfer Protocol");
        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("File Transfer Protocol");
        }
        
        String ext=url.substring(url.lastIndexOf(".")+1);
        if(ext.equals("com"))
        {
            System.out.println("Commercial");
        }
        else if(ext.equals("org"))
        {
            System.out.println("Organisation");
        }
        else if(ext.equals("net"))
        {
            System.out.println("Network");
        }
    }
    
}
