import java.io.*;
import java.util.*;

public class TraverseLinkedList 
{
	public static void main(String args[])
	{
		LinkedList<String> ob = new LinkedList<>();

		ob.add("Sumit");
		ob.add("Vedant");
		ob.add("Tanuja");
		ob.add("Ambika");

		System.out.println("Size      : "+ob.size());
		System.out.println("Names     : "+ob);

		System.out.println("Forward   : ");

		ListIterator ir = ob.listIterator();

		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}

		System.out.println("BackWard   : ");

		while(ir.hasPrevious())
		{
			System.out.println(ir.previous());
		}

	}
}