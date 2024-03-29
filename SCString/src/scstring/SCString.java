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
        
        //4-FIND IF DATE IS PROPER DATE FORMAT OR NOT[dd/mm/yyyy]
        System.out.println("\n4-FIND IF DATE IS PROPER DATE FORMAT OR NOT[dd/mm/yyyy]");
        String str3="01/12/2000";
        System.out.println(str3);
        System.out.println(str3.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
        
        //5-REMOVE SPECIAL CHARACTERS FROM STRING
        System.out.println("\n5-REMOVE SPECIAL CHARACTERS FROM STRING");
        String str4="a!B@c#1$2%3";
        System.out.println(str4);
        System.out.println(str4.replaceAll("[^a-zA-Z0-9]",""));
        
        //6-REMOVE EXTRA SPACES FROM STRING
        System.out.println("\n6-REMOVE EXTRA SPACES FROM STRING");
        String str5="abc    def    gh    ijk";
        System.out.println(str5);
        System.out.println(str5.replaceAll("\\s+"," "));
        
        //7-FIND NO. OF WORDS IN A STRING
        System.out.println("\n7-FIND NO. OF WORDS IN A STRING");
        String str6="    abc    def    gh    ijk    ";
        str6=str6.replaceAll("\\s+", " ").trim();
        String words[]=str6.split("\\s");
        System.out.println(str6);
        System.out.println(words.length);
    }
    
}
