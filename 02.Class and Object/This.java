import java.io.*;

class A
{
	int i;
	int j;
	A()
	{
		this(8,9);
		System.out.println("I am in Default Constructor !!!");
	}
	A(int i,int j)
	{
		this.i=i;
		this.j=j;
		System.out.println("I am in Parametrizes Constructor !!!");
	}
	void display()
	{
		System.out.println("I am in Display !!!");
		System.out.println(i);
		System.out.println(j);
	}
}
public class This
{
	public static void main(String args[])
	{
		A ob=new A();
		ob.display();

		A ob1=new A(11,22);
		ob1.display();

	}
}