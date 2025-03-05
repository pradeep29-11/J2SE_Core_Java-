import java.io.*;

public class Sumb 
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the first number : ");
		int a=Integer.parseInt(br.readLine());

		System.out.print("Enter the second number : ");
		int b=Integer.parseInt(br.readLine());

		int sum=a+b;

		System.out.print("Sum is : "+sum);
	}
}