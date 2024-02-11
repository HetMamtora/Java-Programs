package scstring;

public class SCString {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //1-FIND IF THE EMAIL ID IS ON GMAIL OR NOT
        System.out.println("1-FIND IF THE EMAIL ID IS ON GMAIL OR NOT");
        String str="abcd@gmail.com";
        
        System.out.println(str);
        
        int i=str.indexOf("@");
        String uname=str.substring(0,i);
        String domain=str.substring(i+1, str.length());
        
        System.out.println("USERNAME: "+uname);
        System.out.println("DOMAIN: "+domain);
        
        int j=domain.indexOf(".");
        String name=domain.substring(0,j);
        System.out.println(name.equals("gmail"));
        
        
        //2-FIND IF NUMBER IS BINARY OR NOT
        System.out.println("\n2-FIND IF NUMBER IS BINARY OR NOT");
        int b=1001110;
        String str1=String.valueOf(b);
        System.out.println(b);
        System.out.println(str1.matches("[01]+"));
        
        //3-FIND IF NUMBER IS HEXA-DECIMAL OR NOT
        System.out.println("\n3-FIND IF NUMBER IS HEXA-DECIMAL OR NOT");
        String str2="234AB";
        System.out.println(str2);
        System.out.println(str2.matches("[0-9A-F]+"));
    }
    
}
