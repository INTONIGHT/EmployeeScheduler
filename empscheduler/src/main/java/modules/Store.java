package modules;

import java.util.ArrayList;
import java.util.HashMap;

public class Store {
	//how many hours total for a day the store needs
	private double dailyHoursNeeded;
	//a way to keep track of the hours for a day
	private double dailyHoursAvailable;
	//weekly hours needed
	private double weeklyHoursNeeded;
	//weekly hours available ie the total hours available per worker
	private double weeklyHoursAvailable;
	private double dailyCost;
	private double weeklyCost;
	//This will have each day and the total hours needed by shift members for that day
	private HashMap<String, ArrayList<Double>> hoursPerDay;
	//this will have the individual day and then have a map which will map each individual hour of the day
	//then put number of hours needed.
	private HashMap<String, HashMap<Double,Double>> dailyTimePerHour;
	
}
