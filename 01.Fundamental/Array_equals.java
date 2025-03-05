import java.io.*;
import java.util.Arrays;

public class Array_equals
{
	public static void main(String args[])
	{
		int a[]={11,22,33};
		int b[]={11,22,33};

		if(Arrays.equals(a,b))
		{
			System.out.println("Both Arrays are Equals !!");
		}
		else
		{
			System.out.println("Both Arrays are not Equals !!");
		}
	}
}