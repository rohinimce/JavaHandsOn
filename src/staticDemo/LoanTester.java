package staticDemo;

public class LoanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Loan l1=new Loan();
System.out.println("LoanCount "+l1.getLoanCounter());
Loan l2=new Loan(123,0001,1000.09f,1,2.5f);
System.out.println("LoanCount "+l2.getLoanCounter());

	}

}
