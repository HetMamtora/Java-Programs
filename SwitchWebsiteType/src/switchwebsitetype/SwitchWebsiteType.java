package switchwebsitetype;
import java.util.*;

public class SwitchWebsiteType {

    public static void main(String[] args) {
         // TODO code application logic here
         
         Scanner sc=new Scanner(System.in);
         
         String domain;
         System.out.println("Enter Domain: ");
         domain=sc.nextLine();
         
         String ext=domain.substring(domain.lastIndexOf(".")+1);
         
         switch(ext)
         {
             case "com": System.out.println("Commercial");
                      break;
             case "org": System.out.println("Organisation");
                      break;
             case "gov": System.out.println("Government");
                      break;
             case "net": System.out.println("Network");
                      break;
         }
    }
}