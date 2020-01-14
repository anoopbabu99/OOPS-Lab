package assignmentOne;
import java.util.*;


public class q16{
	Node head; 
	Node reverseHead;
	class Node{
		char data;
		Node next;
		Node (char d)
		{
			data  = d;
			next = null;
		}
	}
	void createList(String str)
	{
		for(int i=0; i< str.length();i++)
		{ 
			Node new_Node = new Node(str.charAt(i));
			Node new_Node2 = new Node(str.charAt(i));
			//insert from front:
			new_Node2.next = reverseHead;
			reverseHead = new_Node2;
			
			//insert from back:
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
	boolean checkPalindrome()
	{
		boolean detect = true; 
		Node current = head;
		Node current2 = reverseHead;
		while(current!=null)
		{
			if(current.data!=current2.data)
			{
				detect = false; 
				break;
			}
			current2  = current2.next;
			current = current.next;
		}
		return detect; 
	}
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String inputString = cin.nextLine();
		q16 obj = new q16(); 
		
		obj.createList(inputString);
		boolean detect = obj.checkPalindrome();
		System.out.println(detect);
	}
}

