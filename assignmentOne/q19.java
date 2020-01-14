package assignmentOne;
import java.util.*;

public class q19{
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
	void scanList(int n)
	{
		Scanner cin = new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
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
	}
	void swapPairwise(int n)
	{
		Node current  = head; 
		int temp;
		if(n%2==0)
		{
			for(int i=0;i<n/2;i++)
			{
				temp = current.data;
				current.data = current.next.data;
				current.next.data = temp;
				current = current.next.next;
			}
		}
		else
		{
			for(int i=0;i<(n-1)/2;i++)
			{
				temp = current.data;
				current.data = current.next.data;
				current.next.data = temp;
				current = current.next.next;
			}
		}
	}
	void printList()
	{
		Node current = head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		q19 obj = new q19();
		System.out.print("Enter number of elements: ");
		int n=cin.nextInt();
		obj.scanList(n);
		obj.printList();
		obj.swapPairwise(n);
		obj.printList();
	}
}
