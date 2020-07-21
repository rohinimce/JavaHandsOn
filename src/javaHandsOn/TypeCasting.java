package javaHandsOn;

public class TypeCasting {
	private int billID,customerId,discount;
	private double billAmount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * TypeCasting type= new TypeCasting(); type.setBillId(1001, 101, 2);
		 * type.setBillAnount(199.99); type.calculateDiscount();
		 * 
		 * type.setBillId(1001, 101, 4); type.setBillAnount(210.5);
		 * type.calculateDiscount();
		 */
	int sum=0;	
		for(int i=0,j=0;i<5&j<5;++i,j=i+1)
			sum+=i;
		System.out.println(sum);
	
		/*
		 * do { if(i>j) { break; } j--; } while (++i <5); System.out.println("i ="
		 * +i+" and j = "+j);
		 */

	}
	
	public void setBillId(int billid,int cusotmerID, int discount) {
		this.billID=billid;
		this.customerId=cusotmerID;
		this.discount=discount;
		String f = null;
		switch(f) {
		case  "a":
			
		}
	}
	



	public int getBillId() {
		return billID;
	}
	public int getCustomerId() {
		return customerId;
	}
	public double getDiscount() {
		return discount;
	}
	public void setBillAnount(double billAmount) {
		this.billAmount=billAmount;
	}
	public double getBillAmount() {
		return billAmount;
	}
	
	public void calculateDiscount() {
		
		double discountedBillAmount=getBillAmount()-getBillAmount()*(getDiscount()/100);
		System.out.println(discountedBillAmount);
	}
}
