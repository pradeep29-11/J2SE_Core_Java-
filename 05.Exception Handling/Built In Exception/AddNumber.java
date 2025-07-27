import java.io.*;

class AddNumber
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,sum;

		while(true)
		{
			try 
			{
				System.out.print("Enter the First number : ");
				num1=Integer.parseInt(br.readLine());
				break;
			}
			catch(Exception e)
			{
				System.out.println("Number can Not convert into Integer");
			}
		}
		while(true)
		{
			try 
			{
				System.out.print("Enter the Second number : ");
				num2=Integer.parseInt(br.readLine());
				break;
			}
			catch(Exception e)
			{
				System.out.println("Number can Not convert into Integer");
			}
		}
		sum=num1+num2;

		System.out.println("Sum : "+sum);
	}
}