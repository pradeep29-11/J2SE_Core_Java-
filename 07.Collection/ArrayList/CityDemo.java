import java.io.*;
import java.util.*;

public class CityDemo 
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("How many City  : ");
		int n = Integer.parseInt(br.readLine());

		ArrayList<String> ob = new ArrayList<>();

		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the City : ");
			String city = br.readLine();

			ob.add(city);
		}

		System.out.println("Data  : "+ob);

	}
}