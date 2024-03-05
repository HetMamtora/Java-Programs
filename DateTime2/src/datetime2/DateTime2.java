package datetime2;
import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class DateTime2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //DATE TIME CLASSES AND OBJECTS
        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt);
        
        OffsetDateTime odt=OffsetDateTime.now();
        System.out.println(odt);
        System.out.println(odt);
        
        MonthDay md=MonthDay.now();
        System.out.println(md);
        
        Period p=Period.of(2, 2, 10);
        System.out.println(p.addTo(LocalDate.now()));
        
        Instant i=Instant.now();
        System.out.println(i);

    }    
}