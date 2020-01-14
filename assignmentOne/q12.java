package assignmentOne;
import java.util.*; 
public class q12 {
	//time complexity O(n)
	void fillStack(Stack<Integer> stack, int n)
	{
		Scanner cin = new Scanner(System.in);
		int element; 
		for(int i =0;i<n;i++)
		{
			element = cin.nextInt();
			stack.push(element);
		}
	}
	void sortStack(Stack<Integer> originalStack, Stack<Integer> tempStack)
	{
		while(originalStack.empty()==false) 
        { 
            int tmp = originalStack.pop();  
            while(tempStack.empty()==false && tempStack.peek()> tmp) 
            { 

            	originalStack.push(tempStack.pop()); 
            }
            tempStack.push(tmp); 
        } 
		
		while(tempStack.empty()==false)
		{
			originalStack.push(tempStack.pop());
		}
	}
	void printStack(Stack<Integer> stack)
	{
		while (!stack.empty()) 
        { 
            System.out.print(stack.pop()+" "); 
        }  
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = cin.nextInt();
		Stack<Integer> originalStack = new Stack<Integer>(); 
		Stack<Integer> tempStack = new Stack<Integer>();
		q12 obj = new q12();
	    obj.fillStack(originalStack, n); 
	    obj.sortStack(originalStack, tempStack);
	    obj.printStack(originalStack);
	}
}

