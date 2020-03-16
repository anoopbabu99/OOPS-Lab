import java.util.LinkedList;
import java.util.Scanner;
public class q3{
	
	void scanList()
	{
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = cin.nextInt();
		int element;
		System.out.print("Enter the elements: ");
		LinkedList<Integer> myList = new LinkedList<Integer>();
		for(int i=0;i<n;i++)
		{
			element = cin.nextInt();
			myList.add(element);
		}
		if(n<3) {System.out.println("Not possible"); System.exit(0);}
 		element = myList.get(n-3);
		System.out.println(element);
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		q3 obj = new q3();
		obj.scanList();
	}
}