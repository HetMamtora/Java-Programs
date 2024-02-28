package userannotationseg;

//import java.lang.annotation.Annotation;

@interface MyAnno
{
    String name();
    String project();
    String date() default "today";
    String version() default "10";
}

@MyAnno(name="Het",project="Bank")

public class UserAnnotationsEg {
    
    //@MyAnno(name="Het")
    int data;
    
    //@MyAnno(name="Het")
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //@MyAnno(name="Het")
        int x;
    }
    
}
