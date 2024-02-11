package stringpractice;

public class StringPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //METHODS OF CREATING A STRING
        System.out.println("METHODS OF CREATING A STRING::");
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
        
        //ALL STRING METHODS #1
        System.out.println("\nALL STRING METHODS #1::");
        String str9=new String("netbeans");
        System.out.println(str9.length());
        String strUp=str9.toUpperCase();
        System.out.println(strUp);
        String str10=new String("   netbeans   ");
        System.out.println(str10);
        str10=str10.trim();
        System.out.println(str10);
        String strSub=str9.substring(3);
        System.out.println(strSub);
        String strSub1=str9.substring(3,7);
        System.out.println(strSub1);
        String strRep=str9.replace('e','M');
        System.out.println(strRep+" "+str9);
        
        //ALL STRING METHODS #2
        System.out.println("\nALL STRING METHODS #2::");
        String str11="Mr. Tom Cruise";
        System.out.println(str11.startsWith("Mr."));
        System.out.println(str11.startsWith("Tom",4));
        System.out.println(str11.endsWith("Cruise"));
        System.out.println(str11.endsWith("cruise"));
        System.out.println(str11.charAt(4));
        for (int i=0;i<str11.length();i++)
            System.out.println(str11.charAt(i));
        for (int i1=0;i1<str11.length();i1++)
            System.out.print(str11.charAt(i1));
        
        String str12="www.abcd.co.in";
        System.out.println("\n");
        System.out.println(str12.indexOf('.',9));
        
        //ALL STRING METHODS #3
        System.out.println("\nALL STRING METHODS #3::");
        
        String str13="Pyramid";
        String str14="Pyramid";
        String str15="pyramid";
        String str16=new String("Pyramid");
        String str17=new String("pyramid");
        String str18="the great wall of china";
        String str19=" is very great";
        System.out.println(str13.equals(str14));
        System.out.println(str13.equalsIgnoreCase(str15));
        System.out.println(str13==str14);
        System.out.println(str13==str15);
        System.out.println(str13==str16);
        System.out.println(str13.equals(str16));
        
        System.out.println(str13.compareTo(str16)); //same will return 0
        System.out.println(str16.compareTo(str17)); //checks difference between 2 ASCII code
        
        System.out.println(str18.contains("wall"));
        System.out.println(str18.concat(str19));
        
        
    }
    
}
