package interfaceExercise;

public class Intern implements Dataprovide {
public int marksSecured;
public int graceMarks;
Intern(int marksSecured, int graceMarks){
	this.marksSecured=marksSecured;
	this.graceMarks=graceMarks;
}

public int getMarkSecured() {
	return marksSecured;
}


public int getGraceMarks() {
	return graceMarks;
}

public void calPercentage() {
	float percentage;
	
	int totalMarks= getMarkSecured()+getGraceMarks();
	if(totalMarks>totalMaxMarks) {
		System.out.println("Please Enter correct Marks");
	}else {
	percentage= ((float)totalMarks/(float)totalMaxMarks)*100;
	System.out.println("Total aggreagate Percentage is "+percentage);
	}
}
}
