package inheritanceconstructors;

class Parent
{
    public Parent()
    {
        System.out.println("Parent Constructor.");
    }
}
class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor.");
    } 
}
class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("Grand Child Constructor.");
    } 
}

public class InheritanceConstructors {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Parent p=new Parent();
        //Child c=new Child();
        GrandChild g=new GrandChild();
    }
    
}
