package multiThreding;


class MessagePrinter {
	//public synchronized void display(String msg) { //synchronized method
		public void display(String msg) { 
		System.out.print("<"+msg);
		try {
			Thread.sleep(500);
		}catch(InterruptedException e){
			System.out.println(e);
				
			}
		System.out.println(">");
	}
}

class PrinterThread extends Thread{
	private String message;
	private MessagePrinter mpObject;
	public PrinterThread(String msg, MessagePrinter mp ) {
		message=msg;
		mpObject=mp;
	}
	
	/*
	 * public void run() { mpObject.display(message); }
	 */
	
	public void run() {  // synchronized block
		synchronized (mpObject) {
			mpObject.display(message);
		}
		
		
	}
}
public class ThreadSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessagePrinter mp= new MessagePrinter();
		PrinterThread t1= new PrinterThread("Welcome", mp);
		t1.start();
		PrinterThread t2= new PrinterThread("Java", mp);
		t2.start();
		PrinterThread t3= new PrinterThread("Program", mp);
		t3.start();

	}

}
