import java.lang.*;
import java.util.*;

class SumofTwo
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		int a,b,c;

		System.out.println("Enter 2 Nos :: ");
		a=s.nextInt();
		b=s.nextInt();	
		c=a+b;

		System.out.println("Sum is ::" +c);
	}
}