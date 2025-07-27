/*
	Write a Java Program that accepts user name and password & throw 
	exception “InvalidLogin” if they do not match.
*/
import java.io.*;

class InvalidLoginException extends Exception
{
	InvalidLoginException(String msg)
	{
		super(msg);
	}
}
public class Password
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try 
		{
			System.out.print("Enter the userName : ");
			String uname = br.readLine();

			System.out.print("Enter the Password : ");
			String pass= br.readLine();

			if(uname.equals("Pradeep") && pass.equals("Pra@8080"))
			{
				System.out.println("Login Sussesfull !!");
			}
			else 
			{
				throw new InvalidLoginException("Password is InCorrect !!");
			}

		}
		catch(IOException oe)
		{
			System.out.println("IO Problem ");
		}
		catch(InvalidLoginException ie)
		{
			System.out.print("InvalidLoginException : "+ie.getMessage());
		}
		catch(Exception ae)
		{
			System.out.println("Unknown Problem ");
		}
		
	}
}