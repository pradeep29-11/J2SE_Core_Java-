import java.io.*;

class A
{
	int i;
	A(int i)
	{
		this.i=i;
	}
	void display()
	{
		System.out.println("Value of I : "+i);
	}
}
class B extends A
{
	int j;
	B(int i,int j)
	{
		super(i);
		this.j=j;
	}
	void display()
	{
		super.display();
		System.out.println("Value of J : "+j);
	}
}

public class Demo
{
	public static void main(String args[])
	{
		B ob = new B(11,22);
		ob.display();
	}
}