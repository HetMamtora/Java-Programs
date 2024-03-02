package datastreamserialisation;
import java.io.*;

class Student
{
    int rollno;
    String name;
    float avg;
    String dept;
}

public class DataStreamSerialisation {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        //WRITING INTO FILE
        /*FileOutputStream fos=new FileOutputStream("Student1.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        
        Student s=new Student();
        s.rollno=10;
        s.name="ABC";
        s.dept="Computer";
        s.avg=85.5f;
        
        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);
        dos.writeFloat(s.avg);
        
        //TXT FILE IS ACTUALLY BINARY FILE OPEN IT TO UNDERSTAND
        
        dos.close();
        fos.close(); */
        
        //READING FROM FILE
        FileInputStream fis=new FileInputStream("Student1.txt");
        DataInputStream dis=new DataInputStream(fis);
        
        Student s=new Student();
        s.rollno=dis.readInt();
        s.name=dis.readUTF();
        s.dept=dis.readUTF();
        s.avg=dis.readFloat();
        
        System.out.println("Roll.No: "+s.rollno);
        System.out.println("Name: "+s.name);
        System.out.println("Department: "+s.dept);
        System.out.println("Average: "+s.avg);
        
        dis.close();
        fis.close();
    }
    
}
