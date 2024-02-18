package varargsdiscount;

public class VarargsDiscount
{
    static double discount(double ...P)
    {
        double sum=0;
        
        for(int i=0;i<P.length;i++)
            sum+=P[i];
        
        if(sum<500) return sum*0.10;
        else if(sum>=500 && sum<1000) return sum*0.15;
        else return sum*0.20;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        double A[]={500,250};
        System.out.println("Discount: "+discount(A));
    }
    
}
