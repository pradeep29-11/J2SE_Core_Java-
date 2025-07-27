import java.io.*;
import java.util.*;

public class QueueDemo 
{
	public static void main(String args[])
	{
		Queue q = new LinkedList();
		q.add("Pune");
		q.add("Delhi");
		q.add("Beed");

		System.out.println("Element of Queue : ");
		Iterator ir = q.iterator();

		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}

		System.out.println("First Element    : "+q.peek());
		System.out.println("Deleted Element  : "+q.remove());
		System.out.println("Deleted Element  : "+q.remove());
		System.out.println("Element of Queue : "+q);
	}
}