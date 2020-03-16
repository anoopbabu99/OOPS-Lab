import java.util.*;

class q7{
	int minElement = Integer.MAX_VALUE;
	void stack_push(ArrayList<Integer> stack, int x) 
	{
		if(stack.size()==0) 
			{
				minElement = x;
				stack.add(x);
			}
		else 
		{
			if(x>minElement) 
			{
				stack.add(x);
			}
			else
			{
				stack.add(2*x-minElement);
				minElement = x;
			}
		}
		
	}
	int stack_pop(ArrayList<Integer> stack) 
	{
		if(stack.size()==0)
			return -1;
		else {
			int victim;
			victim= stack.get(stack.size()-1);
			if(victim<minElement) minElement = 2*minElement - victim;
			else {/*no change*/}
			return victim;
			}
	}
	int stack_min() 
	{
		if(minElement == Integer.MAX_VALUE) return -1;
		return minElement;
	}
	
	void implementStack(int Q)
	{
		ArrayList<Integer> stack = new ArrayList<Integer>();
		int victim;
		int min;
		Scanner cin = new Scanner(System.in);
		for(int i=0;i<Q;i++)
		{
			switch(cin.nextInt())
			{
				case 1: //push
					stack_push(stack, cin.nextInt());
					break;
				case 2: //pop
					victim=stack_pop(stack);
					System.out.print(victim+" ");
					break;
				case 3: //extract_min
					min = stack_min();
					System.out.print(min+" ");
					break;
			}
		}
	}
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		ArrayList<String> myList = new ArrayList<String>();
		int T = cin.nextInt();
		int N=0;
		int max;
		q7 obj = new q7();
		for(int i=0;i<T;i++)
		{
			obj.implementStack(cin.nextInt());
			myList.clear();
		}
			
		}
}