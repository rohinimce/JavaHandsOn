package multiThreding;
class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			Thread.yield();
			System.out.println(i+" First Thread");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
					
				}
			}
		}
	}


class MyRunnable implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			Thread.yield();
			System.out.println(i+" First Thread");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
					
				}
		}
	}

	
}
public class threadMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t= new MyThread();
		Thread r= new Thread(new MyRunnable());
		t.start();
		
		try {
			
		t.join();
		}catch(InterruptedException e){
			System.out.println(e);
			
			}
		r.start();

	}

}
