import java.util.*;

public class q6{
	class Node
	{
		char data;
		Node(char d)
		{
			data = d;
		}
	}
	
	boolean isBalanced(String exp)
	{
		Stack<Node> stack = new Stack<Node>();
		boolean error = false; 
		char victim;
		for(int i=0;i<exp.length();i++)
		{
			char c = exp.charAt(i);
			if(c=='('||c=='['||c=='{') 
			{
				Node entry = new Node(c);
				stack.push(entry);
			}
			if(c==')'||c==']'||c=='}')
			{
				if(stack.isEmpty()) {error = true; break;}
				switch(c)
				{
					case ')': victim = stack.peek().data;
						if(victim!='(') error=true; 
						else stack.pop();
						break;
					case ']': victim = stack.peek().data;
						if(victim!='[')  error=true; 
						else stack.pop();
						break;
					case '}': victim = stack.peek().data;
						if(victim!='{')  error=true;
						else stack.pop();
						break;
				}
			}
		}
		if(error||stack.size()!=0) return false;
		else return true;
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the expression: ");
		String exp = cin.nextLine();
		
		q6 obj= new q6();
		boolean balanced = obj.isBalanced(exp);
		if(balanced) System.out.print("balanced");
		else System.out.print("notBalanced");
	}
}
