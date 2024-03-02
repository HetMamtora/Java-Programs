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
        
        FileOutputStream fos=new FileOutputStream("Student1.txt");
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
        fos.close();
    }
    
}
