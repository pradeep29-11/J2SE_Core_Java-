import java.io.*;
import java.util.*;

public class Demo 
{
	public static void main(String args[])
	{
		Vector<String> ob = new Vector<>(2,3); //2 is intial capacity 3 is Increment capacity

		System.out.println("Intial Capacity  : "+ob.capacity());
		System.out.println("Size             : "+ob.size());

		ob.add("Beed");
		ob.add("Pune");
		ob.add("Delhi");
		
		System.out.println("Capacity        : "+ob.capacity());
		System.out.println("Size            : "+ob.size());


	}
}