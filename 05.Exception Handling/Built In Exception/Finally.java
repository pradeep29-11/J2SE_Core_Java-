import java.io.*;

class A
{
	void display() throws IndexOutOfBoundsException
	{
		try 
		{
			int a[]={11,22,33,44,55};
			System.out.println(a[33]);
			System.out.println("End-to-End");
		}
		finally
		{
			System.out.println("Clossing Resource !!");
		}
	}
}
class Finally
{
	public static void main(String args[])
	{
		try 
		{
			A ob = new A();
			ob.display();
		}
		catch(IndexOutOfBoundsException ie)
		{
			System.out.println("Invalid Index");
		}
	}
}