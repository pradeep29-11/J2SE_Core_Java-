import java.io.*;

public class Eligible_voting
{
	public static void main(String args[])
	{
		if(args.length==0)
		{
			System.out.println("No arguments from command line ");
		}
		else
		{
			int cnt=0;
			for(int i=0;i<args.length;i++)
			{
				if(18<=Integer.parseInt(args[i]))
				{
					cnt++;
				}
			}
			System.out.println("The number of Votter : "+cnt);
		}
	}
}