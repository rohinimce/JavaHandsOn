package stringExercise;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocationChanger loc=new LocationChanger();
		loc.setLocation("BL003,Delhi,STP");
		loc.setName("Annabelle Michael");
		loc.welcomeEmployee();
		loc.checkCity();
		loc.editAddress();
		
System.out.println("-----------------------------");
		//LocationChanger lc2=new LocationChanger();
		loc.setLocation("FL091,Pune,SEZ");
		loc.setName("Jissele James");
		loc.welcomeEmployee();
		loc.checkCity();
		loc.editAddress();

	}

}
