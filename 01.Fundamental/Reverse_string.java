import java.io.*;
import java.util.*;

public class Reverse_string
{
	public static void main(String args[])
	{
		String a="TCA";
		StringBuffer sb=new StringBuffer(a);
		sb.reverse();
		a=new String(sb);
		System.out.println("The reverse string : "+a);
	}
}