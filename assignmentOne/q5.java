package assignmentOne;
import java.util.*; 

public class q5 {
	//insertion sort:
    void ins_sort(ArrayList<Integer> myList) 
    { 
        int n = myList.size(); 
        for (int i = 1; i < n; ++i) { 
            int key = myList.get(i); 
            int j = i - 1; 
            while (j >= 0 && myList.get(j) > key) { 
            	myList.set(j+1, myList.get(j));
                j = j - 1; 
            } 
            myList.set(j+1,key); 
        } 
    } 
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int arraySize = cin.nextInt();
		ArrayList<Integer> myList = new ArrayList<Integer>(0);
		int  element; 
		System.out.println("Enter the array:");
		for(int i=0;i<arraySize;i++)
		{
			element = cin.nextInt();
			myList.add(element);	
		}
		q5 obj = new q5();
		
		obj.ins_sort(myList);
		System.out.println(myList);
	}
}