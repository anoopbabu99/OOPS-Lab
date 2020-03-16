import java.util.*;


	class Rectangle{
		int length=0;
		int breadth=0; 
		Rectangle(){}
		Rectangle(int length, int breadth)
		{
			this.breadth = breadth;
			this.length = length; 
		}
		int area()
		{
			return length*breadth;
		}
		int perimeter()
		{
			return 2*length + 2*breadth;
		}
	}
	class Square extends Rectangle{
		int side = 0;
		Square(int side)
		{
			length = side;
			breadth =side;
		}
	}
public class q1{
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		Square square = new Square(7);
		System.out.println("Area = "+square.area());
		System.out.println("Perimeter = "+square.perimeter());
		Square square2 = new Square(9);
		System.out.println("Area = "+square2.area());
		System.out.println("Perimeter = "+square2.perimeter());
		
		
	}
}