package javaHandsOn;

public class StudentTester {
	private int studentId;
	private String name;
	private float qualifyingExamMarks;
	private char residentialStatus;
	private int yearOfEngineering;

	public static void main(String[] args) {
		StudentTester stud=new StudentTester();
		stud.setStudentName("Jacob");
		stud.setStudentId(1001);
		stud.setStudentMarks(80.2f);
		stud.setStudentYearOfPass(3);
		stud.setStudentResStatus('H');
		stud.displayStudDetails();
		stud.setStudentName("Peter");
		stud.setStudentId(1002);
		stud.setStudentMarks(83.0f);
		stud.setStudentYearOfPass(2);
		stud.setStudentResStatus('D');
		stud.displayStudDetails();
		

	}
	
	public void setStudentId(int studentID) {
		this.studentId=studentID;
	
		
	}
	
	public void setStudentName(String name) {	
		this.name=name;
		
	}
	
	public void setStudentMarks(float qualifyingExamMarks) {
		
		this.qualifyingExamMarks=qualifyingExamMarks;
		
	}
	public void setStudentResStatus(char residentialStatus) {
		
		this.residentialStatus=residentialStatus;
		
	}
	
	
	public void setStudentYearOfPass(int yearOfEngineering) {
	
		this.yearOfEngineering=yearOfEngineering;
	}

	public int getStudId() {
				
		return studentId;
	}
	
	public String getStudname() {
		
		return name;
	}
	
	
public char getStudresStatus() {
			return residentialStatus;
	}
	
public float getStudmarks() {
	return qualifyingExamMarks;
}
	
public int getstudYearOfpassing() {
	return yearOfEngineering;
}
 
public void displayStudDetails() {
	String residnetialStatus;
	char resStatus=getStudresStatus();
	residnetialStatus=Character.toString(resStatus);
	if(residnetialStatus.equals("H")) {
		residnetialStatus="Hostellers";
	}else if(residnetialStatus.equals("D")) {
		residnetialStatus="DayScholar";
	}
	System.out.println("Student Name		:	"+getStudname());
	System.out.println("Student Id		:	"+getStudId());
	System.out.println("Qualifying Marks	:	"+getStudmarks());
	System.out.println("Year of Engineering	:	"+getstudYearOfpassing());
	System.out.println("Residential Status	:	"+residnetialStatus);

}
		
	}

