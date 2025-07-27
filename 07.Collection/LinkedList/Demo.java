import java.io.*;
import java.util.*;

public class Demo 
{
	public static void main(String args[])
	{
		LinkedList<String> ob = new LinkedList<>();

		ob.add("Aniket");
		ob.add("Pradeep");
		ob.add("Vedant");
		ob.add("Anuj");

		System.out.println("Names   : "+ob);
		System.out.println("Size    : "+ob.size());
		System.out.println("Element : ");

		for(String data : ob)
		{
			System.out.println(data);
		}
	}
}