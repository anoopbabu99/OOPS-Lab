package assignmentOne;
import java.util.*; 

public class q8 {
	//time complexity O(n)
	int findMissingNumber(ArrayList<Integer> myList)
	{
		Collections.sort(myList);
		int x =0; 
		for(int i=0;i<myList.size(); i++)
		{
			if(myList.get(i)!= i+1)
			{
				x = myList.get(i);
				return x-1;
			}
		}
		return myList.size()+1;
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter the number of integers");
		int arraySize = cin.nextInt();
		ArrayList<Integer> myList = new ArrayList<Integer>(0);
		int element; 
		System.out.println("Enter the array:");
		for(int i=0;i<arraySize;i++)
		{
			element = cin.nextInt();
			myList.add(element);	
		} 
		q8 obj = new q8();
		int missingNumber = obj.findMissingNumber(myList);
		System.out.println(missingNumber);
	}
}