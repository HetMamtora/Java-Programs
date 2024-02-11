package stringpractice;

public class StringPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //METHODS OF CREATING A STRING
        String str1="Java Program";
        String str2=new String("JAVA");
        
        char c[]={'H','e','l','l','o'};
        String str3=new String(c);
        
        byte b[]={65,66,67,68};
        String str4=new String(b,2,2);
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        
        //STRING POOL
        String str5="Java";
        String str6="Java";
        String str7="java";
        String str8=new String("Java");
        
        System.out.println(str5==str6);
        System.out.println(str5==str7);
        System.out.println(str5==str8);
    }
    
}
