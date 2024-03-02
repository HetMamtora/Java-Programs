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
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
}

public class ObjectStreamSerialisation {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
    }
    
}
