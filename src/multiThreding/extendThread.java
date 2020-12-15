package multiThreding;



class FirstThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" First Thread");
		}
	}
}

public class extendThread {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread Starts");
		FirstThread thread=new FirstThread();
thread.start();
System.out.println("Main Thread Ends");
	}

}
