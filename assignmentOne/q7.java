package assignmentOne;
import java.util.*; 
import java.text.DecimalFormat;

public class q7 {
	double fact(double n)	  
	{
		    return (n == 1 || n == 0) ? 1 : n * fact(n - 1); 
	}
	double sumSeries(int n)
	{
		double result=0;
		double i = 1;
		while(i<=n)
		{
			result+= i/fact(i);
			i++;
		}
		return result; 
	}
	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		q7 obj = new q7();
		double result = obj.sumSeries(n);
		DecimalFormat df = new DecimalFormat("0.00000");
		System.out.println("value: " + df.format(result));
	}
}
