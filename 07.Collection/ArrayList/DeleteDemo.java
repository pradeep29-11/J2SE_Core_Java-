import java.io.*;
import java.util.*;

public class DeleteDemo 
{
	public static void main(String args[])
	{
		ArrayList<String> ob = new ArrayList<>();
		ob.add("Pradeep");
		ob.add("Sumit");
		ob.add("Aniket");
		ob.add("Vedant");

		System.out.println("Names : "+ob);
		ob.clear();
		System.out.println("Names : "+ob);
	}
}