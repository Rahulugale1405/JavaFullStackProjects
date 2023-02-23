package in.ineuron.bean;

//16thNov recording 1st part from 55 mins of video - watched on 09thJan2023 from 06:45AM onwards

//Target Object
public class Employee {

	private String empId;
	private String empName;
	private String empAddr;
	
	//Has-A relationship 
	Account account;

	//Constructor Injection
	public Employee(String empId, String empName, String empAddr, Account account) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddr = empAddr;
		this.account = account;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Employee details are : ");
		System.out.println("Employee ID :: " + empId);
		System.out.println("Employee Name:: " + empName);
		System.out.println("Emplyee Address :: " + empAddr);
		
		System.out.println("===================1====================");
		
		System.out.println("Account Detials are :");
		System.out.println("Account number :: " + account.accNo);
		System.out.println("Account Name:: " + account.accName);
		System.out.println("Account Type :: " + account.accType);
	}
	
	
}
