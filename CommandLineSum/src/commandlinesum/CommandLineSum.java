package commandlinesum;

public class CommandLineSum {

    public static void main(String[] args) {
        // TODO code application logic here
        
        double s=0;
        
        for(String x:args)
        {
            s=s+Double.parseDouble(x);
        }
        System.out.println("Sum is: "+s);
    }
    
}
