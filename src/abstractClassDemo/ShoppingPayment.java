package abstractClassDemo;

public class ShoppingPayment extends RRPaymentServices{
	
	

	 int counter=1001;
	 String paymentId;
	
	ShoppingPayment(double balance, int customerId) {
		super(balance, customerId);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * ShoppingPayment(double balance,int customerId){
	 * 
	 * 
	 * }
	 */
	
	public String getPaymentID() {
		this.paymentId="S"+counter;
		counter++;
		return paymentId;
	}
//////
	public void payBill(double amount) {
		
		if((amount<getBalance())) {
			
		double	balancedue=getBalance()-amount;
		if(balancedue>=0.0 ){
			System.out.println("Congratulations !! You have successfully payment of Rs."+amount+"Payment Details are");
			System.out.println("**************************************************************************************");
			System.out.println("Customer ID		:"+getCustomerId());
			System.out.println("Payment Id      :"+getPaymentID());
			System.out.println("Previous Due    :Rs."+getBalance());
			System.out.println("RemainingDue    :Rs."+(getBalance()-amount)   );
			
		}else {
			System.out.println("Insufficient Amount entered");
		}
		
		}else if(amount>getBalance()) {
			System.out.println("Excess Amount entered please try again");
			
		}else if((amount==getBalance())) {
			
			System.out.println("Congratulations !! your payment of"+amount+"is successful with paymentId"+getPaymentID());
		}
	}

	
}
