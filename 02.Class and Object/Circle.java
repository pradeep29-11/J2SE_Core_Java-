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
	public static void main(String args[])
	{
		CircleArea ob = new CircleArea(5);

		System.out.println("Area of Circle : "+ob.getArea());
	}
}