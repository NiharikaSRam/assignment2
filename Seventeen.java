import java.lang.Math;

public class Seventeen
{
	public static void main(String args[])
	{
		int x1= 3;
		int x2 = 6;
		int y1 = 5;
		int y2 = 9;
		Double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
		System.out.println("Distance : " + distance);
	}
}