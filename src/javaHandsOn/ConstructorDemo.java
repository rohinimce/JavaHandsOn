package javaHandsOn;

public class ConstructorDemo {
	
	String bankName, area, phoneNo;

	void ConstructorDemo(){
		System.out.println("Banking application");
	}

	public static void main(String args[]) {
		ConstructorDemo bank = new ConstructorDemo();
		System.out.println(bank.bankName);
	}

	
}
