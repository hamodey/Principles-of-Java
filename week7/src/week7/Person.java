package week7;

import java.util.Date;
import java.util.Calendar;


public class Person {
	static String name;
	static Date DoB;
	
	Person(String name, Date DoB){
		
		this.name = name;
		
		this.DoB = DoB;
	
	}
	
	int getAge(){
	    Calendar today = Calendar.getInstance();
	    int todayYear = today.get(Calendar.YEAR);
	    int todayMon = today.get(Calendar.MONTH);
	    int todayDay = today.get(Calendar.DATE);
	    @SuppressWarnings("deprecation")
		int birthDateDayOfYear = DoB.getYear();
	    int birthMon = DoB.getMonth();
	    int birthDay = DoB.getDate();
	    int age = todayYear - birthDateDayOfYear;
	    
	    if(todayDay < birthDay) {
    			return age = age - 1;
	    }
	    else if(todayMon < birthMon) {
	    		return age = age - 1;
	    }
	    else {
	    		return age;
	    }
	}
	
	public String toString() {
		return "Name: " + name + " Age: " + getAge() + " Date of Birth: " + DoB;
	}
	
//	public static void main(String[] args) {
//		Person ahmed = new Person("ahmed", new Date(1996, 12, ));
//		System.out.println(ahmed.getAge());
//	}
	
}
