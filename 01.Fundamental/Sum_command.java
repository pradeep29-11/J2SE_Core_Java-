import java.io.*;

public class Sum_command
{
	public static void main(String args[])
	{
		if(args.length==0)
		{
			System.out.println("No Arguments Sent from command line");
		}
		else
		{

			int sum=0;
			for(int i=0;i<args.length;i++)
			{
				sum=sum+Integer.parseInt(args[i]);
			}
			System.out.println("Sum : "+ sum);
		}
	}
}