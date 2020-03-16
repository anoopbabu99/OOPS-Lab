import java.util.*;

public class q1{
	void scanList(ArrayList<Integer> myList)
	{
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = cin.nextInt();
		int element;
		System.out.print("Enter the elements: ");
		while(n!=0)
		{
			element = cin.nextInt();
			myList.add(element);
			n--;
		}
	}
	void searchList(ArrayList<Integer> myList)
	{
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the element to be searched: ");
		int element = cin.nextInt();
		
		boolean existance = myList.contains(element); 
		if(existance) 
		{
			int pos =myList.indexOf(element)+1; 
			System.out.println("element found at " +pos+ " index.");	
		}
		
	}
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		ArrayList<Integer> myList = new ArrayList<Integer>();
		q1 obj = new q1();
		obj.scanList(myList);
		obj.searchList(myList);
	}
}