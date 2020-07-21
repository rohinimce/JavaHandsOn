package abstractClassDemo;

public class Tester {

	public static void main(String[] args) {
		
		
		RRPaymentServices cc=new CreditCardPayment(10000.23, 5001);
		cc.payBill(15000.0);
		System.out.println("--------------------------------------");
		RRPaymentServices cc1=new CreditCardPayment(10000.23, 5001);
		
		cc1.payBill(0);
	
		System.out.println("--------------------------------------");
		
		RRPaymentServices shop = new ShoppingPayment(10000.23, 5001);
		shop.payBill(5000.0);
		System.out.println("--------------------------------------");
		RRPaymentServices shop1 = new ShoppingPayment(5000.0, 561328);
		shop1.payBill(5000.0);
		System.out.println("--------------------------------------");
		RRPaymentServices shop2 = new ShoppingPayment(5000.0, 561328);
		shop2.payBill(6000.0);
		System.out.println("--------------------------------------");
		RRPaymentServices shop3 = new ShoppingPayment(5000.0, 561328);
		shop3.payBill(4000.0);

	}

}
