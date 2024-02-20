package classegstudent;
import java.util.*;

class Student
{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    
    public int total()
    {
        return m1+m2+m3;
    }
    public float average()
    {
        return (float)total()/3;
    }
    public char grade()
    {
        if(average()>80 || average()<=100)
            return 'A';
        else if(average()>70 || average()<=80)
            return 'B';
        else if(average()>60 || average()<=70)
            return 'C';
        else if(average()>50 || average()<=60)
            return 'D';
        else if(average()>40 || average()<=50)
            return 'E';
        else
            return 'F';
    }
    public String details()
    {
        return "Roll No: "+roll+"\n"+"Name: "+name+"\n"+"Course: "+course+"\n";
    }
}

public class ClassEgStudent {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        Student s=new Student();
       
        System.out.print("Enter Roll No.: ");
        s.roll=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        s.name=sc.nextLine();
        System.out.println("Enter marks of 3 subjects: ");
        s.m1=sc.nextInt();
        s.m2=sc.nextInt();
        s.m3=sc.nextInt();
        
        System.out.println("Total: "+s.total());
        System.out.println("Average: "+s.average());
        System.out.println("Grade: "+s.grade());
        System.out.println("Details: \n"+s.details());
        
    }
    
}
