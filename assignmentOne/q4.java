package assignmentOne;
import java.util.*; 

public class q4 {
	//time complexity O(n)
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = cin.nextInt();
		int i,j;
		for(i = 1; i< rows; i++)
		{
			j=0;
			while(j!=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
		
		i = rows;
		j =0;
		while(j!=i)
		{
			System.out.print("*");
			j++;
		}
		System.out.println();
		
		for(i = rows-1; i> 0; i--)
		{
			j=0;
			while(j!=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
		
	}
}