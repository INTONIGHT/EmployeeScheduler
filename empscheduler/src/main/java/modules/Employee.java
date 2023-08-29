package modules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Employee {
	 	private String employeeType, firstName, lastName;
	 	private int id;
	 	private double hoursWorked, overtimeHours, payRate,hoursAvailable;
	    //per worker the goal will be to have the day then an array list of hours available
	    //the functionality will be 24hours stored ie 1pm would be 13 and then 15 mins as .25
	    //the arraylist will follow the pattern of first number is start time second number is end time.
	    //can have any amt of shifts per day not over 24 hrs.
	    private HashMap<String, ArrayList<Double>> dailyHoursAvailable;
	    public Employee() {
	    	super();
	    }
		public Employee(String employeeType, String firstName, String lastName, double hoursWorked,
				double overtimeHours, double payRate, double hoursAvailable,
				HashMap<String, ArrayList<Double>> dailyHoursAvailable,int id) {
			super();
			this.employeeType = employeeType;
			this.firstName = firstName;
			this.lastName = lastName;
			this.hoursWorked = hoursWorked;
			this.overtimeHours = overtimeHours;
			this.payRate = payRate;
			this.hoursAvailable = hoursAvailable;
			this.dailyHoursAvailable = dailyHoursAvailable;
			this.id = id;
		}
		public String getEmployeeType() {
			return employeeType;
		}
		public void setEmployeeType(String employeeType) {
			this.employeeType = employeeType;
		}
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
		public double getHoursWorked() {
			return hoursWorked;
		}
		public void setHoursWorked(double hoursWorked) {
			this.hoursWorked = hoursWorked;
		}
		public double getOvertimeHours() {
			return overtimeHours;
		}
		public void setOvertimeHours(double overtimeHours) {
			this.overtimeHours = overtimeHours;
		}
		public double getPayRate() {
			return payRate;
		}
		public void setPayRate(double payRate) {
			this.payRate = payRate;
		}
		public double getHoursAvailable() {
			return hoursAvailable;
		}
		public void setHoursAvailable(double hoursAvailable) {
			this.hoursAvailable = hoursAvailable;
		}
		
		public HashMap<String, ArrayList<Double>> getDailyHoursAvailable() {
			return dailyHoursAvailable;
		}
		public void setDailyHoursAvailable(HashMap<String, ArrayList<Double>> dailyHoursAvailable) {
			this.dailyHoursAvailable = dailyHoursAvailable;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		@Override
		public String toString() {
			return "Employee [employeeType=" + employeeType + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", hoursWorked=" + hoursWorked + ", overtimeHours=" + overtimeHours + ", payRate=" + payRate
					+ ", hoursAvailable=" + hoursAvailable +  ", dailyHoursAvailable=" + dailyHoursAvailable + ", id=" + id + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(dailyHoursAvailable, employeeType, firstName, hoursAvailable, hoursWorked, id, lastName,
					overtimeHours, payRate);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return Objects.equals(dailyHoursAvailable, other.dailyHoursAvailable)
					&& Objects.equals(employeeType, other.employeeType) && Objects.equals(firstName, other.firstName)
					&& Double.doubleToLongBits(hoursAvailable) == Double.doubleToLongBits(other.hoursAvailable)
					&& Double.doubleToLongBits(hoursWorked) == Double.doubleToLongBits(other.hoursWorked)
					&& id == other.id && Objects.equals(lastName, other.lastName)
					&& Double.doubleToLongBits(overtimeHours) == Double.doubleToLongBits(other.overtimeHours)
					&& Double.doubleToLongBits(payRate) == Double.doubleToLongBits(other.payRate);
		}
		
	    
}
