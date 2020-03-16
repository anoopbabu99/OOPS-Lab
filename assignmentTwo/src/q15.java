import java.util.*;
/*
Imagine a tollbooth at a bridge. Cars passing by the booth are expected
to pay a 50 cent toll. Mostly they do, but sometimes a car goes without
paying. The tollbooth keeps track of the number of cars that have gone by,
and of the total amount of money collected. Model this tollbooth with a
class called tollBooth. The two data are a type unsigned int hold the total
number of cars and a type double to hold the total amount of money
collected. A constructor initialize both of these to 0. A member function
called payingCar() increments the car total and adds 0.50 to cash total.
Another function called nonpayCar(), increments the car total but adds
nothing to the cash total. Finally, a member function called display()
displays the two totals.
Include a program to test this class. This program should allow the user to
push one key to count a paying car, and another to count a nonpaying car.
Before exit, it should print both total cars and total cash.
*/
public class q15{
	public class Tollbooth{
		//float toll = (float)0.5;
		int numberOfCars;
		double totalTollCollected;
		Tollbooth()
		{
			this.numberOfCars =0;
			this.totalTollCollected =0;
		}
		void payingCar()
		{
			this.numberOfCars++;
			this.totalTollCollected = this.totalTollCollected+0.5;
		}
		void nonPayingCar()
		{
			this.numberOfCars++;
			this.totalTollCollected = this.totalTollCollected+0;
		}
		void display()
		{
			System.out.println(this.numberOfCars);
			System.out.println(this.totalTollCollected);
		}
	}
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		q15 obj = new q15();
		Tollbooth tb = obj.new Tollbooth();
		String x;
		while(true)
		{
			System.out.print("Enter option:");
			x= cin.nextLine();
			if(x.equals("pay")) tb.payingCar();
			if(x.equals("nopay")) tb.nonPayingCar();
			if(x.equals("exit")) 
			{
					tb.display();
					System.exit(0);
					break;
			}
		}
		
		
	}
}