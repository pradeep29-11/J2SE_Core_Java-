import java.io.*;

class A
{
	int i;
	float j;
	double k;
	char ch;
	boolean m;
	String s;

	void display()
	{
		System.out.println("I am in Display ");
		System.out.println("Value of i : "+i);
		System.out.println("Value of j : "+j);
		System.out.println("Value of k : "+k);
		System.out.println("Value of ch : "+ch);
		System.out.println("Value of m : "+m);
		System.out.println("Value of s : "+s);
	}
}
public class Variables
{
	public static void main(String args[])
	{
		A ob=new A();
		ob.display();

	}
}