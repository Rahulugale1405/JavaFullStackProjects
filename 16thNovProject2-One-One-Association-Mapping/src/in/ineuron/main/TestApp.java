package in.ineuron.main;

import in.ineuron.bean.Account;
import in.ineuron.bean.Employee;

public class TestApp {

	public static void main(String[] args) {
		
		Account account = new Account("DevRa1420", "Hare Krishna", "Savings");
		
		//Constructor Injection
		Employee employee = new Employee("DR14", "Hare Krishna", "Nashik", account);
		employee.getEmployeeDetails();

	}

}
