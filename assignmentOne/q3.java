package assignmentOne;
import java.util.*; 

public class q3 {
	//time complexity O(n)
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter the number of integers");
		int arraySize = cin.nextInt();
		ArrayList<Integer> myList = new ArrayList<Integer>(0);
		int count, element,j; 
		System.out.println("Enter the array:");
		for(int i=0;i<arraySize;i++)
		{
			element = cin.nextInt();
			myList.add(element);	
		}
		//Collections.sort(myList); 
		System.out.println("The length of the original array is:" + myList.size());
		for(int i=0;i<myList.size();i++)
		{
			count = 0; 
			element = myList.get(i);
			System.out.print(element+" ");
			j=i;
			while(j<myList.size()&&myList.get(j)==element)
			{
				count++;
				if(count>2) {myList.remove(j); j--;}
				j++;
			}
			i=j-1; 
		}
		System.out.println(myList);
		System.out.println("After removing duplicates, the new length of the array is:" + myList.size());
	}
}