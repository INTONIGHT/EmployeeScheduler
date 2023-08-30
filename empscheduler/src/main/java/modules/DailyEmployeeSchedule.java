package modules;

import java.util.ArrayList;
//using this to handle an employees schedule for a specific day and then map out that day
public class DailyEmployeeSchedule {

	private String firstName, lastName, day;
	private ArrayList<Double> times;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public ArrayList<Double> getTimes() {
		return times;
	}
	public void setTimes(ArrayList<Double> times) {
		this.times = times;
	}
	public DailyEmployeeSchedule(String firstName, String lastName, String day, ArrayList<Double> times) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.day = day;
		this.times = times;
	}
	public DailyEmployeeSchedule() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeeSchedule [firstName=" + firstName + ", lastName=" + lastName + ", day=" + day + ", times="
				+ times + "]";
	}
	
}
