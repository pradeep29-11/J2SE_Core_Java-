import java.io.*;

class AppendMode 
{
	public static void main(String args[])
	{
		File f = new File(args[0]);

		if(!f.exists())
		{
			System.out.println(args[0]+"Does not exists !! ");
			System.exit(0);
		}
		if(!f.isFile())
		{
			System.out.println(args[0]+"is not File !!");
			System.exit(0);
		}
		FileReader fr = null;
		FileWriter fw = null;
		try 
		{
			fr = new FileReader(args[0]);
			fw = new FileWriter(args[1],true);
			BufferedReader br = new BufferedReader(fr);

			while(true)
			{
				String str = br.readLine();

				if(str==null)
				{
					break;
				}
				fw.write(str+"\n");
			}
			System.out.println(args[0]+" is Copied in "+args[1]);
		}
		catch(Exception e)
		{
			System.out.println("Problem while Reading File !!");
		}
		finally 
		{
			try 
			{
				fr.close();
				fw.close();
			}
			catch(Exception ae)
			{
				System.out.println("Problem while closing the file !!");
			}
		}
	}
}