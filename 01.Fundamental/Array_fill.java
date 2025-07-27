import java.io.*;
import java.util.Arrays;

public class Array_fill
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		Arrays.fill(a,77);

		System.out.println("After Fill : "+Arrays.toString(a));
	}
}