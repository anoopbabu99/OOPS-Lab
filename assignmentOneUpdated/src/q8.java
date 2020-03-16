import java.util.*;
class q8{
	
	
	void scanList(ArrayList<Integer> myList)
	{
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int N = cin.nextInt();
		System.out.print("Enter the elements:");
		for(int i=0;i<N;i++)
		{
			myList.add(cin.nextInt());
		}
	}
	int getLocalMax(ArrayList<Integer> myList, int index)
	{
		int sum = Integer.MIN_VALUE;
		int my_sum =0;
		for(int i=index;i<myList.size();i++)
		{
			my_sum = my_sum + myList.get(i);
			if(my_sum>sum) sum = my_sum;
		}
		return sum;
		
	}
	int findMinSubArray(ArrayList<Integer> myList)
	{
		int global_max = Integer.MIN_VALUE;
		int local_max;
		for(int i=0;i<myList.size();i++)
		{
			local_max = getLocalMax(myList,i);
			if(local_max>global_max) global_max = local_max;
		}
		
		return global_max;
	}
	
	public static void main(String[] args){
	Scanner cin = new Scanner(System.in);
	ArrayList<Integer> myList = new ArrayList<Integer>();
	System.out.print("Enter the number of test cases:");
	int T = cin.nextInt();
	int N=0;
	int max;
	q8 obj = new q8();
	for(int i=0;i<T;i++)
	{
		obj.scanList(myList);
		max = obj.findMinSubArray(myList);
		System.out.println(max);
		myList.clear();
	}
		
	}
}