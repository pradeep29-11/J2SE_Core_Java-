import java.io.*;

class Employed1
{
	private int eid;
	private String ename;
	private double salary;
	private String city;

	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public int getEid()
	{
		return eid;
	}
	public String getEname()
	{
		return ename;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getCity()
	{
		return city;
	}
}
public class Employed
{
	public static void main(String args[])
	{
		Employed1 ob = new Employed1();
		Employed1 ob1 = new Employed1();

		System.out.println("Employed id     : "+ ob.getEid());
		System.out.println("Employed name   : "+ob.getEname());
		System.out.println("Employed salary : "+ob.getSalary());
		System.out.println("Employed city   : "+ob.getCity());

		System.out.println("--------------------------");
		ob1.setEid(15);
		ob1.setEname("Pradeep");
		ob1.setSalary(122.12);
		ob1.setCity("Pune");

		System.out.println("Employed id     : "+ ob1.getEid());
		System.out.println("Employed name   : "+ob1.getEname());
		System.out.println("Employed salary : "+ob1.getSalary());
		System.out.println("Employed city   : "+ob1.getCity());
	}
}