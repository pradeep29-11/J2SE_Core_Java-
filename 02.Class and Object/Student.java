import java.io.*;

class Student1
{
	int rno;
	String name;
	double per;
	Student1()
	{
		rno=0;
		name="NA";
		per=0.0;
	}
	Student1(int rno,String name,double per)
	{
		this.rno=rno;
		this.name=name;
		this.per=per;
	}
	void display()
	{
		System.out.println("Roll No    : "+rno);
		System.out.println("Name       : "+name);
		System.out.println("Percentage : "+per);
		System.out.println("-----------------------");
	}
}
public class Student
{
	public static void main(String args[])
	{
		Student1 ob=new Student1();
		ob.display();

		Student1 ob1=new Student1(15,"Pradeep",99.12);
		ob1.display();

	}
}