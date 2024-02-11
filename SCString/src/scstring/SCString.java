package scstring;

public class SCString {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //FIND IF THE EMAIL ID IS ON GMAIL OR NOT
        
        String str="abcd@gmail.com";
        
        int i=str.indexOf("@");
        String uname=str.substring(0,i);
        String domain=str.substring(i+1, str.length());
        
        System.out.println("USERNAME: "+uname);
        System.out.println("DOMAIN: "+domain);
        
        int j=domain.indexOf(".");
        String name=domain.substring(0,j);
        System.out.println(name.equals("gmail"));
    }
    
}
