package multiThreding;

class FirstRunnable implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" First Thread");
		}
	}
}
public class implementRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread Starts");
		Thread t= new Thread(new FirstRunnable());
		t.start();
		System.out.println("Main Thread Ends");
			}

	

}
