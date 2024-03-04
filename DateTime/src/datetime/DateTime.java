package datetime;
import java.util.*;

public class DateTime {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //1-DATE REPRESENTATION
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000);
        System.out.println(System.currentTimeMillis()/1000/60);
        System.out.println(System.currentTimeMillis()/1000/60/60);
        System.out.println(System.currentTimeMillis()/1000/60/60/24);
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        
        System.out.println(Long.MAX_VALUE);
        
        //2-DATE CLASS
        Date d=new Date(); //CONTAINS BOTH DATE & TIME
        System.out.println(d);
        System.out.println(d.getDate());
        
        Date d1=new Date("1/1/1980");
        System.out.println(d1);
        
        //3-CALENDER CLASS
        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.get(Calendar.MONTH)); //CHANGE METHODS TO UNDERSTAND
        
        //4-TIME ZONE
        TimeZone tz=gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());
        
    }
    
}
