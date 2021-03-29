public class Forty6{
	double circle(double radius){
		return radius*radius*Math.PI;
	}
	double triangle(double height, double base){
		return 0.5*height*base;
	}
	double square(double side){
		return side*side;
	}
	double rectangle(double length, double breadth){
		return length*breadth;
	}
	double rhombus(double base, double height){
		return base * height;
	}
	double trapezoid(double base1, double base2, double height){
		return ((base1 + base2)/2)*height;
	}
	
	
	public static void main(String args[]){
		Forty6 obj = new Forty6();
		System.out.println("Area of Circle: "+obj.circle(7));
		System.out.println("Area of triangle: "+obj.triangle(3, 9));
		System.out.println("Area of square: "+obj.square(4));
		System.out.println("Area of rectangle: "+obj.rectangle(8, 2));
		System.out.println("Area of rhombus: "+obj.rhombus(1, 5));
		System.out.println("Area of trapezoid: "+obj.trapezoid(1, 3, 8));
	}
}