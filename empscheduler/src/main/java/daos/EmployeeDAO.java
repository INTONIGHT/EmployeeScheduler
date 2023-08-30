package daos;

import java.util.ArrayList;
import java.util.HashMap;

import modules.DailyEmployeeSchedule;
import modules.Employee;


public class EmployeeDAO {
	//This will handle setting up methods for an employee as well as anything else
	//CRUD methods
	//CREATE methods
	public Employee addEmployee(String firstName, String lastName, double rate) {
		//ideally you would also call a method in a different class to update the SQL for now I am just going to map values
		HashMap<String, ArrayList<Double>> times = new HashMap<>();
		return addEmployee(firstName, lastName,rate, times);
	}
	public Employee addEmployee(String firstName, String lastName, double rate, HashMap<String, ArrayList<Double>> timesAvailable) {
		Employee e = new Employee();
		e.setFirstName(firstName);
		e.setLastName(lastName);
		e.setPayRate(rate);
		e.setDailyHoursAvailable(timesAvailable);
		return e;
	}
	
	//READ methods
	//not fully implemented
	public Employee getEmployeeById(int id) {
		Employee e = new Employee();
		//this is where youd run some sql code so build that out
		return e;
	}
	//not fully implemented
	
	public DailyEmployeeSchedule getDailyScheduleById(int id) {
		DailyEmployeeSchedule des = new DailyEmployeeSchedule();
		
		return des;
	}
	//UPDATE methods
	public void updateSchedule(HashMap<String, ArrayList<Double>> employeeAvailability, int id) {
		Employee e = getEmployeeById(id);
		e.setDailyHoursAvailable(employeeAvailability);
	}
	public void updateScheduleByDay(ArrayList<Double> hoursAvailable, int id, String day) {
		Employee e = getEmployeeById(id);
		HashMap<String, ArrayList<Double>> currentHours = e.getDailyHoursAvailable();
		currentHours.replace(day, hoursAvailable);
		e.setDailyHoursAvailable(currentHours);
	}
}
