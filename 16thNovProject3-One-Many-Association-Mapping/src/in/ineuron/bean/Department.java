package in.ineuron.bean;

//16thNov recording 1st part from 01:22 mins of video - watched on 09thJan2023 from 08:18AM onwards

//Target Object
public class Department {
	
	private String did;
	private String dname;
	
	//Has-A Variable
	private Employee[] emps;

	//Constructor Injection
	public Department(String did, String dname, Employee[] emps) {
		super();
		this.did = did;
		this.dname = dname;
		this.emps = emps;
	} 
	
	public void getDepartmentDetails() {
		
		System.out.println("Department Details: ");
		System.out.println("-----------------------------");
		System.out.println("Department ID     :: " + did);
		System.out.println("Department Name   :: " + dname);
		
		System.out.println();
		
		System.out.println("Employee Detials: ");
		System.out.println("-----------------------------");
		for(Employee employee:emps) {
			System.out.println("Employee ID       :: " + employee.empId);
			System.out.println("Employee Name     :: " + employee.empName);
			System.out.println("Employee Address  :: " + employee.empAddr);
			System.out.println();
		}
		
	}

}
