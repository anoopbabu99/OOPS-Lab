package assignmentOne;
import java.util.*;


public class q18{
	class Node
	{
		char data;
		int start;
		int end;
		Node(char d)
		{
			data = d;
		}
	}
	
	
	void checkParethsis(String exp) 
	{
		Stack<Node> stack = new Stack<Node>();
		ArrayList<ArrayList<Integer>> trackIndices = new ArrayList<ArrayList<Integer>>(0);
		char victim;
		Node tracker = new Node ('$'); 
		boolean error = false;
		for(int i=0;i<exp.length();i++)
		{
			char c = exp.charAt(i);
			if(c=='('||c=='['||c=='{') 
			{
				Node entry = new Node(c);
				entry.start = i;
				entry.end = -1;
				stack.push(entry);
			}
			if(c==')'||c==']'||c=='}')
			{
				switch(c)
				{
					case ')': victim = stack.peek().data;
						if(victim!='(') error=true; 
						else
						{
							tracker  = stack.pop();
							ArrayList<Integer> temp = new ArrayList<Integer>(); 
							temp.add(tracker.start);
							temp.add(i);
							trackIndices.add(temp);
						} 
						break;
					case ']': victim = stack.peek().data;
						if(victim!='[')  error=true; 
						else
						{
							tracker  = stack.pop();
							ArrayList<Integer> temp = new ArrayList<Integer>(); 
							temp.add(tracker.start);
							temp.add(i);
							trackIndices.add(temp);
						} 
						break;
					case '}': victim = stack.peek().data;
						if(victim!='{')  error=true;
						else
						{
							tracker  = stack.pop();
							ArrayList<Integer> temp = new ArrayList<Integer>(); 
							temp.add(tracker.start);
							temp.add(i);
							trackIndices.add(temp);
						}
						break;
				}
			}
		}
		if(error||stack.size()!=0) System.out.println("Parenthesis mismatched! ");
		else {
			System.out.println("Order of pairs of parenthesis are correct. ");
			System.out.println("Array indices: ");
			for(int i=0;i<trackIndices.size();i++)
			{
				for(int j=0; j<trackIndices.get(i).size(); j++)
				{
					System.out.print(trackIndices.get(i).get(j)+" ");
				}
				System.out.println();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String exp= cin.nextLine();
		q18 obj= new q18();
		obj.checkParethsis(exp);
		
		
	}
}

