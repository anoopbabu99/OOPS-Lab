import java.util.*;
/*
Create an abstract class Bank, which is having member function
getRateOfInterest() which will return the interest rate.Write 2 different
classes SBI (interest rate 12%)and PNB(interest rate 13.4%) which
extends the class Bank. Write a main class TestBank which returns the
interest rate for the input bank .
*/
public class q12{
	abstract class Bank{
		abstract double getInterestRate();
	}
	class SBI extends Bank{
		double getInterestRate() {
			return 0.12;
		}
		
	}
	class PNB extends Bank{
		double getInterestRate() {
			return 0.134;
		}
	}
	
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		
	}
}