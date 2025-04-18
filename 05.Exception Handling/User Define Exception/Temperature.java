import java.io.*;

class TempException extends Exception
{
	public TempException(String msg)
	{
		super(msg);
	}
}
class Temperature
{
	public static void main(String args[])
	{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));


		try 
		{
			System.out.print("Enter the Temperature : ");
			int temp = Integer.parseInt(br.readLine());

			if(temp<94)
			{
				throw new TempException("Lower The TempException : "+temp);
			}
			else if(temp>100)
			{
				throw new TempException("Higher the TempException : "+temp);
			}
			System.out.println("Normal Temperature : "+temp);
		}
		catch(IOException ae)
		{
			System.out.println("IO Problem ");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Invalid Input ");
		}
		catch(TempException te)
		{
			System.out.println("TempException : "+te.getMessage());
		}

	}
}