import java.io.*;

abstract class A
{
	abstract void display();	
	abstract void show();
}
/*

class B extends A
{
	void display()
	{
		System.out.println("Disp : Red");
	}
	void show()
	{
		System.out.println("Show : Green");
	}
}
*/
public class Annonymous
{
	public static void main(String args[])
	{
		/*
		A ob = new B();
		ob.display();
		ob.show();
		*/

		A ob = new A()
		{
			void display()
			{
				System.out.println("Disp : Red");
			}
			void show()
			{
				System.out.println("Show : Green");
			}
		};
		ob.display();
		ob.show();
	}
}