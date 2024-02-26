package multithreadingrunnabledemo;

class MyRunnable implements Runnable
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

public class MultiThreadingRunnableDemo {

    //METHOD-1
    //MULTITHREADING RUNNABLE DEMO
    /*public static class ThreadTest implements Runnable
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
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ThreadTest t=new ThreadTest();
        MyRunnable t=new MyRunnable();
        Thread th=new Thread(t);
        th.start();
        
        
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }
    }
    
}
