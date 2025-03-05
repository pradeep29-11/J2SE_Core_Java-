import java.io.*;

class A
{
	int i;
	int j;
	A()
	{
		i=1;
		j=1;
		System.out.println("I am in Default Constructor!!!");
	}
	A(int a,int b)
	{
		i=a;
		j=b;
		System.out.println("I am in Parametrized Constructor!!!");
	}
	A(A tob)
	{
		i=tob.i;
		j=tob.j;
		System.out.println("I am in Parametrized 2 Constructor!!!");
	}
	void display()
	{
		System.out.println("I am in Display!!!");
		System.out.println(i);
		System.out.println(j);
	}
}
public class Constructor
{
	public static void main(String args[])
	{
		A ob=new A();
		ob.display();

		A ob1=new A(11,22);
		ob1.display();

		A ob2=new A(ob1);
		ob2.display();
	}
}