package assignmentOne;
import java.util.*; 



public class q15{
	class Node{
		char data;
		Node next;
		Node (char d)
		{
			data  = d;
			next = null;
		}
	}
	static Node head=null; 
	
	void insertVowels(String str)
	{
		char c;
		for(int i=0; i< str.length();i++)
		{
			c= str.charAt(i); 
			if( c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				Node new_Node = new Node(c); 
				/*
				//insert in the front: 
		        new_Node.next = head; 
		        head = new_Node; 	
		        */
				
				//insert in the back:
				if(head == null) head = new_Node; 	
				else 
				{
					Node ptr= head;
					while(ptr.next!=null)
					{
						ptr=ptr.next;
					}
					ptr.next = new_Node;
				}
			}
		}
	}
	void print()
	{
		Node current = head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String inputString = cin.nextLine();
		q15 obj = new q15(); 
		obj.insertVowels(inputString);
		obj.print();
	}
}

