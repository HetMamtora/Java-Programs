import java.lang.*;
import java.util.Scanner;

class QuadraticEq
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a,b,c;
		double r1,r2;

		System.out.println("Enter value for A, B & C:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		r1=(-b+Math.sqrt((b*b)-(4*a*c)))/2*a;
		r2=(-b-Math.sqrt((b*b)-(4*a*c)))/2*a;
		
		System.out.println("Root 1: "+r1);
		System.out.println("Root 2: "+r2);
	}
}