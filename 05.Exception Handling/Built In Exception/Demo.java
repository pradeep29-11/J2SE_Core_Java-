import java.io.*;

class Demo
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try 
		{
			System.out.print("Enter the number : ");
			int a=Integer.parseInt(br.readLine());
			System.out.println("Your Number : "+a);
		}
		catch(IOException ae)
		{
			System.out.println("IO Problem:Can read input");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Given Input is not Number ");
		}
		catch(Exception a)
		{
			System.out.println("UnknownError");
		}
	}
}