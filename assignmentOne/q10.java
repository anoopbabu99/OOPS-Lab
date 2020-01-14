package assignmentOne;
import java.util.*; 
//using nested arraylists:

public class q10 {
	//time complexity O(n)
	int getEntry(ArrayList<Integer> x, ArrayList<ArrayList<Integer>> y, int j)
	{
		int entry =0;
		for(int i =0; i<x.size(); i++)
		{
			entry += x.get(i)*y.get(i).get(j);
		}
		return entry;
	}
	ArrayList<ArrayList<Integer>> findProduct(ArrayList<ArrayList<Integer>> x, ArrayList<ArrayList<Integer>> y)
	{
		ArrayList<ArrayList<Integer>> prod= new ArrayList<ArrayList<Integer>>(0);
		int entry;
		boolean flag =true;
		
		//check if product is possible:
		if(x.get(0).size()!=y.size()) {
			System.out.println("This matrix multiplication is not defined ");
			System.exit(0);
			flag = false; 
		}
		
		//find product:
		int prod_rows = x.size();
		int prod_columns = y.get(0).size();
		for(int i =0; i< prod_rows; i++)
		{
			ArrayList<Integer> a = new ArrayList<Integer>(0);
			for(int j=0;j<prod_columns;j++)
			{
				entry  = getEntry(x.get(i),y,j);
				a.add(entry);
			}
			prod.add(a);
		}
		
		return prod;
		
	}
	void scanMatrix(ArrayList<ArrayList<Integer>> x)
	{
		Scanner cin = new Scanner(System.in);
		int entry;
		System.out.print("Enter the number of rows: ");
		int rows = cin.nextInt();
		System.out.print("Enter the number of columns: ");	
		int columns = cin.nextInt();
		for(int i=0; i<rows;i++)
		{
			ArrayList<Integer> a = new ArrayList<Integer>(0);
	        for(int j=0; j<columns;j++)
	        {
	        	entry = cin.nextInt();
	        	a.add(entry);
	        }
	        x.add(a); 
		}
		
	}
	void displayMatrix(ArrayList<ArrayList<Integer>> x)
	{
		for(int i =0;i<x.size();i++)
		{
			for(int j =0; j< x.get(i).size();j++)
			{
				System.out.print(x.get(i).get(j)+ " ");
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>(0);
		ArrayList<ArrayList<Integer>> b= new ArrayList<ArrayList<Integer>>(0);
		q10 obj = new q10();
		obj.scanMatrix(a);
		obj.scanMatrix(b);
		ArrayList<ArrayList<Integer>> z= new ArrayList<ArrayList<Integer>>(0);
		z=obj.findProduct(a,b);
		obj.displayMatrix(z);
	}
}