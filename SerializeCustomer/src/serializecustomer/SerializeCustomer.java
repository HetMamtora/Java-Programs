package serializecustomer;
import java.io.*;
import java.util.*;

class Customer implements Serializable
{
    String custID;
    String name;
    String phno;
    
    static int count=0;
    
    Customer()
    {}
    
    Customer(String n, String p)
    {
        custID="C"+count;
        count++;
        name=n;
        phno=p;
    }
    
    public String toString()
    {
        return "Customer ID: "+custID+"\nName: "+name+"\nPh.No: "+phno+"\n";
    }
}


public class SerializeCustomer {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        //WRITE INTO FILE
        /*Customer list[]={new Customer("ABC","1234567890"),new Customer("BCD","2345678901"),new Customer("CDE","3456789012")};
        
        FileOutputStream fos=new FileOutputStream("Customer.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        oos.writeLong(list.length);
        
        for(Customer c:list)
            oos.writeObject(c);
        
        oos.close();
        fos.close();*/
        
        
        //READ FROM FILE 
        Scanner sc=new Scanner(System.in);
        
        FileInputStream fis=new FileInputStream("Customer.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        int length=ois.readInt();
        
        Customer list[]=new Customer[length];
        
        for(int i=0; i<length; i++)
        {
            list[i]=(Customer)ois.readObject();
        }
        
        System.out.print("Enter name of Customer: ");
        String name=sc.nextLine();
        
        for(int i=0; i<length; i++)
        {
            if(name.equalsIgnoreCase(list[i].name))
                System.out.println(list[i]);
        }
        ois.close();
        fis.close();
    }
    
}
