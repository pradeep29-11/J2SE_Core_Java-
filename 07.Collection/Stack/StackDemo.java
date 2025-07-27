import java.io.*;
import java.util.*;

public class StackDemo 
{
	public static void main(String args[])
	{
		Stack<String> s = new Stack<>();

		s.push("Pune");
		s.push("Mumbai");
		s.push("Delhi");
		s.push("Kolkata");

		System.out.println("Element of Stack  : ");

		Iterator ir = s.iterator();

		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}

		System.out.println("Popped Element  : "+s.pop());
		System.out.println("Popped Element  : "+s.pop());
		System.out.println("Topmost Element : "+s.peek());
		s.push("Banglore");

		System.out.println("Element in Stack : "+s);
	}
}