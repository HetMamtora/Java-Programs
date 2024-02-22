package methodoverridetv;

class TV
{
    public void switchON()
    {
        System.out.println("TV is switched ON.");
    }
    public void changeChannel()
    {
        System.out.println("TV channel is changed.");
    }
}

class SmartTV extends TV
{
    @Override
    public void switchON()
    {
        System.out.println("SmartTV is switched ON.");
    }
    @Override
    public void changeChannel()
    {
        System.out.println("SmartTV channel is changed.");
    }
    public void browse()
    {
        System.out.println("SmartTV browsing menu.");
    }
}

public class MethodOverrideTV {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // 1
        TV t=new TV();
        t.switchON();
        t.changeChannel();
        System.out.println("");
        
        // 2
        SmartTV t1=new SmartTV();
        t1.switchON();
        t1.browse();
        System.out.println("");
        
        
        //DYNAMIC METHOD DISPATCH
        // 3
        TV t2=new SmartTV();
        // SmartTV t2=new TV(); //IT IS WRONG WE CANNOT CALL THIS
        t2.switchON();
        //t2.browse(); //ONLY SUPER CLASS METHODS ARE ALLOWED
        t2.changeChannel();
        
        
        
        
    }
    
}
