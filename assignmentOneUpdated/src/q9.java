import java.util.*;
class q9{
	void scanMatrix(ArrayList<ArrayList<Integer>> matrix)
	{
		Scanner cin = new Scanner(System.in);
		int rows = cin.nextInt();
		int columns = cin.nextInt();
		for(int i=0;i<rows;i++)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int j=0;j<columns;j++)
				temp.add(cin.nextInt());
			matrix.add(temp);
		}
	}
	void printSpiralTraversal(ArrayList<ArrayList<Integer>> matrix)
	{
		int top_bound = 0;
		int bottom_bound = matrix.size();
		int left_bound =0;
		int right_bound = matrix.get(0).size();
		boolean unused = false;
		while(true)
		{
			unused = true;
			for(int i=left_bound;i<right_bound;i++)
			{
				unused = false;
				System.out.print(matrix.get(top_bound).get(i)+" ");
			} top_bound++;
			if(top_bound==bottom_bound) break;
			
			for(int i=top_bound;i<bottom_bound;i++)
			{
				unused = false;
				System.out.print(matrix.get(i).get(right_bound-1)+" ") ;
			} right_bound--;
			if(right_bound==left_bound) break;
			
			for(int i=right_bound-1;i>=left_bound;i--)
			{
				unused = false;
				System.out.print(matrix.get(bottom_bound-1).get(i)+" ");
			} bottom_bound--;
			for(int i = bottom_bound-1; i>= top_bound ; i--)
			{
				unused = false;
				System.out.print(matrix.get(i).get(left_bound)+" ");
			} left_bound++;
			
			if(unused) break;
			
		}
		matrix.clear();
	}
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> myMatrix = new ArrayList<ArrayList<Integer>>();
		int T = cin.nextInt();
		q9 obj = new q9();
		for(int i=0;i<T;i++)
		{
			obj.scanMatrix(myMatrix);
			obj.printSpiralTraversal(myMatrix);
		}
		
	}
}
