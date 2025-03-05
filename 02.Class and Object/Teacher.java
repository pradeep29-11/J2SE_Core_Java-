import java.io.*;

class Teacher1
{
	private String name;
	private int age;
	private String college;
	private double salary;

	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setCollege(String college)
	{
		this.college=college;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getCollege()
	{
		return college;
	}
	public double getSalary()
	{
		return salary;
	}
}
public class Teacher
{
	public static void main(String args[])
	{
		Teacher1 ob = new Teacher1();
		Teacher1 ob1 =new Teacher1();

		System.out.println("Teacher Name    : "+ob.getName());
		System.out.println("Teacher Age     : "+ob.getAge());
		System.out.println("Teacher College : "+ob.getCollege());
		System.out.println("Teacher Salary  : "+ob.getSalary());
		System.out.println("-------------------------");

		ob1.setName("Pradeep");
		ob1.setAge(18);
		ob1.setCollege("JSPM");
		ob1.setSalary(10000);

		System.out.println("Teacher Name    : "+ob1.getName());
		System.out.println("Teacher Age     : "+ob1.getAge());
		System.out.println("Teacher College : "+ob1.getCollege());
		System.out.println("Teacher Salary  : "+ob1.getSalary());
		System.out.println("-------------------------");

	}
}