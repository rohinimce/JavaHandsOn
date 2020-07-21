package abstractClassDemo;

public class CreditCardPayment extends RRPaymentServices {
	int counter = 1001;
	String paymentID;
	double cashBack;
	double balanceDue;

	CreditCardPayment(double balance, int customerId) {
		super(balance , customerId);
		this.balanceDue=getBalance();
		// TODO Auto-generated constructor stub
	}

public void payBill(double amount) {

	  System.out.println("Congratulations !! You have successfully payment of Rs."
	  +amount+"Payment Details are"); System.out.println(
	  "**************************************************************************************"
	  ); System.out.println("Customer ID		:"+getCustomerId());
	  System.out.println("Payment Id      :"+getPaymentId());
	  
	  System.out.println("Previous Due    :Rs."+getBalance());
	  System.out.println("RemainingDue    :Rs."+getBalanceDue(amount) );
	  System.out.println("CashBack Wallet Balance:Rs."+getCashBack(amount)); }
	  
	  
	  
	  
	 

	public String getPaymentId() {
		paymentID = "C" + counter;
		counter++;
		return paymentID;
	}

	public double getCashBack(double amount) {
		if(amount>getBalance()) {
			cashBack = amount - getBalance();
		}
		
		return cashBack;
	}

	public double getBalanceDue(double amount) {
		if(amount>getBalance()) {
			this.balanceDue=0.0;
		}

		return balanceDue;
	}

}
