package genericjavademo3;

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

public class GenericJavaDemo3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        MyArray<Integer> ma=new MyArray<>();
        
        ma.append(10);
        ma.append(20);
        ma.append(30);
        
        ma.display();
    }
    
}
