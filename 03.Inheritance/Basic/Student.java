import java.io.*;

class Student20
{
	public int rno;
	public String name;
	public double per;

	Student20()
	{

	}
	Student20(int rno,String name,double per)
	{
		this.rno=rno;
		this.name=name;
		this.per=per;
	}
	public void display()
	{
		System.out.print(rno+"\t"+name+"\t"+per+"\t");
	}
}
class Student2020 extends Student20
{
	public String email;
	public String whatapp;

	Student2020(int rno,String name,double per,String email,String whatapp)
	{
		super(rno,name,per);
		this.email=email;
		this.whatapp=whatapp;
	}
	public void display()
	{
		super.display();
		System.out.println(email+"\t"+whatapp);
	}
}
public class Student
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("How amny Student you want : ");
		int a = Integer.parseInt(br.readLine());

		Student2020 ob[] = new Student2020[a];

		for(int i=0;i<a;i++)
		{
			System.out.print("Enter the Roll no : ");
			int rno=Integer.parseInt(br.readLine());

			System.out.print("Enter the name : ");
			String name = br.readLine();

			System.out.print("Enter the per : "); 
			double per = Double.parseDouble(br.readLine());

			System.out.print("Enter the email : ");
			String email = br.readLine();

			System.out.print("Enter the whatapp number : ");
			String whatapp = br.readLine();

			ob[i] = new Student2020(rno,name,per,email,whatapp);

		}
		System.out.println("Roll no\t\tname\tpercentage\tEmail\t\twhatapp");
		for(int i=0;i<a;i++)
		{
			ob[i].display();
			System.out.println();
		}

	}
}