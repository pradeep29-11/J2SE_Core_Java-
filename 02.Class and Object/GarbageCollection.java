import java.io.*;

class Student
{
	private int rno;
	private String name;
	private double per;

	Student()
	{
		rno=0;
		name=null;
		per=0.0;
	}
	Student(int rno,String name,double per)
	{
		this.rno=rno;
		this.name=name;
		this.per=per;
	}
	void display()
	{
		System.out.println("Roll NO 	   : "+rno);
		System.out.println("Name 	   	   : "+name);
		System.out.println("Percentage     : "+per);
		System.out.println("----------------------------");
	}
	protected void finalize()
	{
		System.out.println("I am in Finalize ");
	}
}
public class GarbageCollection
{
	public static void main(String[] args) 
	{
		new Student(15,"pradeep",90.12).display();

		//System.gc();

		Runtime rt = Runtime.getRuntime();
		rt.gc();

	}
}