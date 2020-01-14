package assignmentOne;
import java.util.*; 
public class q11 {
	//time complexity O(n)
	void permSet(String str, String ans) 
	{  
        if (str.length() == 0) { 
            System.out.print(ans + " "); 
            return; 
        } 
        boolean alpha[] = new boolean[26]; 
  
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
            if (alpha[ch - 'a'] == false) 
            	permSet(ros, ans + ch); 
            alpha[ch - 'a'] = true; 
        } 
    } 
	void permList(String str,String ans) 
	{ 
		  
        // If string is empty 
        if (str.length() == 0) { 
            System.out.print(ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
  
            
            permList(ros, ans + ch); 
        } 
    } 
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = cin.nextLine();

		q11 obj = new q11();
		//obj.permSet(s,"");
		obj.permList(s,"");
	}
}
