import java.io.*;

class Staffnew
{
	String name;
	String addres;

	public void setName(String name)
	{
		this.name=name;
	}
	public void setaddres(String addres)
	{
		this.addres=addres;
	}
	public String getName()
	{
		return name;
	}
	public String getAddres()
	{
		return addres;
	}
}
class FullTimeStaff extends Staffnew
{
	String dept;
	double  salary;

	public void setDept(String dept)
	{
		this.dept=dept;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public String getDept()
	{
		return dept;
	}
	public double getSalary()
	{
		return salary;
	}

}
class PartTimeStaff extends Staffnew
{
	int no_of_hr;
	double rate_per_hr;

	public void setNo_of_hr(int no_of_hr)
	{
		this.no_of_hr = no_of_hr;
	}
	public void setRate_per_hr(double rate_per_hr)
	{
		this.rate_per_hr=rate_per_hr;
	}
	public int getNo_of_hr()
	{
		return no_of_hr;
	}
	public double getRate_per_hr()
	{
		return rate_per_hr;
	}
}
public class Staff
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("How many Student : ");
		int a = Integer.parseInt(br.readLine());

		FullTimeStaff ob[] = new FullTimeStaff[a];
		for(int i=0;i<a;i++)
		{
			ob[i] =  new FullTimeStaff();

			System.out.print("Enter the Name     : ");
			String name = br.readLine();

			System.out.print("Enter the Addres    : ");
			String addres = br.readLine();

			System.out.print("Enter the Department : ");
			String dept = br.readLine();

			System.out.print("Enter the Salary     : ");
			double salary = Double.parseDouble(br.readLine());

			ob[i].setName(name);
			ob[i].setaddres(addres);
			ob[i].setDept(dept);
			ob[i].setSalary(salary);
			System.out.println("--------------------------------------");
		}

		for(int i=0;i<a;i++)
		{
			System.out.println("Name       : "+ob[i].getName());
			System.out.println("Addres     : "+ob[i].getAddres());
			System.out.println("Department : "+ob[i].getDept());
			System.out.println("Salary     : "+ob[i].getSalary());
			System.out.println("--------------------------------------");
		}

		PartTimeStaff ob1[] = new PartTimeStaff[a];
		for(int i=0;i<a;i++)
		{
			ob1[i] = new PartTimeStaff(); 

			System.out.print("Enter the Name           : ");
			String name = br.readLine();

			System.out.print("Enter the Addres          : ");
			String addres = br.readLine();

			System.out.print("Enter the NO of Hours      : ");
			int no_of_hr = Integer.parseInt(br.readLine());

			System.out.print("Enter the Rate per Hours : ");
			double rate_per_hr=Double.parseDouble(br.readLine());

			ob1[i].setName(name);
			ob1[i].setaddres(addres);
			ob1[i].setNo_of_hr(no_of_hr);
			ob1[i].setRate_per_hr(rate_per_hr);
		}

		for(int i=0;i<a;i++)
		{
			System.out.println("Name           : "+ob1[i].getName());
			System.out.println("Addres         : "+ob1[i].getAddres());
			System.out.println("Number Hours   : "+ob1[i].getNo_of_hr());
			System.out.println("Rate per Hours : "+ob1[i].getNo_of_hr());
			double totalRate = (ob1[i].getNo_of_hr())*(ob1[i].getRate_per_hr());
			System.out.println("Total Rate     : "+totalRate);
			System.out.println("--------------------------------------");
		}

	}
}