package mapsAndInterface15thDec;

import java.util.HashMap;

//15thDec recorded lecture 1st part --> practiced on 03rdFeb2023 from 08:00AM onwards

/*	Whenever there's an object & if no one is referring to it, then JVM will invoke garbage collector
 * 	& this GC will collect object from heap area
 * 	While collecting the object, internally GC uses finalize method to collect the object
 * 
 */
class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	
	@Override
	public String toString() {
		return "Rahul";
	}
	
	@Override
	public void finalize() {
		System.out.println("Garbage collector collects the object");
	}
}


public class Launch2 {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		//try using WeakHashMap below
		HashMap hashmap = new HashMap();	//HashMap dominates Garbage collector so finalize method won't be executed
		hashmap.put(employee, "Krishna");	
		
		employee = null;					//eligible for garbage collection
		
		System.gc();		//this calls to garbage collector which internally calls finalize() method
		System.out.println("LastLine");
	}

}
