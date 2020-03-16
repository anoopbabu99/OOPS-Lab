import java.util.*; 

public class q5{
	void enqueue(int x, ArrayList<Integer> queue)
	{
		queue.add(x);
	}
	int dequeue(ArrayList<Integer> queue)
	{
		if(queue.size()==0) return -1;
		return queue.remove(0);
	}
	void scanQueue(ArrayList<Integer> originalQueue)
	{
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the number of elements in queue: ");
		int n = cin.nextInt();
		System.out.print("Enter the elements: ");
		
		for(int i=0;i<n;i++) 
			enqueue(cin.nextInt(), originalQueue);
	}
	void reverseQueue(ArrayList<Integer> originalQueue)
	{
		ArrayList<Integer> tempQueue = new ArrayList<Integer>();
		for(int i = originalQueue.size()-1;i>=0;i--)
		{
		    for(int j=0;j<i;j++) 
		    	enqueue(dequeue(originalQueue),originalQueue);
		    enqueue(dequeue(originalQueue),tempQueue);
		}
		
		while(!tempQueue.isEmpty()) 
			enqueue(dequeue(tempQueue), originalQueue);
		
	}
	void printQueue(ArrayList<Integer> queue)
	{
		System.out.println(queue);
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		q5 obj = new q5();
		ArrayList<Integer> originalQueue = new ArrayList<Integer>();
		obj.scanQueue(originalQueue);
		obj.reverseQueue(originalQueue);
		obj.printQueue(originalQueue);
	}
}
