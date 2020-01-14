package assignmentOne;
import java.util.*; 
public class q9 {
	//time complexity O(n)
	void sumSegments(ArrayList<Integer> myList)
	{
		boolean flag = false; 
		int i,sum =0,index1=0,index2=0;
		for(int element: myList)
		{
			sum+=element;
		}
		if(sum%3==0)
		{
			int target = sum/3; sum=0;
			//System.out.println(target);
			for(i =0;i<myList.size();i++)
			{
				sum+=myList.get(i);
				if(target==sum) 
				{
					index1=i;
					break; 
				}
			}
			i++;
			sum =0;
			while(i<myList.size())
			{
				sum+=myList.get(i);
				if(target==sum) 
				{
					index2=i;
					flag = true;
					break; 
				}
				i++;
			}
			
		}
		
		if(flag)
		{
			ArrayList<Integer> segOne = new ArrayList<Integer>(0);
			ArrayList<Integer> segTwo = new ArrayList<Integer>(0);
			ArrayList<Integer> segThree = new ArrayList<Integer>(0);
			for(i=0;i<=index1;i++)
			{
				segOne.add(myList.get(i));
			}
			for(i=index1+1;i<=index2;i++)
			{
				segTwo.add(myList.get(i));
			}
			for(i=index2+1;i<myList.size();i++)
			{
				segThree.add(myList.get(i));
			}
			if(segOne.size()!=0&&segTwo.size()!=0&&segThree.size()!=0)
			{
				System.out.print(segOne+",");
				System.out.print(segTwo+",");
				System.out.println(segThree);
			}
			else flag = false;
		}
		if(!flag) System.out.println("Cannot divide the array into segments.");
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
		q9 obj = new q9();
		obj.sumSegments(myList);
	}
}