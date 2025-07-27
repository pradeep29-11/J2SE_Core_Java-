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
		System.out.println("Roll no    : "+rno);
		System.out.println("Name       : "+name);
		System.out.println("Percentage : "+per);
		System.out.println("-----------------------");
	}
}
public class StudentArray
{
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("How many Student you want : ");
		int a=Integer.parseInt(br.readLine());

		Student ob[] = new Student[n];

		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the Roll no : ");
			int rno=Integer.parseInt(br.readLine());

			System.out.print("Enter the Student Name : ");
			String name=br.readline();

			System.out.print("Enter the percentage : ");
			double per=Integer.parseInt(br.readline());		

			ob[i].Student(rno,name,per);
		}

		for(int i=0;i<n;i++)
		{
			ob[i].display();
		}
	}
}