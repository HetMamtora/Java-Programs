package genericjavademo4;

interface A{}
class B implements A{}
class C implements A{}

@SuppressWarnings("unchecked")
class MyArray<T>
{
    T A[]=(T[])new Object[10];
    int length=0;
    
    public void append(T v)
    {
        A[length++]=v;
    }
    public void display()
    {
        for(int i=0; i<length;i++)
        {
            System.out.println(A[i]);
        }
    }
}

public class GenericJavaDemo4 {
    
    //GENERIC METHOD
    static<E> void show(E[] list) //BOUND TYPES ALSO WORK: static<E extends Number> void show(E...list)
    {
        for(E x:list)
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        show(new String[]{"Hii","Go","Bye"});
        show(new Integer[]{10,20,30,40});
    }
    
}
