import java.util.*;
/*
Write a menu driven program in java to check whether a given number
is a prime number or palindrome number.Create classes of your choice
and have a method to check whether a given number is a prime number or
palindrome number.
*/
public class q11{
	class Number{
		long number;
		boolean isPalindrome;
		boolean isPrime;
		Number(long number)
		{
			this.number= number; 
			this.isPrime = checkPrime(); 
			this.isPalindrome = checkPalindrome();
		}
		boolean checkPrime()
		{
			isPrime = true;
			for(int i=2;i<number/2;i++)
			{
				if(number%i ==0)
				{
					isPrime = false; 
				}
			}
			return isPrime;
		}
		boolean checkPalindrome()
		{
			isPalindrome = true;
			String num=Long.toString(number);
			int j = num.length() -1;
			for(int i=0;i<num.length()/2;i++)
			{
				if(num.charAt(i)== num.charAt(j))
				{
					j--;
				}
				else
				{
					isPalindrome = false;
					break;
				}
			}
			return isPalindrome;
		}
		
		
	}
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		q11 obj = new q11();
		Number number = obj.new Number(cin.nextLong());
		System.out.println(number.isPrime);
		System.out.println(number.isPalindrome);
	}
}