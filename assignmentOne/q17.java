package assignmentOne;
import java.util.*;




public class q17{
	Node head; 
	class Node{
		int data;
		Node next;
		Node (int d)
		{
			data  = d;
			next = null;
		}
	}
	
	void queue_add()
	{
		//insert in front: 
		Scanner cin = new Scanner(System.in);
		int element = cin.nextInt(); 
		Node new_Node = new Node(element); 
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
	int queue_remove()
	{
		if(head!=null)
		{
		Node victim = head;
		head = victim.next;
		return victim.data;
		}
		else return -1;
	}
	int queue_peek()
	{
		if(head!=null) return head.data;
		else return -1;
	}
	
	void printQueue()
	{
		Node current = head;
		while(current!=null)
		{
			System.out.println(current.data+ " ");
			current = current.next;
		}
	}
	
	enum Operation
	{
		add, remove, peek, terminate, print;
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		q17 obj= new q17();
		int top; 
		while(true)
		{
		System.out.print("Do you want to add, remove, peek or terminate? ");
		String str = cin.nextLine();
		Operation op=Operation.valueOf(str);
			switch(op)
			{
				case add: obj.queue_add(); break;
				case remove: top = obj.queue_remove(); break;
				case peek: top = obj.queue_peek(); System.out.println(top);break;
				case terminate: System.exit(0); break;
				case print: obj.printQueue(); break;
			}
		} 
		
	}
}

