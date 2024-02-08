import java.lang.*;
import java.util.Scanner;

class AreaOfTriangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		//TYPE-1

		float base,height,area;

		System.out.println("Enter Base: ");
		base=sc.nextFloat();
		System.out.println("Enter Height: ");
		height=sc.nextFloat();

		area=base*height/2;
		System.out.println("Area of Triangle1: "+area);
		
		//TYPE-2
		int a,b,c;
		float s;
		double area1;
		
		System.out.println("Enter 3 sides of a Triangle: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		s=(a+b+c)/2f;
		area1=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle2: " +area1);
		
	}

}