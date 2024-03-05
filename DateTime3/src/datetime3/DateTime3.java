package datetime3;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;
public class DateTime3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        LocalDateTime dt=LocalDateTime.now();
        
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println(df.format(dt));
        
        //CHRONO FIELDS
        LocalDateTime dt1=LocalDateTime.now();
        System.out.println(dt1.get(ChronoField.DAY_OF_MONTH));
        
    }
    
}
