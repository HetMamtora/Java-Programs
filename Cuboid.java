import java.lang.*;
import java.util.Scanner;

class Cuboid
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int length,breadth,height;
		int area, volume;

		System.out.println("Enter value for Length, Breadth & Height:");
		length=sc.nextInt();
		breadth=sc.nextInt();
		height=sc.nextInt();

		area=(length*height)+(length*breadth)+(breadth*height);
		System.out.println("Area of Cuboid: " +area);

		volume=length*breadth*height;
		System.out.println("Volume of Cuboid: " +volume);
	}
}