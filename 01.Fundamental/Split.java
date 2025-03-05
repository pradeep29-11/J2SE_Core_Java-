import java.io.*;
import java.util.Arrays;

public class Split
{
	public static void main(String args[])
	{
		String S="99999,pradeep,5000,300";

		String a[]=S.split(",");
		System.out.println(Arrays.toString(a));
	}
}