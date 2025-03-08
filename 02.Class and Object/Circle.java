import java.io.*;

class CircleArea
{
	private static final double PI=3.14;
	private double radius;

	CircleArea(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		return (PI*radius*radius); 
	}
}
public class Circle
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the Radius of the circle : ");
		double r = Double.parseDouble(br.readLine());

		CircleArea ob = new CircleArea(r);

		System.out.println("Area of Circle : "+ob.getArea());
	}
}