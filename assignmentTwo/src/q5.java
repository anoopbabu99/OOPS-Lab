import java.util.*;
/*
Create class ‘Shape’ with data members: length1, length2
Method: calculate_area() - To calculate area.
Create class ‘Square’ with data member: side and override method
calculate_area().Create class ‘Triangle’ and ‘Circle’ with data member side
and radius respectively.Override method calculate_area().
*/
class Shape{
	int length1=0, length2=0;
	float calculateArea()
	{
		return length1*length2;
	}
}

class Squar extends Shape{
	float side;
	float calculateArea()
	{
		return side*side;
	}
}

class Triangle extends Shape{
	float side;
	float calculateArea()
	{
		return 1/2*side*side;
	}
}
class Circle extends Shape{
	int radius;
	double pi = 3.1415;
	float calculateArea()
	{
		return radius*(float)pi*radius;
	}
}
public class q5{
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		System.out.println();
		
	}
}
