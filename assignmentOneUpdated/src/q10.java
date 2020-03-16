import java.util.*;
class q10{
	
	
	void scanList(ArrayList<String>myList)
	{
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the number of strings:");
		int N = cin.nextInt();
		System.out.print("Enter the strings:");
		for(int i=0;i<N;i++)
		{
			myList.add(cin.next());
		}
	}
	int findMinStr(ArrayList<String> myList)
	{
		int min = Integer.MAX_VALUE;
		for(String x: myList)
		{
			if(x.length()<min); min = x.length();
		}
		return min;
	}
	void findLongestCommonPrefix(ArrayList<String> myList)
	{
		String answer = "-1";
		char c;
		int max = findMinStr(myList);
		boolean flag = false;
		if(myList.size()==0) System.out.print(answer);
		else {
			int i = 0;
			while(i<max) 
			{
				c = myList.get(0).charAt(i);
				for(String x : myList)
				{
					if(x.charAt(i)!=c) 
					{
						flag = true; 
						break;
					}
				}
				if(flag) break;
				i++;
			}
			
			for(int ind=0;ind<i;ind++)
			{
				System.out.print(myList.get(0).charAt(ind));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
	Scanner cin = new Scanner(System.in);
	ArrayList<String> myList = new ArrayList<String>();
	System.out.print("Enter the number of test cases:");
	int T = cin.nextInt();
	int N=0;
	int max;
	q10 obj = new q10();
	for(int i=0;i<T;i++)
	{
		obj.scanList(myList);
		obj.findLongestCommonPrefix(myList);
		myList.clear();
	}
		
	}
}