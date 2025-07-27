//Deep Copy

import java.io.*;

class A implements Cloneable
{
	int i;
	double j;
	int a[];

	A()
	{
		i=20;
		j=13.2;
		a = new int[2];
		a[0] = 66;
		a[1] = 77;
	}
	void display()
	{
		System.out.println("Vale of I  : "+i);
		System.out.println("Value of J : "+j);
		System.out.println("a[0]       : "+a[0]);
		System.out.println("a[1]       : "+a[1]);
		System.out.println("--------------------------");
	}
	public A clone() throws CloneNotSupportedException
	{
		A t = (A) super.clone();

		t.a[0] = a[0];
		t.a[1] = a[1];
		return t;
	}
}

public class DeepCopy
{
	public static void main(String args[]) throws Exception
	{
		A ob1 = new A();
		ob1.display();

		A ob2 = new A();
		
		ob1.a[0] = 100;
		ob2.clone();
		ob2.display();
	}
}