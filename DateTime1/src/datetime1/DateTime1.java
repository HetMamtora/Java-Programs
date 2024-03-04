package datetime1;
import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class DateTime1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //OLD METHOD - MUTABLE 
        Date d=new Date();
        d.setHours(21);
        System.out.println(d);
        
        //NEW CLASS
        LocalDate dt=LocalDate.now();
        System.out.println(dt);
        
        LocalDate dt1=LocalDate.now(Clock.systemDefaultZone());
        System.out.println(dt1);
        
        LocalDate dt2=LocalDate.of(2020, Month.MARCH,10);
        System.out.println(dt2);
        
        LocalDate dt3=LocalDate.ofEpochDay(1);
        System.out.println(dt3);
        
        LocalDate dt4=LocalDate.parse("2023-01-03");
        LocalDate d1=dt4.plusMonths(6);
        System.out.println(d1);
        
        //TIME 
        LocalTime lt=LocalTime.now();
        System.out.println(lt);
        LocalTime t=lt.minusHours(3);
        System.out.println(t);
        
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        
    }
    
}
