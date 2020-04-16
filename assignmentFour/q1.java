import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.*;
//shared counter A4Q1.

class q1{
	
	String showQuestion() 
	{
		return "1. Design a shared counter in Java\nInput:\n\tNumber of threads (n)"+ "\n\tMaximum count in each thread (N)\nOutput:\n\tDisplay the value of each counter in parallel , "+ "as the value gets incremented in each counter.\n"+ "\tAll the counter should reset to zero when at least one of them reaches maximum count (N)\n";
	}
	void showThreadDetails() {
		System.out.println ( Thread.currentThread().getName() +" "+"(state:"+Thread.currentThread().getState()+")"+" is running - "+Thread.currentThread().getId()); 
	}
	
	//stores maximum value of counter
	static int maxCount =0;
	//below is the shared counter. 
	//atomicInteger is a special type of integer that can only be accessed atomically!
	private static AtomicInteger mainCounter;
	
	class ThreadCounter implements Runnable
	{
		int localCounter = 0;
		
		@Override
		public void run()
	    {
	        //showThreadDetails();
	        
			while(mainCounter.get()<maxCount&&mainCounter.get()!=0)
			{
				System.out.println(Thread.currentThread().getName() + " increments counter to: " + mainCounter.getAndIncrement());		
				localCounter = mainCounter.get();
			}
			
			if(mainCounter.get()==maxCount)
			{	
				System.out.println("\nFINAL: "+Thread.currentThread().getName() + " increments counter to: " + mainCounter.getAndIncrement()+"\n");
				
				//reset to zero.
				mainCounter.addAndGet(-mainCounter.get());
				System.exit(0);
			}
			
	    }
	}
	public static void main(String args[]) {
		
		Scanner cin = new Scanner(System.in);
		q1 obj = new q1();
		
		//JVM creates a main thread by itself. uncomment next line to view details.
		//obj.showThreadDetails();
		
		//uncomment next line to view question. 
		//System.out.println(obj.showQuestion()); System.exit(0);
		
		System.out.print("Enter the number of threads:\t");
		int n = cin.nextInt();
		mainCounter = new AtomicInteger(1);
		
		System.out.print("Enter the maximum count on each thread:\t");
		maxCount = cin.nextInt();
		
		
		//create a list of threads:
		ArrayList<Thread> threadList = new ArrayList<Thread>();
		for(int i=0; i<n; i++)
		{
			ThreadCounter thread = obj.new ThreadCounter();
			Thread myThread = new Thread(thread);
			threadList.add(myThread);
		}
		
		//execute threads:
		for(int i=0; i<n; i++)
			threadList.get(i).start();
	}
}

