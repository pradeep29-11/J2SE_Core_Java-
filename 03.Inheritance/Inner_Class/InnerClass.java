import java.io.*;

class OuterClass
{
	private int i=15;
	class InnerClass
	{
		void display()
		{
			System.out.println("I am in Inner Class I : "+i);
		}
	}
	//Creating Inner Class Instance
	void createInstanceInnerClass()
	{
		InnerClass ob= new InnerClass();
		ob.display();
	}
}
public class InnerClass
{
	public static void main(String args[])
	{
		OuterClass ob = new OuterClass();
		ob.createInstanceInnerClass();
	}
}