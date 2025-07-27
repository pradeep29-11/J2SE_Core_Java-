import java.io.*;

class ReadFile
{
	public static void main(String args[])
	{
		File f = new File(args[0]);

		if(!f.exists())
		{
			System.out.println(args[0]+"Does  not Exists !!");
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
			fr = new FileReader(args[0]); //Opening of File

			while(true)
			{
				int ch = fr.read();

				if(ch == -1)
				{
					break;
				}
				System.out.print((char)ch);
			}

		}
		catch(Exception ae)
		{
			System.out.println("Problem while reading a file !!!");
		}
		finally
		{
			try 
			{
				fr.close();
			}
			catch(Exception e)
			{
				System.out.println("Problem While Closing the File !!");
			}
		}
	}
}