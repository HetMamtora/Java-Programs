package threadmethodsdemo2;

class MyThread extends Thread
{
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++ +" My Thread");
        }
    }
}

public class ThreadMethodsDemo2 {

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        MyThread t=new MyThread();
        //t.setDaemon(true);
        t.start();
        
        int count=1;
        while(true)
        {
            System.out.println(count++ +" Main");
            Thread.yield();
        }
        
        //Thread mainThread=Thread.currentThread();
        //mainThread.join();
        
        /*try{
            Thread.sleep(100);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }*/
    }
    
}
