import java.util.*; 

public class q4{
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
		PUSH, POP, PEEK, TERMINATE;
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		ArrayList<Integer> myList = new ArrayList<Integer>(0);
		q4 obj= new q4();
		int top; 
		while(true)
		{
		System.out.print("Do you want to push, pop, peek or terminate? ");
		String str = cin.nextLine();;
		Operation op=Operation.valueOf(str);
			switch(op)
			{
				case PUSH: obj.stack_push(myList); 
				break;
				case POP: top = obj.stack_pop(myList); 
				if(top==-1) System.out.print("Stack is empty!");
				else System.out.println(top); 
				break;
				case PEEK: top = obj.stack_peek(myList); 
				if(top==-1) System.out.print("Stack is empty!");
				else System.out.println(top); 
				break;
				case TERMINATE: System.out.println(myList);
				myList.clear(); 
				System.exit(0);
			}
		}
		
	}
}