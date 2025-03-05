import java.io.*;

class Static1
{
	private int i;
	private static int j;

	Static1()
	{
		i=11;
		j++;
	}
	static void show()
	{
		System.out.println("I am in Show !!");
		System.out.println(j);
	}
	void display()
	{
		System.out.println("I am in display ");
		System.out.println(i);
	}
}
public class StaticNew
{
	public static void main(String args[])
	{
		Static1 ob = new Static1();
		ob.display();
		Static1.show();
	}
}