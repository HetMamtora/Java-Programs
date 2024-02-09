import java.lang.*;

class Bitwise
{
	public static void main(String args[])
	{
		//SWAPING
		int a=10,b=15;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
	}
}