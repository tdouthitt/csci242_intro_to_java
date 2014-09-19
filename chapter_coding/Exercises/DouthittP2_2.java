import java.awt.Rectangle;

public class DouthittP2_2
{
	public static void main(String[] args)
	{
		Rectangle box = new Rectangle(5,10, 50 ,50);
		double x = box.getHeight();
		double n = box.getWidth();
		double perimeter = ((2 * x) + (2 * n));
		System.out.println(perimeter);
	}
}