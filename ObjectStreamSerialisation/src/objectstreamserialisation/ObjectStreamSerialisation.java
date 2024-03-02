package objectstreamserialisation;
import java.io.*;

class Student implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=20;
    public transient int t;
    
    public Student()
    {}
    
    public Student(int r, String n, float a, String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }
    
    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll.No: "+rollno+
                "\nName: "+name+
                "\nAverage: "+avg+
                "\nDepartment "+dept+
                "\nData: "+Data+
                "\nTransient: "+t+"\n";
    }
}

public class ObjectStreamSerialisation {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        //WRITE DATA INTO FILE
        /*FileOutputStream fos=new FileOutputStream("Student.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Student s=new Student(10,"ABC",89.9f,"CSE");
        
        oos.writeObject(s);
        
        fos.close();
        oos.close();*/
        
        //READ DATA FROM FILE
        FileInputStream fis=new FileInputStream("Student.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Student s=(Student)ois.readObject();
        
        System.out.println(s);
        
        fis.close();
        ois.close();
    }
    
}
