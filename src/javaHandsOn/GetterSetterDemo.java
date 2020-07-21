package javaHandsOn;

public class GetterSetterDemo {
	
	private String name;
	private int year;
	
	private int length;
	private int bredth;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterSetterDemo getSet=new GetterSetterDemo();
		getSet.setName("Rohini");
		getSet.setYear(1991);
		getSet.setLength(20);
		getSet.setBredth(20);
		getSet.calculateArea();
System.out.println("My name is "+ getSet.getName());
System.out.println("Birth Year is "+ getSet.getYear());
	}
	
	public void setName(String myName) {
		this.name=myName;
	}

	public void setYear(int myBirthYear) {
		this.year=myBirthYear;
	}
	
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	
	public void setLength(int l) {
		this.length=l;
		
	}
	public void setBredth(int b) {
		this.bredth=b;
	}
	
	public int getLength() {
		return length;
	}
	public int getBredth() {
		return bredth;
	}
	
	public void calculateArea() {
		int area= getLength()*getBredth();
		System.out.println("Area of rectangle is "+area);
	}
	
	public void calculatePerimeter(int l, int b) {
		int perimeter= 2*(l+b);
		System.out.println("Perimeter of rectangle is"+perimeter);
		
		
	}
}
