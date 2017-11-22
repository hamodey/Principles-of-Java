package week7;


import java.util.Date;
import java.util.Calendar;

public class Student extends Person{

	String studentID;
	double[] marks;
	
	Student(String name, Date DoB, String studentID, double[] marks){
		super(name, DoB);
		this.studentID = studentID;
		this.marks = marks;
	}
	
	double getFinalMark() {
		double sum = 0;
		double average = 0;
		for(int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		average = sum/marks.length;
		return average;
	}
	
	String getGrade() {
		getFinalMark();
		
		if(getFinalMark() < 50) {
			return "F";
		}
		else if(getFinalMark() >= 50 && getFinalMark() < 60) {
			return "D";
		}
		else if(getFinalMark() >= 60 && getFinalMark() < 70) {
			return "B";
		}
		else{
			return "A";
		}
	}
	
	public String toString() {
		return super.toString() + " Student ID: " + studentID + " Grade: "
				+ getGrade() + " Final Mark " + getFinalMark();
	}
	
}
