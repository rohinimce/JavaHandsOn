package abstractClassDemo;

public abstract class RRPaymentServices {
	
	public double balance;
	public int customerId;
	public abstract void payBill(double amount) ;	
	//public abstract void displayBill(double amount) ;	
	RRPaymentServices(double balance,int customerId){
		super();
		this.balance=balance;
		this.customerId=customerId;
		}
	
		public void setBalance(double balance) {
			this.balance=balance;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public int getCustomerId() {
			return customerId;
		}
	}
	


