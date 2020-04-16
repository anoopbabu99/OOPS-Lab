import java.util.*;
import java.io.*; 

//creating an exception A4Q10.
//reading from a file in JAVA. 

class q10{
	
	String showQuestion() 
	{
		return "Define a new exception, called ExceptionLineTooLong, that prints out the error message\"The\r\n" + 
				"string is too long\". Write a program that reads all lines of a file and throws an exception of\r\n" + 
				"typeExceptionLineTooLong in the case where a string of the file is longer than 80 characters.";
	}
	class ExceptionLineTooLong extends Exception 
	{ 
	    public ExceptionLineTooLong() 
	    { 
	        // Call constructor of parent Exception 
	        super("The string is too long"); 
	    } 
	} 
	public static void main(String args[]) throws Exception  {
		
		q10 obj = new q10();

		//uncomment next line to view question. 
		//System.out.println(obj.showQuestion()); System.exit(0);

		Scanner reader = null;
	    try 
	    {
	    	//get path of text.txt and open file
			String z = System.getProperty("user.dir")+"\\src\\text.txt";
			z = z.replace("\\", "\\\\");
	    	reader = new Scanner(new File(z));
	    } 
	    catch (FileNotFoundException e) 
	    {
	        System.out.println("ERROR: file not found.");
	    }
	    
	    //check file
	    String word = null;
	    while (reader.hasNext()) 
	    {
	    	try {
	    		 word = reader.next();
	    		
	    		if(word.length()>=80) {
	    			throw obj.new ExceptionLineTooLong();
	    		}
	    	}
	    	catch(ExceptionLineTooLong exc){
            	System.out.println(exc.getMessage());
            	//System.out.println(word);
	    	}
	    }
		
	} 
		
}