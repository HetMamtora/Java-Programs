import java.lang.*;

class Bitwise
{
	public static void main(String args[])
	{
		//SWAPING
		int r1=10,r2=15;
		r1=r1^r2;
		r2=r1^r2;
		r1=r1^r2;
		System.out.println(r1);
		System.out.println(r2);


		//SWAPING-2
		byte a=9,b=12;
		byte c;

		c=(byte)(a<<4);
		c=(byte)(c|b);

		System.out.println((c&0b11110000)>>4);
		System.out.println((c&0b00001111));
	}
}