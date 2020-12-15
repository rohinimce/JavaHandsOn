package staticDemo;

public class Loan {
	private static int loanCounter;
int loanNo;
int accountNo;
int customerNo;
float loanAmount;
int loanDuration;
float interest;

Loan(){
	loanCounter++;
}

public void setLoanNo(int intloanNo){
	this.loanNo= intloanNo;
}

public int getLoanNo() {
	return loanNo;
}

public void setAccountNo(int intAccountNo){
	this.accountNo= intAccountNo;
}

public int getAccountNo() {
	return accountNo;
}

public void setCustomerNo(int intCustomerNo){
	this.customerNo= intCustomerNo;
}

public int getCustomerNo() {
	return customerNo;
}

public void setLoanAmmount(float loanAmount){
	this.loanAmount= loanAmount;
}

public float getLoanAmmount() {
	return loanAmount;
}

public void setLoanDuration(int intloanDuration){
	this.loanDuration= intloanDuration;
}

public int getLoanDuration() {
	return loanDuration;
}

public void setInterest(float interest){
	this.interest= interest;
}

public float getInterest() {
	return interest;
}

Loan(int accNo,int cusNo,float loanAmount,int loanDuration,float intrest){
	loanCounter++;
}

public int getLoanCounter() {
	return loanCounter;
}
}
