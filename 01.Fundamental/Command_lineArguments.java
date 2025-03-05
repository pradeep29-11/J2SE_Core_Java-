import java.io.*;

public class Command_lineArguments
{
	public static void main(String args[])
	{
		if(args.length==0)
		{
			System.out.println("No Arguments Sent from command line");
		}
		else
		{
			System.out.print("List of Arguments : ");
			for(int i=0;i<args.length;i++)
			{
				System.out.print(args[i]+" ");
			}
		}
	}
}