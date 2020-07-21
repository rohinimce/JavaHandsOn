package interfaceExercise;

public class Trainee implements Dataprovide{
int marksSecured;
Trainee(int marksSecured){
	this.marksSecured=marksSecured;
}

public void calPercentage() {
	double percentage= ((float)marksSecured/(float)totalMaxMarks)*100;
	System.out.println("Total aggreagate Percentage is "+percentage);
}
}

