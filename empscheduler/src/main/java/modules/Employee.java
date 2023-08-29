package modules;

import java.util.ArrayList;
import java.util.HashMap;

public class Employee {
	 private String employeeType, firstName, lastName;
	    private double hoursWorked;
	    private double overtimeHours;
	    private double payRate;
	    private double hoursAvailable;
	    //Trying to figure out how to store the hours per day for each employee
	    private HashMap<String,ArrayList<Double>> availableTimes;
	    //per worker the goal will be to have the day then an array list of hours available
	    //the functionality will be 24hours stored ie 1pm would be 13 and then 15 mins as .25
	    //the arraylist will follow the pattern of first number is start time second number is end time.
	    //can have any amt of shifts per day not over 24 hrs.
	    private HashMap<String, ArrayList<Double>> dailyHoursAvailable;
}
