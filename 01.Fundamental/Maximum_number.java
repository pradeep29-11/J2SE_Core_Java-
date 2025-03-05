import java.io.*;
import java.util.Arrays;
public class Maximum_number
{
	public static void main(String args[])
	{
		if(args.length==0)
		{
			System.out.println("No Arguments Sent from command line");
		}
		else
		{
			int max=Integer.parseInt(args[0]);
			for(int i=0;i<args.length;i++)
			{
				if(max<Integer.parseInt(args[i]))
				{
					max=Integer.parseInt(args[i]);
				}
			}
			System.out.println("Maximum number : "+max);
		}
	}
}