import java.io.*;

public class Circleb
{
	static public void main(String args[]) throws Exception 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Radius : ");
		double r=Float.parseFloat(br.readLine());

		double a =r*r*3.14;

		System.out.println("Area : "+ a);


	}
}