package thisKeywordDemo;

public class Chocolate {
	private int barcode;
	private String name;
	private double weight;
	private double cost;
	
	Chocolate(int barcode, String name, double weight, double cost){
		this.barcode=barcode;
		this.name=name;
		this.weight=weight;
		this.cost=cost;
		
		System.out.println(barcode);
		System.out.println(name);
		System.out.println(this.weight);
		System.out.println(this.cost);
		
	}
	
	public void setBarcode(int barcode) {
		this.barcode=barcode;
	}
public int getBarcode() {
	return barcode;
}

public void setname(String name) {
	this.name=name;
}
public String getName() {
return name;
}

public void setWeight(double weight) {
	this.weight=weight;
}
public double getweight() {
return weight;
}

public void setCost(double Cost) {
	this.cost=Cost;
}
public double getCost() {
return cost;
}
}
