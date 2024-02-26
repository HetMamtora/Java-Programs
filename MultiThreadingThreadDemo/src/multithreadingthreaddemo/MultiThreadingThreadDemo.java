package multithreadingthreaddemo;

//NORMAL THREAD DEMO
/*class MyThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }
}*/

public class MultiThreadingThreadDemo {
    
    //MULTITHREADING DEMO
    public static class ThreadTest extends Thread
    {
        public void run()
        {
            int i=1;
            while(true)
            {
                System.out.println(i+" Hello");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        ThreadTest t=new ThreadTest();
        t.start();
        
        //ThreadTest t1=new ThreadTest();
        //t1.start();
        
        
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }
    }
    
}
