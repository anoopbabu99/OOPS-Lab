package assignmentOne;
import java.util.*; 

public class q6 {
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
		Collections.sort(myList); 
		
		for(int i=0;i<myList.size();i++)
		{
			count = 0; 
			element = myList.get(i);
			
			j=i;
			while(j<myList.size()&&myList.get(j)==element)
			{
				count++;
				if(count>1) {myList.remove(j); j--;}
				j++;
			}
			i=j-1; 
		}
		System.out.println(myList);
		
	}
}