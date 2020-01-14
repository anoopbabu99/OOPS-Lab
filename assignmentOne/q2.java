package assignmentOne;
import java.util.*; 

public class q2 {
	//time complexity O(nlogn + n) = O(nlogn)
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
		Collections.sort(myList); 
		int result=0,count,j;
		for(int i=0;i<arraySize;i++)
		{
			element = myList.get(i);
			count =0; 
			j=i;
			while(j<arraySize&&myList.get(j)==element)
			{
				j++;
				count++;
			}
			i=j-1;
			if(count%2!=0) result = element; 
		}
		System.out.println(result); 
	}
}