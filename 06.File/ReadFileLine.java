import java.io.*;

class ReadFileLine 
{
	public static void main(String args[])
	{
		File f = new File(args[0]);

		if(!f.exists())
		{
			System.out.println(args[0]+"Does Not exists !!");
			System.exit(0);
		}
		if(!f.isFile())
		{
			System.out.println(args[0]+"is Not File !!");
			System.exit(0);
		}
		FileReader fr = null;	
		try 
		{
			fr = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(fr);

			while(true)
			{
				String line = br.readLine();
				if(line == null)
				{
					break;
				}
				System.out.println(line);
			}
		}
		catch(Exception e)
		{
			System.out.println("Problem While Reading File !!");
		}
		finally
		{
			try 
			{
				fr.close();
			}
			catch(Exception ae)
			{
				System.out.println("Problem while Closing File !!");
			}
		}
	
	}
}