package thisKeywordDemo;

public class ChocolateTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate choco=new Chocolate(101, "Cadbury", 12, 10);
		choco.setBarcode(102);
		System.out.println("barcode"+choco.getBarcode());
		choco.setname("Hershelys");
		System.out.println("barcode"+choco.getName());
		choco.setWeight(24);
		System.out.println("barcode"+choco.getweight());
		choco.setCost(50);
		System.out.println("barcode"+choco.getCost());

	}

}
