package methodoverridecar;

class Car
{
    public void start()
    {
        System.out.println("CAR Started");
    }
    public void accelerate()
    {
        System.out.println("CAR is getting Accelerated");
    }
    public void changeGear()
    {
        System.out.println("CAR is changing gear.");
    }
}
class LuxuryCar extends Car
{
    public void changeGear()
    {
        System.out.println("CAR has automatic gear.");
    }
    public void OpenRoof()
    {
        System.out.println("CAR is opening the Sun Roof.");
    }
}

public class MethodOverrideCar {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // 1
        Car c=new Car();
        c.start();
        c.accelerate();
        c.changeGear();
        System.out.println("");
        
        // 2
        LuxuryCar c1=new LuxuryCar();
        c1.start();
        c1.accelerate();
        c1.changeGear();
        c1.OpenRoof();
        System.out.println("");
        
        // 3
        Car c2=new LuxuryCar();
        c2.start();
        c2.accelerate();
        c2.changeGear();
        //c2.OpenRoof();   NOT ALLOWED
        System.out.println("");
    }
    
}
