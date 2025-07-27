import java.io.*;

class A
{
	int i=11;
	int j=12;

	void display()
	{
		System.out.println("I am in display");
		System.out.println("Value of i : "+i);
		System.out.println("Value if j : "+j);
	}
}
public class Demo
{
	public static void main(String args[])
	{
		A ob=new A();
		ob.display();
		System.out.println("Reference : "+ob);
		System.out.println("Hash code : "+ob.hashCode());
	}
}