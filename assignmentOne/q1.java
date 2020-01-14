package assignmentOne;
//time complexity O(nlogn + n) = O(nlogn)
import java.util.*; 

public class q1 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		ArrayList<Integer> myarray = new ArrayList<Integer>(0);
		System.out.println(" Enter the size of the array:");
		int arraySize = cin.nextInt();
		
		System.out.println(" Enter the array:");
		int element;
		for(int i=0;i<arraySize;i++)
		{
			element = cin.nextInt();
			myarray.add(element);
		}
		System.out.println("Enter the sum to be found:");
		int sum = cin.nextInt();
		Collections.sort(myarray);
		int j = myarray.size()-1;
		Map< Integer,Integer> uniquePair =  new HashMap< Integer,Integer>();  
		for(int i=0;i<arraySize;i++)
		{
			if(i>j) break;
			if(myarray.get(i)+myarray.get(j)==sum)
			{
				uniquePair.put(myarray.get(i),myarray.get(j));
				i++;
				j--;
			}
			if(myarray.get(i)+myarray.get(j)<sum) i++;
			if(myarray.get(i)+myarray.get(j)>sum) j--;
		}
		System.out.println("The pairs whose sum is "+sum+ " are: ");
		Iterator<Map.Entry<Integer,Integer>> itr = uniquePair.entrySet().iterator(); 
		Map.Entry<Integer,Integer> entry;
        while(itr.hasNext()) 
        { 
             entry = itr.next(); 
             System.out.print(entry.getKey()+" "+entry.getValue() );
        } 
	}

}