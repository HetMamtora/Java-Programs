package interfacephone;

class Phone 
{
    public void call()
    {
        System.out.println("Phone is calling.");
    }
    public void sms()
    {
        System.out.println("Phone is sending SMS.");
    }
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall()
    {
        System.out.println("Smart Phone video calling");
    }
    @Override
    public void click()
    {
        System.out.println("Smart Phone Clicking Photo");
    }
    @Override
    public void record()
    {
        System.out.println("Smart Phone recording video");
    }
    @Override
    public void play()
    {
        System.out.println("Smart Phone playing music");
    }
    @Override
    public void stop()
    {
        System.out.println("Smart Phone stopped playing music");
    }

}

public class INterfacePhone {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //1
        SmartPhone sp=new SmartPhone();
        sp.call();
        sp.click();
        sp.play();
        System.out.println("");
        
        //2
        Phone sp1=new SmartPhone();
        sp1.call();
        sp1.sms();
        System.out.println("");
        
        //3
        ICamera sp3=new SmartPhone();
        sp3.click();
        sp3.record();
        System.out.println("");
        
        //4
        IMusicPlayer sp4=new SmartPhone();
        sp4.play();
        sp4.stop();
        System.out.println("");
    }
    
}
