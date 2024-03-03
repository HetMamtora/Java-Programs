package genericjavademo4;

class A{}
class B extends A{}
class C extends B{}

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
    /*static<E> void show(E[] list) //BOUND TYPES ALSO WORK: static<E extends Number> void show(E...list)
    {
        for(E x:list)
        {
            System.out.println(x);
        }
    }*/
    
    /*static void fun(MyArray obj)
    {
        obj.display();
    }*/
    
    //UNBOUNDED WILDCARD
    static void fun(MyArray<? super C> obj)
    {
        obj.display();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        //1-GENERIC METHOD
        //show(new String[]{"Hii","Go","Bye"});
        //show(new Integer[]{10,20,30,40});
        
        //2-WILDCARD
        /*MyArray<String> ma1=new MyArray<>();
        ma1.append("Hi");
        ma1.append("Bye");
        
        MyArray<Integer> ma2=new MyArray<>();
        ma2.append(10);
        ma2.append(20);
        
        fun(ma1);
        fun(ma2);*/
        
        //3-WILDCARD
        MyArray<B> ma1=new MyArray<>();
        MyArray<C> ma2=new MyArray<>();
        fun(ma1);
        fun(ma2);
    }
    
}
