package constructorsstudent;

class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;
    
    public Subject(String subID, String name, int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    
    //GETTER METHODS
    public String getSubID()
    {
        return subID;
    }
    public String getName()
    {
        return name;
    }
    public int getMaxMarks()
    {
        return maxMarks;
    }
    public int getMarksObtain()
    {
        return marksObtain;
    }
    
    //SETTER METHODS
    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }
    public void setMarksObtain(int m)
    {
        marksObtain=m;
    }
    boolean isQualified()
    {
        return marksObtain>=maxMarks/10*4;
    }
    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtain;
    }
}

class Student
{

}

public class ConstructorsStudent {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Subject subs[]=new Subject[3];
        
        subs[0]=new Subject("S101","DS",100);
        subs[1]=new Subject("S102","Java",100);
        subs[2]=new Subject("S103","Web Development",100);
        
        for(Subject s:subs)
        {
            System.out.println(s);
        }
    }
    
}
