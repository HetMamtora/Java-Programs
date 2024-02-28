package annotationseg2;

import java.lang.annotation.*;

//@Retention(RetentionPolicy.Class)
//@Documented
//@Target(value=ElementType.LOCAL_VARIABLE,ElementType.METHOD)
//Repeatable(MyAnno.class)
@interface MyAnno
{
    String name();
    String project();
    String date() default "today";
    String version() default "10";
}

//@MyAnno(name="Ajay",project="Bank")

public class AnnotationsEg2 {
    
    int data;
    //@MyAnno(name="Ajay",project="Bank")
    
    
    //@MyAnno(name="Ajay")

    public static void main(String[] args) {
        // TODO code application logic here
        
        //@MyAnno(name="Ajay")
        int x;
    }
    
}
