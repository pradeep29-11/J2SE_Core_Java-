import java.io.*;
import java.util.Arrays;

public class Array_binarySearch
{
	public static void main(String args[])
	{
		int a[]={22,1,3,66,22,99,23,100};

		Arrays.sort(a);
		System.out.println("Array Sorted : "+ Arrays.toString(a));

		int pos=Arrays.binarySearch(a,2);

		if(pos>=0)
		{
			System.out.println("The element is found at position : "+pos);
		}
		else
		{
			System.out.println("The element is not found at position : "+pos);
		}
	}
}