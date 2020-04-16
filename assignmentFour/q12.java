import java.util.*;
//print odd and even numbers in a synchronous manner A4Q12.

class q12{
	
	String showQuestion() 
	{
		return "Write a program for generating 2 threads, one for printing even numbers and the other for\r\n" + 
				"printing odd numbers.\r\n" + 
				"";
	}
	
	void showThreadDetails() {
		System.out.println ( Thread.currentThread().getName() +" "
				+ ""+"(state:"+Thread.currentThread().getState()+")"+
				" is running - (id: "+Thread.currentThread().getId()+")");
	}
	
	class BridgeToCommunicate{
		
		//initial number to print is odd, hence initialize this to false. 
		boolean isOddPrinted = false;
		
		//function to print odd number
		//synchronized keyword makes sure only one odd number gets printed.  
		synchronized void printOdd(int number)
	    {
			//wait for even number to get printed
	        while (isOddPrinted)
	        {
	        	
	            try
	            {
	                wait();
	            } 
	            catch (InterruptedException e)
	            {
	                e.printStackTrace();
	            }
	        }
	         
	        //print odd number
	        System.out.println("ODD THREAD: "+number);
	        isOddPrinted = true;
	         
	        //sleep for a second before notifying the even thread that the job is complete.  
	        try
	        {
	            Thread.sleep(300);
	        } 
	        catch (InterruptedException e) 
	        {
	            e.printStackTrace();
	        }
	        
	        //inform even thread that odd number has been successfully printed
	        notify();
	    }
		
		//function to print even number
		synchronized void printEven(int number)
	    {
			//wait for odd number to get printed
	        while (! isOddPrinted)
	        {
	            try
	            {
	                wait();
	            }
	            catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	         
	        //print even number
	        System.out.println("EVEN THREAD : "+number);
	        isOddPrinted = false;
	         
	        //sleep for a second before notifying the odd thread that the job is complete.  
	        try
	        {
	            Thread.sleep(300);
	        } 
	        catch (InterruptedException e) 
	        {
	            e.printStackTrace();
	        }
	        
	        //inform odd thread that even number has been successfully printed
	        notify();
	    }
		
		
	}
	class OddThread implements Runnable
	{
		int countUpto;
		int oddNumber = 1;
		BridgeToCommunicate bridge;
		
		//initialize odd thread
		OddThread(int countUpto, BridgeToCommunicate bridge)
		{
			this.countUpto = countUpto;
			this.bridge = bridge;
		}
		
		@Override
		public void run()
	    {
			//showThreadDetails();
			while(oddNumber<=countUpto)
			{
				bridge.printOdd(oddNumber);
				oddNumber+=2;
			}
	    }
	}
	class EvenThread implements Runnable
	{
		int countUpto;
		int evenNumber = 2;
		BridgeToCommunicate bridge;
		
		//initialize even thread
		EvenThread(int countUpto, BridgeToCommunicate bridge)
		{
			this.countUpto = countUpto;
			this.bridge = bridge;
		}
		
		@Override
		public void run()
	    {
			//showThreadDetails();
			while(evenNumber<=countUpto)
			{
				bridge.printEven(evenNumber);
				evenNumber+=2;
			}
	    }
	}
	public static void main(String args[]) {
		
		Scanner cin = new Scanner(System.in);
		q12 obj = new q12();
		
		//JVM creates a main thread by itself. uncomment next line to view details.
		//obj.showThreadDetails();
		
		//uncomment next line to view question. 
		//System.out.println(obj.showQuestion()); System.exit(0);
		
		BridgeToCommunicate bridge = obj.new BridgeToCommunicate();
		
		System.out.println("How many natural numbers would you like to display?");
		int countUpto = cin.nextInt();
        
        OddThread thread_odd = obj.new OddThread(countUpto, bridge);
		Thread myOddThread = new Thread(thread_odd);
		
		EvenThread thread_even = obj.new EvenThread(countUpto, bridge);
		Thread myEvenThread = new Thread(thread_even);
		
		myOddThread.start();
		myEvenThread.start();
	}
}