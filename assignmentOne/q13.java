package assignmentOne;
import java.util.*; 

// 1 2 3 4 1 2 5 1 2 3 4 5
public class q13{
	//time complexity O(n)
	void scanArray(ArrayList<Integer> arr)
	{
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = cin.nextInt();
		System.out.print("Enter the elements: ");
		int element; 
		for(int i =0;i<n;i++)
		{
			element = cin.nextInt();
			arr.add(element);
		}
	}
	int pageFaultCount(ArrayList<Integer> arr)
	{
		Queue<Integer> queue = new LinkedList<>();
		HashSet<Integer> map = new HashSet<Integer>();
		int hit=0, miss=0;
		for(int i=0;i<arr.size();i++)
		{	
			if (map.contains(arr.get(i))==false)
			{
				miss++;
				if(queue.size()==3)
				{
					int victim = queue.remove();
					map.remove(victim);
				}
			}
//its already in the map but it has to be updated to be in the tail of the queue. 
			else
			{
				System.out.println(); 
				int index=0,j =1;
				Iterator<Integer> itr = queue.iterator();
				while(itr.hasNext())
				{
					if(itr.next()==arr.get(i)) 
					{
						index = j;
						break;
					}
					j++;
				}
//reason index is incremented by one? 
				queue.remove(index);
			}
			queue.add(arr.get(i));
			map.add(arr.get(i));
		}
		
		
		return miss;
		
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>(0);
		
		q13 obj = new q13();
		obj.scanArray(myList);
		int PFC = obj.pageFaultCount(myList);
		System.out.println(PFC);
	}
}

