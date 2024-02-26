package threadmethodsdemo1;

class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        //setPriority(Thread.MAX_PRIORITY);
    }
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i++);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

public class ThreadMethodsDemo1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        MyThread t=new MyThread("My Thread 1");
        t.start();
        t.interrupt();
        
        /*System.out.println("ID: "+t.getId());
        System.out.println("Name:"+t.getName());
        System.out.println("Priority: "+t.getPriority());
        t.start();
        System.out.println("State: "+t.getState());
        System.out.println("Alive: "+t.isAlive());*/
    }
    
}
