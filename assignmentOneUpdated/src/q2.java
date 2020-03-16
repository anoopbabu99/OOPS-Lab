import java.util.*;
public class q2{
	
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
		int middle;
		//middle is left biased for a list of even length.
		if(n%2==0) middle = n/2;
		else middle = (n+1)/2;
		
		int true_index = middle -1; 
		if(true_index<0) true_index = 0;
		element = myList.get(true_index);
		System.out.println(element);
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		q2 obj = new q2();
		obj.scanList();
		
	}
}