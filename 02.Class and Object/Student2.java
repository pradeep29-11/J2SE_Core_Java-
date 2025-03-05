import java.io.*;

class Student
{
	private int rno;
	private String name;
	private double per;

	public void setRno(int rno)
	{
		this.rno=rno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPer(double per)
	{
		this.per=per;
	}

	public int getRno()
	{
		return rno;
	}
	public String getName()
	{
		return name;
	}
	public double getPer()
	{
		return per;
	}
}
public class Student2
{
	public static void main(String args[])
	{
		Student ob = new Student();
		Student ob1 = new Student();
		ob1.setRno(15);
		ob1.setName("pradeep");
		ob1.setPer(80.12);

		System.out.println("Roll No    : "+ ob.getRno());
		System.out.println("Name       : "+ ob.getName());
		System.out.println("Percentage : "+ob.getPer());
		System.out.println("---------------------------------");
		
		System.out.println("Roll No    : "+ ob1.getRno());
		System.out.println("Name       : "+ ob1.getName());
		System.out.println("Percentage : "+ ob1.getPer());
	}
}