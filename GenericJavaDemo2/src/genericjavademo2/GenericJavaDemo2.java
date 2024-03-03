package genericjavademo2;

class Data<T>
{
    private T obj;
    
    public void setData(T v)
    {
        obj=v;
    }
    public T getData()
    {
        return obj;
    }
}

public class GenericJavaDemo2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Data<Integer> d=new Data<>();
        d.setData(10);
        System.out.println(d.getData());
        Data<String> d1=new Data<>();
        d1.setData("Hello World");
        System.out.println(d1.getData());
    }
    
}
