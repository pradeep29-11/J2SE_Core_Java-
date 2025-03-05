import java.io.*;
import java.util.*;

public class Jagged_Array
{
	public static void main(String arg[]) throws Exception
	{
		int a[][] = new int[3][];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		a[0] = new int[3];
		a[1] = new int[1];
		a[2] = new int[5];


		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("Enter Array : ");
				a[i][j] = Integer.parseInt(br.readLine());	
			}
		}

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}