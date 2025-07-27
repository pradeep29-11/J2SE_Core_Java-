// Shallow Copy
import java.io.*;

class A implements Cloneable
{
	int i;
	double j;
	int a[];

	A()
	{
		i=10;
		j=15.12;
		a = new int[2];
		a[0] = 11;
		a[1] = 22;
	}
	void display()
	{
		System.out.println("Vale of I  : "+i);
		System.out.println("Value of J : "+j);
		System.out.println("a[0]       : "+a[0]);
		System.out.println("a[1]       : "+a[1]);
		System.out.println("--------------------------");
	}
	public A clone() throws CloneNotSupportedException
	{
		A t = (A) super.clone();
		return t;

	}
}
public class Demo
{
	public static void main(String args[]) throws Exception
	{
		A ob = new A();
		ob.display();

		A ob1 = new A();
		ob.a[0]=55;
		ob1.clone();
		ob1.display();
	}
}