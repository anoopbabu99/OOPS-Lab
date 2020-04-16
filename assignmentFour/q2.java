import java.util.*;
//ways of creating thread A4Q2.

class q2{
	
	String showQuestion() 
	{
		return "Write a java program that shows 2 ways of starting a thread (by using Thread class and by\r\n" + 
				"implementing Runnable interface)";
	}
	void showThreadDetails() {
		System.out.println ( Thread.currentThread().getName() +" "
				+ ""+"(state:"+Thread.currentThread().getState()+")"+
				" is running - (id: "+Thread.currentThread().getId()+")"); 
	}
	class RunnableThread implements Runnable
	{
		@Override
		public void run()
	    {
			showThreadDetails();
	    }
	}
	
	class ExtendedThread extends Thread
	{
		@Override
		public void run()
	    {
			showThreadDetails();
	    }
	}
	
	public static void main(String args[]) {
		
		Scanner cin = new Scanner(System.in);
		q2 obj = new q2();
		
		//JVM creates a main thread by itself. uncomment next line to view details.
		//obj.showThreadDetails();
		
		//uncomment next line to view question. 
		//System.out.println(obj.showQuestion()); System.exit(0);
		
		//Runnable interface thread
		RunnableThread thread1 = obj.new RunnableThread();
		Thread myThread = new Thread(thread1);
		myThread.start();
		
		//Thread class thread
		ExtendedThread thread2 = obj.new ExtendedThread();
		thread2.start();
	}
}