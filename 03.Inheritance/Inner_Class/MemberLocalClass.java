import java.io.*;

class OuterClass
{
	private int i=10;
	void display()
	{
		class InnerClass
		{
			void show()
			{
				System.out.println("I am in Show I : "+i);
			}
		}
		InnerClass ob = new InnerClass();
		ob.show();
	}
	void createInstanceInnerClass()
	{
		this.display();
	}	
}
public class MemberLocalClass
{
	public static void main(String args[])
	{
		OuterClass ob = new OuterClass();
		ob.createInstanceInnerClass();
	}
}
