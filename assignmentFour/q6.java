import java.util.*;
//sender-receiver mechanism A4Q6.

// wait(): to suspend a thread.
// notify(): to resume a thread.
// wait()/notify() can only be invoked in a synchronized block.
// if  method is synchronized it means that: the current thread owns the object's monitor.
// a "monitor" is a mechanism that ensures that only one thread can be executing a given section (or sections) of code at any given time.

class q6{
	String showQuestion() 
	{
		return "Write a simple Sender–Receiver application – that will make use of the wait() and notify()\r\n" + 
				"methods to set up synchronization between them:\r\n" + 
				"-> The Sender is supposed to send a data packet to the Receiver\r\n" + 
				"-> The Receiver cannot process the data packet until the Sender is finished sending it\r\n" + 
				"Similarly, the Sender mustn't attempt to send another packet unless the Receiver has already\r\n" + 
				"processed the previous packet\r\n" + 
				"First create Data class that consists of the data packet that will be sent from Sender to Receiver.\r\n" + 
				"Show the appropriate message (send or message received)";
	}
	void showThreadDetails() {
		System.out.println ( Thread.currentThread().getName() +" "
				+ ""+"(state:"+Thread.currentThread().getState()+")"+
				" is running - (id: "+Thread.currentThread().getId()+")");
	}
	public class Data {
	    private String dataPacket;
	     
	    // True if receiver should wait
	    // False if sender should wait
	    private boolean transfer = true;
	    
	    public synchronized void send(String packet) {
	        while (!transfer) {
	            try { 
	                wait();
	            } catch (InterruptedException e)  {
	                Thread.currentThread().interrupt(); 
	                System.out.println("Thread interrupted"); 
	            }
	        }
	        transfer = false;
	         
	        this.dataPacket = packet;
	        notify();
	    }
	  
	    public synchronized String receive() {
	        while (transfer) {
	            try {
	                wait();
	            } catch (InterruptedException e)  {
	                Thread.currentThread().interrupt(); 
	                System.out.println("Thread interrupted"); 
	            }
	        }
	        transfer = true;
	 
	        notify();
	        return dataPacket;
	    }
	}
	public class Sender implements Runnable {
	    private Data data;
	  
	    Sender(Data data){
	    	this.data = data;
	    }
	    
	    @Override
	    public void run() {
	        String packets[] = {
	          "First packet",
	          "Second packet",
	          "Third packet",
	          "Fourth packet",
	          "End"
	        };
	  
	        for (String packet : packets) {
	            data.send(packet);
	 
	            // mimics processing
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e)  {
	                Thread.currentThread().interrupt(); 
	                System.out.println("Thread interrupted"); 
	            }
	        }
	    }
	}
	public class Receiver implements Runnable {
	    private Data load;
	  
	    Receiver(Data load){
	    	this.load = load;
	    }
	  
	    @Override
	    public void run() {
	        for(String receivedMessage = load.receive();!"End".equals(receivedMessage);receivedMessage = load.receive()) {
	             
	            System.out.println(receivedMessage);
	 
	            // mimics processing
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt(); 
	                System.out.println("Thread interrupted"); 
	            }
	        }
	    }
	}
	public static void main(String args[]) {
		
		Scanner cin = new Scanner(System.in);
		q6 obj = new q6();
		
		//JVM creates a main thread by itself. uncomment next line to view details.
		//obj.showThreadDetails();
		
		//uncomment next line to view question.
		//System.out.println(obj.showQuestion()); System.exit(0);
		
		//sending and receiving the message:
		Data data = obj.new Data();
		
		Sender sender = obj.new Sender(data);
		Thread mysender = new Thread(sender);
		
		Receiver receiver = obj.new Receiver(data);
		Thread myReceiver = new Thread(receiver);
		
		mysender.start();
		myReceiver.start();

		
	}
}

//wait(): this forces the current thread to wait until some other thread invokes notify() or notifyAll() on the same object.
//notify(): method is used for waking up threads that are waiting for an access to this object's monitor.