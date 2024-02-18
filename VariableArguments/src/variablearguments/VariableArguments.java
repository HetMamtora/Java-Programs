package variablearguments;

public class VariableArguments
{
    static void show(int ...A)
    {
        for(int x:A)
        {
            System.out.println(x);
        }
    }
    
    static void showList(String ...S)
    {
        for(int i=0;i<S.length;i++)
        {
            System.out.println(i+1+"."+S[i]);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        show();
        show(10,20,30);
        show(new int[]{3,5,7,9,1,13,15});
        
        showList("John","abc","Ajay","Smith","Sheldon");       
    }   
}
