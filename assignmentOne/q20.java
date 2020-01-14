package assignmentOne;
import java.util.*;
//using linked list library function:

public class q20{

	void insert(LinkedList<Integer> myList, int n)
	{
		Scanner cin = new Scanner(System.in);
		int element;
		System.out.print("Enter the elements: ");
		while(n>0)
		{
			element = cin.nextInt();
			myList.add(element);
			n--;
		}
		
	}
	int binarySearch(LinkedList<Integer> myList, int l, int r) 
	{ 
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the value to be searched: ");
		int x = cin.nextInt();
	    while (l <= r) { 
	        int m = l + (r - l) / 2; 
	        if (myList.get(m) == x) return m; 
	        if (myList.get(m) < x) l = m + 1; 
	        else r = m - 1; 
	    }
	    return -1; 
	} 
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		LinkedList<Integer> myList = new LinkedList<Integer>(); 
		q20 obj = new q20();
		System.out.print("Enter the number of elements: ");
		int n = cin.nextInt();
		obj.insert(myList, n);
		//System.out.println(myList);
		Collections.sort(myList);
		//System.out.println(myList);
		int index = obj.binarySearch(myList,0,n-1);
		if(index!=-1) {
			//int element = myList.get(index);
			System.out.println(index);
		}
		else System.out.println("Not found");
		
	}
}
