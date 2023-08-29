package modules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

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
	public Store() {
		super();
	}
	public Store(double dailyHoursNeeded, double dailyHoursAvailable, double weeklyHoursNeeded,
			double weeklyHoursAvailable, double dailyCost, double weeklyCost,
			HashMap<String, ArrayList<Double>> hoursPerDay, HashMap<String, HashMap<Double, Double>> dailyTimePerHour) {
		super();
		this.dailyHoursNeeded = dailyHoursNeeded;
		this.dailyHoursAvailable = dailyHoursAvailable;
		this.weeklyHoursNeeded = weeklyHoursNeeded;
		this.weeklyHoursAvailable = weeklyHoursAvailable;
		this.dailyCost = dailyCost;
		this.weeklyCost = weeklyCost;
		this.hoursPerDay = hoursPerDay;
		this.dailyTimePerHour = dailyTimePerHour;
	}
	public double getDailyHoursNeeded() {
		return dailyHoursNeeded;
	}
	public void setDailyHoursNeeded(double dailyHoursNeeded) {
		this.dailyHoursNeeded = dailyHoursNeeded;
	}
	public double getDailyHoursAvailable() {
		return dailyHoursAvailable;
	}
	public void setDailyHoursAvailable(double dailyHoursAvailable) {
		this.dailyHoursAvailable = dailyHoursAvailable;
	}
	public double getWeeklyHoursNeeded() {
		return weeklyHoursNeeded;
	}
	public void setWeeklyHoursNeeded(double weeklyHoursNeeded) {
		this.weeklyHoursNeeded = weeklyHoursNeeded;
	}
	public double getWeeklyHoursAvailable() {
		return weeklyHoursAvailable;
	}
	public void setWeeklyHoursAvailable(double weeklyHoursAvailable) {
		this.weeklyHoursAvailable = weeklyHoursAvailable;
	}
	public double getDailyCost() {
		return dailyCost;
	}
	public void setDailyCost(double dailyCost) {
		this.dailyCost = dailyCost;
	}
	public double getWeeklyCost() {
		return weeklyCost;
	}
	public void setWeeklyCost(double weeklyCost) {
		this.weeklyCost = weeklyCost;
	}
	public HashMap<String, ArrayList<Double>> getHoursPerDay() {
		return hoursPerDay;
	}
	public void setHoursPerDay(HashMap<String, ArrayList<Double>> hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}
	public HashMap<String, HashMap<Double, Double>> getDailyTimePerHour() {
		return dailyTimePerHour;
	}
	public void setDailyTimePerHour(HashMap<String, HashMap<Double, Double>> dailyTimePerHour) {
		this.dailyTimePerHour = dailyTimePerHour;
	}
	@Override
	public String toString() {
		return "Store [dailyHoursNeeded=" + dailyHoursNeeded + ", dailyHoursAvailable=" + dailyHoursAvailable
				+ ", weeklyHoursNeeded=" + weeklyHoursNeeded + ", weeklyHoursAvailable=" + weeklyHoursAvailable
				+ ", dailyCost=" + dailyCost + ", weeklyCost=" + weeklyCost + ", hoursPerDay=" + hoursPerDay
				+ ", dailyTimePerHour=" + dailyTimePerHour + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dailyCost, dailyHoursAvailable, dailyHoursNeeded, dailyTimePerHour, hoursPerDay, weeklyCost,
				weeklyHoursAvailable, weeklyHoursNeeded);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		return Double.doubleToLongBits(dailyCost) == Double.doubleToLongBits(other.dailyCost)
				&& Double.doubleToLongBits(dailyHoursAvailable) == Double.doubleToLongBits(other.dailyHoursAvailable)
				&& Double.doubleToLongBits(dailyHoursNeeded) == Double.doubleToLongBits(other.dailyHoursNeeded)
				&& Objects.equals(dailyTimePerHour, other.dailyTimePerHour)
				&& Objects.equals(hoursPerDay, other.hoursPerDay)
				&& Double.doubleToLongBits(weeklyCost) == Double.doubleToLongBits(other.weeklyCost)
				&& Double.doubleToLongBits(weeklyHoursAvailable) == Double.doubleToLongBits(other.weeklyHoursAvailable)
				&& Double.doubleToLongBits(weeklyHoursNeeded) == Double.doubleToLongBits(other.weeklyHoursNeeded);
	}
	
}
