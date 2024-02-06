import java.lang.*;

class LiteralJava
{
	public static void main(String args[])
	{
		//INTEGER LITERAL
		byte b1=10;
		byte b2=0b1010;
		byte b3=012;
		byte b4=0XA;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

		//LONG LITERAL
		long l=999999999999L;
		int i=125L;
		System.out.println(i);
	}
}