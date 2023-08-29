package modules;

import java.util.ArrayList;
import java.util.HashMap;

public class Employee {
	 private String employeeType, firstName, lastName;
	    private double hours;
	    private double overtimeHours;
	    private double payRate;
	    //Trying to figure out how to store the hours per day for each employee
	    private HashMap<String,ArrayList<Double>> availableTimes;
	    //This will store based on day and then state any times available
	    private HashMap<String, String> dailyHoursAvailable;
}
