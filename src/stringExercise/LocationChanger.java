package stringExercise;

public class LocationChanger {
	private String location;
	private String name;
	
	public void setLocation(String location1) {
		
		this.location=location1;
	}
	
	public String getLocation() {
		
		return location;
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
public String getName() {
	return name;

}

public void checkCity() {
	String[] locationArray=(getLocation()).split(",");
	if("Delhi".equalsIgnoreCase(locationArray[1])) {
		System.out.println("Welcome to Infy Mysore Delhites");
	}else if ("Trivandrum".equalsIgnoreCase(locationArray[1])) {
		System.out.println("Welcome to MYDC people of Trinfy");
	}else if ("Bhubaneshwar".equalsIgnoreCase(locationArray[1])) {
		System.out.println("You came way long from South we welcome you");
}else {
	System.out.println("OOps your city is not listed!");
}
}

public void editAddress() {
	String[] locationArray=(getLocation()).split(",");
	if ("STP".equals(locationArray[2])) {
		System.out.println("Your location has been changed from STP to SEZ");
	}else if("SEZ".equals(locationArray[2])) {
		System.out.println("Your location remians the same");
	}
}

public void welcomeEmployee() {
	String[] nameArray=getName().split(" ");
	System.out.println("Hello "+nameArray[0]);
}
}
