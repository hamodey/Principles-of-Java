package week7;

import java.util.Date;
import java.util.Calendar;

public class Testing {

	public static void main(String[] args) {

		double[] marks1 = {70,70, 61, 72,60,43};
		Person person1 = new Student("Ahmed", new Date(1998,0,29), "12345678", marks1);
		System.out.println(person1.toString());
		
	}

}
