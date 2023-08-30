package modules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

//this will try to combine some of the work done in employee and store to help be the basis for what a weekly schedule will contain
//the goal is to have each day and then assign employees based off of eneds and then show for each hour of each day who is working
//it can also help keep track of times etc
public class StoreSchedule {
	//so we want to have each hour of a day containing whos working that hour.
	//we also want a day with the people working and the times they are working. each person can work mutliple shifts
	//can also run a total of scheduled hours
	//this one will be each hour of the individual day and then just the list of people assigned for that hour.
	private HashMap<String,ArrayList<String>> hoursPeopleScheduled;
	//this will be a daily view containing key of day and then referencing the person and the times they are scheduled
	//the first string will be for the day and then the internal mapping will contain the person and the times they are scheduled.
	private HashMap<String,HashMap<String,ArrayList<Double>>> dailyViewSchedule;
	private double hoursScheduled;
	
	public StoreSchedule() {
		super();
	}
	
	public StoreSchedule(HashMap<String, ArrayList<String>> hoursPeopleScheduled,
			HashMap<String, HashMap<String, ArrayList<Double>>> dailyViewSchedule, double hoursScheduled) {
		super();
		this.hoursPeopleScheduled = hoursPeopleScheduled;
		this.dailyViewSchedule = dailyViewSchedule;
		this.hoursScheduled = hoursScheduled;
	}
	public HashMap<String, ArrayList<String>> getHoursPeopleScheduled() {
		return hoursPeopleScheduled;
	}
	public void setHoursPeopleScheduled(HashMap<String, ArrayList<String>> hoursPeopleScheduled) {
		this.hoursPeopleScheduled = hoursPeopleScheduled;
	}
	public HashMap<String, HashMap<String, ArrayList<Double>>> getDailyViewSchedule() {
		return dailyViewSchedule;
	}
	public void setDailyViewSchedule(HashMap<String, HashMap<String, ArrayList<Double>>> dailyViewSchedule) {
		this.dailyViewSchedule = dailyViewSchedule;
	}
	public double getHoursScheduled() {
		return hoursScheduled;
	}
	public void setHoursScheduled(double hoursScheduled) {
		this.hoursScheduled = hoursScheduled;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dailyViewSchedule, hoursPeopleScheduled, hoursScheduled);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StoreSchedule other = (StoreSchedule) obj;
		return Objects.equals(dailyViewSchedule, other.dailyViewSchedule)
				&& Objects.equals(hoursPeopleScheduled, other.hoursPeopleScheduled)
				&& Double.doubleToLongBits(hoursScheduled) == Double.doubleToLongBits(other.hoursScheduled);
	}

	@Override
	public String toString() {
		return "Schedule [hoursPeopleScheduled=" + hoursPeopleScheduled + ", dailyViewSchedule=" + dailyViewSchedule
				+ ", hoursScheduled=" + hoursScheduled + "]";
	}
	
}
