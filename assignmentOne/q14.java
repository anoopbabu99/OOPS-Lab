package assignmentOne;
import java.util.*; 

public class q14{
	void stack_push(ArrayList<Integer> myList)
	{
		System.out.print("Enter the element: ");
		Scanner cin = new Scanner(System.in);
		int element  = cin.nextInt();
		myList.add(element);
	}
	int stack_pop(ArrayList<Integer> myList)
	{
		if(myList.size()==0) return -1;
		int top= myList.get(myList.size()-1);
		myList.remove(myList.size()-1);
		return top;
	}
	int stack_peek(ArrayList<Integer> myList)
	{
		if(myList.size()==0) return -1;
		int top= myList.get(myList.size()-1);
		return top;
	}
	enum Operation
	{
		push, pop, peek, terminate;
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		ArrayList<Integer> myList = new ArrayList<Integer>(0);
		q14 obj= new q14();
		int top; 
		while(true)
		{
		System.out.print("Do you want to push, pop, peek or terminate? ");
		String str = cin.nextLine();;
		Operation op=Operation.valueOf(str);
			switch(op)
			{
				case push: obj.stack_push(myList); break;
				case pop: top = obj.stack_pop(myList); break;
				case peek: top = obj.stack_peek(myList); System.out.println(top);break;
				case terminate: myList.clear(); System.exit(0);
			}
		} 
		
	}
}

