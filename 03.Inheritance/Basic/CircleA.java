
class Circle
{
	private int r;

	public Circle(int r)
	{
		this.r = r;
	}
	public void areaCircle()
	{
		Double area = 3.14*r*r;
		System.out.println("Area of Circle : "+area);
	}
	public void perimeterCircle()
	{
		double perimeter = 2 * 3.14 * r;
		System.out.println("Perimeter of Circle : "+perimeter);
	}
}
public class CircleA 
{
	public static void main(String args[])
	{
		Circle ob = new Circle(5);
		ob.areaCircle();

		Perimeter ob = new Circle(5);
        ob.perimeterCircle();
	}
}

