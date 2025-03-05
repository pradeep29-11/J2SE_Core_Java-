import java.io.*;

class A
{
	int i=11;
	int j=12;

	void display()
	{
		System.out.println("I am in Display ");
		System.out.println(i);
		System.out.println(j);
	}
}
public class InstanceOf
{
	public static void main(String args[])
	{
		A ob=new A();
		System.out.println(ob instanceof A);

		String s="TCA";
		System.out.println(s instanceof String);

		//A ob=null;
		//System.out.println(ob instanceof A);

	}
}